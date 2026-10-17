package j96;

import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDepositSetupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DirectDepositSetupScreen directDepositSetupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDepositSetupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVarE3 = this.v.R2();
        Intrinsics.h(model);
        l lVar = (l) cVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        h96.d dVar = h96.d.PREVIEW;
        y yVar = lVar.f172305q;
        lVar.C2(new b(dVar, ((a) ((j2) yVar.f22677a).getValue()).f172290a, ((a) ((j2) yVar.f22677a).getValue()).f172291b));
        return Unit.f186387a;
    }
}
