package fjd;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.k1;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.home.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.revolut.feature.shops.impl.ui.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.v, continuation);
        c0Var.u = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.shops.impl.ui.home.a aVar2 = this.v;
        cli.y yVar = aVar2.Q;
        od0.i iVar = (od0.i) ((o) ((j2) yVar.f22677a).getValue()).i.getContent();
        if (iVar != null) {
            boolean zBooleanValue = ((Boolean) iVar.c()).booleanValue();
            od0.i iVar2 = (od0.i) data.getContent();
            boolean zBooleanValue2 = iVar2 != null ? ((Boolean) iVar2.c()).booleanValue() : false;
            if (!zBooleanValue && zBooleanValue2) {
                ((k1) aVar2.D).d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "adsConsentGranted", new TextLocalisedClause(R$string.shops_screens_home_tooltip_offers_unlocked, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                ShopsCategory shopsCategory = ((o) ((j2) yVar.f22677a).getValue()).f135583g;
                if (shopsCategory != null && (str = shopsCategory.f87040a) != null) {
                    com.revolut.feature.shops.impl.ui.home.a.K2(aVar2, str, true, 4);
                }
            }
        }
        aVar2.H2(yVar, new f9a.i(data, 22));
        return Unit.f186387a;
    }
}
