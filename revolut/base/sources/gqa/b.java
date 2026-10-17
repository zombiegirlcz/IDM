package gqa;

import cw9.d;
import efm.d0;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import rd0.e;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f145614a;

    public b(d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f145614a = paymentsProductFeatureChecker;
    }

    public final z a() {
        d0 d0VarFirst = e.c(this.f145614a.f(), g.f186406a).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return ue0.e.I(d0VarFirst, h0.f322473a, new a(0));
    }
}
