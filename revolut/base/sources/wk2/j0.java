package wk2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import sk2.d;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.atm.impl.ui.redesign.v2.map.a f298191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298191w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(this.f298191w, continuation, 0);
                j0Var.v = obj2;
                return j0Var;
            case 1:
                j0 j0Var2 = new j0(this.f298191w, continuation, 1);
                j0Var2.v = obj2;
                return j0Var2;
            case 2:
                j0 j0Var3 = new j0(this.f298191w, continuation, 2);
                j0Var3.v = obj2;
                return j0Var3;
            case 3:
                j0 j0Var4 = new j0(this.f298191w, continuation, 3);
                j0Var4.v = obj2;
                return j0Var4;
            case 4:
                j0 j0Var5 = new j0(this.f298191w, continuation, 4);
                j0Var5.v = obj2;
                return j0Var5;
            default:
                j0 j0Var6 = new j0(this.f298191w, continuation, 5);
                j0Var6.v = obj2;
                return j0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 1;
        com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar = this.f298191w;
        switch (i) {
            case 0:
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar2 = this.f298191w;
                cli.y yVar = aVar2.C;
                sk2.d dVar = (sk2.d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (dVar instanceof d.a) {
                    aVar2.H2(yVar, new wje.m(12));
                } else if (dVar instanceof sk2.b) {
                    co3.a aVar4 = ((sk2.b) dVar).f263756a;
                    aVar2.H2(yVar, new oc3.y(aVar4, 1));
                    if (!(aVar2.B instanceof b0)) {
                        aVar2.P2(e0.f298183a);
                    }
                    aVar2.o.a(new tk2.c(aVar4));
                } else if (dVar instanceof d.b) {
                    aVar2.K2();
                } else {
                    if (!(dVar instanceof sk2.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((sk2.c) dVar).f263757a) {
                        yji.l.a1(aVar2, aVar2.X1(new y0(null, new nii.l0(new TextLocalisedClause(R$string.common_atms_location_services_title, null, null, 14), new TextLocalisedClause(R$string.common_atms_location_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.common_atms_location_services_action, null, null, 14), new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), null, false, null, 996), false, 5)), new u36.g(2, aVar2, com.revolut.feature.atm.impl.ui.redesign.v2.map.a.class, "showErrorScreen", "showErrorScreen(Ljava/lang/Throwable;)Z", 4, 25), null, new j0(aVar2, continuation, 4), 2);
                    } else {
                        aVar2.Q2(new IllegalStateException("Fetch User Location returns error"));
                    }
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) data.getContent();
                if (list != null) {
                    aVar.H2(aVar.C, new v77.a(list, 14));
                }
                return Unit.f186387a;
            case 2:
                tk2.a aVar6 = (tk2.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.P2(new d0(aVar6.f271833a));
                aVar.H2(aVar.C, new ek2.q(aVar6, 1));
                return Unit.f186387a;
            case 3:
                cli.y yVar2 = aVar.C;
                tk2.n nVar = (tk2.n) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (nVar instanceof tk2.k) {
                    aVar.H2(yVar2, new wje.m(13));
                } else if (nVar instanceof tk2.l) {
                    aVar.I2();
                } else if (nVar instanceof tk2.m) {
                    aVar.L2();
                } else if (nVar instanceof tk2.i) {
                    aVar.H2(yVar2, new wje.m(14));
                } else if (!(nVar instanceof tk2.j)) {
                    if (!(nVar instanceof tk2.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.H2(yVar2, new wje.m(17));
                } else if (((tk2.j) nVar).f271841a) {
                    aVar.H2(yVar2, new wje.m(15));
                } else {
                    List list2 = (List) ((Data) aVar.o.f271849h.f290128a.getValue()).getContent();
                    if (list2 == null) {
                        list2 = zhm.f0.f322471a;
                    }
                    if (list2.size() >= 2) {
                        List<Atm> list3 = list2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                        for (Atm atm : list3) {
                            arrayList.add(new ah0.a(atm.e, atm.f));
                        }
                        aVar.H2(yVar2, new x(((com.revolut.core.mobile_services.impl.map.a) aVar.u).b(arrayList), i2));
                    } else {
                        aVar.H2(yVar2, new wje.m(16));
                    }
                }
                return Unit.f186387a;
            case 4:
                n1 result = (n1) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof l1) {
                    aVar.f63189x = true;
                    aVar.C1(new ExternalDestination.ByIntent(((s70.b) aVar.f63183p).c(), null));
                } else if ((result instanceof m1) || (result instanceof k1)) {
                    if (((k) ((j2) aVar.C.f22677a).getValue()).f298199m.isEmpty()) {
                        aVar.K2();
                    }
                } else if (!(result instanceof j1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                n1 result2 = (n1) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof l1) {
                    aVar.f63188w = true;
                    aVar.C1(new ExternalDestination.ByIntent(((s70.b) aVar.f63183p).b(), null));
                } else if ((result2 instanceof m1) || (result2 instanceof k1)) {
                    if (((k) ((j2) aVar.C.f22677a).getValue()).f298199m.isEmpty()) {
                        aVar.K2();
                    }
                } else if (!(result2 instanceof j1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
