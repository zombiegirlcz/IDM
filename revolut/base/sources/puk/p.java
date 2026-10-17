package puk;

import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f239948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f239949x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                p pVar = new p(4, 0, (Continuation) obj5);
                pVar.f239949x = (od0.i) obj2;
                pVar.v = zBooleanValue;
                pVar.f239948w = zBooleanValue2;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                p pVar2 = new p(4, 1, (Continuation) obj5);
                pVar2.f239949x = (InAppCallStateWithData) obj2;
                pVar2.v = zBooleanValue3;
                pVar2.f239948w = zBooleanValue4;
                return pVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                od0.i iVar = (od0.i) this.f239949x;
                boolean z = this.v;
                boolean z3 = this.f239948w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new yhm.r(iVar, Boolean.valueOf(z), Boolean.valueOf(z3));
            default:
                InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) this.f239949x;
                boolean z4 = this.v;
                boolean z6 = this.f239948w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new zt2.a(inAppCallStateWithData.f74785a.a(), z4, z6);
        }
    }
}
