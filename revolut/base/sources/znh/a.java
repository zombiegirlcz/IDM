package znh;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import kotlin.jvm.internal.Intrinsics;
import p5d.b;
import vel.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ffl.a, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zfl.a f323828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerInstrument f323829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f323830c;

    public a(ScreenerInstrument instrument, f performanceAsset) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f323828a = new zfl.a(performanceAsset);
        this.f323829b = instrument;
        this.f323830c = performanceAsset;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f323828a.f322032b;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        this.f323828a.getClass();
        return null;
    }

    @Override // p5d.a
    public final b c() {
        return this.f323828a.f322031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f323829b, aVar.f323829b) && Intrinsics.f(this.f323830c, aVar.f323830c);
    }

    public final int hashCode() {
        return this.f323830c.hashCode() + (this.f323829b.hashCode() * 31);
    }

    @Override // ffl.a
    public final String i() {
        return this.f323829b.f105162a;
    }
}
