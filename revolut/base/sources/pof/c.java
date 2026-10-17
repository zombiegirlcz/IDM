package pof;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import rnf.s;
import te0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends iri.a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f237973m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f237974b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f237975c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f237976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f237977h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f237978j;
    public final n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f237979l;

    static {
        h0 h0Var = new h0(c.class, "descriptor", "getDescriptor()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f237973m = new KProperty[]{p0Var.j(h0Var), p.a.y(c.class, "comment", "getComment()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "hideButtonsLeadingToTransactionsLists", "getHideButtonsLeadingToTransactionsLists()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "onOpenAction", "getOnOpenAction()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "transaction", "getTransaction()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "details", "getDetails()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "entrypoint", "getEntrypoint()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "trustedMerchant", "getTrustedMerchant()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "jointAccountData", "getJointAccountData()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "queryParams", "getQueryParams()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "redesignEnabled", "getRedesignEnabled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public c() {
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f237975c = new te0.j("");
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.d = new te0.j(bool);
        this.e = new te0.j();
        this.f = new te0.j();
        this.f237976g = new n();
        this.f237977h = new te0.j(s.OTHER);
        this.i = new n();
        this.f237978j = new te0.j();
        this.k = new n();
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f237979l = new te0.j(bool);
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = f237973m;
        te0.e[] elements = {this.f237974b.getValue(this, kPropertyArr[0]), w0(), this.d.getValue(this, kPropertyArr[2]), this.e.getValue(this, kPropertyArr[3]), x0(), this.f237976g.getValue(this, kPropertyArr[5]), this.f237977h.getValue(this, kPropertyArr[6]), this.i.getValue(this, kPropertyArr[7]), this.f237978j.getValue(this, kPropertyArr[8]), this.k.getValue(this, kPropertyArr[9]), this.f237979l.getValue(this, kPropertyArr[10])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f237975c.getValue(this, f237973m[1]);
    }

    public final te0.e x0() {
        return this.f.getValue(this, f237973m[4]);
    }
}
