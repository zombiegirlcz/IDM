package do8;

import aw0.n6;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.a;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorAppAccessController f116450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorAppAccessController juniorAppAccessController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116450w = juniorAppAccessController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f116450w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f116450w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f116450w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            default:
                c cVar4 = new c(this.f116450w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        JuniorAppAccessController juniorAppAccessController = this.f116450w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = juniorAppAccessController.d();
                Intrinsics.h(menuItemId);
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE3;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (!menuItemId.equals("ID_MENU_ITEM_INFO")) {
                    throw new IllegalStateException("Cannot handle click on menu item. Unknown menuItemId: ".concat(menuItemId).toString());
                }
                dVar.n2(new r(1, dVar, continuation), new whi.b(6));
                return Unit.f186387a;
            case 1:
                um0 um0Var = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE32 = juniorAppAccessController.d();
                String listId = um0Var.f166695a;
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar2 = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE32;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (!Intrinsics.f(listId, "ID_INVITATION_CANCELLATION_BUTTON")) {
                    throw new IllegalStateException(h30.l.r("Cannot handle primary button click. Unknown listId: ", listId));
                }
                j60.a.v(dVar2.f77290s, false, null, 3);
                return Unit.f186387a;
            case 2:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE33 = juniorAppAccessController.d();
                String listId2 = um0Var2.f166695a;
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar3 = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE33;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (!Intrinsics.f(listId2, "ID_INVITATION_CANCELLATION_BUTTON")) {
                    throw new IllegalStateException(h30.l.r("Cannot handle secondary button click. Unknown listId: ", listId2));
                }
                dVar3.n2(new r(i2, dVar3, continuation), new whi.b(6));
                return Unit.f186387a;
            default:
                n6 buttonModel = (n6) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE34 = juniorAppAccessController.d();
                Intrinsics.h(buttonModel);
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar4 = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE34;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                dVar4.C2(a.C0512a.f77286a);
                return Unit.f186387a;
        }
    }
}
