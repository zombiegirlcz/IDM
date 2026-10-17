package oee;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f224595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f224596c;

    public /* synthetic */ o(v vVar, f0 f0Var, int i) {
        this.f224594a = i;
        this.f224595b = vVar;
        this.f224596c = f0Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f224594a) {
            case 0:
                v vVar = this.f224595b;
                opi.d dVar = vVar.f224602h;
                vVar.k.getClass();
                f0 card = this.f224596c;
                Intrinsics.checkNotNullParameter(card, "card");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.delivery_details_cancel_order_dialog_title, null, null, 14), null, null, 30);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CANCEL_ORDER_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.delivery_details_cancel_order_dialog_confirm, null, null, 14), false, null, null, card, null, 744);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("DONT_CANCEL_ORDER_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.delivery_details_cancel_order_dialog_reject, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
                ((opi.b) dVar).Z(new y(zhm.v.k(model, model2), tVar, rp0.l.WINDOW, null, null, null, 1016));
                break;
            default:
                v vVar2 = this.f224595b;
                opi.d dVar2 = vVar2.f224602h;
                az2.b bVar = vVar2.f224609r;
                opi.b bVar2 = (opi.b) dVar2;
                bVar2.Z(((vz2.b) bVar).e(this.f224596c, new TextLocalisedClause(R$string.delivery_details_cancel_mcy_card_order_dialog_title, null, null, 14)));
                break;
        }
    }
}
