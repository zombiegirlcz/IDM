package mic;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import com.revolut.feature.rewards.impl.ui.details.screen.mapper.BannerActionParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PerkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PerkDetailsScreen perkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "BANNER_ITEM_ID") && (obj3 instanceof BannerActionParcel)) {
            x xVarD3 = this.v.R2();
            String url2 = ((BannerActionParcel) obj3).f84949a;
            g0 g0Var = (g0) xVarD3;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            g0Var.C2(new n(url2));
        }
        return Unit.f186387a;
    }
}
