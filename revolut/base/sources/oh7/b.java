package oh7;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;
import qi7.h;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zfl.a f225320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f225321b;

    public b(h instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f225320a = new zfl.a(instrument.f246671a);
        this.f225321b = instrument;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f225320a.f322032b;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        this.f225320a.getClass();
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f225320a.f322031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f225321b, ((b) obj2).f225321b);
    }

    public final int hashCode() {
        return this.f225321b.hashCode();
    }
}
