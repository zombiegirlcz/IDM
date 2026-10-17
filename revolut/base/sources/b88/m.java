package b88;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements oim.o {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f13133y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.u) {
            case 0:
                m mVar = new m(5, 0, (Continuation) obj6);
                mVar.v = (Data) obj2;
                mVar.f13131w = (Data) obj3;
                mVar.f13132x = (Data) obj4;
                mVar.f13133y = (Data) obj5;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(5, 1, (Continuation) obj6);
                mVar2.f13132x = (k6d.j) obj2;
                mVar2.v = (Data) obj3;
                mVar2.f13133y = (List) obj4;
                mVar2.f13131w = (Data) obj5;
                return mVar2.invokeSuspend(Unit.f186387a);
            default:
                m mVar3 = new m(5, 2, (Continuation) obj6);
                mVar3.v = (Integer) obj2;
                mVar3.f13131w = (Integer) obj3;
                mVar3.f13132x = (Integer) obj4;
                mVar3.f13133y = (Integer) obj5;
                return mVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                Data data2 = (Data) this.f13131w;
                Data data3 = (Data) this.f13132x;
                Data data4 = (Data) this.f13133y;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new vf0.h(data, data2, data3, data4);
            case 1:
                k6d.j jVar = (k6d.j) this.f13132x;
                Data data5 = (Data) this.v;
                List list = (List) this.f13133y;
                Data data6 = (Data) this.f13131w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.i iVar = (od0.i) data6.getContent();
                return new s6d.q(jVar, data5, list, iVar != null ? (Address) iVar.f224257a : null);
            default:
                Integer num = (Integer) this.v;
                Integer num2 = (Integer) this.f13131w;
                Integer num3 = (Integer) this.f13132x;
                Integer num4 = (Integer) this.f13133y;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (num == null || num2 == null) {
                    return new Float(BitmapDescriptorFactory.HUE_RED);
                }
                return new Float(-kotlin.ranges.f.g(num.intValue(), num4 != null ? num4.intValue() : (int) (num2.intValue() * 0.105f), num3 != null ? num3.intValue() : (int) (num2.intValue() * 0.55f)));
        }
    }
}
