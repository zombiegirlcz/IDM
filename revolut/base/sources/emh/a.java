package emh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b implements ffl.a, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f127656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f127657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f127658c;

    public a(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f127656a = instrument;
        AnalyticsContext analyticsContext = null;
        this.f127657b = new p5d.b(instrument.f214596b, "instrument", null);
        hd hdVarM = a.a.M(instrument.f214597c);
        if (hdVarM != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
            aVarNewBuilder.h(instrument.f214596b);
            aVarNewBuilder.i(hdVarM);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        }
        this.f127658c = analyticsContext;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f127658c;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f127657b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f127656a, ((a) obj2).f127656a);
    }

    public final int hashCode() {
        return this.f127656a.hashCode();
    }

    @Override // ffl.a
    public final String i() {
        return this.f127656a.f214596b;
    }
}
