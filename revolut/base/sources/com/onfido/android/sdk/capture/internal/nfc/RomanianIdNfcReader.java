package com.onfido.android.sdk.capture.internal.nfc;

import com.onfido.android.sdk.capture.internal.nfc.data.IncorrectPinException;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcRomaniaIdExtraction;
import com.onfido.android.sdk.capture.internal.nfc.data.PACEParams;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.util.Hex;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00020\u0012\"\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0006H\u0002J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\u0014\u0010\u0019\u001a\u00020\u0016*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\f\u0010\u001c\u001a\u00020\u0004*\u00020\nH\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\nH\u0002J\u0014\u0010\u001e\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\u0014\u0010 \u001a\u00020\u0004*\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/RomanianIdNfcReader;", "", "()V", "log", "", "message", "", "read", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;", "passportService", "Lorg/jmrtd/PassportService;", "paceParams", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PACEParams;", "pin", "requireStatus", "response", "Lnet/sf/scuba/smartcards/ResponseAPDU;", "successStatus", "", "", "errorMessage", "readBinary", "", "offset", "size", "readFile", "fid", "", "selectDataApplet", "selectNationalApp", "transmitSecure", "adpu", "verifyPin", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RomanianIdNfcReader {
    private static final short ADDRESS_FILE_ID = 262;
    private static final short BIRTH_DETAILS_FILE_ID = 258;
    private static final int SW1_VERIFICATION_FAILED = 99;
    private static final int SW_END_OF_FILE = 25218;
    private static final int SW_SUCCESS = 36864;

    @NotNull
    private static final String NFC_LOGGER = "NFC Logger";

    @NotNull
    private static final String DEFAULT_ERROR_MESSAGE = "Error occured";

    private final void log(String message) {
        Timber.INSTANCE.i(j6.a.q("NFC Logger - ", message), new Object[0]);
    }

    private final byte[] readBinary(PassportService passportService, int i, int i2) throws CardServiceException {
        ResponseAPDU responseAPDUTransmitSecure = transmitSecure(passportService, new byte[]{0, ISO7816.INS_READ_BINARY, (byte) (i >> 8), (byte) (i & 255), (byte) i2});
        requireStatus$default(this, responseAPDUTransmitSecure, new int[]{SW_SUCCESS, SW_END_OF_FILE}, null, 4, null);
        byte[] data = responseAPDUTransmitSecure.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return data;
    }

    private final byte[] readFile(PassportService passportService, short s2) throws CardServiceException, IOException {
        int i = 0;
        requireStatus(transmitSecure(passportService, new byte[]{0, -92, 2, 12, 2, (byte) (s2 >> 8), (byte) (s2 & 255)}), new int[]{SW_SUCCESS}, a0.d.n("File selection failed for FID = ", s2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] binary = new byte[0];
        while (true) {
            if (i != 0 && binary.length != 223) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            }
            binary = readBinary(passportService, i, PassportService.DEFAULT_MAX_BLOCKSIZE);
            byteArrayOutputStream.write(binary);
            i += PassportService.DEFAULT_MAX_BLOCKSIZE;
        }
    }

    private final void requireStatus(ResponseAPDU response, int[] successStatus, String errorMessage) throws CardServiceException {
        if (kotlin.collections.d.G(successStatus, response.getSW())) {
            return;
        }
        throw new CardServiceException(com.google.android.gms.internal.mlkit_vision_face.a.o(errorMessage, ", ", "RAPDU = " + Hex.toHexString(response.getBytes())), response.getSW());
    }

    public static /* synthetic */ void requireStatus$default(RomanianIdNfcReader romanianIdNfcReader, ResponseAPDU responseAPDU, int[] iArr, String str, int i, Object obj2) throws CardServiceException {
        if ((i & 4) != 0) {
            str = "Error occured";
        }
        romanianIdNfcReader.requireStatus(responseAPDU, iArr, str);
    }

    private final void selectDataApplet(PassportService passportService) throws CardServiceException {
        byte[] bArr = {0, -92, 4, 12, 15, -24, 40, -67, 8, 15, ISOFileInfo.A0, 0, 0, 1, 103, 69, ISO7816.INS_REHABILITATE_CHV, 65, 84, 65, 0};
        log("Attempting to select data applet");
        requireStatus$default(this, transmitSecure(passportService, bArr), new int[]{SW_SUCCESS}, null, 4, null);
    }

    private final void selectNationalApp(PassportService passportService) throws CardServiceException {
        byte[] bArr = {0, -92, 4, 0, 16, ISOFileInfo.A0, 0, 0, 0, 119, 3, 12, 96, 0, 0, 0, -2, 0, 0, 5, 0, 0};
        log("Attempting to select national application");
        ResponseAPDU responseAPDUTransmit = passportService.transmit(new CommandAPDU(bArr));
        Intrinsics.h(responseAPDUTransmit);
        requireStatus$default(this, responseAPDUTransmit, new int[]{SW_SUCCESS}, null, 4, null);
    }

    private final ResponseAPDU transmitSecure(PassportService passportService, byte[] bArr) throws CardServiceException {
        ResponseAPDU responseAPDUUnwrap = passportService.getWrapper().unwrap(passportService.transmit(passportService.getWrapper().wrap(new CommandAPDU(bArr))));
        Intrinsics.h(responseAPDUUnwrap);
        return responseAPDUUnwrap;
    }

    private final void verifyPin(PassportService passportService, String str) throws CardServiceException {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArr = {0, 32, 0, 3, 12, bytes[0], bytes[1], bytes[2], bytes[3], -1, -1, -1, -1, -1, -1, -1, -1};
        log("Attempting PIN verification: PIN = ".concat(str));
        ResponseAPDU responseAPDUTransmitSecure = transmitSecure(passportService, bArr);
        if (responseAPDUTransmitSecure.getSW1() != 99) {
            requireStatus(responseAPDUTransmitSecure, new int[]{SW_SUCCESS}, "PIN verification failed");
        } else {
            int sw22 = responseAPDUTransmitSecure.getSW2() & 15;
            log(a0.d.n("PIN attempts left: ", sw22));
            throw new IncorrectPinException(sw22, responseAPDUTransmitSecure.getSW());
        }
    }

    @NotNull
    public final NfcRomaniaIdExtraction read(@NotNull PassportService passportService, @NotNull PACEParams paceParams, @NotNull String pin) throws CardServiceException, IOException {
        Object objA;
        Intrinsics.checkNotNullParameter(passportService, "passportService");
        Intrinsics.checkNotNullParameter(paceParams, "paceParams");
        Intrinsics.checkNotNullParameter(pin, "pin");
        passportService.close();
        passportService.open();
        selectNationalApp(passportService);
        passportService.doPACE(paceParams.getKeySpec(), paceParams.getOid(), paceParams.getParams(), paceParams.getParameterId());
        verifyPin(passportService, pin);
        selectDataApplet(passportService);
        byte[] file = readFile(passportService, (short) 262);
        try {
            m.Companion companion = m.INSTANCE;
            objA = readFile(passportService, (short) 258);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return new NfcRomaniaIdExtraction(file, (byte[]) objA);
    }
}
