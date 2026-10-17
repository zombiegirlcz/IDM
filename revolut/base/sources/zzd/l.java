package zzd;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DocumentsHubScreen documentsHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = documentsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.P;
        a0e.e eVar = a0e.e.f339a;
        if (Intrinsics.f(obj3, eVar)) {
            ((com.revolut.feature.statements.impl.ui.documents_hub.a) this.v.d()).J2(eVar);
        }
        return Unit.f186387a;
    }
}
