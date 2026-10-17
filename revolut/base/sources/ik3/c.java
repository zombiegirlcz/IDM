package ik3;

import akl.s;
import e7l.g;
import efm.r;
import ho6.n;
import ie.b0;
import ijj.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.z;
import ufm.i;
import yhm.j;
import yhm.k;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements fk3.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.b f161878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.c f161879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f161880c;

    public c(fk3.b repository, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f161878a = repository;
        this.f161879b = sessionProvider;
        this.f161880c = j.c(k.NONE, new af0.a(19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List b() {
        return (List) this.f161880c.getValue();
    }

    public final ArrayList c() {
        e7l.f fVarB = ((g) this.f161878a).f161888g.b();
        List listU = d0.U(d0.E0(fVarB.f(), fVarB.e()));
        ArrayList arrayList = new ArrayList(w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        return arrayList;
    }

    public final efm.d0 d() {
        r rVarG = m70.a.g(mo3.a.n(((g) this.f161878a).f161889h.f("", false)), null, new ijj.r(4), 1);
        gk3.g.Companion.getClass();
        efm.d0 d0VarFirst = rVarG.first(gk3.f.a());
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final z e(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        efm.d0 d0VarFirstOrError = m70.a.g(((g) this.f161878a).a(g.b.f123407a, false), null, null, 3).firstOrError();
        ihd.c cVar = new ihd.c(7, new n(this, currency));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, h0.f322473a, new a(this, currency));
    }

    public final efm.d0 f() {
        efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(((g) this.f161878a).a(g.a.f123406a, false), new p(7)), null, new ijj.r(3), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final List g() {
        return ((g) this.f161878a).f161888g.b().b();
    }

    public final i h() {
        efm.d0 d0VarH = ((g) this.f161878a).f161888g.h();
        ihd.c cVar = new ihd.c(5, new p(4));
        d0VarH.getClass();
        i iVar = new i(d0VarH, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.d0 i() {
        efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(k(g.a.f123406a), new p(8)), null, new ijj.r(5), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final h j() {
        h hVar = new h(new h4d.d(this, 9), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        return hVar;
    }

    public final r k(e7l.g configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        return ((g) this.f161878a).a(configType, false);
    }

    public final r l(e7l.g configType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = (g) this.f161878a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.f161888g.d(configType, loadingStrategy);
    }

    public final r m() {
        return nim.a.w(((g) this.f161878a).a(g.b.f123407a, false), new p(20));
    }

    public final r n() {
        return nim.a.w(((g) this.f161878a).a(g.b.f123407a, false), new p(17));
    }

    public final r o() {
        return nim.a.w(((g) this.f161878a).a(g.b.f123407a, false), new p(18));
    }

    public final efm.d0 p() {
        return ((g) this.f161878a).f161888g.h();
    }

    public final pfm.a q() {
        efm.k kVarFirstElement = ((cn0.g) this.f161879b).g().firstElement();
        b0 b0Var = new b0(new s(this, 18), 1);
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, b0Var, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a r() {
        efm.k kVarFirstElement = ((cn0.g) this.f161879b).g().firstElement();
        ihd.c cVar = new ihd.c(4, new ii4.b(this, 8));
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, cVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
