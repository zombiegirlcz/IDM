package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.APDUEvent;
import net.sf.scuba.smartcards.APDUListener;
import net.sf.scuba.smartcards.CardFileInputStream;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.util.Hex;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.icao.DG14File;
import org.jmrtd.lds.icao.DG15File;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDHelperImpl;", "Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDHelper;", "nfcScanTagTimeout", "", "logger", "Lkotlin/Function1;", "", "", "enableAdpuLogs", "", "(ILkotlin/jvm/functions/Function1;Z)V", "createDG14File", "Lorg/jmrtd/lds/icao/DG14File;", "bytes", "", "createDG15File", "Lorg/jmrtd/lds/icao/DG15File;", "createPassportService", "Lorg/jmrtd/PassportService;", "tag", "Landroid/nfc/Tag;", "readBytes", "passportService", "fid", "", "readCardAccessFile", "Lorg/jmrtd/lds/CardAccessFile;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JMRTDHelperImpl implements JMRTDHelper {
    private final boolean enableAdpuLogs;

    @NotNull
    private final Function1<String, Unit> logger;
    private final int nfcScanTagTimeout;

    /* JADX WARN: Multi-variable type inference failed */
    public JMRTDHelperImpl(int i, @NotNull Function1<? super String, Unit> logger, boolean z) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.nfcScanTagTimeout = i;
        this.logger = logger;
        this.enableAdpuLogs = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPassportService$lambda$1$lambda$0(JMRTDHelperImpl this$0, APDUEvent aPDUEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.f(aPDUEvent.getType(), "ISODep")) {
            this$0.logger.invoke("APDU:\nCommand:" + Hex.toHexString(aPDUEvent.getCommandAPDU().getBytes()) + "\nResponse:" + Hex.toHexString(aPDUEvent.getResponseAPDU().getBytes()));
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDHelper
    @NotNull
    public DG14File createDG14File(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new DG14File(new ByteArrayInputStream(bytes));
    }

    @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDHelper
    @NotNull
    public DG15File createDG15File(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new DG15File(new ByteArrayInputStream(bytes));
    }

    @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDHelper
    @NotNull
    public PassportService createPassportService(@NotNull Tag tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        IsoDep isoDep = IsoDep.get(tag2);
        isoDep.setTimeout(this.nfcScanTagTimeout);
        PassportService passportService = new PassportService(CardService.getInstance(isoDep), 256, PassportService.DEFAULT_MAX_BLOCKSIZE, false, false);
        if (this.enableAdpuLogs) {
            passportService.addAPDUListener(new APDUListener() { // from class: com.onfido.android.sdk.capture.internal.nfc.a
                @Override // net.sf.scuba.smartcards.APDUListener
                public final void exchangedAPDU(APDUEvent aPDUEvent) {
                    JMRTDHelperImpl.createPassportService$lambda$1$lambda$0(this.f49933a, aPDUEvent);
                }
            });
        }
        return passportService;
    }

    @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDHelper
    @NotNull
    public byte[] readBytes(@NotNull PassportService passportService, short fid2) throws CardServiceException {
        Intrinsics.checkNotNullParameter(passportService, "passportService");
        CardFileInputStream inputStream = passportService.getInputStream(fid2, PassportService.DEFAULT_MAX_BLOCKSIZE);
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return zi0.c.H(inputStream);
    }

    @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDHelper
    @NotNull
    public CardAccessFile readCardAccessFile(@NotNull PassportService passportService) {
        Intrinsics.checkNotNullParameter(passportService, "passportService");
        return new CardAccessFile(passportService.getInputStream((short) 284, PassportService.DEFAULT_MAX_BLOCKSIZE));
    }
}
