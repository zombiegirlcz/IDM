package u6b;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.CobrandedCardsAccountLinkingScreen;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsAccountLinkingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsAccountLinkingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(textData);
        l lVar = (l) iVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        y yVar = lVar.f277539r;
        lVar.H2(yVar, new s6b.k(new HashMap(((e) ((j2) yVar.f22677a).getValue()).f277527a), textData, 1));
        return Unit.f186387a;
    }
}
