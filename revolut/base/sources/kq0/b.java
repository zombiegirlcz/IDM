package kq0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements jq0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatorSet f188283a;

    public b(AnimatorSet animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f188283a = animator;
    }

    @Override // jq0.d
    public final Animator a() {
        return this.f188283a;
    }
}
