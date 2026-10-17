package rch;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zfl.a f253274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vel.f f253275b;

    public g(vel.f performanceAsset) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f253274a = new zfl.a(performanceAsset);
        this.f253275b = performanceAsset;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f253274a.f322032b;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        this.f253274a.getClass();
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f253274a.f322031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f253275b, ((g) obj2).f253275b);
    }

    public final int hashCode() {
        return this.f253275b.hashCode();
    }
}
