package s4f;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f259853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f259854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f259855c;

    public h(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f259853a = instrument;
        AnalyticsContext analyticsContext = null;
        this.f259854b = new p5d.b(instrument.f214596b, "instrument", null);
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
        this.f259855c = analyticsContext;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f259855c;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f259854b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f259853a, ((h) obj2).f259853a);
    }

    public final int hashCode() {
        return this.f259853a.hashCode();
    }
}
