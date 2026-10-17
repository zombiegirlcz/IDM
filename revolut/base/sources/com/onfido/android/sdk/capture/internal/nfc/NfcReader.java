package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.Tag;
import com.onfido.android.sdk.capture.nfc.MRTDAccessControl;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.nfc.VerificationType;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import net.sf.scuba.smartcards.CardServiceException;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.BACKey;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.PACEInfo;
import org.jmrtd.lds.SecurityInfo;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001,B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\\\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0002JB\u0010#\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u00100$2\u0006\u0010 \u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001eH\u0082@¢\u0006\u0002\u0010&J6\u0010'\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100$2\u0006\u0010 \u001a\u00020!2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001eH\u0082@¢\u0006\u0002\u0010(J0\u0010)\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100$2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u0007*\u00020!2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006-"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader;", "", "jmrtdHelper", "Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDHelper;", "logger", "Lkotlin/Function1;", "", "", "(Lcom/onfido/android/sdk/capture/internal/nfc/JMRTDHelper;Lkotlin/jvm/functions/Function1;)V", "fid", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "getFid", "(Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;)S", "read", "Lkotlinx/coroutines/flow/Flow;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "tag", "Landroid/nfc/Tag;", "bacKey", "Lorg/jmrtd/BACKey;", "dataGroups", "", "preferredAccessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "aaChallenge", "", "chipAuthentication", "", "extractedValues", "", "readDataGroup", "passportService", "Lorg/jmrtd/PassportService;", "dataGroup", "attemptActiveAuth", "Lkotlinx/coroutines/flow/FlowCollector;", "dataGroupValues", "(Lkotlinx/coroutines/flow/FlowCollector;Lorg/jmrtd/PassportService;[BLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attemptChipAuth", "(Lkotlinx/coroutines/flow/FlowCollector;Lorg/jmrtd/PassportService;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authenticate", "(Lkotlinx/coroutines/flow/FlowCollector;Lorg/jmrtd/PassportService;Lorg/jmrtd/BACKey;Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPace", "State", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcReader {

    @NotNull
    private final JMRTDHelper jmrtdHelper;

    @NotNull
    private final Function1<String, Unit> logger;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcReader$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<String, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((String) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull String it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "", "()V", "AuthenticationFailed", "AuthenticationFinished", "AuthenticationStarted", "ConnectionLost", "Failed", "Reading", "Success", "VerificationFinished", "VerificationStarted", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$AuthenticationFailed;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$AuthenticationFinished;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$AuthenticationStarted;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$ConnectionLost;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$Failed;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$Reading;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$Success;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$VerificationFinished;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$VerificationStarted;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$AuthenticationFailed;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "accessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "throwable", "", "(Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;Ljava/lang/Throwable;)V", "getAccessControl", "()Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "getThrowable", "()Ljava/lang/Throwable;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AuthenticationFailed extends State {

            @NotNull
            private final MRTDAccessControl accessControl;

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthenticationFailed(@NotNull MRTDAccessControl accessControl, @NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(accessControl, "accessControl");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.accessControl = accessControl;
                this.throwable = throwable;
            }

            @NotNull
            public final MRTDAccessControl getAccessControl() {
                return this.accessControl;
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$AuthenticationFinished;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "accessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "(Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;)V", "getAccessControl", "()Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AuthenticationFinished extends State {

            @NotNull
            private final MRTDAccessControl accessControl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthenticationFinished(@NotNull MRTDAccessControl accessControl) {
                super(null);
                Intrinsics.checkNotNullParameter(accessControl, "accessControl");
                this.accessControl = accessControl;
            }

            @NotNull
            public final MRTDAccessControl getAccessControl() {
                return this.accessControl;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$AuthenticationStarted;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "accessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "(Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;)V", "getAccessControl", "()Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AuthenticationStarted extends State {

            @NotNull
            private final MRTDAccessControl accessControl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthenticationStarted(@NotNull MRTDAccessControl accessControl) {
                super(null);
                Intrinsics.checkNotNullParameter(accessControl, "accessControl");
                this.accessControl = accessControl;
            }

            @NotNull
            public final MRTDAccessControl getAccessControl() {
                return this.accessControl;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$ConnectionLost;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConnectionLost extends State {

            @NotNull
            public static final ConnectionLost INSTANCE = new ConnectionLost();

            private ConnectionLost() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$Failed;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Failed extends State {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            @NotNull
            public final Throwable getError() {
                return this.error;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0002\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$Reading;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "progress", "", "dataGroupValues", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "", "(FLjava/util/Map;)V", "getDataGroupValues", "()Ljava/util/Map;", "getProgress", "()F", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Reading extends State {

            @NotNull
            private final Map<MRTDDataGroup, byte[]> dataGroupValues;
            private final float progress;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reading(float f, @NotNull Map<MRTDDataGroup, byte[]> dataGroupValues) {
                super(null);
                Intrinsics.checkNotNullParameter(dataGroupValues, "dataGroupValues");
                this.progress = f;
                this.dataGroupValues = dataGroupValues;
            }

            @NotNull
            public final Map<MRTDDataGroup, byte[]> getDataGroupValues() {
                return this.dataGroupValues;
            }

            public final float getProgress() {
                return this.progress;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$Success;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "aaResponse", "", "dataGroupValues", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "([BLjava/util/Map;)V", "getAaResponse", "()[B", "getDataGroupValues", "()Ljava/util/Map;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Success extends State {
            private final byte[] aaResponse;

            @NotNull
            private final Map<MRTDDataGroup, byte[]> dataGroupValues;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(byte[] bArr, @NotNull Map<MRTDDataGroup, byte[]> dataGroupValues) {
                super(null);
                Intrinsics.checkNotNullParameter(dataGroupValues, "dataGroupValues");
                this.aaResponse = bArr;
                this.dataGroupValues = dataGroupValues;
            }

            public final byte[] getAaResponse() {
                return this.aaResponse;
            }

            @NotNull
            public final Map<MRTDDataGroup, byte[]> getDataGroupValues() {
                return this.dataGroupValues;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$VerificationFinished;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "type", "Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "result", "", "throwable", "", "(Lcom/onfido/android/sdk/capture/nfc/VerificationType;[BLjava/lang/Throwable;)V", "getResult", "()[B", "getThrowable", "()Ljava/lang/Throwable;", "getType", "()Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VerificationFinished extends State {
            private final byte[] result;
            private final Throwable throwable;

            @NotNull
            private final VerificationType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerificationFinished(@NotNull VerificationType type, byte[] bArr, Throwable th10) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.result = bArr;
                this.throwable = th10;
            }

            public final byte[] getResult() {
                return this.result;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final VerificationType getType() {
                return this.type;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State$VerificationStarted;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "type", "Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "(Lcom/onfido/android/sdk/capture/nfc/VerificationType;)V", "getType", "()Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VerificationStarted extends State {

            @NotNull
            private final VerificationType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerificationStarted(@NotNull VerificationType type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            @NotNull
            public final VerificationType getType() {
                return this.type;
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MRTDDataGroup.values().length];
            try {
                iArr[MRTDDataGroup.SOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MRTDDataGroup.COM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MRTDDataGroup.DG1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MRTDDataGroup.DG2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MRTDDataGroup.DG3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MRTDDataGroup.DG4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MRTDDataGroup.DG5.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MRTDDataGroup.DG6.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MRTDDataGroup.DG7.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MRTDDataGroup.DG8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MRTDDataGroup.DG9.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MRTDDataGroup.DG10.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MRTDDataGroup.DG11.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MRTDDataGroup.DG12.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MRTDDataGroup.DG13.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MRTDDataGroup.DG14.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MRTDDataGroup.DG15.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MRTDDataGroup.DG16.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcReader$attemptActiveAuth$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcReader", f = "NfcReader.kt", l = {Constants.TAG_EMV_NFC_CONFIG_VERSION, 246, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, 259, 262}, m = "attemptActiveAuth")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20141 extends gim.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C20141(Continuation<? super C20141> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return NfcReader.this.attemptActiveAuth(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcReader$attemptChipAuth$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcReader", f = "NfcReader.kt", l = {275, 288, 295, 301, 307, 320}, m = "attemptChipAuth")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20151 extends gim.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C20151(Continuation<? super C20151> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return NfcReader.this.attemptChipAuth(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcReader$authenticate$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcReader", f = "NfcReader.kt", l = {Constants.EMVTag.TAG_9A_TRANSACTION_DATE, ISO781611.SMT_DO_DS, 180, 183, 185}, m = "authenticate")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20161 extends gim.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C20161(Continuation<? super C20161> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return NfcReader.this.authenticate(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcReader$read$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcReader$read$1", f = "NfcReader.kt", l = {91, 100, 103, 104, 105, 112, 114}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20171 extends i implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $aaChallenge;
        final /* synthetic */ BACKey $bacKey;
        final /* synthetic */ boolean $chipAuthentication;
        final /* synthetic */ List<MRTDDataGroup> $dataGroups;
        final /* synthetic */ Map<MRTDDataGroup, byte[]> $extractedValues;
        final /* synthetic */ MRTDAccessControl $preferredAccessControl;
        final /* synthetic */ Tag $tag;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ NfcReader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20171(Map<MRTDDataGroup, byte[]> map, List<? extends MRTDDataGroup> list, NfcReader nfcReader, Tag tag2, BACKey bACKey, MRTDAccessControl mRTDAccessControl, byte[] bArr, boolean z, Continuation<? super C20171> continuation) {
            super(2, continuation);
            this.$extractedValues = map;
            this.$dataGroups = list;
            this.this$0 = nfcReader;
            this.$tag = tag2;
            this.$bacKey = bACKey;
            this.$preferredAccessControl = mRTDAccessControl;
            this.$aaChallenge = bArr;
            this.$chipAuthentication = z;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C20171 c20171 = new C20171(this.$extractedValues, this.$dataGroups, this.this$0, this.$tag, this.$bacKey, this.$preferredAccessControl, this.$aaChallenge, this.$chipAuthentication, continuation);
            c20171.L$0 = obj2;
            return c20171;
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0203, code lost:
        
            if (r2.emit(r3, r17) != r6) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x028c, code lost:
        
            if (r2.emit(r3, r17) == r6) goto L98;
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:33:0x00a7 */
        /* JADX WARN: Removed duplicated region for block: B:105:0x02a7 A[PHI: r1
          0x02a7: PHI (r1v6 kotlin.jvm.internal.Ref$ObjectRef) = (r1v7 kotlin.jvm.internal.Ref$ObjectRef), (r1v33 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:104:0x02a5, B:73:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02bd A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x004d, blocks: (B:7:0x001f, B:10:0x002e, B:86:0x0230, B:88:0x024e, B:90:0x0254, B:93:0x025c, B:96:0x0274, B:108:0x02bd, B:15:0x0046, B:67:0x01ef, B:20:0x005d, B:62:0x01d0, B:64:0x01d6, B:30:0x009f, B:44:0x013a), top: B:121:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01a9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01d6 A[Catch: Exception -> 0x0033, all -> 0x004d, TryCatch #8 {Exception -> 0x0033, blocks: (B:10:0x002e, B:67:0x01ef, B:20:0x005d, B:62:0x01d0, B:64:0x01d6, B:44:0x013a), top: B:121:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01ef A[Catch: Exception -> 0x0033, all -> 0x004d, PHI: r0 r1 r2 r4
          0x01ef: PHI (r0v71 byte[]) = (r0v66 byte[]), (r0v66 byte[]), (r0v75 byte[]) binds: [B:63:0x01d4, B:65:0x01eb, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x01ef: PHI (r1v30 kotlin.jvm.internal.Ref$ObjectRef) = 
          (r1v27 kotlin.jvm.internal.Ref$ObjectRef)
          (r1v27 kotlin.jvm.internal.Ref$ObjectRef)
          (r1v32 kotlin.jvm.internal.Ref$ObjectRef)
         binds: [B:63:0x01d4, B:65:0x01eb, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x01ef: PHI (r2v36 kotlinx.coroutines.flow.FlowCollector) = 
          (r2v33 kotlinx.coroutines.flow.FlowCollector)
          (r2v33 kotlinx.coroutines.flow.FlowCollector)
          (r2v39 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:63:0x01d4, B:65:0x01eb, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x01ef: PHI (r4v11 java.util.Map) = (r4v9 java.util.Map), (r4v9 java.util.Map), (r4v12 java.util.Map) binds: [B:63:0x01d4, B:65:0x01eb, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {Exception -> 0x0033, blocks: (B:10:0x002e, B:67:0x01ef, B:20:0x005d, B:62:0x01d0, B:64:0x01d6, B:44:0x013a), top: B:121:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x024e A[Catch: all -> 0x004d, TryCatch #9 {all -> 0x004d, blocks: (B:7:0x001f, B:10:0x002e, B:86:0x0230, B:88:0x024e, B:90:0x0254, B:93:0x025c, B:96:0x0274, B:108:0x02bd, B:15:0x0046, B:67:0x01ef, B:20:0x005d, B:62:0x01d0, B:64:0x01d6, B:30:0x009f, B:44:0x013a), top: B:121:0x000f }] */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.nfc.NfcReader.C20171.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull FlowCollector flowCollector, Continuation<? super Unit> continuation) {
            return ((C20171) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NfcReader(@NotNull JMRTDHelper jmrtdHelper, @NotNull Function1<? super String, Unit> logger) {
        Intrinsics.checkNotNullParameter(jmrtdHelper, "jmrtdHelper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.jmrtdHelper = jmrtdHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attemptActiveAuth(kotlinx.coroutines.flow.FlowCollector r13, org.jmrtd.PassportService r14, byte[] r15, java.util.Map<com.onfido.android.sdk.capture.nfc.MRTDDataGroup, byte[]> r16, kotlin.coroutines.Continuation<? super byte[]> r17) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.nfc.NfcReader.attemptActiveAuth(kotlinx.coroutines.flow.FlowCollector, org.jmrtd.PassportService, byte[], java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attemptActiveAuth$onVerificationFinished(FlowCollector flowCollector, Throwable th10, byte[] bArr, Continuation<? super Unit> continuation) {
        Object objEmit = flowCollector.emit(new State.VerificationFinished(VerificationType.ActiveAuthentication.INSTANCE, bArr, th10), continuation);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    public static /* synthetic */ Object attemptActiveAuth$onVerificationFinished$default(FlowCollector flowCollector, Throwable th10, byte[] bArr, Continuation continuation, int i, Object obj2) {
        if ((i & 1) != 0) {
            th10 = null;
        }
        if ((i & 2) != 0) {
            bArr = null;
        }
        return attemptActiveAuth$onVerificationFinished(flowCollector, th10, bArr, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (attemptChipAuth$onVerificationFinished$2(r8, r9, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        if (attemptChipAuth$onVerificationFinished$2(r8, r9, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        if (attemptChipAuth$onVerificationFinished$2(r8, r9, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016d, code lost:
    
        if (attemptChipAuth$onVerificationFinished$2(r8, r9, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        if (attemptChipAuth$onVerificationFinished$2(r8, r9, r0) != r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attemptChipAuth(kotlinx.coroutines.flow.FlowCollector r8, org.jmrtd.PassportService r9, java.util.Map<com.onfido.android.sdk.capture.nfc.MRTDDataGroup, byte[]> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.nfc.NfcReader.attemptChipAuth(kotlinx.coroutines.flow.FlowCollector, org.jmrtd.PassportService, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attemptChipAuth$onVerificationFinished$2(FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
        Object objEmit = flowCollector.emit(new State.VerificationFinished(VerificationType.ChipAuthentication.INSTANCE, null, th10), continuation);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    public static /* synthetic */ Object attemptChipAuth$onVerificationFinished$2$default(FlowCollector flowCollector, Throwable th10, Continuation continuation, int i, Object obj2) {
        if ((i & 1) != 0) {
            th10 = null;
        }
        return attemptChipAuth$onVerificationFinished$2(flowCollector, th10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
    
        if (r2.emit(r0, r3) != r4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type update failed for variable: r18v0 'this'  ??, new type: com.onfido.android.sdk.capture.internal.nfc.NfcReader
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object authenticate(kotlinx.coroutines.flow.FlowCollector r19, org.jmrtd.PassportService r20, org.jmrtd.BACKey r21, com.onfido.android.sdk.capture.nfc.MRTDAccessControl r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.nfc.NfcReader.authenticate(kotlinx.coroutines.flow.FlowCollector, org.jmrtd.PassportService, org.jmrtd.BACKey, com.onfido.android.sdk.capture.nfc.MRTDAccessControl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void doPace(PassportService passportService, BACKey bACKey) throws GeneralSecurityException, CardServiceException {
        Object next;
        this.logger.invoke("Building PACE key");
        PACEKeySpec pACEKeySpecCreateMRZKey = PACEKeySpec.createMRZKey(bACKey);
        this.logger.invoke("Reading Card Access file");
        CardAccessFile cardAccessFile = this.jmrtdHelper.readCardAccessFile(passportService);
        this.logger.invoke("Card access file received: " + cardAccessFile);
        Collection<SecurityInfo> securityInfos = cardAccessFile.getSecurityInfos();
        Intrinsics.checkNotNullExpressionValue(securityInfos, "getSecurityInfos(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : securityInfos) {
            if (obj2 instanceof PACEInfo) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (it8.hasNext()) {
                next = it8.next();
                if (PACEInfo.toMappingType(((PACEInfo) next).getObjectIdentifier()) == PACEInfo.MappingType.IM) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PACEInfo pACEInfo = (PACEInfo) next;
        if (pACEInfo == null && (pACEInfo = (PACEInfo) d0.d0(arrayList)) == null) {
            return;
        }
        String objectIdentifier = pACEInfo.getObjectIdentifier();
        BigInteger parameterId = pACEInfo.getParameterId();
        AlgorithmParameterSpec parameterSpec = PACEInfo.toParameterSpec(parameterId);
        this.logger.invoke("Attempting PACE with:\npaceInfo=" + pACEInfo);
        passportService.doPACE(pACEKeySpecCreateMRZKey, objectIdentifier, parameterSpec, parameterId);
    }

    private final short getFid(MRTDDataGroup mRTDDataGroup) {
        switch (WhenMappings.$EnumSwitchMapping$0[mRTDDataGroup.ordinal()]) {
            case 1:
                return (short) 285;
            case 2:
                return PassportService.EF_COM;
            case 3:
                return PassportService.EF_DG1;
            case 4:
                return PassportService.EF_DG2;
            case 5:
                return PassportService.EF_DG3;
            case 6:
                return PassportService.EF_DG4;
            case 7:
                return PassportService.EF_DG5;
            case 8:
                return PassportService.EF_DG6;
            case 9:
                return PassportService.EF_DG7;
            case 10:
                return PassportService.EF_DG8;
            case 11:
                return PassportService.EF_DG9;
            case 12:
                return PassportService.EF_DG10;
            case 13:
                return PassportService.EF_DG11;
            case 14:
                return PassportService.EF_DG12;
            case 15:
                return PassportService.EF_DG13;
            case 16:
                return PassportService.EF_DG14;
            case 17:
                return PassportService.EF_DG15;
            case 18:
                return PassportService.EF_DG16;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] readDataGroup(PassportService passportService, MRTDDataGroup dataGroup) throws Exception {
        this.logger.invoke("Attempting to read " + dataGroup);
        try {
            return this.jmrtdHelper.readBytes(passportService, getFid(dataGroup));
        } catch (Exception e) {
            if (passportService.isConnectionLost(e)) {
                throw e;
            }
            return null;
        }
    }

    @NotNull
    public final Flow read(@NotNull Tag tag2, @NotNull BACKey bacKey, @NotNull List<? extends MRTDDataGroup> dataGroups, @NotNull MRTDAccessControl preferredAccessControl, byte[] aaChallenge, boolean chipAuthentication, Map<MRTDDataGroup, byte[]> extractedValues) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(bacKey, "bacKey");
        Intrinsics.checkNotNullParameter(dataGroups, "dataGroups");
        Intrinsics.checkNotNullParameter(preferredAccessControl, "preferredAccessControl");
        return new v1(new C20171(extractedValues, dataGroups, this, tag2, bacKey, preferredAccessControl, aaChallenge, chipAuthentication, null));
    }

    public /* synthetic */ NfcReader(JMRTDHelper jMRTDHelper, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jMRTDHelper, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
