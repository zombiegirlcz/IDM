package ty7;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesActivity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275496a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f275497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f275498c;

    public /* synthetic */ h(e eVar, p pVar) {
        this.f275498c = eVar;
        this.f275497b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        switch (this.f275496a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                uy7.e model = (uy7.e) pair.f186385a;
                ((PetEditReviewChangesActivity) this.f275498c).setItems((List) pair.f186386b);
                p pVar = this.f275497b;
                iqi.h hVar = pVar.k;
                pVar.f275511q.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (model instanceof uy7.c) {
                    int i = R$string.pets_pet_details_review_changes_confirm_payment_button_title;
                    dj0.d dVar = ((uy7.c) model).f284099c.f;
                    textLocalisedClause = new TextLocalisedClause(i, v.l(dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4) : null), null, 12);
                } else {
                    if (!(model instanceof uy7.d) && !(model instanceof uy7.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pets_pet_details_review_changes_confirm_button_title, null, null, 14);
                    textLocalisedClause = textLocalisedClause2;
                }
                ((iqi.b) hVar).a0(textLocalisedClause);
                return Unit.f186387a;
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                NavBarWithToolbar navBarWithToolbar = ((xpi.c) this.f275497b.f275506j).f307974j;
                if (navBarWithToolbar == null) {
                    Intrinsics.r("navBarWithToolbarView");
                    throw null;
                }
                navBarWithToolbar.setExpanded(false, true);
                PetEditReviewChangesActivity petEditReviewChangesActivity = (PetEditReviewChangesActivity) this.f275498c;
                petEditReviewChangesActivity.getClass();
                pfm.h hVar2 = new pfm.h(new b(petEditReviewChangesActivity, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
        }
    }

    public /* synthetic */ h(p pVar, e eVar) {
        this.f275497b = pVar;
        this.f275498c = eVar;
    }
}
