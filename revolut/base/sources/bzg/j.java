package bzg;

import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPnLScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPnLScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i;
        int i2;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        if (obj3 instanceof fzg.f) {
            l0 l0Var = aVar2.f95119q;
            ViewIdTarget viewIdTarget = new ViewIdTarget(R$id.listSubheader_startImage);
            ezg.b bVar = aVar2.f95118p;
            List pnlContributorTypes = ((k) ((j2) aVar2.f95123w.f22677a).getValue()).f19998n;
            fzg.f selectedType = (fzg.f) obj3;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(pnlContributorTypes, "pnlContributorTypes");
            Intrinsics.checkNotNullParameter(selectedType, "selectedType");
            List<fzg.f> list = pnlContributorTypes;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (fzg.f fVar : list) {
                PopupMenuItem.Companion companion = PopupMenuItem.INSTANCE;
                int[] iArr = ezg.a.f130938a;
                int i3 = iArr[fVar.ordinal()];
                if (i3 == 1) {
                    str = "CONTRIBUTORS_BY_ASSET_ID";
                } else if (i3 == 2) {
                    str = "CONTRIBUTORS_BY_TRANSACTION_ID";
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "CONTRIBUTORS_BY_POSITIONS";
                }
                int i5 = iArr[fVar.ordinal()];
                if (i5 == 1) {
                    i = R$string.wealth_analytics_widgetised_pnl_contributors_type_asset;
                } else if (i5 == 2) {
                    i = R$string.wealth_analytics_widgetised_pnl_contributors_type_transaction;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_analytics_widgetised_pnl_contributors_type_positions;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                boolean z = selectedType == fVar;
                int i6 = iArr[fVar.ordinal()];
                if (i6 == 1) {
                    i2 = R$drawable.uikit_icn_24_avatar_grid;
                } else if (i6 == 2) {
                    i2 = R$drawable.uikit_icn_24_menu;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$drawable.uikit_icn_24_view_list_medium;
                }
                arrayList.add(PopupMenuItem.Companion.a(companion, str, textLocalisedClause, z, null, fVar, new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 200));
            }
            l0.d(l0Var, viewIdTarget, zi0.c.d(arrayList), null, 12);
        }
        return Unit.f186387a;
    }
}
