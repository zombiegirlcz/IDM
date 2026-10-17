package cs0;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f108426a;

    public g(LinearInterpolator baseInterpolator, long j2) {
        Intrinsics.checkNotNullParameter(baseInterpolator, "baseInterpolator");
        this.f108426a = baseInterpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f108426a.getInterpolation(f);
    }
}
