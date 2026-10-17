package p26;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.p;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements p {
    public /* synthetic */ Data u;
    public /* synthetic */ qta.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ TrendViewDelegate.a f232091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f232092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Data f232093y;

    public l(Continuation continuation) {
        super(6, continuation);
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        l lVar = new l((Continuation) obj7);
        lVar.u = (Data) obj2;
        lVar.v = (qta.f) obj3;
        lVar.f232091w = (TrendViewDelegate.a) obj4;
        lVar.f232092x = (Data) obj5;
        lVar.f232093y = (Data) obj6;
        return lVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        qta.f fVar = this.v;
        TrendViewDelegate.a aVar = this.f232091w;
        Data data2 = this.f232092x;
        Data data3 = this.f232093y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new g(data, fVar, aVar, data2, data3);
    }
}
