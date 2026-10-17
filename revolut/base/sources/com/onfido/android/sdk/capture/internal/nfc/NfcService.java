package com.onfido.android.sdk.capture.internal.nfc;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import androidx.core.os.BundleKt;
import com.onfido.android.sdk.capture.internal.nfc.NfcReader;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.nfc.MRTDAccessControl;
import com.onfido.android.sdk.capture.nfc.MRTDData;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.nfc.MRTDDocumentInfo;
import com.onfido.android.sdk.capture.nfc.MRTDReader;
import com.onfido.android.sdk.capture.nfc.MRTDReaderDelegate;
import elm.f;
import gim.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.q;
import wkm.l;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0000J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\t\u001a\u00020\nH\u0002JQ\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcService;", "Lcom/onfido/android/sdk/capture/nfc/MRTDReader;", "()V", "nfcServiceScope", "Lkotlinx/coroutines/CoroutineScope;", "reader", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader;", "cancelSession", "", "activity", "Landroid/app/Activity;", "createMRTDData", "Lcom/onfido/android/sdk/capture/nfc/MRTDData;", "values", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "", "aaResponse", "getService", "handleState", "state", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReader$State;", "delegate", "Lcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;", "observeNfcTags", "Lkotlinx/coroutines/flow/Flow;", "Landroid/nfc/Tag;", "read", "documentInfo", "Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;", "preferredAccessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "dataGroups", "", "activeAuthenticationChallenge", "chipAuthentication", "", "(Landroid/app/Activity;Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;[BZLcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;)V", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcService implements MRTDReader {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int MAX_PROGRESS = 100;
    private static final int NFC_SCAN_TAG_TIMEOUT = 5000;
    private static final int READER_FLAGS = 131;
    private static final int READER_PRESENCE_CHECK_DELAY = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49931a = 0;

    @NotNull
    private final CoroutineScope nfcServiceScope;

    @NotNull
    private final NfcReader reader;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/NfcService$Companion;", "", "()V", "MAX_PROGRESS", "", "NFC_SCAN_TAG_TIMEOUT", "READER_FLAGS", "READER_PRESENCE_CHECK_DELAY", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcService$observeNfcTags$1, reason: invalid class name */
    @gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcService$observeNfcTags$1", f = "NfcService.kt", l = {135}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/nfc/Tag;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<ProducerScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcService$observeNfcTags$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass2 extends u implements Function0<Unit> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ NfcAdapter $nfcAdapter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(NfcAdapter nfcAdapter, Activity activity) {
                super(0);
                this.$nfcAdapter = nfcAdapter;
                this.$activity = activity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3701invoke();
                return Unit.f186387a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3701invoke() {
                this.$nfcAdapter.disableReaderMode(this.$activity);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ProducerScope producerScope, Tag tag2) {
            Intrinsics.h(tag2);
            producerScope.mo3647trySendJP2dKIU(tag2);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.$activity);
                defaultAdapter.enableReaderMode(this.$activity, new e(producerScope, 0), 131, BundleKt.bundleOf(new Pair("presence", new Integer(1000))));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(defaultAdapter, this.$activity);
                this.label = 1;
                if (com.bumptech.glide.d.d(producerScope, anonymousClass2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull ProducerScope producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.nfc.NfcService$read$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcService$read$1", f = "NfcService.kt", l = {76}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20181 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $activeAuthenticationChallenge;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ MRTDDataGroup[] $dataGroups;
        final /* synthetic */ MRTDReaderDelegate $delegate;
        final /* synthetic */ MRTDDocumentInfo $documentInfo;
        final /* synthetic */ MRTDAccessControl $preferredAccessControl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20181(Activity activity, MRTDReaderDelegate mRTDReaderDelegate, MRTDDocumentInfo mRTDDocumentInfo, MRTDDataGroup[] mRTDDataGroupArr, MRTDAccessControl mRTDAccessControl, byte[] bArr, Continuation<? super C20181> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$delegate = mRTDReaderDelegate;
            this.$documentInfo = mRTDDocumentInfo;
            this.$dataGroups = mRTDDataGroupArr;
            this.$preferredAccessControl = mRTDAccessControl;
            this.$activeAuthenticationChallenge = bArr;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return NfcService.this.new C20181(this.$activity, this.$delegate, this.$documentInfo, this.$dataGroups, this.$preferredAccessControl, this.$activeAuthenticationChallenge, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    final Ref$ObjectRef ref$ObjectRefW = p.a.w(obj2);
                    l lVarQ = q.Q(NfcService.this.observeNfcTags(this.$activity), new NfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1(null, NfcService.this, this.$documentInfo, this.$dataGroups, this.$preferredAccessControl, this.$activeAuthenticationChallenge, ref$ObjectRefW));
                    p0 p0Var = p0.f264001a;
                    Flow flowC = q.C(lVarQ, f.f127540b);
                    final NfcService nfcService = NfcService.this;
                    final MRTDReaderDelegate mRTDReaderDelegate = this.$delegate;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.internal.nfc.NfcService.read.1.2
                        public final Object emit(@NotNull NfcReader.State state, @NotNull Continuation<? super Unit> continuation) {
                            nfcService.handleState(state, mRTDReaderDelegate);
                            if (state instanceof NfcReader.State.Reading) {
                                ref$ObjectRefW.f186409a = ((NfcReader.State.Reading) state).getDataGroupValues();
                            }
                            return Unit.f186387a;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((NfcReader.State) obj3, (Continuation<? super Unit>) continuation);
                        }
                    };
                    this.label = 1;
                    if (flowC.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
            } catch (Exception e) {
                this.$delegate.readFailed(e);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20181) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NfcService() {
        p0 p0Var = p0.f264001a;
        this.nfcServiceScope = e0.c(zkm.o.f323119a.e.plus(e0.e()));
        this.reader = new NfcReader(new JMRTDHelperImpl(5000, NfcService$reader$1.INSTANCE, false), null, 2, 0 == true ? 1 : 0);
    }

    private final MRTDData createMRTDData(Map<MRTDDataGroup, byte[]> values, byte[] aaResponse) {
        byte[] bArr = values.get(MRTDDataGroup.DG1);
        if (bArr == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        byte[] bArr2 = bArr;
        byte[] bArr3 = values.get(MRTDDataGroup.DG2);
        if (bArr3 != null) {
            return new MRTDData(bArr2, bArr3, values.get(MRTDDataGroup.DG3), values.get(MRTDDataGroup.DG4), values.get(MRTDDataGroup.DG5), values.get(MRTDDataGroup.DG6), values.get(MRTDDataGroup.DG7), values.get(MRTDDataGroup.DG8), values.get(MRTDDataGroup.DG9), values.get(MRTDDataGroup.DG10), values.get(MRTDDataGroup.DG11), values.get(MRTDDataGroup.DG12), values.get(MRTDDataGroup.DG13), values.get(MRTDDataGroup.DG14), values.get(MRTDDataGroup.DG15), values.get(MRTDDataGroup.DG16), values.get(MRTDDataGroup.COM), values.get(MRTDDataGroup.SOD), aaResponse);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState(NfcReader.State state, MRTDReaderDelegate delegate) {
        if (state instanceof NfcReader.State.ConnectionLost) {
            delegate.documentLost();
            return;
        }
        if (state instanceof NfcReader.State.Failed) {
            delegate.readFailed(((NfcReader.State.Failed) state).getError());
            return;
        }
        if (state instanceof NfcReader.State.Reading) {
            delegate.readProgress((int) (((NfcReader.State.Reading) state).getProgress() * 100));
            return;
        }
        if (state instanceof NfcReader.State.Success) {
            NfcReader.State.Success success = (NfcReader.State.Success) state;
            delegate.readFinished(createMRTDData(success.getDataGroupValues(), success.getAaResponse()));
            return;
        }
        if (state instanceof NfcReader.State.AuthenticationStarted) {
            delegate.accessControlStarted(((NfcReader.State.AuthenticationStarted) state).getAccessControl());
            return;
        }
        if (state instanceof NfcReader.State.AuthenticationFinished) {
            delegate.accessControlFinished(((NfcReader.State.AuthenticationFinished) state).getAccessControl());
            return;
        }
        if (state instanceof NfcReader.State.AuthenticationFailed) {
            NfcReader.State.AuthenticationFailed authenticationFailed = (NfcReader.State.AuthenticationFailed) state;
            delegate.accessControlFailed(authenticationFailed.getAccessControl(), authenticationFailed.getThrowable());
        } else if (state instanceof NfcReader.State.VerificationStarted) {
            delegate.verificationStarted(((NfcReader.State.VerificationStarted) state).getType());
        } else if (state instanceof NfcReader.State.VerificationFinished) {
            NfcReader.State.VerificationFinished verificationFinished = (NfcReader.State.VerificationFinished) state;
            delegate.verificationFinished(verificationFinished.getType(), verificationFinished.getResult(), verificationFinished.getThrowable());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow observeNfcTags(Activity activity) {
        return q.k(new AnonymousClass1(activity, null));
    }

    @Override // com.onfido.android.sdk.capture.nfc.MRTDReader
    public void cancelSession(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        e0.n(this.nfcServiceScope.getF74819h());
    }

    @NotNull
    public final NfcService getService() {
        return this;
    }

    @Override // com.onfido.android.sdk.capture.nfc.MRTDReader
    public void read(@NotNull Activity activity, @NotNull MRTDDocumentInfo documentInfo, MRTDAccessControl preferredAccessControl, MRTDDataGroup[] dataGroups, byte[] activeAuthenticationChallenge, boolean chipAuthentication, @NotNull MRTDReaderDelegate delegate) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(documentInfo, "documentInfo");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        e0.C(this.nfcServiceScope, null, null, new C20181(activity, delegate, documentInfo, dataGroups, preferredAccessControl, activeAuthenticationChallenge, null), 3);
    }
}
