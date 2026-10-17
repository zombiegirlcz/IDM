package hx0;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kji.d f156303a;

    public c0(kji.d transitionHandler) {
        Intrinsics.checkNotNullParameter(transitionHandler, "transitionHandler");
        this.f156303a = transitionHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027b  */
    @Override // android.transition.Visibility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator onAppear(android.view.ViewGroup r32, android.view.View r33, android.transition.TransitionValues r34, android.transition.TransitionValues r35) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx0.c0.onAppear(android.view.ViewGroup, android.view.View, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        fnc.s k = this.f156303a.getK();
        if (k == null) {
            return null;
        }
        k.j();
        return null;
    }
}
