package ty4;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionParcel;
import com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import cul.n0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jmrtd.lds.LDSFile;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends jki.g implements j {
    public final com.revolut.feature.external_accounts.api.navigation.a A;
    public final d B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f275478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DirectDebitAccountSelectionScreenContract$InputData f275479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f01.c f275480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cz4.b f275481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xy4.b f275482t;
    public final je6.h u;
    public final t70.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wsg.n f275483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z71.a f275484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cz4.a f275485y;
    public final j60.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x deeplinkHandler, DirectDebitAccountSelectionScreenContract$InputData inputData, f01.c uiKitResources, cz4.b interactor, xy4.b directDebitStatusDialogFactory, je6.h externalInstitutionLogoMapper, t70.b currencyLocalization, wsg.n walletInteractor, z71.a revolutBankAccountsRepository, cz4.a directDebitAccountDetailsInteractor, j60.a bottomExpandableDialogControllerExtension, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, gte.a featureToggleInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(directDebitStatusDialogFactory, "directDebitStatusDialogFactory");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(directDebitAccountDetailsInteractor, "directDebitAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f275478p = deeplinkHandler;
        this.f275479q = inputData;
        this.f275480r = uiKitResources;
        this.f275481s = interactor;
        this.f275482t = directDebitStatusDialogFactory;
        this.u = externalInstitutionLogoMapper;
        this.v = currencyLocalization;
        this.f275483w = walletInteractor;
        this.f275484x = revolutBankAccountsRepository;
        this.f275485y = directDebitAccountDetailsInteractor;
        this.z = bottomExpandableDialogControllerExtension;
        this.A = externalPocketNavigationFactory;
        this.B = new d(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        cz4.a aVar = this.f275485y;
        oe6.a aVar2 = aVar.f110157b;
        yji.l.b1(this, rd0.e.b(pd.b.r(nim.a.w(nim.a.w(u1.d(((xg6.j) aVar2).i(w4l.i.f294643c, oe6.b.f224551a), osg.b.e(aVar.f110156a, true, null, null, io3.i.EXTERNAL, null, null, null, LDSFile.EF_DG4_TAG)), new n0(aVar, 23)), new l(this, 2)), new l(this, 1))), null, new tna.p(this, null, 28), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }

    public final void y2(io3.d dVar) {
        C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, this.f275479q.f69888b, 2032)));
    }

    public final void z2(AccountSelectionParcel accountSelectionParcel, bk4.f fVar) {
        PocketInfo pocketInfo;
        String f69907g;
        if (accountSelectionParcel == null || (pocketInfo = accountSelectionParcel.f69890a) == null) {
            return;
        }
        String f = pocketInfo.getF();
        if (f == null || f.length() == 0 || (f69907g = pocketInfo.getF69907g()) == null || f69907g.length() == 0) {
            this.f275482t.getClass();
            X1(xy4.b.a());
        } else {
            j60.a.v(this.z, false, null, 3);
            v2(new f(pocketInfo, fVar));
        }
    }
}
