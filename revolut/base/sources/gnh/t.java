package gnh;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zfl.a f145019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vel.f f145020b;

    public t(vel.f performanceAsset) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f145019a = new zfl.a(performanceAsset);
        this.f145020b = performanceAsset;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f145019a.f322032b;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        this.f145019a.getClass();
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f145019a.f322031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f145020b, ((t) obj2).f145020b);
    }

    public final int hashCode() {
        return this.f145020b.hashCode();
    }
}
