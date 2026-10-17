package bs9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ks9.n0;
import ks9.s0;
import vr9.b;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(GroupChatScreen groupChatScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarF3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar2 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        String str = model.f52613a;
        if (obj3 instanceof b.AbstractC1618b) {
            ((ks9.b) aVar2.f79347q).Z2((b.AbstractC1618b) obj3);
        } else if (obj3 instanceof vr9.v) {
            aVar2.f79349s.Z2((vr9.v) obj3);
        } else if (obj3 instanceof vr9.j) {
            vr9.j parcel = (vr9.j) obj3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ((n0) aVar2.f79348r).e3(parcel, aVar2.J2().f18116a);
        } else {
            Continuation continuation = null;
            if (Intrinsics.f(str, "MESSAGING_BOTTOM_DIALOG_ACTION_OK")) {
                s0 s0Var = aVar2.f79350t;
                s0Var.getClass();
                s0Var.T2(new ko2.b(s0Var, continuation, 3), new yi5.b(27));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Cannot handle ", str));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
