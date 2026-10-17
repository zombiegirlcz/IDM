package a83;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar2 = this.u;
        efm.r rVarFilter = aVar2.C.e.filter(new a6b.a(new a82.l(8), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.l.b1(aVar2, rd0.e.b(rVarFilter), null, new g0(aVar2, null, 3), 3);
        z1 z1Var = aVar2.C;
        Intrinsics.checkNotNullParameter("REACTIVATE_TERMINATED_CARD_LIST_ID", "id");
        z1.b(z1Var, new ListIdTarget("REACTIVATE_TERMINATED_CARD_LIST_ID"), new AppTipUIModel("TERMINATED_CARD_TIP_ID", null, new TextLocalisedClause(R$string.cards_tip_reactivate_title, null, null, 14), new TextLocalisedClause(R$string.retail_tips_cards_reactivation_subtitle, null, null, 14), new aw0.s(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_lightbulb, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10)), null, null, null, 994), null, null, 24);
        return Unit.f186387a;
    }
}
