package fci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f133769c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(Object obj2, int i, Object obj3, Object obj4) {
        this.f133767a = i;
        this.f133768b = obj2;
        this.f133769c = obj3;
        this.d = obj4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        switch (this.f133767a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Ref$BooleanRef) this.f133768b).f186407a = true;
                break;
            case 2:
            default:
                super.onAnimationCancel(animation);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                tw0.d0 d0Var = (tw0.d0) this.f133768b;
                View view = (View) this.f133769c;
                d0Var.getClass();
                tw0.d0.b(view);
                ((Function0) this.d).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator endedAnimator) {
        switch (this.f133767a) {
            case 0:
                Intrinsics.checkNotNullParameter(endedAnimator, "endedAnimator");
                ((s) this.f133768b).f133807a.setAlpha(1.0f);
                d0 d0Var = (d0) this.f133769c;
                ArrayList arrayList = d0Var.f133772c;
                arrayList.remove((ValueAnimator) endedAnimator);
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.d;
                int i = ref$IntRef.f186408a - 1;
                ref$IntRef.f186408a = i;
                if (i == 0 && !d0Var.f) {
                    d0Var.f = true;
                    arrayList.clear();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(endedAnimator, "animation");
                joi.a aVar = (joi.a) this.f133769c;
                if (aVar.f177092a == endedAnimator) {
                    aVar.f177092a = null;
                }
                if (!((Ref$BooleanRef) this.f133768b).f186407a) {
                    ((Function0) this.d).invoke();
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(endedAnimator, "animation");
                View view = (View) this.f133768b;
                if (view == null) {
                    view = (View) this.f133769c;
                }
                Intrinsics.h(view);
                view.post(new kt0.d((lki.z) this.d, 7));
                break;
            default:
                Intrinsics.checkNotNullParameter(endedAnimator, "animation");
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f133767a) {
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                Unit unit = Unit.f186387a;
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }

    public c0(ts1.h hVar, tw0.d0 d0Var, View view, Function0 function0) {
        this.f133767a = 3;
        this.f133768b = d0Var;
        this.f133769c = view;
        this.d = function0;
    }
}
