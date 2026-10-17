package dn6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step;
import dlk.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rn6.f;
import tn6.h;
import yki.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116223a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d f116224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f116225c;
    public final /* synthetic */ LinkAccountFlowContract$Step d;

    public /* synthetic */ h(LinkAccountFlowContract$Step linkAccountFlowContract$Step, com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar, l lVar) {
        this.d = linkAccountFlowContract$Step;
        this.f116224b = dVar;
        this.f116225c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f116223a) {
            case 0:
                rn6.f result = (rn6.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof rn6.e;
                com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar = this.f116224b;
                if (z) {
                    ExternalInstitution externalInstitution = ((LinkAccountFlowContract$Step.Branches) this.d).f72999a;
                    oki.h.t2(dVar, this.f116225c, externalInstitution.f66111h.contains(ho3.c.AIS_PREVIEW) ? new LinkAccountFlowContract$Step.ReviewAccountLinkingDetails(externalInstitution.f66107a, externalInstitution.f66108b, ((rn6.e) result).f255507a.f154218a, 8) : new LinkAccountFlowContract$Step.Consent(externalInstitution, ((rn6.e) result).f255507a.f154218a), true, null, false, 12);
                } else {
                    if (!(result instanceof f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.B2();
                }
                return Unit.f186387a;
            default:
                tn6.h result2 = (tn6.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, h.a.f272316a)) {
                    com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar2 = this.f116224b;
                    dVar2.n2(new k(dVar2, this.d, null, 7), new whi.b(6));
                } else {
                    if (!Intrinsics.f(result2, h.b.f272317a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(this.f116225c);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ h(com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar, l lVar, LinkAccountFlowContract$Step linkAccountFlowContract$Step) {
        this.f116224b = dVar;
        this.f116225c = lVar;
        this.d = linkAccountFlowContract$Step;
    }
}
