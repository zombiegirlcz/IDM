package com.revolut.core.ui_kit.views.slider_layout;

import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import dy0.a0;
import dy0.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    @NotNull
    public static final a0 Companion = new a0();
    public static final f d = new f(null, r.HIDDEN, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f59684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f59685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SliderLayout.SlidingSpec f59686c;

    public f(d dVar, r state, SliderLayout.SlidingSpec slidingSpec) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f59684a = dVar;
        this.f59685b = state;
        this.f59686c = slidingSpec;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f59684a, fVar.f59684a) && this.f59685b == fVar.f59685b && Intrinsics.f(this.f59686c, fVar.f59686c);
    }

    public final int hashCode() {
        d dVar = this.f59684a;
        int iHashCode = (this.f59685b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31;
        SliderLayout.SlidingSpec slidingSpec = this.f59686c;
        return iHashCode + (slidingSpec != null ? slidingSpec.hashCode() : 0);
    }
}
