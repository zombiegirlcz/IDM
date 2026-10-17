package twb;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import com.revolut.kompot.common.ExternalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        String str2 = model.f51781a;
        int iHashCode = str2.hashCode();
        if (iHashCode != -846393709) {
            if (iHashCode != -236007173) {
                if (iHashCode == 1372890824 && str2.equals("SECTION_CLAIM_URL_CELL_DETAILS_ID")) {
                    aVar2.C1(new ExternalDestination.Browser(str, null));
                }
            } else if (str2.equals("SECTION_COPY_PIN_CELL_DETAILS_ID")) {
                c70.a aVar3 = aVar2.f83717p;
                th9.t tVar = aVar2.I;
                aVar3.a("COPY_REDEMPTION_PIN_LABEL", str, false);
                if (!c70.a.g()) {
                    tVar.invoke();
                }
                aVar2.X1(new mii.f("PIN_COPIED_SHOT_DIALOG", new TextLocalisedClause(R$string.gift_cards_redeem_toast_pin_copied, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), f1.ABOVE_ANCHOR_VIEW, null, 76));
            }
        } else if (str2.equals("SECTION_COPY_CODE_CELL_DETAILS_ID")) {
            aVar2.L2(str);
        }
        return Unit.f186387a;
    }
}
