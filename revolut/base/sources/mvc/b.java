package mvc;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.EditTrustedLocationController;
import com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.EditTrustedLocationControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditTrustedLocationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditTrustedLocationController editTrustedLocationController, Continuation continuation) {
        super(2, continuation);
        this.v = editTrustedLocationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.M.getValue();
        String listId = model.f53228a;
        com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a aVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) iVar;
        y yVar = aVar2.f85653q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != 162505007) {
            if (iHashCode != 512264693) {
                if (iHashCode == 1487960827 && listId.equals("EDIT_LOCATION_LIST_ITEM_ID")) {
                    aVar2.C2(new e(((c) ((j2) yVar.f22677a).getValue()).f209213a));
                }
            } else if (listId.equals("REMOVE_LOCATION_LIST_ITEM_ID")) {
                if (((c) ((j2) yVar.f22677a).getValue()).f209214b) {
                    oki.h.v2(aVar2.f85654r, EditTrustedLocationControllerContract$Step.RemoveLastTrustedLocation.f85651a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    aVar2.A1(new mci.e(aVar2, null, 22), new yi5.b(25));
                }
            }
        } else if (listId.equals("RENAME_LOCATION_LIST_ITEM_ID")) {
            aVar2.C2(new f(((c) ((j2) yVar.f22677a).getValue()).f209213a));
        }
        return Unit.f186387a;
    }
}
