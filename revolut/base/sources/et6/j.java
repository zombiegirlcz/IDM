package et6;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f129251w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                j jVar = new j(3, 0, (Continuation) obj4);
                jVar.f129251w = zBooleanValue;
                jVar.v = (Data) obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                j jVar2 = new j(3, 1, (Continuation) obj4);
                jVar2.v = (Data) obj2;
                jVar2.f129251w = zBooleanValue2;
                return jVar2.invokeSuspend(Unit.f186387a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                j jVar3 = new j(3, 2, (Continuation) obj4);
                jVar3.v = (Data) obj2;
                jVar3.f129251w = zBooleanValue3;
                return jVar3.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                j jVar4 = new j(3, 3, (Continuation) obj4);
                jVar4.v = (Data) obj2;
                jVar4.f129251w = zBooleanValue4;
                return jVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object aVar;
        switch (this.u) {
            case 0:
                boolean z = this.f129251w;
                Data data = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Data.copy$default(data, null, null, data.getLoading() || z, 3, null);
            case 1:
                Data data2 = this.v;
                boolean z3 = this.f129251w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(data2, Boolean.valueOf(z3));
            case 2:
                Data data3 = this.v;
                boolean z4 = this.f129251w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        v19.a aVar5 = (v19.a) content;
                        v19.a aVar6 = v19.a.V3;
                        aVar = b39.b.f12015a;
                        if (aVar5 == aVar6 && z4) {
                            aVar = new b39.a(b39.d.REV_POINTS_HOME);
                        }
                    } else {
                        aVar = null;
                    }
                    return new Data(aVar, data3.getError(), data3.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data3.getLoading());
                }
            default:
                Data data4 = this.v;
                boolean z6 = this.f129251w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Data.copy$default(data4, null, null, data4.getLoading() || !z6, 3, null);
        }
    }
}
