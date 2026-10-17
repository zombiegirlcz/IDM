package kxj;

import e7l.g;
import efm.d0;
import k8d.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f190583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f190584b;

    public b(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f190583a = configurationInteractor;
        m70.a.c(t0.f186434a);
        this.f190584b = new a("", null);
    }

    public final d0 a() {
        d0 d0VarFirstOrError = ue0.e.E(m70.a.h(((ik3.c) this.f190583a).l(g.a.f123406a, w4l.h.f294642c), new t(15), new kj4.c(this, 23), null, 4), this.f190584b).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
