package ps9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ks9.n0;
import vkm.j2;
import vr9.b;
import wr9.c;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupChatSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof b.AbstractC1618b) {
            ((ks9.b) dVar.f79385p).Z2((b.AbstractC1618b) obj3);
        } else if (obj3 instanceof vr9.v) {
            dVar.f79388s.Z2((vr9.v) obj3);
        } else if (obj3 instanceof vr9.j) {
            vr9.j parcel = (vr9.j) obj3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ((n0) dVar.o).e3(parcel, ((p) ((j2) dVar.C.f22677a).getValue()).f239437a);
        } else {
            Continuation continuation = null;
            if (obj3 instanceof c.b) {
                dVar.l2(new v(dVar, continuation, 0), new yi5.b(26));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Cannot handle ", model.f52613a));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
