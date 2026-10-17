package od3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 extends gim.i implements Function2 {
    public s0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f224279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LargeActionButtonDelegate.Model f224280x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s0 s0Var, LargeActionButtonDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f224279w = s0Var;
        this.f224280x = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l0(this.f224279w, this.f224280x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        s0 s0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s0 s0Var2 = this.f224279w;
            ufm.i iVarH = ((ik3.c) s0Var2.B).h();
            this.u = s0Var2;
            this.v = 1;
            Object objB = nim.a.b(iVarH, this);
            if (objB == aVar) {
                return aVar;
            }
            s0Var = s0Var2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s0Var = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        List listD1 = zhm.d0.d1((Iterable) obj2);
        xi0.a aVar2 = xi0.b.Companion;
        Object obj3 = this.f224280x.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        aVar2.getClass();
        return s0Var.C1(new BridgeDestination(new FeatureCommand(new CurrencyChooserFeatureConfig.CurrencyChooser(xi0.a.a((String) obj3), listD1, new TextLocalisedClause(R$string.cashback_details_action_change_currency, null, null, 14), new Integer(4)))));
    }
}
