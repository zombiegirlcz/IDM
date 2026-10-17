package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController$TransitionEffect$onStart$4 extends u implements Function0<Unit> {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ Object $mergedTransition;
    final /* synthetic */ Ref$ObjectRef $seekCancelLambda;
    final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        final /* synthetic */ ViewGroup $container;
        final /* synthetic */ Object $mergedTransition;
        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj2, ViewGroup viewGroup) {
            super(0);
            this.this$0 = transitionEffect;
            this.$mergedTransition = obj2;
            this.$container = viewGroup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(container, "$container");
            Iterator<T> it8 = this$0.getTransitionInfos().iterator();
            while (it8.hasNext()) {
                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it8.next()).getOperation();
                View view = operation.getFragment().getView();
                if (view != null) {
                    operation.getFinalState().applyState(view, container);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
            }
            Iterator<T> it8 = this$0.getTransitionInfos().iterator();
            while (it8.hasNext()) {
                ((DefaultSpecialEffectsController.TransitionInfo) it8.next()).getOperation().completeEffect(this$0);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3476invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3476invoke() {
            List<DefaultSpecialEffectsController.TransitionInfo> transitionInfos = this.this$0.getTransitionInfos();
            if (!(transitionInfos instanceof Collection) || !transitionInfos.isEmpty()) {
                Iterator<T> it8 = transitionInfos.iterator();
                while (it8.hasNext()) {
                    if (!((DefaultSpecialEffectsController.TransitionInfo) it8.next()).getOperation().getIsSeeking()) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                        }
                        CancellationSignal cancellationSignal = new CancellationSignal();
                        this.this$0.getTransitionImpl().setListenerForTransitionEnd(this.this$0.getTransitionInfos().get(0).getOperation().getFragment(), this.$mergedTransition, cancellationSignal, new b(this.this$0, 2));
                        cancellationSignal.cancel();
                        return;
                    }
                }
            }
            if (FragmentManager.isLoggingEnabled(2)) {
            }
            FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
            Object controller = this.this$0.getController();
            Intrinsics.h(controller);
            transitionImpl.animateToStart(controller, new d(this.this$0, this.$container, 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onStart$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup, Object obj2, Ref$ObjectRef ref$ObjectRef) {
        super(0);
        this.this$0 = transitionEffect;
        this.$container = viewGroup;
        this.$mergedTransition = obj2;
        this.$seekCancelLambda = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3475invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3475invoke() {
        if (FragmentManager.isLoggingEnabled(2)) {
        }
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(this.$container, this.$mergedTransition));
        if (this.this$0.getController() == null) {
            if (FragmentManager.isLoggingEnabled(2)) {
            }
            this.this$0.setNoControllerReturned(true);
            return;
        }
        this.$seekCancelLambda.f186409a = new AnonymousClass1(this.this$0, this.$mergedTransition, this.$container);
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Started executing operations from " + this.this$0.getFirstOut() + " to " + this.this$0.getLastIn();
        }
    }
}
