package an8;

import aii.r;
import c25.c;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import cp4.p;
import dp4.c1;
import ejk.e;
import gim.i;
import hbh.o;
import hha.d;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ncd.h;
import nii.l1;
import nii.n1;
import nzj.n;
import om4.c0;
import om4.g0;
import om4.k0;
import om4.w;
import om4.y3;
import pig.l;
import pig.m;
import vge.g;
import vge.t2;
import vge.x;
import vkm.q;
import w4l.j;
import w4l.k;
import yw4.f;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f6573x = obj2;
        this.f6574y = obj3;
        this.f6572w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a((b) this.f6573x, (String) this.f6572w, (k) this.f6574y, continuation, 0);
                aVar.v = ((Boolean) obj2).booleanValue();
                return aVar;
            case 1:
                a aVar2 = new a(1, this.f6573x, (c) this.f6574y, (String) this.f6572w, continuation);
                aVar2.v = ((Boolean) obj2).booleanValue();
                return aVar2;
            case 2:
                a aVar3 = new a((m) this.f6572w, this.v, (com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a) this.f6574y, continuation, 2);
                aVar3.f6573x = obj2;
                return aVar3;
            case 3:
                a aVar4 = new a((e) this.f6572w, (d) this.f6574y, this.v, continuation, 3);
                aVar4.f6573x = obj2;
                return aVar4;
            case 4:
                a aVar5 = new a((o) this.f6573x, (InvestTransactionsFilter) this.f6572w, (k) this.f6574y, continuation, 4);
                aVar5.v = ((Boolean) obj2).booleanValue();
                return aVar5;
            case 5:
                a aVar6 = new a(5, this.f6573x, (w) this.f6574y, (String) this.f6572w, continuation);
                aVar6.v = ((Boolean) obj2).booleanValue();
                return aVar6;
            case 6:
                a aVar7 = new a((c0) this.f6573x, (wi0.b) this.f6572w, (k) this.f6574y, continuation, 6);
                aVar7.v = ((Boolean) obj2).booleanValue();
                return aVar7;
            case 7:
                a aVar8 = new a(continuation, (k0) this.f6573x, (String) this.f6572w, (f) this.f6574y);
                aVar8.v = ((Boolean) obj2).booleanValue();
                return aVar8;
            case 8:
                a aVar9 = new a((x) this.f6572w, (ProductAccountDescriptor$Value) this.f6574y, this.v, continuation, 8);
                aVar9.f6573x = obj2;
                return aVar9;
            default:
                a aVar10 = new a((m2f.o) this.f6572w, this.v, (com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c) this.f6574y, continuation, 9);
                aVar10.f6573x = obj2;
                return aVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((a) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return ((a) create(bool2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a) create((InsuranceDocumentsAvailability) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                return ((a) create(bool3, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                return ((a) create(bool4, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                return ((a) create(bool5, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                Boolean bool6 = (Boolean) obj2;
                bool6.booleanValue();
                return ((a) create(bool6, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 20;
        Continuation continuation = null;
        int i3 = 0;
        Object obj3 = this.f6572w;
        Object obj4 = this.f6574y;
        switch (i) {
            case 0:
                b bVar = (b) this.f6573x;
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z) {
                    return new go.g(new Data(f0.f322471a, new IllegalStateException("Saving product is not available"), false, 4, null), 2);
                }
                jab.a aVar2 = bVar.f6575a;
                String juniorId = (String) obj3;
                k loadingStrategy = (k) obj4;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(u0.m(xam.a.h(new a9h.a(aVar2, juniorId, loadingStrategy, (Continuation) null, 14), rd0.e.b(aVar2.f172474b.q())), ijb.a.a(bVar.f6576b, h.YOUTH, null, null, (k) obj4, 6)), new amf.i(7));
            case 1:
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z3) {
                    return new go.g(new Data(this.f6573x, null, false, 6, null), 2);
                }
                c cVar = (c) obj4;
                return rd0.e.e(nim.a.v(u0.i(rd0.e.b(cVar.f20668b.a(false)), nim.a.v(u0.m(rd0.e.b(l93.f.k(cVar.f20669c, null, null, false, 15)), q.q(nim.a.v(((y3) cVar.f20667a).e(j.f294644c, true), new c09.a(21)))), new c09.a(i2)), cVar.i), new c25.a(cVar, (String) obj3, i3)), h0.f322473a, new b6a.d(cVar, continuation, 15));
            case 2:
                com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a aVar4 = (com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a) obj4;
                n1 n1Var = (n1) this.f6573x;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (((l) ((m) obj3)).f236490c == hfg.c.COMPLETED && this.v && (n1Var instanceof l1)) {
                    aVar4.n2(new egg.f(aVar4, null), new whi.b(6));
                } else {
                    aVar4.B2();
                }
                return Unit.f186387a;
            case 3:
                InsuranceDocumentsAvailability insuranceDocumentsAvailability = (InsuranceDocumentsAvailability) this.f6573x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cjk.b bVar2 = ((e) obj3).f126910b;
                return cjk.b.a(((d) obj4).f152287a, insuranceDocumentsAvailability, this.v, false);
            case 4:
                boolean z4 = this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return z4 ? nim.a.v(((o) this.f6573x).a((InvestTransactionsFilter) obj3, (k) obj4), new hb4.k(20)) : new go.g(new Data(Optional.empty(), null, false, 6, null), 2);
            case 5:
                boolean z6 = this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z6) {
                    return new go.g(new Data(this.f6573x, null, false, 6, null), 2);
                }
                dp4.j jVar = ((w) obj4).f226726a;
                String facilityId = (String) obj3;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                w4l.i loadingStrategy2 = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return jVar.f.b(new cp4.h(facilityId), loadingStrategy2);
            case 6:
                boolean z11 = this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z11) {
                    od0.i.Companion.getClass();
                    return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                }
                dp4.q qVar = ((c0) this.f6573x).f226537a;
                String countryCode = ((wi0.b) obj3).f297794a;
                k loadingStrategy3 = (k) obj4;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                return nim.a.v(qVar.d.b(new cp4.l(countryCode), loadingStrategy3), new n(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 29));
            case 7:
                boolean z12 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z12) {
                    return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                }
                c1 c1Var = ((k0) this.f6573x).f226612a;
                String facilityId2 = (String) obj3;
                f feature = (f) obj4;
                Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                Intrinsics.checkNotNullParameter(feature, "feature");
                w4l.h loadingStrategy4 = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                return nim.a.A(rd0.e.n(nim.a.v(c1Var.f116613g.b(new p(facilityId2, feature.name()), loadingStrategy4), om4.f0.f226571a), h0.f322473a), g0.f226581a);
            case 8:
                g gVar = (g) this.f6573x;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) obj3;
                return Boolean.valueOf(((t2) xVar.f289051c).l(x.b(xVar, (ProductAccountDescriptor$Value) obj4, this.v)) != null && gVar.f288897a.getContent() == null && gVar.f288897a.getError() == null);
            default:
                com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c cVar2 = (com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c) obj4;
                n1 n1Var2 = (n1) this.f6573x;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (((m2f.n) ((m2f.o) obj3)).f201986c == u2f.a.COMPLETED && this.v && (n1Var2 instanceof l1)) {
                    cVar2.n2(new y1f.e(cVar2, null), new whi.b(6));
                } else {
                    cVar2.B2();
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(r rVar, boolean z, oki.h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6572w = rVar;
        this.v = z;
        this.f6574y = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6573x = obj2;
        this.f6572w = obj3;
        this.f6574y = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6572w = obj2;
        this.f6574y = obj3;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Continuation continuation, k0 k0Var, String str, f fVar) {
        super(2, continuation);
        this.u = 7;
        this.f6573x = k0Var;
        this.f6572w = str;
        this.f6574y = fVar;
    }
}
