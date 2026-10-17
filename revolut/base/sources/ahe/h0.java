package ahe;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f4995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f4996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(4, 0, (Continuation) obj5);
                h0Var.v = (List) obj2;
                h0Var.f4995w = (SpaceContentModel) obj3;
                h0Var.f4996x = (SpaceContentModel) obj4;
                return h0Var.invokeSuspend(Unit.f186387a);
            case 1:
                h0 h0Var2 = new h0(4, 1, (Continuation) obj5);
                h0Var2.v = (List) obj2;
                h0Var2.f4995w = (xjg.l) obj3;
                h0Var2.f4996x = (Set) obj4;
                return h0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                h0 h0Var3 = new h0(4, 2, (Continuation) obj5);
                h0Var3.v = (kqa.a) obj2;
                h0Var3.f4995w = (PaymentPocketInfo) obj3;
                h0Var3.f4996x = (asa.g) obj4;
                return h0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                h0 h0Var4 = new h0(4, 3, (Continuation) obj5);
                h0Var4.v = (a3) obj2;
                h0Var4.f4995w = (do3.n) obj3;
                h0Var4.f4996x = (klf.j1) obj4;
                return h0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                h0 h0Var5 = new h0(4, 4, (Continuation) obj5);
                h0Var5.v = (String) obj2;
                h0Var5.f4995w = (Set) obj3;
                h0Var5.f4996x = (Set) obj4;
                return h0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                h0 h0Var6 = new h0(4, 5, (Continuation) obj5);
                h0Var6.f4995w = (Data) obj2;
                h0Var6.f4996x = (Data) obj3;
                h0Var6.v = (List) obj4;
                return h0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                h0 h0Var7 = new h0(4, 6, (Continuation) obj5);
                h0Var7.v = (List) obj2;
                h0Var7.f4995w = (List) obj3;
                h0Var7.f4996x = (List) obj4;
                return h0Var7.invokeSuspend(Unit.f186387a);
            default:
                h0 h0Var8 = new h0(4, 7, (Continuation) obj5);
                h0Var8.f4995w = (Data) obj2;
                h0Var8.f4996x = (xi0.b) obj3;
                h0Var8.v = (List) obj4;
                return h0Var8.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        ArrayList arrayList;
        switch (this.u) {
            case 0:
                List list = (List) this.v;
                SpaceContentModel spaceContentModel = (SpaceContentModel) this.f4995w;
                SpaceContentModel spaceContentModel2 = (SpaceContentModel) this.f4996x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                ArrayList arrayListU = p.a.u(obj2);
                if (spaceContentModel2 != null) {
                    arrayListU.add(spaceContentModel2);
                }
                if (spaceContentModel != null) {
                    arrayListU.add(spaceContentModel);
                }
                arrayListU.addAll(list);
                return zhm.d0.d1(arrayListU);
            case 1:
                List list2 = (List) this.v;
                xjg.l lVar = (xjg.l) this.f4995w;
                Set set = (Set) this.f4996x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new apd.g(list2, lVar, set);
            case 2:
                kqa.a aVar3 = (kqa.a) this.v;
                PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) this.f4995w;
                asa.g gVar = (asa.g) this.f4996x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new yhm.r(aVar3, paymentPocketInfo, gVar);
            case 3:
                a3 a3Var = (a3) this.v;
                do3.n nVar = (do3.n) this.f4995w;
                klf.j1 j1Var = (klf.j1) this.f4996x;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new yhm.r(a3Var, nVar, j1Var);
            case 4:
                String str = (String) this.v;
                Set set2 = (Set) this.f4995w;
                Set set3 = (Set) this.f4996x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return zhm.d0.T(set2, str) ? klf.j1.JUNIOR : zhm.d0.T(set3, str) ? klf.j1.TEEN : klf.j1.NONE;
            case 5:
                Data data2 = (Data) this.f4995w;
                Data data3 = (Data) this.f4996x;
                List list3 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data3);
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : (List) content) {
                            if (list3.contains(z92.f.l((io3.d) obj3))) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    data = new Data(arrayList, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                return t1.B(zhm.v.k(data2, data));
            case 6:
                List list4 = (List) this.v;
                List list5 = (List) this.f4995w;
                List list6 = (List) this.f4996x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return zhm.d0.E0(list6, zhm.d0.E0(list5, list4));
            default:
                Data data4 = (Data) this.f4995w;
                xi0.b bVar = (xi0.b) this.f4996x;
                List list7 = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content2 = data4.getContent();
                    return new Data(content2 != null ? new y4d.k(((PersistedBackground) content2).f63743a.f63742b, bVar, list7) : null, data4.getError(), data4.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, data4.getLoading());
                }
        }
    }
}
