package p62;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IrisSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IrisSettingsScreen irisSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = irisSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.apm.iris.impl.ui.settings.a aVar2 = (com.revolut.feature.apm.iris.impl.ui.settings.a) hVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.e;
        Alias alias = obj3 instanceof Alias ? (Alias) obj3 : null;
        if (alias != null) {
            aVar2.I2(alias);
        }
        return Unit.f186387a;
    }
}
