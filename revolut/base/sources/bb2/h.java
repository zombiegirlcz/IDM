package bb2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SettingsScreen settingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = settingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarD3 = this.v.R2();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.alias.Alias");
        ((com.revolut.feature.apm.payid.impl.screen.settings.a) mVarD3).L2(new n((Alias) obj3));
        return Unit.f186387a;
    }
}
