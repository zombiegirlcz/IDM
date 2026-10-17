package xzd;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CustomStatementScreen f309929w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CustomStatementScreen customStatementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f309929w = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f309929w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f309929w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StatementsFormat statementsFormat = null;
        CustomStatementScreen customStatementScreen = this.f309929w;
        switch (i) {
            case 0:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = customStatementScreen.e3();
                String listId = popupMenuItem.getF51938a();
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) mVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ID_MENU_PDF")) {
                    statementsFormat = StatementsFormat.PDF;
                } else if (Intrinsics.f(listId, "ID_MENU_CSV")) {
                    statementsFormat = StatementsFormat.EXCEL;
                }
                StatementsFormat statementsFormat2 = statementsFormat;
                if (statementsFormat2 != null) {
                    bVar.J2(CustomisationSelection.copy$default(bVar.I2(), null, null, null, false, statementsFormat2, null, null, null, null, 495, null));
                }
                return Unit.f186387a;
            default:
                l lVar = (l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0 l0Var = customStatementScreen.V;
                if (l0Var != null) {
                    l0.d(l0Var, lVar.f309933a, lVar.f309934b, mw0.o.TOUCH_COORDINATES, 8);
                    return Unit.f186387a;
                }
                Intrinsics.r("popupMenuDialogDisplayer");
                throw null;
        }
    }
}
