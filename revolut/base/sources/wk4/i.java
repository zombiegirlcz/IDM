package wk4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetDateScreen f298243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(SetDateScreen setDateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298243w = setDateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f298243w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f298243w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SetDateScreen setDateScreen = this.f298243w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarI3 = setDateScreen.T2();
                Intrinsics.h(listId);
                m mVar = (m) dVarI3;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ID_MENU_ITEM_INFO")) {
                    j60.a aVar2 = mVar.f298248q;
                    mVar.f298247p.getClass();
                    t tVar = new t(new TextLocalisedClause(R$string.credit_autopay_set_day_ach_info_title, null, null, 14), null, null, 30);
                    List listK = v.k(yk4.a.c(R$drawable.uikit_icn_24_question_outline, R$string.credit_autopay_set_day_ach_info_dates_unavailable_title, R$string.credit_autopay_set_day_ach_info_dates_unavailable_subtitle, "id_dates_unavailable"), yk4.a.c(R$drawable.uikit_icn_24_calendar_coins, R$string.credit_autopay_set_day_ach_info_collection_date_title, R$string.credit_autopay_set_day_ach_info_collection_date_subtitle, "id_payment_collecting"));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.l(model, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                    aVar2.x(new y(d0.F0(model, listK), tVar, rp0.l.WINDOW, null, null, null, "SET_DATE_BOTTOM_DIALOG_DELEGATES_KEY", null, null, null, 3832));
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarI32 = setDateScreen.T2();
                int iIntValue = ((Number) pair.f186386b).intValue();
                m mVar2 = (m) dVarI32;
                mVar2.getClass();
                mVar2.x2(new k(iIntValue, 0));
                break;
        }
        return Unit.f186387a;
    }
}
