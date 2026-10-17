package ktj;

import a0j.b;
import a0j.b0;
import a0j.c;
import a0j.c0;
import a0j.d;
import a0j.d0;
import a0j.e;
import a0j.e0;
import a0j.f0;
import a0j.g;
import a0j.g0;
import a0j.h;
import a0j.h0;
import a0j.i;
import a0j.k;
import a0j.l;
import a0j.m;
import a0j.n;
import a0j.p;
import a0j.q;
import a0j.r;
import a0j.t;
import a0j.u;
import a0j.w;
import a0j.x;
import a0j.y;
import a0j.z;
import aim.f;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements zzi.a {

    @NotNull
    private static final C1077a Companion = new C1077a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f189560a;

    /* JADX INFO: renamed from: ktj.a$a, reason: collision with other inner class name */
    public static final class C1077a {
        private C1077a() {
        }
    }

    static {
        f builder = new f();
        b0 b0Var = b0.SPEND;
        m mVar = m.SPENDING_PACE;
        l lVar = new l(mVar);
        m mVar2 = m.PROJECTED_BALANCE;
        l lVar2 = new l(mVar2);
        m mVar3 = m.RECURRING_PAYMENTS;
        a0j.a aVar = new a0j.a(b0Var, new w(v.k(lVar, lVar2, new l(mVar3)), new a0j.v(v.k(new k(d.f396a, false), new k(b.f393a, false)), u.PRIMARY_ACCOUNT)));
        b0 b0Var2 = b0.SAVE;
        m mVar4 = m.SAVING_PACE;
        l lVar3 = new l(mVar4);
        m mVar5 = m.EMERGENCY_FUND;
        a0j.a aVar2 = new a0j.a(b0Var2, new w(v.k(lVar3, new l(mVar5)), new a0j.v(v.k(new k(new i(h.AER), false), new k(c.f394a, true)), null)));
        b0 b0Var3 = b0.GROW;
        m mVar6 = m.INVESTING_PACE;
        l lVar4 = new l(mVar6);
        m mVar7 = m.PORTFOLIO_RISK;
        l lVar5 = new l(mVar7);
        m mVar8 = m.TOTAL_WEALTH;
        a0j.a aVar3 = new a0j.a(b0Var3, new w(v.k(lVar4, lVar5, new l(mVar8)), new a0j.v(v.k(new k(g.f402a, false), new k(a0j.f.f401a, true)), null)));
        b0 b0Var4 = b0.CREDIT;
        a0j.a aVar4 = new a0j.a(b0Var4, new w(v.k(p.IMPROVE_YOUR_CHANCES, p.UNLOCK_BETTER_OFFERS), new a0j.v(zhm.u.c(new k(e.f399a, false)), null)));
        builder.put(b0Var, aVar);
        builder.put(b0Var2, aVar2);
        builder.put(b0Var3, aVar3);
        builder.put(b0Var4, aVar4);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.b();
        f builder2 = new f();
        x xVar = new x("Spending increased recently", "You finished May £235 ahead, but recent spending picked up in everyday categories. Keep an eye on restaurants, groceries, to help protect that surplus.");
        t tVar = t.GOOD;
        f0 f0Var = f0.DAY;
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306273h;
        n nVar = new n(mVar, tVar, new g0(f0Var, new dj0.d(2400L, bVar), true));
        t tVar2 = t.POSITIVE;
        LocalDate localDate = LocalDate.parse("2026-06-01");
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        n nVar2 = new n(mVar2, tVar2, new d0(new dj0.d(163400L, bVar), localDate));
        t tVar3 = t.HIGH;
        f0 f0Var2 = f0.MONTH;
        a0j.a aVar5 = new a0j.a(b0Var, new z(78, 4, xVar, v.k(nVar, nVar2, new n(mVar3, tVar3, new g0(f0Var2, new dj0.d(25200L, bVar), false))), null));
        x xVar2 = new x("Savings were slowed down", "You saved £512 in May, but moving £200 back out slowed your progress. Focus on your emergency fund first, or increasing your monthly target slightly to £600.");
        t tVar4 = t.LOW;
        a0j.a aVar6 = new a0j.a(b0Var2, new z(46, -2, xVar2, v.k(new n(mVar4, tVar4, new g0(f0Var2, new dj0.d(51200L, bVar), false)), new n(mVar5, tVar4, new h0(new dj0.d(125300L, bVar), new dj0.d(1500000L, bVar)))), null));
        a0j.a aVar7 = new a0j.a(b0Var3, new z(24, 4, new x("Low investments", "Your wealth is growing, but mostly through deposits. Try setting a recurring investment, reviewing unused cash, or rebalancing if your portfolio has drifted."), v.k(new n(mVar6, tVar4, new g0(f0Var2, new dj0.d(2500L, bVar), false)), new n(mVar8, t.GROWING, new e0(new dj0.d(2363400L, bVar))), new n(mVar7, t.CAUTIOUS, c0.f395a)), null));
        a0j.a aVar8 = new a0j.a(b0Var4, new z(86, 4, new x("Credit under control", "You made your repayments on time in May, but your credit usage increased. Try paying down part of your balance, or setting up automatic repayments"), v.k(new r(q.GOOD, 2), new r(q.NEEDS_ATTENTION, 1)), new y()));
        builder2.put(b0Var, aVar5);
        builder2.put(b0Var2, aVar6);
        builder2.put(b0Var3, aVar7);
        builder2.put(b0Var4, aVar8);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        f189560a = builder2.b();
    }
}
