package ajd;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCombinedSearchScreen v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f5540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ShopsCombinedSearchScreen shopsCombinedSearchScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCombinedSearchScreen;
        this.f5540w = view;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f5540w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.v;
        ShopsCombinedSearchScreen.g3(shopsCombinedSearchScreen, shopsCombinedSearchScreen.m2(), this.f5540w, new agh.b(shopsCombinedSearchScreen, model, 8));
        return Unit.f186387a;
    }
}
