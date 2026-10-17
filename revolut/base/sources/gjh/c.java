package gjh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.v.d;
        Intrinsics.h(model);
        Intrinsics.checkNotNullParameter(model, "model");
        ((j) eVar.f144297n).getClass();
        l0.f((l0) eVar.o, model.f53228a, zi0.c.d(u.c(com.revolut.core.ui_kit.models.popup.a.a("menu_item_hide_inactive_accounts", new TextLocalisedClause(R$string.wealth_invest_home_portfolio_upselling_accounts_menu_hide_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, i.f144305a, null, null, Constants.TAG_EMV_L2_CHECKSUM))), null, null, 12);
        return Unit.f186387a;
    }
}
