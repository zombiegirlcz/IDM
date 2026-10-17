package mkk;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lha.k f206498w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar, lha.k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f206498w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f206498w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            cha.b bVar2 = bVar.o;
            String strJ2 = bVar.J2();
            String str = this.f206498w.f195217a;
            this.u = 1;
            if (((ffk.h) bVar2).j(strJ2, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        g1 g1Var = bVar.f103411p;
        k1 k1Var = (k1) g1Var;
        k1Var.d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "id_member_removed", new TextLocalisedClause(R$string.family_plans_management_remove_member_success_shot, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        return Unit.f186387a;
    }
}
