package cu8;

import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends iri.a implements j1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f108861y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f108862b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f108863c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f108864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f108865h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f108866j;
    public final te0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f108867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f108868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.j f108869n;
    public final te0.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te0.j f108870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te0.j f108871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final te0.j f108872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final te0.n f108873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final te0.j f108874t;
    public final te0.j u;
    public final te0.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final te0.n f108875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Sequence f108876x;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(n1.class, "currentStep", "getCurrentStep()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f108861y = new KProperty[]{p0Var.j(h0Var), p.a.y(n1.class, "finalCommand", "getFinalCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "nationalityCountryCode", "getNationalityCountryCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "defaultNationalityCountryCode", "getDefaultNationalityCountryCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "kycProvider", "getKycProvider()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "countryCode", "getCountryCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "documentCountry", "getDocumentCountry()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "selectedDocs", "getSelectedDocs()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "hasBackNavigation", "getHasBackNavigation()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "kycScope", "getKycScope()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "acceptedConsents", "getAcceptedConsents()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "hasSubmittedAllRequiredDocuments", "getHasSubmittedAllRequiredDocuments()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "kycConfiguration", "getKycConfiguration()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "updateKycStateAfterSubmit", "getUpdateKycStateAfterSubmit()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "suggestedCitizenship", "getSuggestedCitizenship()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "completionDialog", "getCompletionDialog()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "hintsDisplayed", "getHintsDisplayed()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "alert", "getAlert()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "workflowStepId", "getWorkflowStepId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "backPressCollapsesApp", "getBackPressCollapsesApp()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "requirement", "getRequirement()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "languageTag", "getLanguageTag()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n1.class, "supportDeeplink", "getSupportDeeplink()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public n1() {
        KycFinalCommand.Next next = new KycFinalCommand.Next(DummyCommand.f98635a);
        Intrinsics.checkNotNullParameter(next, "default");
        te0.j jVar = new te0.j(next);
        this.f108863c = jVar;
        this.d = new te0.j();
        this.e = new te0.j();
        te0.j jVar2 = new te0.j(my8.q.ONFIDO);
        this.f = new te0.j();
        this.f108864g = new te0.j();
        SelectedKycDocs.INSTANCE.getClass();
        this.f108865h = new te0.j(SelectedKycDocs.d);
        Boolean bool = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar3 = new te0.j(bool);
        this.i = jVar3;
        this.f108866j = new te0.j();
        zhm.h0 h0Var = zhm.h0.f322473a;
        this.k = new te0.j(h0Var);
        Boolean bool2 = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool2, "default");
        te0.j jVar4 = new te0.j(bool2);
        this.f108867l = jVar4;
        this.f108868m = new te0.j();
        Intrinsics.checkNotNullParameter(bool2, "default");
        this.f108869n = new te0.j(bool2);
        this.o = new te0.j();
        this.f108870p = new te0.j(gt8.a.VERIFY_IDENTITY_IN_PROGRESS);
        Intrinsics.checkNotNullParameter(h0Var, "default");
        this.f108871q = new te0.j(h0Var);
        this.f108872r = new te0.j();
        this.f108873s = new te0.n();
        Intrinsics.checkNotNullParameter(bool2, "default");
        this.f108874t = new te0.j(bool2);
        te0.j jVar5 = new te0.j();
        this.u = jVar5;
        this.v = new te0.j();
        te0.n nVar = new te0.n();
        this.f108875w = nVar;
        te0.e eVarA0 = A0();
        KProperty[] kPropertyArr = f108861y;
        te0.e[] elements = {eVarA0, jVar.getValue(this, kPropertyArr[1]), G0(), jVar2.getValue(this, kPropertyArr[4]), y0(), C0(), H0(), jVar3.getValue(this, kPropertyArr[8]), E0(), w0(), jVar4.getValue(this, kPropertyArr[11]), I0(), J0(), D0(), x0(), jVar5.getValue(this, kPropertyArr[20]), F0(), nVar.getValue(this, kPropertyArr[22])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f108876x = kotlin.collections.d.E(elements);
    }

    public final te0.e A0() {
        return this.f108862b.getValue(this, f108861y[0]);
    }

    public final te0.e B0() {
        return this.e.getValue(this, f108861y[3]);
    }

    public final te0.e C0() {
        return this.f108864g.getValue(this, f108861y[6]);
    }

    public final te0.e D0() {
        return this.f108868m.getValue(this, f108861y[12]);
    }

    public final te0.e E0() {
        return this.f108866j.getValue(this, f108861y[9]);
    }

    public final te0.e F0() {
        return this.v.getValue(this, f108861y[21]);
    }

    public final te0.e G0() {
        return this.d.getValue(this, f108861y[2]);
    }

    public final te0.e H0() {
        return this.f108865h.getValue(this, f108861y[7]);
    }

    public final te0.e I0() {
        return this.o.getValue(this, f108861y[14]);
    }

    public final te0.e J0() {
        return this.f108873s.getValue(this, f108861y[18]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f108876x;
    }

    public final te0.e w0() {
        return this.k.getValue(this, f108861y[10]);
    }

    public final te0.e x0() {
        return this.f108874t.getValue(this, f108861y[19]);
    }

    public final te0.e y0() {
        return this.f.getValue(this, f108861y[5]);
    }

    public final efm.d0 z0() {
        efm.d0 d0VarFirstOrError = te0.w.a0(H0().c(te0.s.f270018a), new cs.a(29)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
