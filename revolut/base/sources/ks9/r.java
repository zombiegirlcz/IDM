package ks9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f189370w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189370w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f189370w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f189370w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((eu9.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((mw0.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 27;
        switch (this.u) {
            case 0:
                eu9.e menuItem = (eu9.e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                s sVar = this.f189370w;
                sVar.T2(new kq5.d(menuItem, sVar, null, 6), new yi5.b(i));
                return Unit.f186387a;
            default:
                mw0.f fVar = (mw0.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z = fVar instanceof mw0.d;
                s sVar2 = this.f189370w;
                if (z) {
                    fu9.h hVar = ((mw0.d) fVar).f209286a;
                    ChatItem chatItem = hVar.f138156b;
                    sVar2.T2(new km2.n(sVar2, hVar.f138157c, hVar.f138155a, chatItem, (Continuation) null, 7), new yi5.b(i));
                } else {
                    if (!(fVar instanceof mw0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((mw0.e) fVar).f209287a;
                    if (obj3 instanceof fu9.g) {
                        sVar2.v.k(((fu9.g) obj3).f138154a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
