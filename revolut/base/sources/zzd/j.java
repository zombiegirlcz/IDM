package zzd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DocumentsHubScreen documentsHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = documentsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarD = this.v.d();
        Intrinsics.h(model);
        ((com.revolut.feature.statements.impl.ui.documents_hub.a) sVarD).K2(model);
        return Unit.f186387a;
    }
}
