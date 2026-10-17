package aeh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements ffl.a, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f3589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f3590c;

    public f(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f3588a = ref2;
        this.f3589b = new p5d.b(ref2, "instrument", null);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(ref2);
        aVarNewBuilder.i(hd.MUTUAL_FUND);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.f3590c = AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return new AnalyticsContext(this.f3590c);
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f3589b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f3588a, ((f) obj2).f3588a);
    }

    public final int hashCode() {
        return this.f3588a.hashCode();
    }

    @Override // ffl.a
    public final String i() {
        return this.f3588a;
    }
}
