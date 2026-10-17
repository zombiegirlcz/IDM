package up5;

import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends iri.a implements c {
    public static final /* synthetic */ KProperty[] v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.n f281874b = new te0.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.n f281875c;
    public final te0.n d;
    public final te0.n e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f281876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f281877h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f281878j;
    public final te0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f281879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f281880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.j f281881n;
    public final te0.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te0.j f281882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te0.n f281883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final te0.n f281884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final te0.j f281885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final te0.n f281886t;
    public final Sequence u;

    static {
        h0 h0Var = new h0(e.class, "addressId", "getAddressId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        v = new KProperty[]{p0Var.j(h0Var), p.a.y(e.class, "address", "getAddress()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "withdrawCurrency", "getWithdrawCurrency()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "selectedBlockchain", "getSelectedBlockchain()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "isQuickSendFlow", "isQuickSendFlow()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "step", "getStep()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "moneyInputState", "getMoneyInputState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "isInputInSendCurrency", "isInputInSendCurrency()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "lastWithdrawToBaseCurrencyExchangeRates", "getLastWithdrawToBaseCurrencyExchangeRates()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(e.class, "idempotencyKey", "getIdempotencyKey()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "feesBreakdown", "getFeesBreakdown()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "confirmedCryptoAmount", "getConfirmedCryptoAmount()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "withdrawFinishBehavior", "getWithdrawFinishBehavior()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "withdrawTransactionId", "getWithdrawTransactionId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "suggestionsEnabled", "getSuggestionsEnabled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "cryptoAddressCounterpartyPreCheckResult", "getCryptoAddressCounterpartyPreCheckResult()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "withdrawQuote", "getWithdrawQuote()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "nextButtonLoading", "getNextButtonLoading()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e.class, "fundingSourceInput", "getFundingSourceInput()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public e() {
        te0.n nVar = new te0.n();
        this.f281875c = nVar;
        this.d = new te0.n();
        this.e = new te0.n();
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar = new te0.j(bool);
        this.f = jVar;
        this.f281876g = new te0.j(d.REVIEW);
        dj0.d.Companion.getClass();
        nqi.c cVar = new nqi.c(dj0.d.d, "0");
        Intrinsics.checkNotNullParameter(cVar, "default");
        this.f281877h = new te0.j(cVar);
        Boolean bool2 = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(bool2, "default");
        te0.j jVar2 = new te0.j(bool2);
        this.i = jVar2;
        this.f281878j = new te0.j();
        this.k = new te0.j();
        this.f281879l = new te0.j();
        te0.j jVar3 = new te0.j();
        this.f281880m = jVar3;
        WithdrawFinishBehavior.Default r92 = WithdrawFinishBehavior.Default.f71147a;
        Intrinsics.checkNotNullParameter(r92, "default");
        this.f281881n = new te0.j(r92);
        te0.n nVar2 = new te0.n();
        this.o = nVar2;
        Intrinsics.checkNotNullParameter(bool2, "default");
        te0.j jVar4 = new te0.j(bool2);
        this.f281882p = jVar4;
        this.f281883q = new te0.n();
        this.f281884r = new te0.n();
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f281885s = new te0.j(bool);
        te0.n nVar3 = new te0.n();
        this.f281886t = nVar3;
        te0.e eVarW0 = w0();
        KProperty[] kPropertyArr = v;
        te0.e[] elements = {eVarW0, nVar.getValue(this, kPropertyArr[1]), E0(), C0(), jVar.getValue(this, kPropertyArr[4]), D0(), B0(), jVar2.getValue(this, kPropertyArr[7]), A0(), z0(), y0(), jVar3.getValue(this, kPropertyArr[11]), F0(), nVar2.getValue(this, kPropertyArr[13]), jVar4.getValue(this, kPropertyArr[14]), x0(), G0(), nVar3.getValue(this, kPropertyArr[18])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.u = kotlin.collections.d.E(elements);
    }

    public final te0.e A0() {
        return this.f281878j.getValue(this, v[8]);
    }

    public final te0.e B0() {
        return this.f281877h.getValue(this, v[6]);
    }

    public final te0.e C0() {
        return this.e.getValue(this, v[3]);
    }

    public final te0.e D0() {
        return this.f281876g.getValue(this, v[5]);
    }

    public final te0.e E0() {
        return this.d.getValue(this, v[2]);
    }

    public final te0.e F0() {
        return this.f281881n.getValue(this, v[12]);
    }

    public final te0.e G0() {
        return this.f281884r.getValue(this, v[16]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.u;
    }

    public final te0.e w0() {
        return this.f281874b.getValue(this, v[0]);
    }

    public final te0.e x0() {
        return this.f281883q.getValue(this, v[15]);
    }

    public final te0.e y0() {
        return this.f281879l.getValue(this, v[10]);
    }

    public final te0.e z0() {
        return this.k.getValue(this, v[9]);
    }
}
