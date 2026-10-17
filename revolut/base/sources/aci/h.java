package aci;

import e8e.w;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements a {

    @NotNull
    public static final b Companion = new b();
    public static final List d;
    public static final List e;
    public static final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayList f3154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f3155h;
    public static final List i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dha.c f3156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eci.b f3157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bci.b f3158c;

    static {
        cci.g gVar = cci.g.BUDGETING;
        cci.g gVar2 = cci.g.FX;
        cci.g gVar3 = cci.g.LINKED_ACCOUNTS;
        cci.g gVar4 = cci.g.P2P;
        cci.g gVar5 = cci.g.PAYMENTS;
        cci.g gVar6 = cci.g.REMITTANCE;
        cci.g gVar7 = cci.g.REWARDS;
        cci.g gVar8 = cci.g.STAYS;
        cci.g gVar9 = cci.g.SUBSCRIPTIONS;
        cci.g gVar10 = cci.g.FREELANCING;
        List listK = v.k(gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, cci.g.JOINT_ACCOUNT);
        d = listK;
        e = v.k(cci.g.DAILY_PURCHASE, cci.g.ONLINE_PURCHASE, cci.g.RECURRING_PAYMENTS, cci.g.SPENDING_ABROAD, cci.g.SPENDING_DOMESTIC, cci.g.ATM_WITHDRAWAL_ABROAD, cci.g.ATM_WITHDRAWAL_DOMESTIC, cci.g.REMITTANCE_SELF_DOMESTIC, cci.g.REMITTANCE_SELF_ABROAD, cci.g.REMITTANCE_REV_USER, cci.g.REMITTANCE_DOMESTIC, cci.g.REMITTANCE_ABROAD, cci.g.TRADING_DOMESTIC, cci.g.TRADING_ABROAD, cci.g.TRADING_COMMODITIES, cci.g.P2P_DOMESTIC);
        List list = listK;
        f = d0.E0(u.c(cci.g.LOANS), list);
        f3154g = d0.E0(u.c(cci.g.CREDIT_CARDS), list);
        cci.g gVar11 = cci.g.SALARY;
        f3155h = v.k(gVar11, cci.g.SPENDING, gVar, gVar6, gVar2, cci.g.SAVINGS);
        i = v.k(cci.g.P2P_EUR, gVar11, gVar10, cci.g.MANAGE_PROPERTY, cci.g.UTILITIES, gVar9, cci.g.DIRECT_DEBITS, cci.g.LIVING_ABROAD, cci.g.LOCAL_AUTHORITIES);
    }

    public h(dha.c pricingPlansRepository, eci.b purposeOfAccountRepository, bci.b purposeMapper) {
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(purposeOfAccountRepository, "purposeOfAccountRepository");
        Intrinsics.checkNotNullParameter(purposeMapper, "purposeMapper");
        this.f3156a = pricingPlansRepository;
        this.f3157b = purposeOfAccountRepository;
        this.f3158c = purposeMapper;
    }

    public static List a(wi0.b bVar) {
        if (com.bumptech.glide.d.t(bVar)) {
            return e;
        }
        if (com.bumptech.glide.d.l(bVar)) {
            return f;
        }
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        if (!Intrinsics.f(bVar, wi0.b.W)) {
            aVar.getClass();
            if (!Intrinsics.f(bVar, wi0.b.D2)) {
                aVar.getClass();
                if (!Intrinsics.f(bVar, wi0.b.T0)) {
                    aVar.getClass();
                    if (!Intrinsics.f(bVar, wi0.b.y2) && !com.bumptech.glide.d.o(bVar)) {
                        return d;
                    }
                }
            }
        }
        return f3154g;
    }

    public final Object b(List list, i iVar) throws Throwable {
        eci.b bVar = this.f3157b;
        bVar.getClass();
        w wVar = new w(bVar, list, null, 9);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, wVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
