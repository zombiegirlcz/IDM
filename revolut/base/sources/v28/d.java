package v28;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zfl.a f285681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vel.f f285682b;

    public d(vel.f performanceAsset) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f285681a = new zfl.a(performanceAsset);
        this.f285682b = performanceAsset;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f285681a.f322032b;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        this.f285681a.getClass();
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f285681a.f322031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f285682b, ((d) obj2).f285682b);
    }

    public final int hashCode() {
        return this.f285682b.hashCode();
    }
}
