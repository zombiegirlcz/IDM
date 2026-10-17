package rk7;

import ip0.gu;
import ip0.pb0;
import ip0.s7;
import ip0.u40;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import raf.o;
import rd3.x;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik7.j f254768a;

    public n(ik7.j expenseItemMapper, qk7.a myClaimsImageProvider, ik7.i claimStatusMapper, ik7.a cfacExpenseMapper) {
        Intrinsics.checkNotNullParameter(expenseItemMapper, "expenseItemMapper");
        Intrinsics.checkNotNullParameter(myClaimsImageProvider, "myClaimsImageProvider");
        Intrinsics.checkNotNullParameter(claimStatusMapper, "claimStatusMapper");
        Intrinsics.checkNotNullParameter(cfacExpenseMapper, "cfacExpenseMapper");
        this.f254768a = expenseItemMapper;
    }

    public static aim.e b() {
        aim.e eVarB = u.b();
        eVarB.add(new gu("CLAIM EXPENSE SUBHEADER", 0, 0, 30));
        List listK = v.k(new pb0("CLAIM EXPENSE"), new pb0("CLAIM EXPENSE"), new pb0("CLAIM EXPENSE"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return u.a(eVarB);
    }

    public static aim.e c() {
        aim.e eVarB = u.b();
        u40 u40Var = new u40("PROGRESS VERTICAL TIMELINE");
        yp0.b.l(u40Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(u40Var);
        List listK = v.k(new s7("CLAIM EXPENSES TOTAL INFO", 0, 0, 0, 0, false, null, 126), new s7("CLAIM EXPENSES TOTAL INFO", 0, 0, 0, 0, false, null, 126), new s7("CLAIM EXPENSES TOTAL INFO", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        eVarB.add(new gu("CLAIM EXPENSE SUBHEADER", 0, 0, 30));
        eVarB.addAll(b());
        return u.a(eVarB);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f254753a, new rj7.b(this, 9), new rhj.m(this, 11), new rbe.c(this, domainState, 5)), (g) iii.c.f(domainState.f254753a, new o(this, 28), new r6f.i(this, 27), new x(this, 4)));
    }
}
