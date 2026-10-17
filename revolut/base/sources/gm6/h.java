package gm6;

import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import fo6.k;
import ho6.j;
import ho6.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tn6.h;
import yki.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d f144778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f144779c;
    public final /* synthetic */ CrossBorderLinkAccountFlowContract$Step d;

    public /* synthetic */ h(com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar, CrossBorderLinkAccountFlowContract$Step crossBorderLinkAccountFlowContract$Step, l lVar, int i) {
        this.f144777a = i;
        this.f144778b = dVar;
        this.d = crossBorderLinkAccountFlowContract$Step;
        this.f144779c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144777a) {
            case 0:
                ho6.j result = (ho6.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof k) {
                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar = this.f144778b;
                    im6.a aVar = dVar.f72899x;
                    se6.i iVar = ((k) result).f154233a;
                    aVar.getClass();
                    dVar.J2(im6.a.a(iVar), ((CrossBorderLinkAccountFlowContract$Step.CountryDepartments) this.d).f72876b);
                } else {
                    if (!(result instanceof j.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(this.f144779c, CrossBorderLinkAccountFlowContract$Step.CountryDepartmentNotListedDialog.f72874a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 1:
                fo6.k result2 = (fo6.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof fo6.l;
                l lVar = this.f144779c;
                if (z) {
                    CrossBorderLinkAccountFlowContract$Step.Branches branches = (CrossBorderLinkAccountFlowContract$Step.Branches) this.d;
                    oki.h.t2(this.f144778b, lVar, new CrossBorderLinkAccountFlowContract$Step.Consent(branches.f72868a, branches.f72869b, ((fo6.l) result2).f136832a.f262133a), true, null, false, 12);
                } else {
                    if (!(result2 instanceof k.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(lVar, CrossBorderLinkAccountFlowContract$Step.BranchNotListedDialog.f72867a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 2:
                tn6.h result3 = (tn6.h) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, h.a.f272316a)) {
                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar2 = this.f144778b;
                    dVar2.n2(new j(dVar2, this.d, null, 0), new whi.b(6));
                } else {
                    if (!Intrinsics.f(result3, h.b.f272317a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(this.f144779c);
                }
                return Unit.f186387a;
            default:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z3 = outputData instanceof dii.e;
                com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar3 = this.f144778b;
                CrossBorderLinkAccountFlowContract$Step crossBorderLinkAccountFlowContract$Step = this.d;
                if (z3) {
                    CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog = (CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderLinkAccountFlowContract$Step;
                    dVar3.J2(takeUserRegionForGlobalBankDialog.f72886c, takeUserRegionForGlobalBankDialog.f72885b);
                } else if (outputData instanceof dii.f) {
                    CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog2 = (CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog) crossBorderLinkAccountFlowContract$Step;
                    oki.h.t2(dVar3, this.f144779c, new CrossBorderLinkAccountFlowContract$Step.CountryDepartments(takeUserRegionForGlobalBankDialog2.f72884a, takeUserRegionForGlobalBankDialog2.f72885b), true, null, false, 12);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ h(com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar, l lVar, CrossBorderLinkAccountFlowContract$Step crossBorderLinkAccountFlowContract$Step, int i) {
        this.f144777a = i;
        this.f144778b = dVar;
        this.f144779c = lVar;
        this.d = crossBorderLinkAccountFlowContract$Step;
    }
}
