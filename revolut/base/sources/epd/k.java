package epd;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryManagementCustomController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CategoryManagementCustomController categoryManagementCustomController, Continuation continuation) {
        super(2, continuation);
        this.v = categoryManagementCustomController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        String name = textData.f52598b.toString();
        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) cVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        y yVar = bVar.f87654r;
        a aVar2 = (a) ((b) ((j2) yVar.f22677a).getValue()).f128159a.getContent();
        if (aVar2 != null) {
            bVar.H2(yVar, new eed.j(aVar2, name, 27));
        }
        return Unit.f186387a;
    }
}
