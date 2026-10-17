package qna;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.app_interface.AppInterfaceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import qc0.e1;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppInterfaceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppInterfaceScreen appInterfaceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = appInterfaceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = (s) this.v.O.getValue();
        String listId = model.f53228a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        String strE0 = d0.e0(listId, "ID_CUSTOMISABLE_TAB_VISIBILITY_");
        if (Intrinsics.f(strE0, listId)) {
            strE0 = null;
        }
        if (strE0 != null) {
            sVar.l2(new e1(sVar, strE0, null, 17), new yi5.b(26));
        } else if (listId.equals("ID_HIDE_BOTTOM_BAR_SWITCHER")) {
            sVar.l2(new q(2, null, sVar), new yi5.b(26));
        } else if (listId.equals("ID_HIDE_TAB_BAR_LABELS_SWITCHER")) {
            sVar.l2(new q(1, null, sVar), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
