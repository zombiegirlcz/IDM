package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.nfc.PassportNfcExtractionState;
import com.onfido.android.sdk.capture.internal.nfc.data.IncorrectPinException;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcRomaniaIdExtraction;
import com.onfido.android.sdk.capture.internal.nfc.data.PACEParams;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import fgm.j;
import igm.g;
import igm.p;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import net.sf.scuba.smartcards.CardFileInputStream;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.PACEInfo;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.icao.DG15File;
import org.jmrtd.protocol.AAResult;
import sgm.c1;
import vc.s;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 L2\u00020\u0001:\u0006LMNOPQB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J2\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001d0 H\u0002J2\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100-H\u0002¢\u0006\u0002\u0010.J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001501H\u0002JB\u00102\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u00172\f\u00104\u001a\b\u0012\u0004\u0012\u000206052\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110+2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001d0 H\u0002JR\u00108\u001a\u0004\u0018\u00010)2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u00104\u001a\b\u0012\u0004\u0012\u000206052\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110+2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u0013H\u0002J}\u0010<\u001a\b\u0012\u0004\u0012\u0002060=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0=2\u0006\u0010#\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010@\u001a\u00020?2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100-2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0002\u0010GJX\u0010H\u001a\b\u0012\u0004\u0012\u0002060=2\u0006\u0010#\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010@\u001a\u00020?2\b\u00109\u001a\u0004\u0018\u00010:2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0013H\u0002J\f\u0010I\u001a\u00020\r*\u00020\u0011H\u0002J\u001a\u0010J\u001a\u000203*\b\u0012\u0004\u0012\u000206052\u0006\u0010K\u001a\u00020\rH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful;", "Lcom/onfido/android/sdk/capture/internal/nfc/PassportNfcReader;", "jmrtdHelper", "Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$JMRTDHelper;", "nfcScanTagTimeout", "", "nfcTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "romanianIdNfcReader", "Lcom/onfido/android/sdk/capture/internal/nfc/RomanianIdNfcReader;", "(Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$JMRTDHelper;ILcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;Lcom/onfido/android/sdk/capture/internal/nfc/RomanianIdNfcReader;)V", "allReadingSteps", "", "Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$ReadingStep;", "nfcFileIDToShort", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "", "doPace", "", "securityInfo", "Lorg/jmrtd/lds/SecurityInfo;", "passportService", "Lorg/jmrtd/PassportService;", "paceKeySpec", "Lorg/jmrtd/PACEKeySpec;", "readerState", "Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$ReaderState;", "getAaResponse", "", "aaChallenge", "dataGroupValues", "", "getAuthAccess", "Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;", "passportBACKey", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "canNumber", "", "tryPace", "getNfcPassportExtraction", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "mapDataGroupsToBeRead", "Lkotlin/collections/ArrayDeque;", "fileIDs", "", "([Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;)Lkotlin/collections/ArrayDeque;", "orderAndFilterSecurityInfos", "securityInfos", "", "readDataGroups", "", "emitter", "Lio/reactivex/rxjava3/core/ObservableEmitter;", "Lcom/onfido/android/sdk/capture/internal/nfc/PassportNfcExtractionState;", "dataGroups", "readNfcInfo", "pinNumber", "", "readRoId", "readNfcTag", "Lio/reactivex/rxjava3/core/Observable;", "nfcTagRetries", "Landroid/nfc/Tag;", "tag", "isPaceEnabled", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "chipAuthentication", "realtimeNfcEvents", "Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;", "(Lio/reactivex/rxjava3/core/Observable;Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;[BLandroid/nfc/Tag;[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;Ljava/lang/String;ZLcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;ZZLcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;)Lio/reactivex/rxjava3/core/Observable;", "readNfcTagInternal", "toReadingStep", "updateStep", "step", "Companion", "ConnectionLostException", "JMRTDHelper", "JMRTDHelperImpl", "ReaderState", "ReadingStep", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JMRTDPassportNfcReaderStateful implements PassportNfcReader {
    private static final int TIMEOUT_IN_MS = 60000;
    private List<? extends ReadingStep> allReadingSteps;

    @NotNull
    private final JMRTDHelper jmrtdHelper;

    @NotNull
    private final Map<MRTDDataGroup, Short> nfcFileIDToShort;
    private final int nfcScanTagTimeout;

    @NotNull
    private final NfcTracker nfcTracker;

    @NotNull
    private final RomanianIdNfcReader romanianIdNfcReader;

    @NotNull
    private static final String NFC_LOGGER = "NFC Logger";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$Companion;", "", "()V", "NFC_LOGGER", "", "TIMEOUT_IN_MS", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$ConnectionLostException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionLostException extends Exception {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH&J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$JMRTDHelper;", "", "createCardAccessFile", "Lorg/jmrtd/lds/CardAccessFile;", "passportService", "Lorg/jmrtd/PassportService;", "createPassportService", "tag", "Landroid/nfc/Tag;", "nfcScanTagTimeout", "", "doActiveAuth", "", "dg15Data", "aaChallenge", "readBytes", "fid", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface JMRTDHelper {
        @NotNull
        CardAccessFile createCardAccessFile(@NotNull PassportService passportService);

        @NotNull
        PassportService createPassportService(@NotNull Tag tag2, int nfcScanTagTimeout);

        byte[] doActiveAuth(@NotNull PassportService passportService, byte[] dg15Data, byte[] aaChallenge);

        @NotNull
        byte[] readBytes(@NotNull PassportService passportService, short fid2);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$JMRTDHelperImpl;", "Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$JMRTDHelper;", "()V", "createCardAccessFile", "Lorg/jmrtd/lds/CardAccessFile;", "passportService", "Lorg/jmrtd/PassportService;", "createPassportService", "tag", "Landroid/nfc/Tag;", "nfcScanTagTimeout", "", "doActiveAuth", "", "dg15Data", "aaChallenge", "readBytes", "fid", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JMRTDHelperImpl implements JMRTDHelper {

        @NotNull
        public static final JMRTDHelperImpl INSTANCE = new JMRTDHelperImpl();

        private JMRTDHelperImpl() {
        }

        @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.JMRTDHelper
        @NotNull
        public CardAccessFile createCardAccessFile(@NotNull PassportService passportService) {
            Intrinsics.checkNotNullParameter(passportService, "passportService");
            return new CardAccessFile(passportService.getInputStream((short) 284, PassportService.DEFAULT_MAX_BLOCKSIZE));
        }

        @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.JMRTDHelper
        @NotNull
        public PassportService createPassportService(@NotNull Tag tag2, int nfcScanTagTimeout) {
            Intrinsics.checkNotNullParameter(tag2, "tag");
            IsoDep isoDep = IsoDep.get(tag2);
            Security.insertProviderAt(new BouncyCastleProvider(), 1);
            isoDep.setTimeout(nfcScanTagTimeout);
            return new PassportService(CardService.getInstance(isoDep), 256, PassportService.DEFAULT_MAX_BLOCKSIZE, false, false);
        }

        @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.JMRTDHelper
        public byte[] doActiveAuth(@NotNull PassportService passportService, byte[] dg15Data, byte[] aaChallenge) {
            Intrinsics.checkNotNullParameter(passportService, "passportService");
            PublicKey publicKey = new DG15File(new ByteArrayInputStream(dg15Data)).getPublicKey();
            if (publicKey != null && aaChallenge != null) {
                try {
                    Timber.Companion companion = Timber.INSTANCE;
                    companion.i("NFC Logger - Attempting Active authentication", new Object[0]);
                    AAResult aAResultDoAA = passportService.doAA(publicKey, null, null, aaChallenge);
                    byte[] response = aAResultDoAA.getResponse();
                    Intrinsics.checkNotNullExpressionValue(response, "getResponse(...)");
                    if (!(response.length == 0)) {
                        companion.i("NFC Logger - Active authentication succeeded", new Object[0]);
                    }
                    return aAResultDoAA.getResponse();
                } catch (CardServiceException e) {
                    Timber.INSTANCE.w("NFC Logger - Active authentication card service exception", e);
                }
            }
            return null;
        }

        @Override // com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.JMRTDHelper
        @NotNull
        public byte[] readBytes(@NotNull PassportService passportService, short fid2) throws CardServiceException {
            Intrinsics.checkNotNullParameter(passportService, "passportService");
            CardFileInputStream inputStream = passportService.getInputStream(fid2, PassportService.DEFAULT_MAX_BLOCKSIZE);
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            return zi0.c.H(inputStream);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\n\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$ReaderState;", "", "dataGroupValues", "", "", "", "paceParams", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PACEParams;", "aaResponse", "roIdExtraction", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;", "(Ljava/util/Map;Lcom/onfido/android/sdk/capture/internal/nfc/data/PACEParams;[BLcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;)V", "getAaResponse", "()[B", "setAaResponse", "([B)V", "getDataGroupValues", "()Ljava/util/Map;", "getPaceParams", "()Lcom/onfido/android/sdk/capture/internal/nfc/data/PACEParams;", "setPaceParams", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/PACEParams;)V", "getRoIdExtraction", "()Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;", "setRoIdExtraction", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcRomaniaIdExtraction;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReaderState {
        private byte[] aaResponse;

        @NotNull
        private final Map<Short, byte[]> dataGroupValues;
        private PACEParams paceParams;
        private NfcRomaniaIdExtraction roIdExtraction;

        public ReaderState() {
            this(null, null, null, null, 15, null);
        }

        public final byte[] getAaResponse() {
            return this.aaResponse;
        }

        @NotNull
        public final Map<Short, byte[]> getDataGroupValues() {
            return this.dataGroupValues;
        }

        public final PACEParams getPaceParams() {
            return this.paceParams;
        }

        public final NfcRomaniaIdExtraction getRoIdExtraction() {
            return this.roIdExtraction;
        }

        public final void setAaResponse(byte[] bArr) {
            this.aaResponse = bArr;
        }

        public final void setPaceParams(PACEParams pACEParams) {
            this.paceParams = pACEParams;
        }

        public final void setRoIdExtraction(NfcRomaniaIdExtraction nfcRomaniaIdExtraction) {
            this.roIdExtraction = nfcRomaniaIdExtraction;
        }

        public ReaderState(@NotNull Map<Short, byte[]> dataGroupValues, PACEParams pACEParams, byte[] bArr, NfcRomaniaIdExtraction nfcRomaniaIdExtraction) {
            Intrinsics.checkNotNullParameter(dataGroupValues, "dataGroupValues");
            this.dataGroupValues = dataGroupValues;
            this.paceParams = pACEParams;
            this.aaResponse = bArr;
            this.roIdExtraction = nfcRomaniaIdExtraction;
        }

        public /* synthetic */ ReaderState(Map map, PACEParams pACEParams, byte[] bArr, NfcRomaniaIdExtraction nfcRomaniaIdExtraction, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? null : pACEParams, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? null : nfcRomaniaIdExtraction);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDPassportNfcReaderStateful$ReadingStep;", "", "(Ljava/lang/String;I)V", "progressPercentage", "", "activeSteps", "", "Authenticated", "DG1Read", "DG2Read", "DG3Read", "DG4Read", "DG5Read", "DG6Read", "DG7Read", "DG8Read", "DG9Read", "DG10Read", "DG11Read", "DG12Read", "DG13Read", "DG14Read", "DG15Read", "DG16Read", "SODRead", "DoActiveAuth", "RomanianIdRead", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReadingStep {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReadingStep[] $VALUES;
        public static final ReadingStep Authenticated = new ReadingStep("Authenticated", 0);
        public static final ReadingStep DG1Read = new ReadingStep("DG1Read", 1);
        public static final ReadingStep DG2Read = new ReadingStep("DG2Read", 2);
        public static final ReadingStep DG3Read = new ReadingStep("DG3Read", 3);
        public static final ReadingStep DG4Read = new ReadingStep("DG4Read", 4);
        public static final ReadingStep DG5Read = new ReadingStep("DG5Read", 5);
        public static final ReadingStep DG6Read = new ReadingStep("DG6Read", 6);
        public static final ReadingStep DG7Read = new ReadingStep("DG7Read", 7);
        public static final ReadingStep DG8Read = new ReadingStep("DG8Read", 8);
        public static final ReadingStep DG9Read = new ReadingStep("DG9Read", 9);
        public static final ReadingStep DG10Read = new ReadingStep("DG10Read", 10);
        public static final ReadingStep DG11Read = new ReadingStep("DG11Read", 11);
        public static final ReadingStep DG12Read = new ReadingStep("DG12Read", 12);
        public static final ReadingStep DG13Read = new ReadingStep("DG13Read", 13);
        public static final ReadingStep DG14Read = new ReadingStep("DG14Read", 14);
        public static final ReadingStep DG15Read = new ReadingStep("DG15Read", 15);
        public static final ReadingStep DG16Read = new ReadingStep("DG16Read", 16);
        public static final ReadingStep SODRead = new ReadingStep("SODRead", 17);
        public static final ReadingStep DoActiveAuth = new ReadingStep("DoActiveAuth", 18);
        public static final ReadingStep RomanianIdRead = new ReadingStep("RomanianIdRead", 19);

        private static final /* synthetic */ ReadingStep[] $values() {
            return new ReadingStep[]{Authenticated, DG1Read, DG2Read, DG3Read, DG4Read, DG5Read, DG6Read, DG7Read, DG8Read, DG9Read, DG10Read, DG11Read, DG12Read, DG13Read, DG14Read, DG15Read, DG16Read, SODRead, DoActiveAuth, RomanianIdRead};
        }

        static {
            ReadingStep[] readingStepArr$values = $values();
            $VALUES = readingStepArr$values;
            $ENTRIES = s.n(readingStepArr$values);
        }

        private ReadingStep(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ReadingStep valueOf(String str) {
            return (ReadingStep) Enum.valueOf(ReadingStep.class, str);
        }

        public static ReadingStep[] values() {
            return (ReadingStep[]) $VALUES.clone();
        }

        public final int progressPercentage(@NotNull List<? extends ReadingStep> activeSteps) {
            Intrinsics.checkNotNullParameter(activeSteps, "activeSteps");
            return (int) (((activeSteps.indexOf(this) + 1) / activeSteps.size()) * 100);
        }
    }

    public JMRTDPassportNfcReaderStateful(@NotNull JMRTDHelper jmrtdHelper, int i, @NotNull NfcTracker nfcTracker, @NotNull RomanianIdNfcReader romanianIdNfcReader) {
        Intrinsics.checkNotNullParameter(jmrtdHelper, "jmrtdHelper");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        Intrinsics.checkNotNullParameter(romanianIdNfcReader, "romanianIdNfcReader");
        this.jmrtdHelper = jmrtdHelper;
        this.nfcScanTagTimeout = i;
        this.nfcTracker = nfcTracker;
        this.romanianIdNfcReader = romanianIdNfcReader;
        this.nfcFileIDToShort = r0.k(new Pair(MRTDDataGroup.DG1, Short.valueOf(PassportService.EF_DG1)), new Pair(MRTDDataGroup.DG2, Short.valueOf(PassportService.EF_DG2)), new Pair(MRTDDataGroup.DG3, Short.valueOf(PassportService.EF_DG3)), new Pair(MRTDDataGroup.DG4, Short.valueOf(PassportService.EF_DG4)), new Pair(MRTDDataGroup.DG5, Short.valueOf(PassportService.EF_DG5)), new Pair(MRTDDataGroup.DG6, Short.valueOf(PassportService.EF_DG6)), new Pair(MRTDDataGroup.DG7, Short.valueOf(PassportService.EF_DG7)), new Pair(MRTDDataGroup.DG8, Short.valueOf(PassportService.EF_DG8)), new Pair(MRTDDataGroup.DG9, Short.valueOf(PassportService.EF_DG9)), new Pair(MRTDDataGroup.DG10, Short.valueOf(PassportService.EF_DG10)), new Pair(MRTDDataGroup.DG11, Short.valueOf(PassportService.EF_DG11)), new Pair(MRTDDataGroup.DG12, Short.valueOf(PassportService.EF_DG12)), new Pair(MRTDDataGroup.DG13, Short.valueOf(PassportService.EF_DG13)), new Pair(MRTDDataGroup.DG14, Short.valueOf(PassportService.EF_DG14)), new Pair(MRTDDataGroup.DG15, Short.valueOf(PassportService.EF_DG15)), new Pair(MRTDDataGroup.DG16, Short.valueOf(PassportService.EF_DG16)), new Pair(MRTDDataGroup.SOD, (short) 285));
    }

    private final boolean doPace(SecurityInfo securityInfo, PassportService passportService, PACEKeySpec paceKeySpec, ReaderState readerState) throws CardServiceException {
        if (!(securityInfo instanceof PACEInfo)) {
            return false;
        }
        Timber.Companion companion = Timber.INSTANCE;
        companion.i("NFC Logger - Attempting PACE authentication", new Object[0]);
        PACEInfo pACEInfo = (PACEInfo) securityInfo;
        String objectIdentifier = pACEInfo.getObjectIdentifier();
        BigInteger parameterId = pACEInfo.getParameterId();
        AlgorithmParameterSpec parameterSpec = PACEInfo.toParameterSpec(parameterId);
        companion.i("\n            NFC Logger - Performing PACE with " + paceKeySpec + " input\n            NFC Logger - Performing PACE : Security information object ID: " + objectIdentifier + "\n            NFC Logger - Performing PACE : Security Protocol ID: " + pACEInfo.getProtocolOIDString() + "\n            NFC Logger - Performing PACE : Security information parameter ID: " + PACEInfo.toStandardizedParamIdString(parameterId) + "\n            ", new Object[0]);
        passportService.doPACE(paceKeySpec, objectIdentifier, parameterSpec, parameterId);
        Intrinsics.h(objectIdentifier);
        Intrinsics.h(parameterSpec);
        Intrinsics.h(parameterId);
        readerState.setPaceParams(new PACEParams(paceKeySpec, objectIdentifier, parameterSpec, parameterId));
        return true;
    }

    private final byte[] getAaResponse(PassportService passportService, byte[] aaChallenge, Map<Short, byte[]> dataGroupValues) {
        byte[] bArr = dataGroupValues.get(Short.valueOf(PassportService.EF_DG15));
        if (bArr != null) {
            return this.jmrtdHelper.doActiveAuth(passportService, bArr, aaChallenge);
        }
        return null;
    }

    private final PassportAuthAccess getAuthAccess(PassportService passportService, PassportBACKey passportBACKey, Number canNumber, boolean tryPace, ReaderState readerState) throws GeneralSecurityException {
        String string;
        String string2;
        CardServiceException cardServiceException;
        Exception exc2;
        Exception exc3;
        boolean z;
        String str;
        Exception exc4;
        String str2;
        List<SecurityInfo> listOrderAndFilterSecurityInfos;
        boolean zDoPace;
        Exception exc5;
        Object objA;
        boolean z3;
        boolean z4;
        Timber.Companion companion = Timber.INSTANCE;
        companion.i(com.google.android.gms.internal.mlkit_vision_face.a.r("NFC Logger - Try PACE = ", tryPace), new Object[0]);
        CardServiceException cardServiceException2 = null;
        if (tryPace) {
            try {
                companion.i("NFC Logger - Start reading card access", new Object[0]);
                CardAccessFile cardAccessFileCreateCardAccessFile = this.jmrtdHelper.createCardAccessFile(passportService);
                companion.i("NFC Logger - Start retrieving securityInfos", new Object[0]);
                string2 = cardAccessFileCreateCardAccessFile.toString();
                try {
                    companion.i("NFC Logger - CardAccess file:\n" + string2, new Object[0]);
                    Collection<SecurityInfo> securityInfos = cardAccessFileCreateCardAccessFile.getSecurityInfos();
                    Intrinsics.checkNotNullExpressionValue(securityInfos, "getSecurityInfos(...)");
                    listOrderAndFilterSecurityInfos = orderAndFilterSecurityInfos(securityInfos);
                } catch (IOException e) {
                    e = e;
                    string = null;
                } catch (CardServiceException e2) {
                    string = null;
                    cardServiceException = e2;
                }
            } catch (IOException e4) {
                e = e4;
                string = null;
                string2 = null;
            } catch (CardServiceException e5) {
                string = null;
                string2 = null;
                cardServiceException = e5;
            }
            if (listOrderAndFilterSecurityInfos.isEmpty()) {
                z = false;
                exc4 = null;
                str = null;
                str2 = string2;
                exc5 = exc4;
            } else {
                companion.i("NFC Logger - Attempting PACE", new Object[0]);
                SecurityInfo securityInfo = (SecurityInfo) d0.b0(listOrderAndFilterSecurityInfos);
                string = securityInfo.toString();
                try {
                    try {
                        PACEKeySpec pACEKeySpecCreateMRZKey = PACEKeySpec.createMRZKey(passportBACKey.getBACKey$onfido_capture_sdk_core_release());
                        Intrinsics.h(pACEKeySpecCreateMRZKey);
                        zDoPace = doPace(securityInfo, passportService, pACEKeySpecCreateMRZKey, readerState);
                    } catch (IOException e6) {
                        e = e6;
                        Timber.INSTANCE.e(ch.qos.logback.core.util.a.r("NFC Logger - ", e), new Object[0]);
                        exc2 = e;
                        exc3 = exc2;
                        z = false;
                    }
                } catch (CardServiceException e22) {
                    if (canNumber != null) {
                        try {
                            if (!passportService.isConnectionLost(e22)) {
                                PACEKeySpec pACEKeySpecCreateCANKey = PACEKeySpec.createCANKey(canNumber.toString());
                                Intrinsics.h(pACEKeySpecCreateCANKey);
                                zDoPace = doPace(securityInfo, passportService, pACEKeySpecCreateCANKey, readerState);
                            }
                        } catch (CardServiceException e33) {
                            cardServiceException = e33;
                            Timber.Companion companion2 = Timber.INSTANCE;
                            String message = cardServiceException.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            companion2.w("NFC Logger - CardServiceException - ".concat(message), new Object[0]);
                            exc2 = cardServiceException;
                            exc3 = exc2;
                            z = false;
                        }
                    }
                    throw e22;
                }
                z = zDoPace;
                exc3 = null;
                str = string;
                exc4 = exc3;
                str2 = string2;
                exc5 = exc4;
            }
            Timber.INSTANCE.e(ch.qos.logback.core.util.a.r("NFC Logger - ", e), new Object[0]);
            exc2 = e;
            exc3 = exc2;
            z = false;
            str = string;
            exc4 = exc3;
            str2 = string2;
            exc5 = exc4;
        } else {
            z = false;
            exc5 = null;
            str2 = null;
            str = null;
        }
        try {
            passportService.sendSelectApplet(z);
            Timber.INSTANCE.i(com.google.android.gms.internal.mlkit_vision_face.a.r("NFC Logger - PACE Result - ", z), new Object[0]);
            boolean z6 = true;
            if (tryPace) {
                try {
                    m.Companion companion3 = m.INSTANCE;
                    objA = Integer.valueOf(passportService.getInputStream(PassportService.EF_COM, PassportService.DEFAULT_MAX_BLOCKSIZE).read());
                } catch (Throwable th10) {
                    m.Companion companion4 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Timber.INSTANCE.w("NFC Logger - " + m.a(objA), new Object[0]);
                z3 = (objA instanceof n) ^ true;
            } else {
                z3 = false;
            }
            if (z3) {
                z4 = false;
            } else {
                try {
                    Timber.INSTANCE.i("NFC Logger - Attempting BAC authentication", new Object[0]);
                    passportService.doBAC(passportBACKey.getBACKey$onfido_capture_sdk_core_release());
                    z3 = true;
                } catch (CardServiceException e35) {
                    cardServiceException2 = e35;
                    z6 = false;
                }
                Timber.INSTANCE.i("NFC Logger - BAC auth ".concat(z6 ? "succeeded" : "failed"), new Object[0]);
                z4 = z6;
            }
            return new PassportAuthAccess(z3, z, z4, exc5, cardServiceException2, null, str2, str, 32, null);
        } catch (CardServiceException e41) {
            Timber.Companion companion5 = Timber.INSTANCE;
            String message2 = e41.getMessage();
            companion5.w("NFC Logger - SelectAppletException - ".concat(message2 != null ? message2 : ""), new Object[0]);
            return new PassportAuthAccess(false, z, false, exc5, null, e41, str2, str, 16, null);
        }
    }

    private final NfcPassportExtraction getNfcPassportExtraction(ReaderState readerState) {
        Map<Short, byte[]> dataGroupValues = readerState.getDataGroupValues();
        byte[] bArr = dataGroupValues.get(Short.valueOf(PassportService.EF_DG1));
        if (bArr == null) {
            throw new IllegalArgumentException("DG1 Failed");
        }
        byte[] bArr2 = bArr;
        byte[] bArr3 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG2));
        if (bArr3 == null) {
            throw new IllegalArgumentException("DG2 Failed");
        }
        byte[] bArr4 = bArr3;
        byte[] bArr5 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG3));
        byte[] bArr6 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG4));
        byte[] bArr7 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG5));
        byte[] bArr8 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG6));
        byte[] bArr9 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG7));
        byte[] bArr10 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG8));
        byte[] bArr11 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG9));
        byte[] bArr12 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG10));
        byte[] bArr13 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG11));
        byte[] bArr14 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG12));
        byte[] bArr15 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG13));
        byte[] bArr16 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG14));
        byte[] bArr17 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG15));
        byte[] bArr18 = dataGroupValues.get(Short.valueOf(PassportService.EF_DG16));
        byte[] bArr19 = dataGroupValues.get((short) 285);
        if (bArr19 != null) {
            return new NfcPassportExtraction(bArr2, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13, bArr14, bArr15, bArr16, bArr17, bArr18, bArr19, readerState.getAaResponse(), null, readerState.getRoIdExtraction());
        }
        throw new IllegalArgumentException("SOD RAW Bytes Failed");
    }

    private final ArrayDeque<Short> mapDataGroupsToBeRead(MRTDDataGroup[] fileIDs) {
        ArrayList arrayList = new ArrayList();
        for (MRTDDataGroup mRTDDataGroup : fileIDs) {
            Short sh10 = this.nfcFileIDToShort.get(mRTDDataGroup);
            if (sh10 != null) {
                arrayList.add(sh10);
            }
        }
        return new ArrayDeque<>(arrayList);
    }

    private final List<SecurityInfo> orderAndFilterSecurityInfos(Collection<? extends SecurityInfo> securityInfos) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : securityInfos) {
            if (obj2 instanceof PACEInfo) {
                arrayList.add(obj2);
            }
        }
        return d0.P0(arrayList, new Comparator() { // from class: com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful$orderAndFilterSecurityInfos$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                PACEInfo.MappingType mappingType = PACEInfo.toMappingType(((PACEInfo) t2).getObjectIdentifier());
                PACEInfo.MappingType mappingType2 = PACEInfo.MappingType.IM;
                return cim.b.b(Integer.valueOf(mappingType == mappingType2 ? 1 : 2), Integer.valueOf(PACEInfo.toMappingType(((PACEInfo) t3).getObjectIdentifier()) == mappingType2 ? 1 : 2));
            }
        });
    }

    private final void readDataGroups(PassportService passportService, ObservableEmitter emitter, ArrayDeque<Short> dataGroups, Map<Short, byte[]> dataGroupValues) throws Exception {
        short sShortValue;
        Exception e;
        byte[] bytes;
        while (!dataGroups.isEmpty() && !emitter.isDisposed()) {
            try {
                sShortValue = ((Number) dataGroups.first()).shortValue();
            } catch (Exception e2) {
                sShortValue = 0;
                e = e2;
            }
            try {
                ReadingStep readingStep = toReadingStep(sShortValue);
                Timber.INSTANCE.i("NFC Logger - readNfcDataGroup - " + readingStep, new Object[0]);
                bytes = this.jmrtdHelper.readBytes(passportService, sShortValue);
                dataGroups.removeFirst();
                updateStep(emitter, readingStep);
            } catch (Exception e4) {
                e = e4;
                if (passportService.isConnectionLost(e)) {
                    throw new ConnectionLostException();
                }
                if (e instanceof CardServiceException) {
                    Timber.INSTANCE.w(j6.a.l(sShortValue, "NFC Logger - ", " card service exception"), e);
                } else {
                    if (!(e instanceof IOException ? true : e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    Timber.INSTANCE.w(j6.a.l(sShortValue, "NFC Logger - ", " file exception"), e);
                }
                dataGroups.removeFirst();
                bytes = null;
            }
            dataGroupValues.put(Short.valueOf(sShortValue), bytes);
        }
    }

    private final NfcPassportExtraction readNfcInfo(PassportService passportService, byte[] aaChallenge, ObservableEmitter emitter, ArrayDeque<Short> dataGroups, ReaderState readerState, String pinNumber, boolean readRoId) throws Exception {
        Map<Short, byte[]> dataGroupValues = readerState.getDataGroupValues();
        readDataGroups(passportService, emitter, dataGroups, dataGroupValues);
        if (readerState.getAaResponse() == null) {
            readerState.setAaResponse(getAaResponse(passportService, aaChallenge, dataGroupValues));
            updateStep(emitter, ReadingStep.DoActiveAuth);
        }
        if (readRoId) {
            RomanianIdNfcReader romanianIdNfcReader = this.romanianIdNfcReader;
            PACEParams paceParams = readerState.getPaceParams();
            if (paceParams == null) {
                throw new IllegalArgumentException("PACE params are required for Romanian ID reading");
            }
            if (pinNumber == null) {
                throw new IllegalArgumentException("PIN is required for Romanian ID reading");
            }
            readerState.setRoIdExtraction(romanianIdNfcReader.read(passportService, paceParams, pinNumber));
            updateStep(emitter, ReadingStep.RomanianIdRead);
        }
        try {
            return getNfcPassportExtraction(readerState);
        } catch (IllegalArgumentException e) {
            Timber.INSTANCE.e(ch.qos.logback.core.util.a.q(e, new StringBuilder("NFC Logger - ")), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable readNfcTagInternal(final PassportBACKey passportBACKey, final byte[] aaChallenge, final Tag tag2, final String pinNumber, final ArrayDeque<Short> dataGroups, final ReaderState readerState, final boolean tryPace, final boolean readRoId) {
        Observable observableCreate = Observable.create(new j() { // from class: com.onfido.android.sdk.capture.internal.nfc.b
            @Override // fgm.j
            public final void f(c1 c1Var) throws Throwable {
                JMRTDPassportNfcReaderStateful.readNfcTagInternal$lambda$3(this.f49934a, tag2, passportBACKey, tryPace, readerState, dataGroups, aaChallenge, pinNumber, readRoId, c1Var);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    public static final void readNfcTagInternal$lambda$3(JMRTDPassportNfcReaderStateful this$0, Tag tag2, PassportBACKey passportBACKey, boolean z, ReaderState readerState, ArrayDeque dataGroups, byte[] bArr, String str, boolean z3, ObservableEmitter observableEmitter) throws Throwable {
        String str2;
        PassportService passportService;
        int i;
        PassportService passportService2;
        int i2;
        PassportService passportService3;
        int i3;
        PassportService passportService4;
        int i5;
        PassportService passportService5;
        Object failed;
        ObservableEmitter emitter = observableEmitter;
        int i6 = "BC";
        String str3 = "";
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tag2, "$tag");
        Intrinsics.checkNotNullParameter(passportBACKey, "$passportBACKey");
        Intrinsics.checkNotNullParameter(readerState, "$readerState");
        Intrinsics.checkNotNullParameter(dataGroups, "$dataGroups");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
        try {
            try {
                PassportService passportServiceCreatePassportService = this$0.jmrtdHelper.createPassportService(tag2, this$0.nfcScanTagTimeout);
                try {
                    Timber.Companion companion = Timber.INSTANCE;
                    companion.i("NFC Logger - readNfcTag - Attempting to open passport service", new Object[0]);
                    passportServiceCreatePassportService.open();
                    companion.i("NFC Logger - readNfcTag - Passport service opened", new Object[0]);
                    str2 = "BC";
                    i6 = 0;
                    try {
                        try {
                            PassportAuthAccess authAccess = this$0.getAuthAccess(passportServiceCreatePassportService, passportBACKey, null, z, readerState);
                            if (authAccess.getHasAccess()) {
                                NfcFlowType nfcFlowType = authAccess.getHasPaceAuthSucceeded() ? NfcFlowType.PACE : NfcFlowType.BAC;
                                StringBuilder sb6 = new StringBuilder("NFC Logger - readNfcTag - ");
                                ReadingStep readingStep = ReadingStep.Authenticated;
                                sb6.append(readingStep);
                                sb6.append(" - Auth: ");
                                sb6.append(nfcFlowType.name());
                                companion.i(sb6.toString(), new Object[0]);
                                this$0.nfcTracker.trackNfcChipAuthenticated$onfido_capture_sdk_core_release(nfcFlowType, authAccess);
                                if (((Number) dataGroups.first()).shortValue() == 257) {
                                    this$0.updateStep(emitter, readingStep);
                                }
                                try {
                                    NfcPassportExtraction nfcInfo = this$0.readNfcInfo(passportServiceCreatePassportService, bArr, emitter, dataGroups, readerState, str, z3);
                                    emitter = emitter;
                                    passportServiceCreatePassportService.close();
                                    if (nfcInfo == null) {
                                        companion.w("NFC Logger - readNfcTag - Passport extraction failed", new Object[0]);
                                        if (!emitter.isDisposed()) {
                                            failed = new PassportNfcExtractionState.Failed("Passport extraction failed", authAccess);
                                            emitter.onNext(failed);
                                            emitter.onComplete();
                                        }
                                    } else if (!emitter.isDisposed()) {
                                        emitter.onNext(new PassportNfcExtractionState.Success(nfcInfo, authAccess));
                                        emitter.onComplete();
                                    }
                                } catch (ConnectionLostException e) {
                                    e = e;
                                    emitter = emitter;
                                    passportService5 = passportServiceCreatePassportService;
                                    i5 = i6;
                                    Timber.Companion companion2 = Timber.INSTANCE;
                                    String message = e.getMessage();
                                    if (message != null) {
                                        str3 = message;
                                    }
                                    companion2.w("NFC Logger - readNfcTag - Connection Lost ".concat(str3), new Object[i5]);
                                    if (!emitter.isDisposed()) {
                                        emitter.onNext(PassportNfcExtractionState.ConnectionLost.INSTANCE);
                                    }
                                    if (passportService5 != null && passportService5.isOpen()) {
                                        companion2.i("NFC Logger - readNfcTag - Attempting to close passport service", new Object[i5]);
                                        passportService5.close();
                                        companion2.i("NFC Logger - readNfcTag - Passport service closed", new Object[i5]);
                                    }
                                } catch (IncorrectPinException e2) {
                                    e = e2;
                                    emitter = emitter;
                                    passportService4 = passportServiceCreatePassportService;
                                    i3 = i6;
                                    Timber.Companion companion3 = Timber.INSTANCE;
                                    companion3.w("NFC Logger - readNfcTag - Incorrect PIN", new Object[i3]);
                                    if (!emitter.isDisposed()) {
                                        emitter.onNext(new PassportNfcExtractionState.PinVerificationFailed(e.getAttemptsLeft()));
                                    }
                                    if (passportService4 != null && passportService4.isOpen()) {
                                        companion3.i("NFC Logger - readNfcTag - Attempting to close passport service", new Object[i3]);
                                        passportService4.close();
                                        companion3.i("NFC Logger - readNfcTag - Passport service closed", new Object[i3]);
                                    }
                                } catch (CardServiceException e4) {
                                    e = e4;
                                    emitter = emitter;
                                    passportService3 = passportServiceCreatePassportService;
                                    i2 = i6;
                                    Timber.Companion companion4 = Timber.INSTANCE;
                                    String message2 = e.getMessage();
                                    if (message2 != null) {
                                        str3 = message2;
                                    }
                                    companion4.w("NFC Logger - readNfcTag - ".concat(str3), new Object[i2]);
                                    if (!emitter.isDisposed()) {
                                        emitter.onNext((passportService3 == null || !passportService3.isConnectionLost(e)) ? new PassportNfcExtractionState.Failed("CardServiceException", new PassportAuthAccess(false, false, false, null, null, null, null, null, 255, null)) : PassportNfcExtractionState.ConnectionLost.INSTANCE);
                                        emitter.onComplete();
                                    }
                                    if (passportService3 != null && passportService3.isOpen()) {
                                        companion4.i("NFC Logger - readNfcTag - Attempting to close passport service", new Object[i2]);
                                        passportService3.close();
                                        companion4.i("NFC Logger - readNfcTag - Passport service closed", new Object[i2]);
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    emitter = emitter;
                                    passportService2 = passportServiceCreatePassportService;
                                    i = i6;
                                    Timber.Companion companion5 = Timber.INSTANCE;
                                    String message3 = e.getMessage();
                                    if (message3 == null) {
                                        message3 = "";
                                    }
                                    companion5.w("NFC Logger - readNfcTag - ".concat(message3), new Object[i]);
                                    if (!emitter.isDisposed()) {
                                        String message4 = e.getMessage();
                                        if (message4 != null) {
                                            str3 = message4;
                                        }
                                        emitter.onNext(new PassportNfcExtractionState.Failed(str3, new PassportAuthAccess(false, false, false, null, null, null, null, null, 255, null)));
                                        emitter.onComplete();
                                    }
                                    if (passportService2 != null && passportService2.isOpen()) {
                                        companion5.i("NFC Logger - readNfcTag - Attempting to close passport service", new Object[i]);
                                        passportService2.close();
                                        companion5.i("NFC Logger - readNfcTag - Passport service closed", new Object[i]);
                                    }
                                }
                            } else {
                                companion.i("NFC Logger - readNfcTag - Not " + ReadingStep.Authenticated, new Object[0]);
                                passportServiceCreatePassportService.close();
                                if (!emitter.isDisposed()) {
                                    failed = (passportServiceCreatePassportService.isConnectionLost(authAccess.getPaceException()) || passportServiceCreatePassportService.isConnectionLost(authAccess.getBacException())) ? PassportNfcExtractionState.ConnectionLost.INSTANCE : new PassportNfcExtractionState.Failed("Not Authenticated", authAccess);
                                    emitter.onNext(failed);
                                    emitter.onComplete();
                                }
                            }
                            if (passportServiceCreatePassportService.isOpen()) {
                                companion.i("NFC Logger - readNfcTag - Attempting to close passport service", new Object[0]);
                                passportServiceCreatePassportService.close();
                                companion.i("NFC Logger - readNfcTag - Passport service closed", new Object[0]);
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            passportService = passportServiceCreatePassportService;
                            if (passportService != null && passportService.isOpen()) {
                                Timber.Companion companion6 = Timber.INSTANCE;
                                companion6.i("NFC Logger - readNfcTag - Attempting to close passport service", new Object[i6]);
                                passportService.close();
                                companion6.i("NFC Logger - readNfcTag - Passport service closed", new Object[i6]);
                            }
                            Security.removeProvider(str2);
                            throw th;
                        }
                    } catch (ConnectionLostException e6) {
                        e = e6;
                    } catch (IncorrectPinException e22) {
                        e = e22;
                    } catch (CardServiceException e33) {
                        e = e33;
                    } catch (Exception e35) {
                        e = e35;
                    }
                } catch (ConnectionLostException e41) {
                    e = e41;
                    str2 = "BC";
                    i6 = 0;
                } catch (IncorrectPinException e45) {
                    e = e45;
                    str2 = "BC";
                    i6 = 0;
                } catch (CardServiceException e47) {
                    e = e47;
                    str2 = "BC";
                    i6 = 0;
                } catch (Exception e70) {
                    e = e70;
                    str2 = "BC";
                    i6 = 0;
                } catch (Throwable th11) {
                    th = th11;
                    str2 = "BC";
                    i6 = 0;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (ConnectionLostException e74) {
            e = e74;
            str2 = "BC";
            i5 = 0;
            passportService5 = null;
        } catch (IncorrectPinException e83) {
            e = e83;
            str2 = "BC";
            i3 = 0;
            passportService4 = null;
        } catch (CardServiceException e90) {
            e = e90;
            str2 = "BC";
            i2 = 0;
            passportService3 = null;
        } catch (Exception e100) {
            e = e100;
            str2 = "BC";
            i = 0;
            passportService2 = null;
        } catch (Throwable th13) {
            th = th13;
            str2 = "BC";
            i6 = 0;
            passportService = null;
        }
        Security.removeProvider(str2);
    }

    private final ReadingStep toReadingStep(short s2) {
        if (s2 == 257) {
            return ReadingStep.DG1Read;
        }
        if (s2 == 258) {
            return ReadingStep.DG2Read;
        }
        if (s2 == 259) {
            return ReadingStep.DG3Read;
        }
        if (s2 == 260) {
            return ReadingStep.DG4Read;
        }
        if (s2 == 261) {
            return ReadingStep.DG5Read;
        }
        if (s2 == 262) {
            return ReadingStep.DG6Read;
        }
        if (s2 == 263) {
            return ReadingStep.DG7Read;
        }
        if (s2 == 264) {
            return ReadingStep.DG8Read;
        }
        if (s2 == 265) {
            return ReadingStep.DG9Read;
        }
        if (s2 == 266) {
            return ReadingStep.DG10Read;
        }
        if (s2 == 267) {
            return ReadingStep.DG11Read;
        }
        if (s2 == 268) {
            return ReadingStep.DG12Read;
        }
        if (s2 == 269) {
            return ReadingStep.DG13Read;
        }
        if (s2 == 270) {
            return ReadingStep.DG14Read;
        }
        if (s2 == 271) {
            return ReadingStep.DG15Read;
        }
        if (s2 == 272) {
            return ReadingStep.DG16Read;
        }
        if (s2 == 285) {
            return ReadingStep.SODRead;
        }
        throw new IllegalArgumentException(a0.d.h(s2, " data group can not be mapped to ReadingStep"));
    }

    private final void updateStep(ObservableEmitter observableEmitter, ReadingStep readingStep) {
        if (observableEmitter.isDisposed()) {
            return;
        }
        List<? extends ReadingStep> list = this.allReadingSteps;
        if (list != null) {
            observableEmitter.onNext(new PassportNfcExtractionState.Reading(readingStep.progressPercentage(list)));
        } else {
            Intrinsics.r("allReadingSteps");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.nfc.PassportNfcReader
    @NotNull
    public Observable readNfcTag(@NotNull Observable nfcTagRetries, @NotNull final PassportBACKey passportBACKey, final byte[] aaChallenge, @NotNull Tag tag2, @NotNull MRTDDataGroup[] fileIDs, final String pinNumber, final boolean isPaceEnabled, @NotNull NfcFlowType nfcFlowType, boolean chipAuthentication, final boolean readRoId, RealtimeNfcEvents realtimeNfcEvents) {
        Intrinsics.checkNotNullParameter(nfcTagRetries, "nfcTagRetries");
        Intrinsics.checkNotNullParameter(passportBACKey, "passportBACKey");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(fileIDs, "fileIDs");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final ArrayDeque<Short> arrayDequeMapDataGroupsToBeRead = mapDataGroupsToBeRead(fileIDs);
        final ReaderState readerState = new ReaderState(null, null, null, null, 15, null);
        aim.e eVarB = u.b();
        eVarB.add(ReadingStep.Authenticated);
        ArrayList arrayList = new ArrayList(w.t(arrayDequeMapDataGroupsToBeRead, 10));
        Iterator<Short> it8 = arrayDequeMapDataGroupsToBeRead.iterator();
        while (it8.hasNext()) {
            arrayList.add(toReadingStep(it8.next().shortValue()));
        }
        eVarB.addAll(arrayList);
        eVarB.add(ReadingStep.DoActiveAuth);
        if (readRoId) {
            eVarB.add(ReadingStep.RomanianIdRead);
        }
        this.allReadingSteps = u.a(eVarB);
        Observable observableTakeUntil = Observable.merge(nfcTagRetries, Observable.just(tag2)).switchMap(new igm.o() { // from class: com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.readNfcTag.2
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Tag it9) {
                Intrinsics.checkNotNullParameter(it9, "it");
                return JMRTDPassportNfcReaderStateful.this.readNfcTagInternal(passportBACKey, aaChallenge, it9, pinNumber, arrayDequeMapDataGroupsToBeRead, readerState, isPaceEnabled, readRoId).startWithItem(new PassportNfcExtractionState.Reading(ref$IntRef.f186408a)).timeout(60000L, TimeUnit.MILLISECONDS);
            }
        }).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.readNfcTag.3
            @Override // igm.g
            public final void accept(@NotNull PassportNfcExtractionState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof PassportNfcExtractionState.Reading) {
                    ref$IntRef.f186408a = ((PassportNfcExtractionState.Reading) state).getProgress();
                }
            }
        }).takeUntil(new p() { // from class: com.onfido.android.sdk.capture.internal.nfc.JMRTDPassportNfcReaderStateful.readNfcTag.4
            @Override // igm.p
            public final boolean test(@NotNull PassportNfcExtractionState it9) {
                Intrinsics.checkNotNullParameter(it9, "it");
                return (it9 instanceof PassportNfcExtractionState.Success) || (it9 instanceof PassportNfcExtractionState.Failed);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }
}
