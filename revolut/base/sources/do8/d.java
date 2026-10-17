package do8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAppAccessController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorAppAccessController juniorAppAccessController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAppAccessController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = model.f52373a;
        com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE3;
        vii.b bVar = dVar.f77292w;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -2119515036) {
            if (iHashCode != 10034074) {
                if (iHashCode == 1387600596 && listId.equals("ID_INVITATION_DATA_STATE_ITEM")) {
                    dVar.I2();
                }
            } else if (listId.equals("ID_INVITATION_ERROR_STATE_ITEM")) {
                bVar.a();
            }
        } else if (listId.equals("ID_FULL_ERROR_STATE_ITEM")) {
            bVar.a();
        }
        return Unit.f186387a;
    }
}
