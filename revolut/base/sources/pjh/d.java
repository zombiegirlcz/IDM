package pjh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kel.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f236777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccountType f236778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationRequest f236779c;
    public final p5d.b d;
    public final AnalyticsContext e;

    public d(n stockHolding, TradingAccountType accountType, AnimationRequest animationRequest) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f236777a = stockHolding;
        this.f236778b = accountType;
        this.f236779c = animationRequest;
        this.d = new p5d.b(stockHolding.e, "instrument", stockHolding.f183173a.f183146b);
        hd hdVarM = a.a.M(stockHolding.f183178j);
        if (hdVarM != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
            aVarNewBuilder.h(stockHolding.e);
            aVarNewBuilder.i(hdVarM);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else {
            analyticsContext = null;
        }
        this.e = analyticsContext;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.e;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return this.f236779c;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f236777a, dVar.f236777a) && Intrinsics.f(this.f236778b, dVar.f236778b) && Intrinsics.f(this.f236779c, dVar.f236779c);
    }

    public final int hashCode() {
        int iHashCode = (this.f236778b.hashCode() + (this.f236777a.hashCode() * 31)) * 31;
        AnimationRequest animationRequest = this.f236779c;
        return iHashCode + (animationRequest == null ? 0 : animationRequest.hashCode());
    }
}
