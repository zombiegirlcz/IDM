package s6b;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.CobrandedCardsAccountCreationScreen;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsAccountCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsAccountCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(textData);
        m mVar = (m) iVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        y yVar = mVar.f260210r;
        mVar.H2(yVar, new k(new HashMap(((g) ((j2) yVar.f22677a).getValue()).f260197a), textData, 0));
        return Unit.f186387a;
    }
}
