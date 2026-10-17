package mg7;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.IncentiveSelectionController;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncentiveSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IncentiveSelectionController incentiveSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = incentiveSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        g incentive = obj3 instanceof g ? (g) obj3 : null;
        if (incentive != null) {
            u uVar = (u) this.v.d();
            uVar.getClass();
            Intrinsics.checkNotNullParameter(incentive, "option");
            j60.a aVar2 = uVar.f205188q;
            w wVar = uVar.f205189r;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(incentive, "incentive");
            rp0.l lVar = rp0.l.WINDOW;
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.incentive_reward_incentive_selection_info_title, null, new Custom(null, false, db.HEADING3, false, null, Constants.TAG_FB_CHARGING_STATUS), 10), null, null, 30);
            List list = incentive.e;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            int i = 0;
            for (Object obj4 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                h hVar = (h) obj4;
                int iA = wVar.f205192a.a(hVar.f205168b);
                Integer numValueOf = Integer.valueOf(iA);
                if (iA == 0) {
                    numValueOf = null;
                }
                arrayList.add(new ListCellDelegate.Model(a0.d.n("SUB_CATEGORY_LIST_ID_", i), numValueOf != null ? new j8(new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)) : null, null, new TextClause(hVar.f205167a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), false, null, null, 0, 0, 0, 0, 4068));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.incentive_reward_common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            aVar2.x(new y(d0.E0(zhm.u.c(model2), arrayList), tVar, lVar, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
