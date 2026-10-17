package tn6;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ ConsentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConsentScreen consentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = consentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ConsentScreen.Companion aVar2 = ConsentScreen.INSTANCE;
        ConsentScreen consentScreen = this.u;
        consentScreen.d3().f174552c.setExpanded(false);
        ScreenContentRecyclerView screenContentRecyclerView = consentScreen.d3().d;
        RecyclerView.Adapter adapter = consentScreen.d3().d.getAdapter();
        screenContentRecyclerView.smoothScrollToPosition(adapter != null ? adapter.getItemCount() : 0);
        return Unit.f186387a;
    }
}
