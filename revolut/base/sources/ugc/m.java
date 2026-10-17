package ugc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ int f280018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f280019x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(long j2, int i, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f280019x = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f280019x, 0, continuation);
                mVar.f280018w = ((Number) obj2).intValue();
                return mVar;
            default:
                m mVar2 = new m(this.f280019x, 1, continuation);
                mVar2.f280018w = ((Number) obj2).intValue();
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        int iIntValue = ((Number) obj2).intValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((m) create(Integer.valueOf(iIntValue), continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                int i = this.f280018w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    if (i > 0) {
                        this.f280018w = i;
                        this.v = 1;
                        if (k0.b(this.f280019x, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                int i3 = this.f280018w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    if (i3 > 0) {
                        this.f280018w = i3;
                        this.v = 1;
                        if (k0.b(this.f280019x, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
