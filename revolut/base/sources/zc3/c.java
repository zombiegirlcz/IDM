package zc3;

import com.revolut.feature.cashback.api.navigation.YourCashbackFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import efm.d0;
import java.util.List;
import java.util.Locale;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import q06.h;
import q06.k;
import sri.m;
import ufm.i;
import wf6.w;
import wp5.y;
import zc0.b0;
import zc0.z;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f321233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321234b;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f321233a = navigator;
        this.f321234b = u.c("your-cashback");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public static KompotDestination b(jf0.c cVar) {
        String upperCase = cVar.e(2).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        uc3.d dVar = (uc3.d) u1.v(upperCase, cd3.a.f23165a);
        return dVar != null ? new YourCashbackFeatureConfig.ProductDestination(dVar, true) : new YourCashbackFeatureConfig.HomeDestination(0);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f321234b.contains(deeplink.e(1));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new h(b(cVar), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        return y.D(cVar, "deeplink", 1, "your-cashback") ? new i(new ufm.c(new w(this, cVar, 10), 2), new b0(new z(13), 19), 1) : d0.m(Boolean.FALSE);
    }
}
