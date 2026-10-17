package mjh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends d implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationRequest f206044c;
    public final p5d.b d;
    public final w0 e;

    public b(String instrumentRef, String portfolioId, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f206042a = instrumentRef;
        this.f206043b = portfolioId;
        this.f206044c = animationRequest;
        this.d = new p5d.b(instrumentRef, "instrument", portfolioId);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(instrumentRef);
        aVarNewBuilder.i(hd.CFD);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.e = AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return new AnalyticsContext(this.e);
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return this.f206044c;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f206042a, bVar.f206042a) && Intrinsics.f(this.f206043b, bVar.f206043b) && Intrinsics.f(this.f206044c, bVar.f206044c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f206042a.hashCode() * 31, 31, this.f206043b);
        AnimationRequest animationRequest = this.f206044c;
        return iC + (animationRequest == null ? 0 : animationRequest.hashCode());
    }
}
