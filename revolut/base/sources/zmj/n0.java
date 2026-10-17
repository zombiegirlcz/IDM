package zmj;

import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f323577w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323577w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n0 n0Var = new n0((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f323577w, continuation, 0);
                n0Var.v = ((Boolean) obj2).booleanValue();
                return n0Var;
            case 1:
                n0 n0Var2 = new n0((PeerToPeerChatScreen) this.f323577w, continuation, 1);
                n0Var2.v = ((Boolean) obj2).booleanValue();
                return n0Var2;
            default:
                n0 n0Var3 = new n0((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) this.f323577w, continuation, 2);
                n0Var3.v = ((Boolean) obj2).booleanValue();
                return n0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((n0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.f323577w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) obj3;
                aVar2.n2(new ypk.f(aVar2, z, (Continuation) null), new whi.b(6));
                break;
            case 1:
                PeerToPeerChatScreen peerToPeerChatScreen = (PeerToPeerChatScreen) obj3;
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z3) {
                    KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                    peerToPeerChatScreen.e3().f11270p.c0();
                } else {
                    KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                    peerToPeerChatScreen.e3().f11270p.getInput$ui_kit_components_release().clearFocus();
                }
                break;
            default:
                boolean z4 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) obj3;
                dVar.H2(dVar.I, new xyh.n(z4, 23));
                break;
        }
        return Unit.f186387a;
    }
}
