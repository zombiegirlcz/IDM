package vgf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.data.model.Data;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f289097w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(0, this.f289097w, continuation);
                g0Var.v = obj2;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(1, this.f289097w, continuation);
                g0Var2.v = obj2;
                return g0Var2;
            case 2:
                g0 g0Var3 = new g0(2, this.f289097w, continuation);
                g0Var3.v = obj2;
                return g0Var3;
            case 3:
                g0 g0Var4 = new g0(3, this.f289097w, continuation);
                g0Var4.v = obj2;
                return g0Var4;
            case 4:
                g0 g0Var5 = new g0(4, this.f289097w, continuation);
                g0Var5.v = obj2;
                return g0Var5;
            case 5:
                g0 g0Var6 = new g0(5, this.f289097w, continuation);
                g0Var6.v = obj2;
                return g0Var6;
            case 6:
                g0 g0Var7 = new g0(6, this.f289097w, continuation);
                g0Var7.v = obj2;
                return g0Var7;
            default:
                g0 g0Var8 = new g0(7, this.f289097w, continuation);
                g0Var8.v = obj2;
                return g0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((UnifiedTransaction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 9;
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar = this.f289097w;
        switch (i) {
            case 0:
                a3 a3Var = (a3) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new aqd.g(a3Var, 14));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new vch.s0(data, 7));
                break;
            case 2:
                List months = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar5 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) aVar.v;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(months, "months");
                aVar5.H2(aVar5.u, new qce.a(months, aVar5, i2));
                break;
            case 3:
                List list = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    LocalDate localDate = ((a3) it8.next()).Y0;
                    if (localDate != null) {
                        arrayList.add(localDate);
                    }
                }
                LocalDate localDate2 = (LocalDate) zhm.d0.p0(arrayList);
                ((com.revolut.feature.transaction_list.impl.ui.list.flow.a) aVar.v).J2(aVar.B.i, localDate2 != null ? new TextLocalisedClause(R$string.transactions_list_screen_pending_transactions_subtitle, zhm.u.c(new TimeClause(oc.c.F(localDate2), new TimeClause.Format.DateMedium(com.revolut.core.ui_kit.models.n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12) : null);
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new v73.c(data2, aVar, 27));
                break;
            case 5:
                Data data3 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new vch.s0(data3, 8));
                break;
            case 6:
                String str = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new vb2.r(str, i2));
                break;
            default:
                UnifiedTransaction unifiedTransaction = (UnifiedTransaction) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new v73.c(aVar, unifiedTransaction, 28));
                break;
        }
        return Unit.f186387a;
    }
}
