package eli;

import efm.d0;
import efm.h0;
import efm.i0;
import ej9.s;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import qfm.j0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements efm.g, i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f127461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rjg.a f127462b;

    public /* synthetic */ a(j jVar, rjg.a aVar) {
        this.f127461a = jVar;
        this.f127462b = aVar;
    }

    @Override // efm.g
    public efm.f d(efm.b completable) {
        Intrinsics.checkNotNullParameter(completable, "completable");
        j jVar = this.f127461a;
        t tVarL = new pfm.h(new j0(completable.B(), new s(new d(jVar, this.f127462b, 3), 26), 2), 3).l(new b(jVar, 0));
        return new pfm.h(new j0(tVarL.B(), new s(new c(jVar, 0), 7), 2), 3);
    }

    @Override // efm.i0
    public h0 i(d0 single) {
        Intrinsics.checkNotNullParameter(single, "single");
        j jVar = this.f127461a;
        return new ufm.f(single.p(new s(new d(jVar, this.f127462b, 2), 21)), new s(new c(jVar, 13), 24), 3).p(new s(new c(jVar, 14), 25));
    }
}
