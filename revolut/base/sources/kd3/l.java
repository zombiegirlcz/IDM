package kd3;

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
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public m u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f182791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LargeActionButtonDelegate.Model f182792x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, LargeActionButtonDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f182791w = mVar;
        this.f182792x = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.f182791w, this.f182792x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            m mVar2 = this.f182791w;
            ufm.i iVarH = ((ik3.c) mVar2.f182800y).h();
            this.u = mVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarH, this);
            if (objB == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        List listD1 = d0.d1((Iterable) obj2);
        xi0.a aVar2 = xi0.b.Companion;
        Object obj3 = this.f182792x.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        aVar2.getClass();
        return mVar.C1(new BridgeDestination(new FeatureCommand(new CurrencyChooserFeatureConfig.CurrencyChooser(xi0.a.a((String) obj3), listD1, new TextLocalisedClause(R$string.cashback_details_action_change_currency, null, null, 14), new Integer(4)))));
    }
}
