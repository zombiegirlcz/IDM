package pjg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oma.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f236757b;

    public /* synthetic */ h(p pVar, int i) {
        this.f236756a = i;
        this.f236757b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f236756a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((gjg.k) this.f236757b.i).a();
            case 1:
                opi.d.c(this.f236757b.f236769m);
                return Unit.f186387a;
            case 2:
                p pVar = this.f236757b;
                gjg.a aVar = pVar.f236766h;
                TrustedMerchant.Approved merchant = pVar.f236771p.f94439a;
                gjg.j jVar = (gjg.j) aVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(merchant, "merchant");
                return jVar.f144288g.a(new gjg.g(merchant.f94405b));
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((k3l.d) this.f236757b.f236770n).O(new StatusViewConfiguration.Success("SUCCESS_STATUS_VIEW_ID", new TextLocalisedClause(R$string.trusted_merchants_decline_success_title, null, null, 14), new TextLocalisedClause(R$string.trusted_merchants_decline_success_description, null, null, 14), null, null, 2040));
                return Unit.f186387a;
            case 4:
                k3l.j it10 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((gjg.k) this.f236757b.i).a();
            default:
                ActionsView.Item it11 = (ActionsView.Item) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                pfm.h hVar = new pfm.h(new r(this.f236757b, 7), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
        }
    }
}
