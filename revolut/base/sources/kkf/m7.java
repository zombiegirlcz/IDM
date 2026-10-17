package kkf;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class m7 extends gim.i implements oim.o {
    public /* synthetic */ tof.a3 u;
    public /* synthetic */ tof.t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f184831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ DateTime f184832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n7 f184833y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n7 n7Var, boolean z, Continuation continuation) {
        super(5, continuation);
        this.f184833y = n7Var;
        this.z = z;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        m7 m7Var = new m7(this.f184833y, this.z, (Continuation) obj6);
        m7Var.u = (tof.a3) obj2;
        m7Var.v = (tof.t3) obj3;
        m7Var.f184831w = zBooleanValue;
        m7Var.f184832x = (DateTime) obj5;
        return m7Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Clause clauseH;
        tof.a3 transaction = this.u;
        tof.t3 t3Var = this.v;
        boolean z = this.f184831w;
        DateTime dateTime = this.f184832x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CellDetailsNoteDelegate.Model modelN = null;
        List list = t3Var != null ? t3Var.f273073q : null;
        boolean z3 = list == null || list.isEmpty();
        if (k71.k.q0(transaction) || k71.k.T(transaction)) {
            return zhm.f0.f322471a;
        }
        if (k71.k.f1(transaction) && !z3) {
            return zhm.f0.f322471a;
        }
        if (this.z && k71.k.c1(transaction) && !z3) {
            return zhm.f0.f322471a;
        }
        vlf.b bVar = this.f184833y.f184855c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CapitalizedClause capitalizedClauseR = ((bnf.r) bVar.f290428b).r(transaction);
        if (capitalizedClauseR != null && (clauseH = bVar.h(dateTime, transaction, t3Var, z)) != null) {
            modelN = ((wnf.e) bVar.f290427a).n(capitalizedClauseR, clauseH);
        }
        List listL = zhm.v.l(modelN);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }
}
