package q64;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ aw3.k u;
    public final /* synthetic */ GiveConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(aw3.k kVar, GiveConsentScreen giveConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = kVar;
        this.v = giveConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.f10698b.setExpanded(false, true);
        ?? r3 = this.v.W;
        RecyclerView recyclerViewH = ((dli.c) r3.getValue()).h();
        RecyclerView.Adapter adapter = ((dli.c) r3.getValue()).h().getAdapter();
        recyclerViewH.smoothScrollToPosition(adapter != null ? adapter.getItemCount() : 0);
        return Unit.f186387a;
    }
}
