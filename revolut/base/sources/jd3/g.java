package jd3;

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
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public h u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f172956w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LargeActionButtonDelegate.Model f172957x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, LargeActionButtonDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f172956w = hVar;
        this.f172957x = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f172956w, this.f172957x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar2 = this.f172956w;
            ufm.i iVarH = ((ik3.c) hVar2.f172964t).h();
            this.u = hVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarH, this);
            if (objB == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        List listD1 = d0.d1((Iterable) obj2);
        xi0.a aVar2 = xi0.b.Companion;
        Object obj3 = this.f172957x.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        aVar2.getClass();
        return hVar.A2(new BridgeDestination(new FeatureCommand(new CurrencyChooserFeatureConfig.CurrencyChooser(xi0.a.a((String) obj3), listD1, new TextLocalisedClause(R$string.cashback_details_action_change_currency, null, null, 14), new Integer(4)))));
    }
}
