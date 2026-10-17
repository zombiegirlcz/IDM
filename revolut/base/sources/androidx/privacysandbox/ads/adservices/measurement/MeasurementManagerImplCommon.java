package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import fim.a;
import fim.h;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.l;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0097@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0097@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0097@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0097@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001cH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001fH\u0097@¢\u0006\u0002\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "mMeasurementManager", "Landroid/adservices/measurement/MeasurementManager;", "(Landroid/adservices/measurement/MeasurementManager;)V", "getMMeasurementManager", "()Landroid/adservices/measurement/MeasurementManager;", "deleteRegistrations", "", "deletionRequest", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMeasurementApiStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSource", "attributionSource", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerTrigger", "trigger", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebSource", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebTrigger", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MeasurementManagerImplCommon extends MeasurementManager {

    @NotNull
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4, reason: invalid class name */
    @d(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SourceRegistrationRequest sourceRegistrationRequest, MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(null, this.this$0, continuation);
            anonymousClass4.L$0 = obj2;
            return anonymousClass4;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public MeasurementManagerImplCommon(@NotNull android.adservices.measurement.MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    public static Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        new l(1, h.b(continuation)).u();
        measurementManagerImplCommon.getMMeasurementManager();
        throw null;
    }

    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new l.a(2), OutcomeReceiverKt.asOutcomeReceiver(lVar));
        Object objT = lVar.t();
        if (objT == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        Object objO = e0.o(new AnonymousClass4(sourceRegistrationRequest, measurementManagerImplCommon, null), continuation);
        return objO == a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri2, Continuation<? super Unit> frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri2, new l.a(2), OutcomeReceiverKt.asOutcomeReceiver(lVar));
        Object objT = lVar.t();
        a aVar = a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    public static Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        new l(1, h.b(continuation)).u();
        measurementManagerImplCommon.getMMeasurementManager();
        throw null;
    }

    public static Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        new l(1, h.b(continuation)).u();
        measurementManagerImplCommon.getMMeasurementManager();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object deleteRegistrations(@NotNull DeletionRequest deletionRequest, @NotNull Continuation<? super Unit> continuation) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, continuation);
    }

    @NotNull
    public final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object getMeasurementApiStatus(@NotNull Continuation<? super Integer> continuation) {
        return getMeasurementApiStatus$suspendImpl(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerSource(@NotNull Uri uri2, InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
        return registerSource$suspendImpl(this, uri2, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerTrigger(@NotNull Uri uri2, @NotNull Continuation<? super Unit> continuation) {
        return registerTrigger$suspendImpl(this, uri2, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebSource(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebTrigger(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerSource(@NotNull SourceRegistrationRequest sourceRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, continuation);
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri2, InputEvent inputEvent, Continuation<? super Unit> frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri2, inputEvent, new l.a(2), OutcomeReceiverKt.asOutcomeReceiver(lVar));
        Object objT = lVar.t();
        a aVar = a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }
}
