package zj3;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pd.b;
import pre.c;
import yoj.d;
import zhf.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements tj3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f322740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f322741b;

    public a(c termsInteractor, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f322740a = termsInteractor;
        this.f322741b = featuresInteractor;
    }

    public final d0 a() {
        d0 d0VarFirstOrError = zi0.c.q(b(), uj3.a.FEATURE_UNAVAILABLE).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final r b() {
        return b.r(nim.a.w(((cpj.b) this.f322741b).k(yoj.c.COMMODITIES, d.DISABLED), new zii.c(13)), new f(this, 3));
    }
}
