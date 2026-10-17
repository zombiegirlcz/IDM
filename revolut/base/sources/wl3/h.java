package wl3;

import com.revolut.data.model.Data;
import e7l.g;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import lhi.v;
import ljl.n1;
import rfm.w;
import rfm.z;
import ulm.p0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements cl3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl3.a f298380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl3.u f298381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f298382c;
    public final fk3.b d;
    public volatile Map e;
    public final Lazy f;

    public h(fl3.a contactsRepository, sl3.u remoteContactsRepository, ang.f userInteractor, fk3.b configRepository) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(remoteContactsRepository, "remoteContactsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        this.f298380a = contactsRepository;
        this.f298381b = remoteContactsRepository;
        this.f298382c = userInteractor;
        this.d = configRepository;
        this.e = r0.g();
        this.f = yhm.j.b(new p0(this, 10));
    }

    public static boolean j(zm3.a aVar, do3.n nVar) {
        if (d0.W(hx7.q.E(aVar))) {
            return false;
        }
        return a0.z(hx7.q.E(aVar), nVar.f116411g, true) || a0.z(hx7.q.E(aVar), nVar.i, true);
    }

    public final z b(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        z zVarM = ((sl3.k) this.f298380a).e(code).m(this.f298381b.a(code));
        efm.k kVarW = g(code).w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        z zVarM2 = zVarM.m(ue0.e.x(kVarW));
        Intrinsics.checkNotNullExpressionValue(zVarM2, "switchIfEmpty(...)");
        return zVarM2;
    }

    public final w c(String point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return ((sl3.k) this.f298380a).f(point);
    }

    public final w d(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(username, "username");
        rfm.m mVar = new rfm.m(new rfm.o(new sl3.d(kVar, username, 0)), new sk2.g(11, new sk2.f(20)), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return te0.w.h0(mVar);
    }

    public final ufm.i e() {
        efm.d0 d0Var = (efm.d0) ((sl3.k) this.f298380a).k.getValue();
        sk2.g gVar = new sk2.g(23, new sk2.f(26));
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final z f(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        z zVarM = d(username).m(q(username));
        Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
        return zVarM;
    }

    public final ufm.n g(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        efm.d0<ql3.d> userByCode = kVar.f264114b.getUserByCode(code);
        sk2.g gVar = new sk2.g(4, new sl3.i(1));
        userByCode.getClass();
        ufm.i iVar = new ufm.i(userByCode, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.n h(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(username, "username");
        efm.d0<ql3.d> userByUsername = kVar.f264114b.getUserByUsername(username);
        sk2.g gVar = new sk2.g(9, new sk2.f(16));
        userByUsername.getClass();
        ufm.i iVar = new ufm.i(userByUsername, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final pfm.r i(List points) {
        Intrinsics.checkNotNullParameter(points, "points");
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(points, "points");
        pfm.h hVar = new pfm.h(new rzc.b(kVar, points, 10), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return te0.w.g0(hVar);
    }

    public final efm.r k(List codes) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(codes, "codes");
        ao.h hVar = kVar.f264113a;
        Intrinsics.checkNotNullParameter(codes, "codes");
        efm.r map = ((ml3.a) hVar.f7847b).o(codes).map(new v(23, new n1(hVar, 22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = map.map(new sk2.g(14, new sl3.c(kVar, 3)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public final efm.r l(cl3.c[] useGroups, cl3.b event) {
        Intrinsics.checkNotNullParameter(useGroups, "useGroups");
        Intrinsics.checkNotNullParameter(event, "event");
        String searchQuery = event.a();
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        ufm.c cVar = new ufm.c(new sl3.d(kVar, searchQuery, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.n nVarI0 = te0.w.i0(cVar);
        f0 f0Var = f0.f322471a;
        ufm.b bVarM = efm.d0.m(f0Var);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        ufm.b bVarM2 = efm.d0.m(f0Var);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        ufm.i iVar = new ufm.i(te0.w.I0(nVarI0, bVarM, bVarM2), new sk2.g(21, new sl3.c(kVar, 6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        efm.r rVarRepeatWhen = new ufm.i(iVar, new sk2.g(16, new sk2.f(22)), 1).x().repeatWhen(new sk2.g(18, new sl3.c(kVar, 5)));
        efm.r rVarSwitchMap = ((efm.r) kVar.f264120m.getValue()).switchMap(new sk2.g(19, new pbi.h(rVarRepeatWhen, 3)));
        efm.k kVarFirstElement = rVarRepeatWhen.firstElement();
        sk2.g gVar = new sk2.g(20, new sk2.f(23));
        kVarFirstElement.getClass();
        rfm.m mVar = new rfm.m(kVarFirstElement, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        efm.r rVarStartWith = rVarSwitchMap.startWith((efm.w) ue0.e.G(mVar, new Data(new zm3.d(0), null, false, 6, null)).n());
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.r map = te0.w.l(rVarStartWith, this.f298382c.k(false)).map(new b(new wg2.g(useGroups, this, event), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r m() {
        efm.r map = ue0.e.E(m70.a.g(((sl3.k) this.f298380a).g(), null, null, 3), f0.f322471a).map(new b(new wje.m(26), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r n() {
        return nim.a.w(mif.a.d(((ik3.g) this.d).a(g.b.f123407a, false), this.f298382c.k(false)), new wje.m(25));
    }

    public final efm.r o(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        sl3.u uVar = this.f298381b;
        efm.r rVarE = uVar.f264132a.e();
        efm.r rVarB = uVar.b();
        Intrinsics.checkNotNullExpressionValue(rVarB, "observeRemoteExtraMap(...)");
        efm.r map = te0.w.l(rVarE, rVarB).map(new sl3.r(new sef.j(searchQuery, 1), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return te0.w.f0(map);
    }

    public final efm.r p(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        sl3.u uVar = this.f298381b;
        efm.r rVarF = uVar.f264132a.f();
        efm.r rVarB = uVar.b();
        Intrinsics.checkNotNullExpressionValue(rVarB, "observeRemoteExtraMap(...)");
        efm.r map = te0.w.l(rVarF, rVarB).map(new sl3.r(new sef.j(searchQuery, 1), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return te0.w.f0(map);
    }

    public final rfm.m q(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        sl3.k kVar = (sl3.k) this.f298380a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(username, "username");
        efm.d0 d0VarFirstOrError = m70.a.g(kVar.f264117h.f(username, false), null, new sa5.a(29), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        b bVar = new b(new wje.m(28), 3);
        d0VarFirstOrError.getClass();
        rfm.m mVar = new rfm.m(new rfm.j(d0VarFirstOrError, bVar, 0), new b(new wje.m(29), 4), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return mVar;
    }
}
