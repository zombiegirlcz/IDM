package d8b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f112200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f112201x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f112200w = str;
        this.f112201x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, this.f112200w, this.f112201x, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CobrandedCardsWidget) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CobrandedCardsWidget cobrandedCardsWidget = (CobrandedCardsWidget) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = this.v;
        String str = this.f112200w;
        return k.a(this.f112201x, new cvi.b(kVar, str, cobrandedCardsWidget), new a2.a(kVar, 6, str, cobrandedCardsWidget));
    }
}
