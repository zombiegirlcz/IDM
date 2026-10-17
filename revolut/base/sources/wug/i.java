package wug;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wxe.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f300139b;

    public /* synthetic */ i(Data data, int i) {
        this.f300138a = i;
        this.f300139b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        switch (this.f300138a) {
            case 0:
                return d.a((d) obj2, null, null, this.f300139b, 3);
            case 1:
                return d.a((d) obj2, null, this.f300139b, null, 5);
            case 2:
                return wuk.j.f((wuk.j) obj2, this.f300139b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388606);
            case 3:
                wuk.j jVar = (wuk.j) obj2;
                List list = (List) this.f300139b.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return wuk.j.f(jVar, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388095);
            case 4:
                return wuk.j.f((wuk.j) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f300139b, null, null, null, null, null, null, null, null, null, null, null, 8386559);
            case 5:
                return wuk.j.f((wuk.j) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f300139b, null, null, null, null, null, null, null, null, null, null, 8384511);
            case 6:
                return wuk.j.f((wuk.j) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f300139b, null, null, null, null, 8126463);
            case 7:
                return wuk.j.f((wuk.j) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f300139b, null, null, null, 7864319);
            case 8:
                return wuk.j.f((wuk.j) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f300139b, null, null, null, null, null, null, 8323071);
            case 9:
                Data data = this.f300139b;
                Intrinsics.h(data);
                return wv2.d.a((wv2.d) obj2, 0, data, null, false, 29);
            case 10:
                Data data2 = this.f300139b;
                Intrinsics.h(data2);
                return wv2.d.a((wv2.d) obj2, 0, null, data2, false, 27);
            case 11:
                ((wv4.f) obj2).getClass();
                Data data3 = this.f300139b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new wv4.f(data3);
            case 12:
                Data data4 = this.f300139b;
                Intrinsics.h(data4);
                return ww2.k.a((ww2.k) obj2, data4, null, 14);
            case 13:
                Data data5 = this.f300139b;
                Intrinsics.h(data5);
                return ww2.k.a((ww2.k) obj2, null, data5, 11);
            case 14:
                ww8.f update = (ww8.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ww8.f.a(update, this.f300139b, null, 2);
            case 15:
                ww8.f update2 = (ww8.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ww8.f.a(update2, null, this.f300139b, 1);
            case 16:
                return wx6.h.a((wx6.h) obj2, this.f300139b, false, null, 6);
            case 17:
                ((o) obj2).getClass();
                Data detailedStoredMethodData = this.f300139b;
                Intrinsics.checkNotNullParameter(detailedStoredMethodData, "detailedStoredMethodData");
                return new o(detailedStoredMethodData);
            case 18:
                Data data6 = this.f300139b;
                Intrinsics.h(data6);
                return wyc.j.a((wyc.j) obj2, data6, null, 13);
            case 19:
                Data data7 = this.f300139b;
                Intrinsics.h(data7);
                return wyc.j.a((wyc.j) obj2, null, data7, 11);
            case 20:
                return wyg.a.a((wyg.a) obj2, null, null, this.f300139b, null, null, null, null, null, null, 32735);
            case 21:
                return wyg.a.a((wyg.a) obj2, null, null, null, null, this.f300139b, null, null, null, null, 32511);
            case 22:
                return wyg.a.a((wyg.a) obj2, null, null, null, null, null, null, null, null, this.f300139b, 24575);
            case 23:
                cgc.g gVar = ((wz6.d) obj2).f301373b;
                Data perksData = this.f300139b;
                ht6.b bVar = (ht6.b) perksData.getContent();
                if (bVar != null) {
                    ArrayList arrayList = bVar.f155329b;
                    Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (Intrinsics.f(((cgc.g) next).f23912a, gVar != null ? gVar.f23912a : null)) {
                                obj3 = next;
                            }
                        }
                    }
                    gVar = (cgc.g) obj3;
                    if (gVar == null) {
                        gVar = (cgc.g) d0.d0(arrayList);
                    }
                }
                Intrinsics.checkNotNullParameter(perksData, "perksData");
                return new wz6.d(perksData, gVar);
            case 24:
                return g0b.c.a((g0b.c) obj2, null, null, null, this.f300139b, null, null, null, null, null, false, null, null, null, 2097135);
            case 25:
                return g0b.c.a((g0b.c) obj2, null, null, null, null, this.f300139b, null, null, null, null, false, null, null, null, 2097119);
            case 26:
                return g0b.c.a((g0b.c) obj2, null, null, null, null, null, null, null, null, this.f300139b, false, null, null, null, 2093055);
            case 27:
                Data data8 = this.f300139b;
                Intrinsics.h(data8);
                return x0f.h.a((x0f.h) obj2, data8, null, null, null, 30);
            case 28:
                ((x0l.a) obj2).getClass();
                Data config = this.f300139b;
                Intrinsics.checkNotNullParameter(config, "config");
                return new x0l.a(config);
            default:
                return DeFiAccountsExtensionState.a((DeFiAccountsExtensionState) obj2, this.f300139b, null, null, null, null, null, 62);
        }
    }

    public /* synthetic */ i(Data data, wz6.g gVar) {
        this.f300138a = 23;
        this.f300139b = data;
    }
}
