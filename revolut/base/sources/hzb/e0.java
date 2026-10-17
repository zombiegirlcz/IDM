package hzb;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f157099b;

    public /* synthetic */ e0(Data data, int i) {
        this.f157098a = i;
        this.f157099b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        List listV0;
        Data data2;
        switch (this.f157098a) {
            case 0:
                Data data3 = this.f157099b;
                Intrinsics.h(data3);
                return t.a((t) obj2, null, null, null, null, null, data3, null, null, null, null, null, null, null, null, null, null, 131039);
            case 1:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, this.f157099b, null, null, null, null, null, null, 130559);
            case 2:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f157099b, null, 98303);
            case 3:
                return t.a((t) obj2, null, null, null, this.f157099b, null, null, null, null, null, null, null, null, null, null, null, null, 131063);
            case 4:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f157099b, null, null, 114687);
            case 5:
                Data data4 = this.f157099b;
                Intrinsics.h(data4);
                return i09.g.a((i09.g) obj2, false, data4, 1);
            case 6:
                Data data5 = this.f157099b;
                Intrinsics.h(data5);
                return i1e.g.a((i1e.g) obj2, data5, false, null, 6);
            case 7:
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a aVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) obj2;
                aVar.f74190a.getClass();
                Data newData = this.f157099b;
                Intrinsics.checkNotNullParameter(newData, "newData");
                try {
                    Object content = newData.getContent();
                    if (content != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = ((List) content).iterator();
                        while (it8.hasNext()) {
                            zhm.a0.x(((vad.c) it8.next()).b(), arrayList);
                        }
                        listV0 = zhm.d0.V0(arrayList, arrayList.size());
                    } else {
                        listV0 = null;
                    }
                    data = new Data(listV0, newData.getError(), newData.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, newData.getLoading());
                }
                boolean zA = tad.a.a(newData);
                Intrinsics.checkNotNullParameter(data, "data");
                return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.a(aVar, new tad.a(data, false, zA), null, null, false, false, 30);
            case 8:
                return i2h.f.a((i2h.f) obj2, null, this.f157099b, 3);
            case 9:
                dj0.d recipientMoney = ((i2k.k) obj2).f157998b;
                Data pricings = this.f157099b;
                Intrinsics.checkNotNullParameter(pricings, "pricings");
                Intrinsics.checkNotNullParameter(recipientMoney, "recipientMoney");
                return new i2k.k(pricings, recipientMoney);
            case 10:
                return i2l.q.a((i2l.q) obj2, null, this.f157099b, null, false, null, 29);
            case 11:
                return i2l.q.a((i2l.q) obj2, this.f157099b, null, null, false, null, 30);
            case 12:
                Data pocket = this.f157099b;
                Intrinsics.h(pocket);
                ((i35.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new i35.c(pocket);
            case 13:
                Data data6 = this.f157099b;
                Intrinsics.h(data6);
                return i3e.g.a((i3e.g) obj2, null, false, data6, 7);
            case 14:
                Data data7 = this.f157099b;
                Intrinsics.h(data7);
                return i3g.f.a((i3g.f) obj2, data7, null, null, 6);
            case 15:
                return i47.h.a((i47.h) obj2, this.f157099b, null, null, 6);
            case 16:
                return i4b.n.a((i4b.n) obj2, null, null, this.f157099b, null, null, null, 3839);
            case 17:
                return i4b.n.a((i4b.n) obj2, null, null, null, null, null, this.f157099b, 2047);
            case 18:
                return i4b.n.a((i4b.n) obj2, null, null, null, null, this.f157099b, null, 3071);
            case 19:
                return i4b.n.a((i4b.n) obj2, this.f157099b, null, null, null, null, null, 4094);
            case 20:
                Data data8 = this.f157099b;
                Intrinsics.h(data8);
                return i4b.n.a((i4b.n) obj2, null, data8, null, null, null, null, 4093);
            case 21:
                return i4b.n.a((i4b.n) obj2, null, null, null, (wi0.b) this.f157099b.getContent(), null, null, 3583);
            case 22:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, null, this.f157099b, null, null, null, null, null, null, null, 4194271);
            case 23:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, null, null, null, null, null, this.f157099b, null, null, null, 4192255);
            case 24:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, this.f157099b, null, null, null, null, null, null, null, null, 4194287);
            case 25:
                Data data9 = this.f157099b;
                e3h.c cVar = (e3h.c) obj2;
                try {
                    Object content2 = data9.getContent();
                    data2 = new Data(content2 != null ? ((nel.a0) content2).f214561b : null, data9.getError(), data9.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data9.getLoading());
                }
                return e3h.c.a(cVar, null, null, data2, null, null, null, null, null, null, null, null, null, null, 4194299);
            case 26:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, null, null, null, this.f157099b, null, null, null, null, null, 4194047);
            case 27:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f157099b, 4177919);
            case 28:
                return i5e.c.a((i5e.c) obj2, null, this.f157099b, 3);
            default:
                return i5e.c.a((i5e.c) obj2, this.f157099b, null, 5);
        }
    }
}
