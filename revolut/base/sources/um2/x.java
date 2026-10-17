package um2;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$Page;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ThemeCustomisationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ThemeCustomisationController themeCustomisationController, Continuation continuation) {
        super(2, continuation);
        this.v = themeCustomisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CircleActionButtonsBarDelegate.CircleActionButton) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CircleActionButtonsBarDelegate.CircleActionButton actionItem = (CircleActionButtonsBarDelegate.CircleActionButton) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.d();
        Intrinsics.h(actionItem);
        com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) bVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(actionItem, "actionItem");
        Object obj3 = actionItem.f52092h;
        if (obj3 instanceof ThemeCustomisationContract$Page) {
            bVar.z.getClass();
            if (obj3 == ThemeCustomisationContract$Page.THEME) {
                bVar.J2();
            } else {
                bVar.H2(bVar.B, new sx4.b(obj3, 6));
            }
        }
        return Unit.f186387a;
    }
}
