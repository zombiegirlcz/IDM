package androidx.view.compose;

import androidx.view.BackEventCompat;
import androidx.view.compose.internal.BackHandlerCompat;
import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.d;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import ukm.f;
import ukm.u;
import vc.s;
import vkm.e;
import vkm.t;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014RD\u0010\u0019\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/activity/compose/ComposePredictiveBackHandler;", "Landroidx/activity/compose/internal/BackHandlerCompat;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroidx/activity/compose/PredictiveBackHandlerInfo;", "info", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/activity/compose/PredictiveBackHandlerInfo;)V", "", "launchNewGesture", "()V", "Landroidx/activity/BackEventCompat;", "event", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCompleted", "onBackCancelled", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/Continuation;", "", "currentOnBack", "Lkotlin/jvm/functions/Function2;", "getCurrentOnBack", "()Lkotlin/jvm/functions/Function2;", "setCurrentOnBack", "(Lkotlin/jvm/functions/Function2;)V", "Lukm/u;", "activeChannel", "Lukm/u;", "Lkotlinx/coroutines/Job;", "activeJob", "Lkotlinx/coroutines/Job;", "", "isPredictiveBack", "Z", "value", "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposePredictiveBackHandler extends BackHandlerCompat {
    private u activeChannel;
    private Job activeJob;

    @NotNull
    private Function2<? super Flow, ? super Continuation<? super Unit>, ? extends Object> currentOnBack;
    private boolean isPredictiveBack;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1, reason: invalid class name */
    @d(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", l = {Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/activity/BackEventCompat;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C00181 extends i implements Function3 {
            final /* synthetic */ Ref$BooleanRef $completed;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(Ref$BooleanRef ref$BooleanRef, Continuation<? super C00181> continuation) {
                super(3, continuation);
                this.$completed = ref$BooleanRef;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                this.$completed.f186407a = true;
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
                return new C00181(this.$completed, continuation).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return ComposePredictiveBackHandler.this.new AnonymousClass1(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Ref$BooleanRef ref$BooleanRef;
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                o.b(obj2);
                if (ComposePredictiveBackHandler.this.isBackEnabled()) {
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Function2<Flow, Continuation<? super Unit>, Object> currentOnBack = ComposePredictiveBackHandler.this.getCurrentOnBack();
                    u uVar = ComposePredictiveBackHandler.this.activeChannel;
                    Intrinsics.h(uVar);
                    t tVar = new t(new e(uVar, z), new C00181(ref$BooleanRef2, null));
                    this.L$0 = ref$BooleanRef2;
                    this.label = 1;
                    if (currentOnBack.invoke(tVar, this) == aVar) {
                        return aVar;
                    }
                    ref$BooleanRef = ref$BooleanRef2;
                }
                return Unit.f186387a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$0;
            o.b(obj2);
            if (!ref$BooleanRef.f186407a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public ComposePredictiveBackHandler(@NotNull CoroutineScope coroutineScope, @NotNull PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.scope = coroutineScope;
        this.currentOnBack = new ComposePredictiveBackHandler$currentOnBack$1(null);
    }

    private final void launchNewGesture() {
        this.activeChannel = s.a(-2, f.SUSPEND, null, 4);
        this.activeJob = e0.C(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    @NotNull
    public final Function2<Flow, Continuation<? super Unit>, Object> getCurrentOnBack() {
        return this.currentOnBack;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public boolean isBackEnabled() {
        return super.isBackEnabled();
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public void onBackCancelled() {
        u uVar = this.activeChannel;
        if (uVar != null) {
            uVar.f(new CancellationException("onBack cancelled"));
        }
        Job job2 = this.activeJob;
        if (job2 != null) {
            job2.f(null);
        }
        this.activeChannel = null;
        this.activeJob = null;
        this.isPredictiveBack = false;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public void onBackCompleted() {
        if (this.activeChannel != null && !this.isPredictiveBack) {
            onBackCancelled();
        }
        if (this.activeChannel == null) {
            this.isPredictiveBack = false;
            launchNewGesture();
        }
        u uVar = this.activeChannel;
        if (uVar != null) {
            uVar.close(null);
        }
        this.isPredictiveBack = false;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public void onBackProgressed(@NotNull BackEventCompat event) {
        u uVar = this.activeChannel;
        if (uVar != null) {
            uVar.mo3647trySendJP2dKIU(event);
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public void onBackStarted(@NotNull BackEventCompat event) {
        onBackCancelled();
        if (isBackEnabled()) {
            this.isPredictiveBack = true;
            launchNewGesture();
        }
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public void setBackEnabled(boolean z) {
        Job job2;
        if (!z && super.isBackEnabled() && (job2 = this.activeJob) != null && !job2.d()) {
            onBackCancelled();
        }
        super.setBackEnabled(z);
    }

    public final void setCurrentOnBack(@NotNull Function2<? super Flow, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.currentOnBack = function2;
    }
}
