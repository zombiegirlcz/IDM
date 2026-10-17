package pyc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends iri.a implements i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f240778q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f240779b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f240780c = new te0.j();
    public final te0.n d = new te0.n();
    public final te0.j e;
    public final te0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f240781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f240782h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f240783j;
    public final te0.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f240784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f240785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.n f240786n;
    public final te0.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te0.j f240787p;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(h0.class, "currentStep", "getCurrentStep()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f240778q = new KProperty[]{p0Var.j(h0Var), p.a.y(h0.class, "transactionId", "getTransactionId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "incomeSource", "getIncomeSource()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "enteredNote", "getEnteredNote()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "userDefinedType", "getUserDefinedType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "note", "getNote()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "description", "getDescription()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "isUserLocked", "isUserLocked()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "flowReviewState", "getFlowReviewState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "evidence", "getEvidence()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "actionToDoId", "getActionToDoId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "isEvidenceListOpenedFromSummary", "isEvidenceListOpenedFromSummary()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "selectedDocumentGroup", "getSelectedDocumentGroup()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "selectedDocument", "getSelectedDocument()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h0.class, "documentsToUpload", "getDocumentsToUpload()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public h0() {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter("", "default");
        this.e = new te0.j("");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        od0.i.Companion.getClass();
        od0.i iVarA = od0.h.a("");
        Intrinsics.checkNotNullParameter(iVarA, "default");
        this.f = new te0.n(iVarA);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f240781g = new te0.j("");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f240782h = new te0.j("");
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.i = new te0.j(bool);
        this.f240783j = new te0.j(b.USER_ACTION_REQUIRED);
        this.k = new te0.n();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f240784l = new te0.j("");
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f240785m = new te0.j(bool);
        this.f240786n = new te0.n();
        this.o = new te0.n();
        Map mapG = r0.g();
        Intrinsics.checkNotNullParameter(mapG, "default");
        this.f240787p = new te0.j(mapG);
    }

    public final te0.e A0() {
        return this.e.getValue(this, f240778q[3]);
    }

    public final te0.e B0() {
        return this.k.getValue(this, f240778q[9]);
    }

    public final te0.e C0() {
        return this.d.getValue(this, f240778q[2]);
    }

    public final te0.e D0() {
        return this.f240781g.getValue(this, f240778q[5]);
    }

    public final te0.e E0() {
        return this.o.getValue(this, f240778q[13]);
    }

    public final te0.e F0() {
        return this.f240786n.getValue(this, f240778q[12]);
    }

    public final te0.e G0() {
        return this.f240780c.getValue(this, f240778q[1]);
    }

    public final te0.e H0() {
        return this.f.getValue(this, f240778q[4]);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarX0 = x0();
        te0.e eVarG0 = G0();
        te0.e eVarC0 = C0();
        te0.e eVarA0 = A0();
        te0.e eVarD0 = D0();
        te0.e eVarY0 = y0();
        te0.e eVarZ0 = z0();
        KProperty[] kPropertyArr = f240778q;
        te0.e[] elements = {eVarX0, eVarG0, eVarC0, eVarA0, eVarD0, eVarY0, eVarZ0, this.i.getValue(this, kPropertyArr[7]), this.f240783j.getValue(this, kPropertyArr[8]), B0(), w0(), this.f240785m.getValue(this, kPropertyArr[11]), F0(), H0(), E0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f240784l.getValue(this, f240778q[10]);
    }

    public final te0.e x0() {
        return this.f240779b.getValue(this, f240778q[0]);
    }

    public final te0.e y0() {
        return this.f240782h.getValue(this, f240778q[6]);
    }

    public final te0.e z0() {
        return this.f240787p.getValue(this, f240778q[14]);
    }
}
