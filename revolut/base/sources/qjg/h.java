package qjg;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.TrustedMerchantsFeatureConfig;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import ozc.z;
import pfm.r;
import qce.m0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f246870b;

    public /* synthetic */ h(n nVar, int i) {
        this.f246869a = i;
        this.f246870b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f246869a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((gjg.k) this.f246870b.f246876j).a();
            case 1:
                LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
                Object obj3 = model.i;
                if (!Intrinsics.f(model.f52613a, "TRUSTED_CONFIRMATION_DIALOG_MAIN_BUTTON_ID") || !(obj3 instanceof TrustedMerchant)) {
                    return pfm.m.f235744a;
                }
                TrustedMerchant merchant = (TrustedMerchant) obj3;
                gjg.j jVar = (gjg.j) this.f246870b.f246875h;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(merchant, "merchant");
                return jVar.f.a(new gjg.f(merchant.getF94411b()));
            case 2:
                TrustedMerchantsFlowContract$MerchantsContent data = (TrustedMerchantsFlowContract$MerchantsContent) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return ((g) this.f246870b.i).b(data);
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((k3l.d) this.f246870b.f246879n).O(new StatusViewConfiguration.Success("SUCCESS_STATUS_VIEW_ID", new TextLocalisedClause(R$string.trusted_merchants_approve_success_title, null, null, 14), null, null, null, 2044));
                return Unit.f186387a;
            case 4:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                n nVar = this.f246870b;
                bjg.f fVar = (bjg.f) ((gjg.j) nVar.f246875h).f144286b;
                w4l.f fVar2 = fVar.d;
                Unit unit = Unit.f186387a;
                efm.b bVarIgnoreElements = mo3.a.n(fVar2.f(unit, true)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                efm.b bVarIgnoreElements2 = mo3.a.n(fVar.e.f(unit, true)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                pfm.f fVarO = efm.b.o(v.k(bVarIgnoreElements, bVarIgnoreElements2));
                Intrinsics.checkNotNullExpressionValue(fVarO, "merge(...)");
                r rVarG = o70.a.g(fVarO);
                Function1 function1K = nVar.K();
                pfm.a aVar = new pfm.a(rVarG, new o0(11, new m0(new BreadcrumbException(), 17)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar.w(new lhi.b(23, function1K), new z(20, m.f246874a));
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(nVar.f239031a, hVarW);
                return unit;
            case 5:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.u;
                boolean z = obj4 instanceof TrustedMerchant.Approved;
                n nVar2 = this.f246870b;
                if (z) {
                    TrustedMerchant.Approved trustedMerchant = (TrustedMerchant.Approved) obj4;
                    gjg.k kVar = (gjg.k) nVar2.f246876j;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(trustedMerchant, "trustedMerchant");
                    return kVar.f144289a.a(new FeatureCommand(new TrustedMerchantsFeatureConfig.TrustedMerchantDetailsFeatureConfig(trustedMerchant)));
                }
                if (obj4 instanceof TrustedMerchant.ToReview) {
                    return new pfm.h(new phc.d(nVar2, obj4, 19), 2);
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            default:
                opi.d.c(this.f246870b.f246878m);
                return Unit.f186387a;
        }
    }
}
