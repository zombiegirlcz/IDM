package ajd;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCombinedSearchScreen v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f5541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ShopsCombinedSearchScreen shopsCombinedSearchScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCombinedSearchScreen;
        this.f5541w = view;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f5541w, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RewardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RewardDelegate.Model model = (RewardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.v;
        ShopsCombinedSearchScreen.g3(shopsCombinedSearchScreen, shopsCombinedSearchScreen.m2(), this.f5541w, new agh.b(shopsCombinedSearchScreen, model, 9));
        return Unit.f186387a;
    }
}
