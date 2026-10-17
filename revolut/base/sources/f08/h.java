package f08;

import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yx7.q;
import zw7.n;
import zw7.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends ori.a implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx7.f f131012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.g f131013c;
    public final fx7.j d;
    public final ang.f e;
    public final n8b.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fx7.a f131014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f131015h;
    public final l08.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f131016j;

    public h(fx7.f petInteractor, fx7.g petIssueInteractor, fx7.j policyDocumentInteractor, ang.f userInteractor, n8b.a countryInteractor, fx7.a petAnalyticsInteractor, e state, l08.a petLocalDocumentProvider, q policyDocumentLabelBuilder) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petIssueInteractor, "petIssueInteractor");
        Intrinsics.checkNotNullParameter(policyDocumentInteractor, "policyDocumentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(petLocalDocumentProvider, "petLocalDocumentProvider");
        Intrinsics.checkNotNullParameter(policyDocumentLabelBuilder, "policyDocumentLabelBuilder");
        this.f131012b = petInteractor;
        this.f131013c = petIssueInteractor;
        this.d = policyDocumentInteractor;
        this.e = userInteractor;
        this.f = countryInteractor;
        this.f131014g = petAnalyticsInteractor;
        this.f131015h = state;
        this.i = petLocalDocumentProvider;
        this.f131016j = policyDocumentLabelBuilder;
    }

    public final PolicyDocument.Pdf j3(zw7.m mVar) {
        n nVar = mVar.f325814a;
        o oVar = mVar.f325815b;
        int i = g.f131010a[nVar.ordinal()];
        q qVar = this.f131016j;
        if (i == 1) {
            n nVar2 = n.IPID;
            qVar.getClass();
            return new PolicyDocument.Pdf(q.a(nVar2), k3(mVar), oVar == o.RELATIVE, nVar2, mVar.d, mVar.e);
        }
        if (i == 2) {
            n nVar3 = n.POLICY_WORDING;
            qVar.getClass();
            return new PolicyDocument.Pdf(q.a(nVar3), k3(mVar), oVar == o.RELATIVE, nVar3, mVar.d, mVar.e);
        }
        if (i == 3) {
            n nVar4 = n.STATEMENT_OF_INSURANCE;
            qVar.getClass();
            return new PolicyDocument.Pdf(q.a(nVar4), k3(mVar), oVar == o.RELATIVE, nVar4, mVar.d, mVar.e);
        }
        if (i == 4 || i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String k3(zw7.m mVar) {
        o oVar = mVar.f325815b;
        String str = mVar.f325816c;
        int i = g.f131011b[oVar.ordinal()];
        if (i == 1) {
            return this.f131012b.b(str);
        }
        if (i == 2 || i == 3) {
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final r l3() {
        sfm.b bVar = new sfm.b(w.N(((k) this.f131015h).d()), new ey7.a(new f(this, 4), 11), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final sfm.b m3() {
        sfm.b bVar = new sfm.b(w.N(((k) this.f131015h).y0()), new ey7.a(new f(this, 3), 10), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }
}
