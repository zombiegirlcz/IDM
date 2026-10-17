package xzk;

import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.NationalIdentifiersContract$Configuration;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import te0.s;
import te0.w;
import xy7.j;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f310043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f310044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kye.e f310045c;
    public final zzk.a d;
    public final Object e;

    public g(c state, b router, kye.e interactor, zzk.a nationalIdentifiersUtils) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(nationalIdentifiersUtils, "nationalIdentifiersUtils");
        this.f310043a = state;
        this.f310044b = router;
        this.f310045c = interactor;
        this.d = nationalIdentifiersUtils;
        this.e = w.y0(new xge.h(this, 19));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final r a() {
        i iVar = (i) this.f310043a;
        if (!iVar.y0().isInitialized()) {
            Object value = this.e.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (r) value;
        }
        r map = iVar.y0().c(s.f270018a).map(new j(16, new xx9.f(22)));
        Intrinsics.h(map);
        return map;
    }

    public final r b(NationalIdentifiersContract$Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        r rVarA = a();
        i iVar = (i) this.f310043a;
        r map = iVar.w0().c(s.f270018a).map(new j(12, new xx9.f(20)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return pd.b.s(u1.e(rVarA, map, zi0.c.j(w.M(iVar.f310049c.getValue(iVar, i.f[1]), Boolean.FALSE))), new xyc.j(this, config, 5));
    }
}
