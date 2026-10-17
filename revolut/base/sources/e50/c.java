package e50;

import com.revolut.chat.navigation.ArchiveDestination;
import com.revolut.chat.ui.inbox.InboxScreen;
import ip0.xc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InboxScreen f122685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InboxScreen inboxScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122685w = inboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f122685w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f122685w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f122685w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            default:
                c cVar4 = new c(this.f122685w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((xc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InboxScreen inboxScreen = this.f122685w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = inboxScreen.e3();
                u uVar = (u) mVarE3;
                uVar.I2(aVar.d, aVar.f275445a);
                break;
            case 1:
                String itemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = inboxScreen.e3();
                Intrinsics.h(itemId);
                u uVar2 = (u) mVarE32;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "PAST_REQUESTS_ITEM_ID")) {
                    uVar2.C1(ArchiveDestination.f51109b);
                }
                break;
            case 2:
                xc xcVar = (xc) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = inboxScreen.e3();
                u uVar3 = (u) mVarE33;
                uVar3.I2(xcVar.f, xcVar.f167122a);
                break;
            default:
                koi.j item = (koi.j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE34 = inboxScreen.e3();
                Intrinsics.h(item);
                u uVar4 = (u) mVarE34;
                uVar4.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                uVar4.f122700r.b3(item.getF55034b());
                break;
        }
        return Unit.f186387a;
    }
}
