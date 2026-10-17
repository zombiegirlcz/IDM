package xb4;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import ggk.u0;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n38.x;
import skm.q;
import xkf.q1;
import y5g.k;
import yb2.r;
import yf1.y;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f303985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f303986x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f303985w = obj2;
        this.f303986x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) this.f303985w, (nii.g) this.f303986x, continuation, 0);
            case 1:
                return new g((xd2.f) this.f303985w, (String) this.f303986x, continuation, 1);
            case 2:
                return new g((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f303985w, (Watchlist) this.f303986x, continuation, 2);
            case 3:
                return new g((com.revolut.retail.feature.esim.impl.ui.screens.help.b) this.f303985w, (String) this.f303986x, continuation, 3);
            case 4:
                return new g((xi4.a) this.f303985w, (yi4.f) this.f303986x, continuation, 4);
            case 5:
                return new g((xij.c) this.f303985w, (String) this.f303986x, continuation, 5);
            case 6:
                return new g((xjc.g) this.f303985w, (String) this.f303986x, continuation, 6);
            case 7:
                return new g((q1) this.f303986x, continuation, 7);
            case 8:
                return new g((q1) this.f303985w, (String) this.f303986x, continuation, 8);
            case 9:
                return new g((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) this.f303985w, (u0) this.f303986x, continuation, 9);
            case 10:
                return new g((com.revolut.sso.impl.ui.passcode.change_flow.a) this.f303985w, (znl.c) this.f303986x, continuation, 10);
            case 11:
                return new g((com.revolut.feature.retail.savings.impl.ui.details.a) this.f303985w, (String) this.f303986x, continuation, 11);
            case 12:
                return new g((xrg.d) this.f303986x, continuation, 12);
            case 13:
                return new g((com.revolut.feature.rev_points.buying.impl.ui.flow.a) this.f303985w, (dj0.d) this.f303986x, continuation, 13);
            case 14:
                return new g((com.revolut.feature.staking.impl.unstake.v2.a) this.f303986x, continuation, 14);
            case 15:
                return new g((xxh.e) this.f303985w, (xxh.c) this.f303986x, continuation, 15);
            case 16:
                return new g((com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a) this.f303985w, (String) this.f303986x, continuation, 16);
            case 17:
                return new g((uvl.c) this.f303985w, (List) this.f303986x, continuation, 17);
            case 18:
                return new g((y48.f) this.f303985w, (x) this.f303986x, continuation, 18);
            case 19:
                return new g((com.revolut.feature.settings.preview.displayCurrency.a) this.f303985w, this.f303986x, continuation, 19);
            case 20:
                return new g((n7g.c) this.f303985w, (k) this.f303986x, continuation, 20);
            case 21:
                return new g((com.revolut.feature.card_screen.impl.kompot.cards_list.c) this.f303985w, (TerminatedCard) this.f303986x, continuation, 21);
            case 22:
                return new g((com.revolut.feature.onboarding.impl.missinginfo.d) this.f303985w, (rbi.c) this.f303986x, continuation, 22);
            case 23:
                return new g((com.revolut.feature.onboarding.impl.missinginfo.d) this.f303985w, (List) this.f303986x, continuation, 23);
            case 24:
                return new g((q) this.f303985w, (com.revolut.feature_retail_user_declarations.email.screen.a) this.f303986x, continuation, 24);
            case 25:
                return new g((r) this.f303985w, (dj0.d) this.f303986x, continuation, 25);
            case 26:
                return new g((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f303985w, (dj0.d) this.f303986x, continuation, 26);
            case 27:
                return new g((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) this.f303985w, (CatalogueProduct) this.f303986x, continuation, 27);
            case 28:
                return new g((com.revolut.feature.pockets.impl.ui.add_new.c) this.f303985w, (xi0.b) this.f303986x, continuation, 28);
            default:
                return new g((y) this.f303985w, (qf1.i) this.f303986x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x05f3  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xb4.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f303986x = obj2;
    }
}
