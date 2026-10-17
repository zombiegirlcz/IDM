package pmh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e implements ffl.a, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f237572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f237573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f237574c;

    public d(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f237572a = instrument;
        this.f237573b = new p5d.b(instrument.f214596b, "instrument", null);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(instrument.f214596b);
        aVarNewBuilder.i(hd.FUND);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.f237574c = AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return new AnalyticsContext(this.f237574c);
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f237573b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f237572a, ((d) obj2).f237572a);
    }

    public final int hashCode() {
        return this.f237572a.hashCode();
    }

    @Override // ffl.a
    public final String i() {
        return this.f237572a.f214596b;
    }
}
