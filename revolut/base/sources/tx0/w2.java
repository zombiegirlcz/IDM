package tx0;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w2 extends ValueAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f275262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f275263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f275264c;

    public w2(int i, int i2, int i3) {
        this.f275262a = i;
        this.f275263b = i2;
        this.f275264c = i3;
        setIntValues(i2, i3);
    }

    @Override // android.animation.ValueAnimator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer getAnimatedValue() {
        Object animatedValue = super.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) animatedValue;
    }
}
