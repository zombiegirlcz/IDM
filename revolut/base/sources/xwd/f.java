package xwd;

import cli.y;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jmrtd.lds.LDSFile;
import te0.w;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ UnstakeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UnstakeController unstakeController, Continuation continuation) {
        super(2, continuation);
        this.u = unstakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.staking.impl.unstake.v2.a aVar2 = (com.revolut.feature.staking.impl.unstake.v2.a) this.u.R2();
        y yVar = aVar2.z;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        dj0.d dVar = cp5.d.z(((l) j2Var.getValue()).f309355b) ? ((l) j2Var2.getValue()).d.f309352a : ((l) j2Var2.getValue()).d.f309353b;
        if (dVar != null) {
            aVar2.X1(w.a("SWITCH_BUTTON_SHOT_ID", new TextLocalisedClause(R$string.staking_currency_selected, u.c(new CurrencyClause(dVar.f115083b, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_arrows_sort, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
            aVar2.f88169y.onNext(dVar);
        }
        return Unit.f186387a;
    }
}
