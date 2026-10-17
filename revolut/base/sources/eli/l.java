package eli;

import efm.r;
import ej9.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements ujg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile tjg.c f127484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile tjg.e f127485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile zm0.d f127486c;
    public final ihm.j d = p.a.D("toSerialized(...)");
    public final ihm.j e;
    public final ihm.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.j f127487g;

    public l() {
        ihm.j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.e = jVarD;
        this.f = p.a.h("toSerialized(...)");
        this.f127487g = p.a.h("toSerialized(...)");
    }

    public final void a(zm0.d code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f127486c = code;
        ihm.j jVar = this.d;
        od0.i.Companion.getClass();
        jVar.onNext(od0.h.a(code));
    }

    public final void b(tjg.c status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.e.onNext(status);
        this.f127484a = status;
    }

    public final r c() {
        r rVarMerge = r.merge(this.d.filter(new s(new elb.a(2), 27)).map(new s(new elb.a(3), 28)).doOnNext(new s(new ei8.d(this, 15), 29)), this.f.flatMap(new k(new elb.a(4), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }
}
