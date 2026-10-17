package ozc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends iri.a implements g {
    public static final /* synthetic */ KProperty[] z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f231313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.n f231314c;
    public final te0.j d;
    public final te0.n e;
    public final te0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.n f231315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f231316h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f231317j;
    public final te0.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f231318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.n f231319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.n f231320n;
    public final te0.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te0.j f231321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te0.n f231322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final te0.n f231323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final te0.j f231324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final te0.j f231325t;
    public final te0.j u;
    public final te0.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final te0.j f231326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final te0.n f231327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final te0.n f231328y;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(s0.class, "isUserLocked", "isUserLocked()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        z = new KProperty[]{p0Var.j(h0Var), p.a.y(s0.class, "currentStep", "getCurrentStep()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "submissionsSowConfig", "getSubmissionsSowConfig()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "latestSubmission", "getLatestSubmission()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "selectedIncomeSource", "getSelectedIncomeSource()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "selectedIncomeFrequency", "getSelectedIncomeFrequency()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "flowPath", "getFlowPath()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "isNextButtonVisible", "isNextButtonVisible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "amount", "getAmount()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "incomeSourceSubmission", "getIncomeSourceSubmission()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "amendedRemoteDocumentsId", "getAmendedRemoteDocumentsId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "currencyCode", "getCurrencyCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "selectedFrequencyDescription", "getSelectedFrequencyDescription()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "selectedDocument", "getSelectedDocument()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "documentsToUpload", "getDocumentsToUpload()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "selectedDocumentGroup", "getSelectedDocumentGroup()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "incomeDestination", "getIncomeDestination()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "questions", "getQuestions()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "answers", "getAnswers()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "note", "getNote()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "warning", "getWarning()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "description", "getDescription()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "userDefinedType", "getUserDefinedType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s0.class, "question", "getQuestion()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public s0() {
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f231313b = new te0.j(bool);
        this.f231314c = new te0.n();
        this.d = new te0.j();
        this.e = new te0.n();
        this.f = new te0.n();
        this.f231315g = new te0.n();
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f231316h = new te0.j(f0Var);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.i = new te0.j(bool);
        Intrinsics.checkNotNullParameter(0L, "default");
        this.f231317j = new te0.j(0L);
        this.k = new te0.n();
        this.f231318l = new te0.j(zhm.h0.f322473a);
        this.f231319m = new te0.n();
        this.f231320n = new te0.n();
        this.o = new te0.n();
        Map mapG = zhm.r0.g();
        Intrinsics.checkNotNullParameter(mapG, "default");
        this.f231321p = new te0.j(mapG);
        this.f231322q = new te0.n();
        this.f231323r = new te0.n();
        Intrinsics.checkNotNullParameter(f0Var, "default");
        this.f231324s = new te0.j(f0Var);
        Intrinsics.checkNotNullParameter(f0Var, "default");
        this.f231325t = new te0.j(f0Var);
        kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter("", "default");
        this.u = new te0.j("");
        this.v = new te0.n();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f231326w = new te0.j("");
        this.f231327x = new te0.n();
        this.f231328y = new te0.n();
    }

    public final te0.e A0() {
        return this.f231314c.getValue(this, z[1]);
    }

    public final te0.e B0() {
        return this.f231326w.getValue(this, z[21]);
    }

    public final te0.e C0() {
        return this.f231321p.getValue(this, z[14]);
    }

    public final te0.e D0() {
        return this.f231316h.getValue(this, z[6]);
    }

    public final te0.e E0() {
        return this.f231323r.getValue(this, z[16]);
    }

    public final te0.e F0() {
        return this.k.getValue(this, z[9]);
    }

    public final te0.e G0() {
        return this.e.getValue(this, z[3]);
    }

    public final te0.e H0() {
        return this.u.getValue(this, z[19]);
    }

    public final te0.e I0() {
        return this.f231328y.getValue(this, z[23]);
    }

    public final te0.e J0() {
        return this.o.getValue(this, z[13]);
    }

    public final te0.e K0() {
        return this.f231322q.getValue(this, z[15]);
    }

    public final te0.e L0() {
        return this.f231320n.getValue(this, z[12]);
    }

    public final te0.e M0() {
        return this.f231315g.getValue(this, z[5]);
    }

    public final te0.e N0() {
        return this.f.getValue(this, z[4]);
    }

    public final te0.e O0() {
        return this.f231327x.getValue(this, z[22]);
    }

    public final te0.e P0() {
        return this.i.getValue(this, z[7]);
    }

    public final te0.e Q0() {
        return this.f231313b.getValue(this, z[0]);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarQ0 = Q0();
        te0.e eVarA0 = A0();
        KProperty[] kPropertyArr = z;
        te0.e[] elements = {eVarQ0, eVarA0, this.d.getValue(this, kPropertyArr[2]), G0(), N0(), M0(), L0(), D0(), P0(), x0(), z0(), J0(), K0(), C0(), w0(), F0(), E0(), H0(), B0(), O0(), I0(), this.f231324s.getValue(this, kPropertyArr[17]), y0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f231318l.getValue(this, z[10]);
    }

    public final te0.e x0() {
        return this.f231317j.getValue(this, z[8]);
    }

    public final te0.e y0() {
        return this.f231325t.getValue(this, z[18]);
    }

    public final te0.e z0() {
        return this.f231319m.getValue(this, z[11]);
    }
}
