package rvf;

import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.TransitTicketActivationConfig;
import ivf.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function1 {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f257773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PurchasedTransitTicket.ToBeActivated f257774x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, PurchasedTransitTicket.ToBeActivated toBeActivated, Continuation continuation) {
        super(1, continuation);
        this.f257773w = iVar;
        this.f257774x = toBeActivated;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f257773w, this.f257774x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        i iVar = this.f257773w;
        try {
        } catch (Throwable th10) {
            ouf.a aVar2 = iVar.f257776l;
            this.u = th10;
            this.v = 3;
            if (((r) aVar2).d(true, this) != aVar) {
                throw th10;
            }
        }
        if (i == 0) {
            o.b(obj2);
            ouf.a aVar3 = iVar.f257776l;
            PurchasedTransitTicket.ToBeActivated toBeActivated = this.f257774x;
            this.v = 1;
            suf.h hVar = ((r) aVar3).f168858a;
            String str = toBeActivated.f92682a;
            hVar.getClass();
            suf.d dVar = new suf.d(hVar, str, null, 1);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, dVar, this);
            if (obj2 == aVar) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                TransitTicketActivationConfig transitTicketActivationConfig = (TransitTicketActivationConfig) this.u;
                o.b(obj2);
                return transitTicketActivationConfig;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th11 = (Throwable) this.u;
            o.b(obj2);
            throw th11;
        }
        o.b(obj2);
        TransitTicketActivationConfig transitTicketActivationConfig2 = (TransitTicketActivationConfig) obj2;
        ouf.a aVar4 = iVar.f257776l;
        this.u = transitTicketActivationConfig2;
        this.v = 2;
        return ((r) aVar4).d(true, this) == aVar ? aVar : transitTicketActivationConfig2;
    }
}
