package oq0;

import android.view.animation.LinearInterpolator;
import cs0.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    public static cs0.a a() {
        a.d dVar = cs0.a.Companion;
        a.C0641a c0641a = new a.C0641a();
        c0641a.c(0.4f);
        c0641a.g(1.0f);
        c0641a.d(cs0.d.LEFT_TO_RIGHT);
        c0641a.f(1300L);
        c0641a.h();
        c0641a.e();
        cs0.a aVar = c0641a.f108423a;
        aVar.o = 1;
        LinearInterpolator interpolator = new LinearInterpolator();
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        aVar.f108422t = interpolator;
        return c0641a.a();
    }
}
