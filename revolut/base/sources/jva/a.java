package jva;

import cpj.b;
import efm.d0;
import jt2.d;
import ju0.f;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;
import yoj.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f178801a;

    public a(xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f178801a = featuresInteractor;
    }

    public final d0 a() {
        d0 d0VarFirstOrError = ((b) this.f178801a).j(c.CRYPTO_RECURRING_BUYS, h.f294642c).map(new f(5, new d(14))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
