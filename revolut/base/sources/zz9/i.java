package zz9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PeerToPeerChatScreen peerToPeerChatScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarF3 = this.v.R2();
        Intrinsics.h(model);
        e0a.r rVar = ((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF3).f79783w;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        String strM = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (obj3 instanceof eu9.e) {
            eu9.e menuItem = (eu9.e) obj3;
            e0a.w wVar = (e0a.w) rVar;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            wVar.T2(new dz6.o(menuItem, wVar, objArr2 == true ? 1 : 0, 7), new yi5.b(27));
            j60.a.v(wVar.f121529m, false, null, 3);
        } else {
            if (!(obj3 instanceof du9.a)) {
                String str = model.f53228a;
                if (obj3 != null) {
                    strM = o0.f186429a.b(obj3.getClass()).m();
                }
                throw new IllegalStateException(a0.d.s("Cannot handle bottom dialog model with listId=", str, " and parcelType=", strM));
            }
            du9.a option = (du9.a) obj3;
            e0a.w wVar2 = (e0a.w) rVar;
            wVar2.getClass();
            Intrinsics.checkNotNullParameter(option, "option");
            wVar2.T2(new dz6.o(wVar2, option, objArr == true ? 1 : 0, 8), new yi5.b(27));
        }
        return Unit.f186387a;
    }
}
