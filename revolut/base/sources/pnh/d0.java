package pnh;

import com.revolut.data.model.Data;
import com.revolut.feature.salary_switch.impl.models.v2.CounterpartiesResult;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f237769b;

    public /* synthetic */ d0(Data data, int i) {
        this.f237768a = i;
        this.f237769b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f237768a) {
            case 0:
                return j.a((j) obj2, null, null, null, this.f237769b, null, null, null, null, 1007);
            case 1:
                return j.a((j) obj2, null, null, this.f237769b, null, null, null, null, null, 1015);
            case 2:
                return j.a((j) obj2, null, null, null, null, null, this.f237769b, null, null, 895);
            case 3:
                return j.a((j) obj2, this.f237769b, null, null, null, null, null, null, null, 1021);
            case 4:
                return j.a((j) obj2, null, null, null, null, null, null, this.f237769b, null, 767);
            case 5:
                poe.f updateState = (poe.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data data = this.f237769b;
                Intrinsics.h(data);
                return poe.f.a(updateState, data, null, 2);
            case 6:
                ((pp4.i) obj2).getClass();
                Data content = this.f237769b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new pp4.i(content);
            case 7:
                return pp6.b.a((pp6.b) obj2, this.f237769b, null, null, null, 14);
            case 8:
                return pq7.h.a((pq7.h) obj2, this.f237769b, null, null, 6);
            case 9:
                return pq7.h.a((pq7.h) obj2, null, this.f237769b, null, 5);
            case 10:
                pqc.g gVar = (pqc.g) obj2;
                Data data2 = this.f237769b;
                CounterpartiesResult counterpartiesResult = (CounterpartiesResult) data2.getContent();
                List list = counterpartiesResult != null ? counterpartiesResult.f85238b : null;
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                return pqc.g.a(gVar, data2, com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a.I2(gVar.f238720c, list), null, 4);
            case 11:
                return ps9.p.a((ps9.p) obj2, null, this.f237769b, false, 13);
            case 12:
                jsl.a0 update = (jsl.a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jsl.a0.a(update, null, null, null, this.f237769b, null, null, null, null, null, null, null, null, 4087);
            case 13:
                jsl.a0 update2 = (jsl.a0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jsl.a0.a(update2, null, this.f237769b, null, null, null, null, null, null, null, null, null, null, 4093);
            case 14:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, null, null, null, null, null, null, this.f237769b, null, 3071);
            case 15:
                return jsl.a0.a((jsl.a0) obj2, null, null, this.f237769b, null, null, null, null, null, null, null, null, null, 4091);
            case 16:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, this.f237769b, null, null, null, null, null, null, null, 4079);
            case 17:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, this.f237769b, null, null, null, null, null, null, null, 4079);
            case 18:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, null, null, this.f237769b, null, null, null, null, null, 4031);
            case 19:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f237769b, 2047);
            case 20:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, null, null, null, null, null, this.f237769b, null, null, 3583);
            case 21:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, null, null, null, null, this.f237769b, null, null, null, 3839);
            case 22:
                Data data3 = this.f237769b;
                Intrinsics.h(data3);
                return puk.f.a((puk.f) obj2, null, null, data3, null, null, null, false, false, null, 507);
            case 23:
                return puk.f.a((puk.f) obj2, null, null, null, null, this.f237769b, null, false, false, null, 495);
            case 24:
                return puk.f.a((puk.f) obj2, null, null, null, this.f237769b, null, null, false, false, null, 503);
            case 25:
                return puk.f.a((puk.f) obj2, null, null, null, null, null, null, false, false, this.f237769b, 255);
            case 26:
                return pv7.m.a((pv7.m) obj2, this.f237769b, null, null, 6);
            case 27:
                return pv7.m.a((pv7.m) obj2, null, this.f237769b, null, 5);
            case 28:
                Data data4 = this.f237769b;
                Intrinsics.h(data4);
                return pv7.m.a((pv7.m) obj2, null, null, data4, 3);
            default:
                return pvb.b.a((pvb.b) obj2, this.f237769b, null, 2);
        }
    }

    public /* synthetic */ d0(Data data, com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a aVar) {
        this.f237768a = 10;
        this.f237769b = data;
    }
}
