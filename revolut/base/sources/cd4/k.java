package cd4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f23181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ed4.a f23182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lx3.a f23183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CreditLinkedAccountsV2ListScreenContract$InputData f23184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f23185t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j60.a bottomDialogExtension, ed4.a creditLinkedAccountsDialogFactory, lx3.a creditLinkedAccountsFlowInteractor, gte.a featureToggleInteractor, CreditLinkedAccountsV2ListScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(creditLinkedAccountsDialogFactory, "creditLinkedAccountsDialogFactory");
        Intrinsics.checkNotNullParameter(creditLinkedAccountsFlowInteractor, "creditLinkedAccountsFlowInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f23181p = bottomDialogExtension;
        this.f23182q = creditLinkedAccountsDialogFactory;
        this.f23183r = creditLinkedAccountsFlowInteractor;
        this.f23184s = inputData;
        this.f23185t = new g(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f23185t;
    }

    public final void y2() {
        lx3.a aVar = this.f23183r;
        yji.l.a1(this, rd0.e.b(pd.b.t(aVar.a(), new o(aVar, 10))), null, null, new cbh.g(this, null, 3), 3);
    }
}
