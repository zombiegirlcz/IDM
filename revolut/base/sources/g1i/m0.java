package g1i;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends iri.a implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f139655t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f139656b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f139657c = new te0.j();
    public final te0.j d = new te0.j();
    public final te0.n e;
    public final te0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f139658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f139659h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f139660j;
    public final te0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f139661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f139662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.j f139663n;
    public final te0.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te0.j f139664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te0.j f139665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final te0.j f139666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Sequence f139667s;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(m0.class, "config", "getConfig()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f139655t = new KProperty[]{p0Var.j(h0Var), p.a.y(m0.class, "exchangeOrderDraft", "getExchangeOrderDraft()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "limitRate", "getLimitRate()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "orderType", "getOrderType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "destinationCryptoCommodityCurrency", "getDestinationCryptoCommodityCurrency()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "isExchangeOrderV2", "isExchangeOrderV2()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "selectedStartDate", "getSelectedStartDate()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "selectedPeriodType", "getSelectedPeriodType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "savedStartDate", "getSavedStartDate()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "savedPeriodType", "getSavedPeriodType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "scheduleAccepted", "getScheduleAccepted()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "isCryptoEnabled", "isCryptoEnabled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "isCommodityEnabled", "isCommodityEnabled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "orderSummaryInitialExchangeDraft", "getOrderSummaryInitialExchangeDraft()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "investWeekly", "getInvestWeekly()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "currentPlan", "getCurrentPlan()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m0.class, "currentPlanChanged", "getCurrentPlanChanged()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public m0() {
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(iVar, "default");
        this.e = new te0.n(iVar);
        Intrinsics.checkNotNullParameter(iVar, "default");
        te0.n nVar = new te0.n(iVar);
        this.f = nVar;
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f139658g = new te0.j(bool);
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.f139659h = new te0.j(localDateNow);
        this.i = new te0.j();
        LocalDate localDateNow2 = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow2, "now(...)");
        this.f139660j = new te0.j(localDateNow2);
        this.k = new te0.j(f2i.g.WEEKLY);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f139661l = new te0.j(bool);
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar = new te0.j(bool);
        this.f139662m = jVar;
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar2 = new te0.j(bool);
        this.f139663n = jVar2;
        this.o = new te0.j();
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar3 = new te0.j(bool);
        this.f139664p = jVar3;
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f139665q = new te0.j("");
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar4 = new te0.j(bool);
        this.f139666r = jVar4;
        te0.e eVarW0 = w0();
        te0.e eVarY0 = y0();
        te0.e eVarZ0 = z0();
        te0.e eVarB0 = B0();
        KProperty[] kPropertyArr = f139655t;
        te0.e[] elements = {eVarW0, eVarY0, eVarZ0, eVarB0, nVar.getValue(this, kPropertyArr[4]), G0(), F0(), D0(), C0(), E0(), jVar.getValue(this, kPropertyArr[11]), jVar2.getValue(this, kPropertyArr[12]), H0(), A0(), jVar3.getValue(this, kPropertyArr[14]), x0(), jVar4.getValue(this, kPropertyArr[16])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139667s = kotlin.collections.d.E(elements);
    }

    public final te0.e A0() {
        return this.o.getValue(this, f139655t[13]);
    }

    public final te0.e B0() {
        return this.e.getValue(this, f139655t[3]);
    }

    public final te0.e C0() {
        return this.k.getValue(this, f139655t[9]);
    }

    public final te0.e D0() {
        return this.f139660j.getValue(this, f139655t[8]);
    }

    public final te0.e E0() {
        return this.f139661l.getValue(this, f139655t[10]);
    }

    public final te0.e F0() {
        return this.i.getValue(this, f139655t[7]);
    }

    public final te0.e G0() {
        return this.f139659h.getValue(this, f139655t[6]);
    }

    public final te0.e H0() {
        return this.f139658g.getValue(this, f139655t[5]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f139667s;
    }

    public final te0.e w0() {
        return this.f139656b.getValue(this, f139655t[0]);
    }

    public final te0.e x0() {
        return this.f139665q.getValue(this, f139655t[15]);
    }

    public final te0.e y0() {
        return this.f139657c.getValue(this, f139655t[1]);
    }

    public final te0.e z0() {
        return this.d.getValue(this, f139655t[2]);
    }
}
