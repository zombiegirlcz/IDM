package crd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SettingsController settingsController, Continuation continuation) {
        super(2, continuation);
        this.v = settingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lzi.h gVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarD3 = this.v.d();
        String id10 = model.f53228a;
        com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) bVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "MONTHLY_ID")) {
            gVar = new lzi.c(0, 3);
        } else {
            if (!Intrinsics.f(id10, "WEEKLY_ID")) {
                throw new UnsupportedOperationException(p.a.p("id ", id10, " not supported"));
            }
            gVar = new lzi.g(0);
        }
        oki.h.v2(aVar2.f87906t, new SettingsContract$ModalStep.EditCycle(gVar, true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        j60.a.v(aVar2.f87903q, false, null, 3);
        return Unit.f186387a;
    }
}
