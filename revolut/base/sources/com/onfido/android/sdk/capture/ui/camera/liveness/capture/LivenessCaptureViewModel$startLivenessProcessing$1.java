package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import a10.b;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengeViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import fim.a;
import gim.d;
import gim.i;
import go.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import vkm.q;
import vkm.q0;
import vkm.t;
import vkm.y;
import wc7.e;
import yhm.o;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1", f = "LivenessCaptureViewModel.kt", l = {ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LivenessCaptureViewModel$startLivenessProcessing$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $challengesCounterFlow;
    final /* synthetic */ LivenessChallengesViewModel $challengesViewModel;
    int label;
    final /* synthetic */ LivenessCaptureViewModel this$0;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$1", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "counter"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function3 {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
            return invoke((Unit) obj2, ((Number) obj3).intValue(), (Continuation<? super Integer>) obj4);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return new Integer(this.I$0);
        }

        public final Object invoke(@NotNull Unit unit, int i, Continuation<? super Integer> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.I$0 = i;
            return anonymousClass1.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$2", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "", "counter", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<Integer, Continuation<? super Flow>, Object> {
        final /* synthetic */ LivenessChallengesViewModel $challengesViewModel;
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ LivenessCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LivenessChallengesViewModel livenessChallengesViewModel, LivenessCaptureViewModel livenessCaptureViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$challengesViewModel = livenessChallengesViewModel;
            this.this$0 = livenessCaptureViewModel;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$challengesViewModel, this.this$0, continuation);
            anonymousClass2.I$0 = ((Number) obj2).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i, Continuation<? super Flow> continuation) {
            return ((AnonymousClass2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            int i = this.I$0;
            if (i >= this.$challengesViewModel.getChallenges().size()) {
                return vkm.i.f290039a;
            }
            return new g(new Pair(new LivenessChallengeViewModel(i, this.$challengesViewModel.getChallenges().get(i), i == v.j(this.$challengesViewModel.getChallenges())), new Long(this.this$0.timeProvider.getCurrentTimestamp())), 2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            return invoke(((Number) obj2).intValue(), (Continuation<? super Flow>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$3, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$3", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        final /* synthetic */ LivenessChallengesViewModel $challengesViewModel;
        int label;
        final /* synthetic */ LivenessCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LivenessCaptureViewModel livenessCaptureViewModel, LivenessChallengesViewModel livenessChallengesViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = livenessCaptureViewModel;
            this.$challengesViewModel = livenessChallengesViewModel;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$challengesViewModel, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            this.this$0.livenessInteractor.initializePerformedChallenges(this.$challengesViewModel.getId());
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull FlowCollector flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$4, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$4", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u008a@"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function2<Pair<? extends LivenessChallengeViewModel, ? extends Long>, Continuation<? super Unit>, Object> {
        final /* synthetic */ LivenessChallengesViewModel $challengesViewModel;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LivenessCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LivenessCaptureViewModel livenessCaptureViewModel, LivenessChallengesViewModel livenessChallengesViewModel, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = livenessCaptureViewModel;
            this.$challengesViewModel = livenessChallengesViewModel;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$challengesViewModel, continuation);
            anonymousClass4.L$0 = obj2;
            return anonymousClass4;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            LivenessChallengeViewModel livenessChallengeViewModel = (LivenessChallengeViewModel) ((Pair) this.L$0).f186385a;
            this.this$0.processCurrentChallenge(livenessChallengeViewModel, this.$challengesViewModel);
            this.this$0.onNextChallenge$onfido_capture_sdk_core_release(livenessChallengeViewModel.getChallenge());
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull Pair<LivenessChallengeViewModel, Long> pair, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(pair, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$5, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$5", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass5 extends i implements Function3 {
        final /* synthetic */ LivenessChallengesViewModel $challengesViewModel;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LivenessCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LivenessCaptureViewModel livenessCaptureViewModel, LivenessChallengesViewModel livenessChallengesViewModel, Continuation<? super AnonymousClass5> continuation) {
            super(3, continuation);
            this.this$0 = livenessCaptureViewModel;
            this.$challengesViewModel = livenessChallengesViewModel;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            if (((Throwable) this.L$0) == null) {
                this.this$0.pushPerformedChallenge$onfido_capture_sdk_core_release((LivenessChallenge) d0.m0(this.$challengesViewModel.getChallenges()));
                this.this$0.getChallengesCompletedLiveData$onfido_capture_sdk_core_release().postValue(Boolean.TRUE);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(@NotNull FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$challengesViewModel, continuation);
            anonymousClass5.L$0 = th10;
            return anonymousClass5.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$6, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$startLivenessProcessing$1$6", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass6 extends i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(3, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            Throwable th10 = (Throwable) this.L$0;
            Timber.INSTANCE.i(th10, b.u(new StringBuilder("Error on Liveness challenge provider: "), th10), new Object[0]);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull Throwable th10, Continuation<? super Unit> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(continuation);
            anonymousClass6.L$0 = th10;
            return anonymousClass6.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessCaptureViewModel$startLivenessProcessing$1(LivenessCaptureViewModel livenessCaptureViewModel, Flow flow, LivenessChallengesViewModel livenessChallengesViewModel, Continuation<? super LivenessCaptureViewModel$startLivenessProcessing$1> continuation) {
        super(2, continuation);
        this.this$0 = livenessCaptureViewModel;
        this.$challengesCounterFlow = flow;
        this.$challengesViewModel = livenessChallengesViewModel;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new LivenessCaptureViewModel$startLivenessProcessing$1(this.this$0, this.$challengesCounterFlow, this.$challengesViewModel, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            y yVar = new y(new t(new q0(new y(new AnonymousClass3(this.this$0, this.$challengesViewModel, null), q.B(new AnonymousClass2(this.$challengesViewModel, this.this$0, null), new e(this.$challengesCounterFlow, this.this$0.livenessInteractor.getLivenessControlButtonSharedFlow(), new AnonymousClass1(null)))), new AnonymousClass4(this.this$0, this.$challengesViewModel, null), 1), new AnonymousClass5(this.this$0, this.$challengesViewModel, null)), new AnonymousClass6(null));
            this.label = 1;
            if (q.n(yVar, this) == aVar) {
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
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivenessCaptureViewModel$startLivenessProcessing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
