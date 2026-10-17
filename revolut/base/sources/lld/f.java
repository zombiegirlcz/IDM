package lld;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import sbb.w;
import skm.e0;
import skm.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SlotChecklistController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SlotChecklistController slotChecklistController, Continuation continuation) {
        super(2, continuation);
        this.v = slotChecklistController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarM3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar2 = (com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) iVarM3;
        aVar2.getClass();
        Continuation continuation = null;
        String deeplink = obj3 instanceof String ? (String) obj3 : null;
        if (deeplink == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "Parcel ", " is not a deeplink"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else {
            pak.h hVar = aVar2.f87369t;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            rul.e eVar = (rul.e) hVar.f234573b;
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            CoroutineScope coroutineScope = (CoroutineScope) eVar.f257630b;
            p0 p0Var = p0.f264001a;
            e0.C(coroutineScope, elm.f.f127540b, null, new w(eVar, deeplink, continuation, 21), 2);
            aVar2.n2(new ll6.i(aVar2, new o(aVar2, deeplink, null, 0), (Continuation) null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
