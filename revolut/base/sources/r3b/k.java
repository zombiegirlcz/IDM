package r3b;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5d.b f251250c;
    public final w0 d;

    public k(String instrumentRef, String portfolioId) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f251248a = instrumentRef;
        this.f251249b = portfolioId;
        this.f251250c = new p5d.b(instrumentRef, "instrument", portfolioId);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(instrumentRef);
        aVarNewBuilder.i(hd.CFD);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.d = AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return new AnalyticsContext(this.d);
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f251250c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f251248a, kVar.f251248a) && Intrinsics.f(this.f251249b, kVar.f251249b);
    }

    public final int hashCode() {
        return this.f251249b.hashCode() + (this.f251248a.hashCode() * 31);
    }
}
