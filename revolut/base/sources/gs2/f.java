package gs2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockedPaymentsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BlockedPaymentsListScreen blockedPaymentsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockedPaymentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2;
        int i3;
        int i5;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarG3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) oVarG3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "ID_BLOCKED_CATEGORIES_ITEM")) {
            rVar.z2(model.f52715m);
        } else {
            j60.a aVar2 = rVar.f146297t;
            rVar.u.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            if (Intrinsics.f(str, "ID_MERCHANT_SUBHEADER_ITEM")) {
                i = R$string.blocked_payments_merchants_limits_title;
            } else {
                if (!Intrinsics.f(str, "ID_SUBSCRIPTION_SUBHEADER_ITEM")) {
                    throw new IllegalStateException(p.a.p("Clicks on start image for ListSubheaderDelegate with listId ", str, " are not supported"));
                }
                i = R$string.blocked_payments_subscriptions_limits_title;
            }
            rp0.t tVar = new rp0.t(new TextLocalisedClause(i, null, null, 14), null, null, 30);
            if (Intrinsics.f(str, "ID_MERCHANT_SUBHEADER_ITEM")) {
                i2 = R$string.blocked_payments_merchants_limits_at_once;
            } else {
                if (!Intrinsics.f(str, "ID_SUBSCRIPTION_SUBHEADER_ITEM")) {
                    throw new IllegalStateException(p.a.p("Clicks on start image for ListSubheaderDelegate with listId ", str, " are not supported"));
                }
                i2 = R$string.blocked_payments_subscriptions_limits_at_once;
            }
            RowDelegate.Model model2 = new RowDelegate.Model("LIMITS_CELL_1_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(i2, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            if (Intrinsics.f(str, "ID_MERCHANT_SUBHEADER_ITEM")) {
                i3 = R$string.blocked_payments_merchants_limits_per_month;
            } else {
                if (!Intrinsics.f(str, "ID_SUBSCRIPTION_SUBHEADER_ITEM")) {
                    throw new IllegalStateException(p.a.p("Clicks on start image for ListSubheaderDelegate with listId ", str, " are not supported"));
                }
                i3 = R$string.blocked_payments_subscriptions_limits_per_month;
            }
            List listK = zhm.v.k(model2, new RowDelegate.Model("LIMITS_CELL_2_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_week, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(i3, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            List list = listK;
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            if (Intrinsics.f(str, "ID_MERCHANT_SUBHEADER_ITEM")) {
                i5 = R$string.blocked_payments_merchants_limits_button_got_it;
            } else {
                if (!Intrinsics.f(str, "ID_SUBSCRIPTION_SUBHEADER_ITEM")) {
                    throw new IllegalStateException(p.a.p("Clicks on start image for ListSubheaderDelegate with listId ", str, " are not supported"));
                }
                i5 = R$string.blocked_payments_subscriptions_limits_button_got_it;
            }
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("GOT_IT_ITEM", defaultFilledButton, null, new TextLocalisedClause(i5, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model3, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
            aVar2.x(new rp0.y(d0.F0(model3, list), tVar, rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
