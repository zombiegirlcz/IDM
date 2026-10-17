package e0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f121524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121524w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f121524w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f121524w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((eu9.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((mw0.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                eu9.e menuItem = (eu9.e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                w wVar = this.f121524w;
                wVar.T2(new dz6.o(menuItem, wVar, null, 7), new yi5.b(27));
                j60.a.v(wVar.f121529m, false, null, 3);
                return Unit.f186387a;
            default:
                mw0.f fVar = (mw0.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z = fVar instanceof mw0.d;
                w wVar2 = this.f121524w;
                if (z) {
                    fu9.h hVar = ((mw0.d) fVar).f209286a;
                    ChatItem chatItem = hVar.f138156b;
                    wVar2.T2(new dp4.p(wVar2, hVar.f138157c, hVar.f138155a, chatItem, (Continuation) null), new yi5.b(27));
                } else {
                    if (!(fVar instanceof mw0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((mw0.e) fVar).f209287a;
                    if (obj3 instanceof fu9.g) {
                        wVar2.z.k(((fu9.g) obj3).f138154a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
