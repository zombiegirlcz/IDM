package x0i;

import c03.u;
import com.revolut.feature.exchange.models.ExchangeLinkedOrderSpec;
import com.revolut.feature.exchange.models.ExchangeOrderSpec;
import com.revolut.feature_exchange.impl.network.service.FxService;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pfm.r;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements p0i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1i.g f301642a;

    public g(c1i.g repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f301642a = repository;
    }

    public final r a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        c1i.g gVar = this.f301642a;
        pfm.a aVarE = gVar.f20523a.cancelOrder(id10).e(gVar.e.g(Unit.f186387a, false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public final n b(ExchangeOrderSpec spec, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(spec, "draft");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        c1i.g gVar = this.f301642a;
        FxService fxService = gVar.f20523a;
        Intrinsics.checkNotNullParameter(spec, "<this>");
        d0<z0i.g> d0VarCreateOrder = fxService.createOrder(new z0i.b(u1.g(spec.f72143a, a1i.c.f636a), String.valueOf(spec.f72144b), String.valueOf(spec.f72145c), u1.g(spec.d, a1i.c.f637b), cp5.d.d(spec.e), mo3.a.p(spec.f)), idempotencyKey);
        u uVar = new u(17, new c09.a(15));
        d0VarCreateOrder.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarCreateOrder, uVar, 1), new u(18, new c1i.d(gVar, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(iVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    public final n c(ExchangeLinkedOrderSpec spec, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(spec, "draft");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        c1i.g gVar = this.f301642a;
        FxService fxService = gVar.f20523a;
        Intrinsics.checkNotNullParameter(spec, "<this>");
        dj0.d dVar = spec.d;
        Double d = spec.f;
        jo3.a aVarP = mo3.a.p(dVar);
        String strValueOf = String.valueOf(spec.f72126a);
        String strD = cp5.d.d(spec.f72128c);
        String strG = u1.g(spec.f72127b, a1i.c.f637b);
        Double d5 = spec.e;
        z0i.j[] elements = {d5 != null ? new z0i.j(String.valueOf(d5), u1.g(wd6.h.TAKE_PROFIT, a1i.c.f636a)) : null, d != null ? new z0i.j(String.valueOf(d), u1.g(wd6.h.STOP_LOSS, a1i.c.f636a)) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d0<z0i.f> d0VarCreateLinkedOrder = fxService.createLinkedOrder(new z0i.a(aVarP, strD, strValueOf, strG, kotlin.collections.d.L(elements)), idempotencyKey);
        u uVar = new u(14, new c09.a(13));
        d0VarCreateLinkedOrder.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarCreateLinkedOrder, uVar, 1), new u(15, new c1i.d(gVar, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(iVar);
    }
}
