package bba;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f14214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14215c;

    public /* synthetic */ q(Data data, String str, int i) {
        this.f14213a = i;
        this.f14214b = data;
        this.f14215c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        Pair pair;
        Data data;
        switch (this.f14213a) {
            case 0:
                ((d) obj2).getClass();
                Data beneficiaries = this.f14214b;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                return new d(beneficiaries, this.f14215c);
            case 1:
                ((ei1.e) obj2).getClass();
                String query = this.f14215c;
                Intrinsics.checkNotNullParameter(query, "query");
                return new ei1.e(this.f14214b, query);
            case 2:
                return g6a.f.a((g6a.f) obj2, null, null, this.f14214b, false, this.f14215c, false, 43);
            case 3:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                a.C0490a c0490a = aVar.f73837a;
                String str = c0490a.f73841a;
                String str2 = this.f14215c;
                if (str == null) {
                    str = str2;
                }
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(aVar, new a.C0490a(str, str2 != null || c0490a.f73842b), null, this.f14214b, null, null, null, 122);
            case 4:
                j3i.k kVar = (j3i.k) obj2;
                j3i.j jVar = kVar.e;
                Data data2 = this.f14214b;
                qta.d dVar = (qta.d) data2.getContent();
                float fDoubleValue = (dVar == null || (list = dVar.e) == null || (pair = (Pair) d0.o0(list)) == null) ? kVar.e.f171195a : (float) ((Number) pair.f186386b).doubleValue();
                xi0.b currency = jVar.f171196b;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return j3i.k.a(kVar, null, null, this.f14215c, data2, new j3i.j(fDoubleValue, currency), Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS);
            case 5:
                ox5.l update = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ox5.l.a(update, null, null, null, null, null, null, this.f14214b, null, 0, null, null, false, this.f14215c, null, false, 28607);
            case 6:
                ((p6a.e) obj2).getClass();
                Data searchResult = this.f14214b;
                Intrinsics.checkNotNullParameter(searchResult, "searchResult");
                String searchQuery = this.f14215c;
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                return new p6a.e(searchResult, searchQuery);
            case 7:
                pj9.f fVar = (pj9.f) obj2;
                boolean z = fVar.d;
                Data data3 = fVar.f236705b;
                String str3 = this.f14215c;
                Data data4 = this.f14214b;
                if (z) {
                    if (str3 == null && data4.getLoading()) {
                        data = new Data(null, null, true, 3, null);
                    } else if (str3 == null) {
                        Throwable error = data4.getError();
                        if (error == null) {
                            error = new IllegalStateException("Missing Pay Later facility ID");
                        }
                        data3 = new Data(null, error, false, 5, null);
                    } else if (!str3.equals(fVar.f236706c)) {
                        data = new Data(null, null, true, 3, null);
                    }
                    data3 = data;
                }
                return pj9.f.a(fVar, data4, data3, str3, 8);
            case 8:
                return tcg.f.a((tcg.f) obj2, this.f14215c, this.f14214b, null, null, null, null, 60);
            case 9:
                return wl8.g.a((wl8.g) obj2, this.f14215c, null, this.f14214b, null, null, 26);
            case 10:
                y07.g gVar = (y07.g) obj2;
                Data data5 = this.f14214b;
                Intrinsics.h(data5);
                String str4 = gVar.f310156a;
                String str5 = this.f14215c;
                if (str4 == null) {
                    str4 = str5;
                }
                String str6 = gVar.f310157b;
                if (str6 == null) {
                    str6 = str5;
                }
                return y07.g.a(gVar, str4, str6, data5, false, 8);
            default:
                yx5.a update2 = (yx5.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yx5.a.a(update2, null, this.f14214b, null, false, this.f14215c, 13);
        }
    }

    public /* synthetic */ q(String str, Data data, int i) {
        this.f14213a = i;
        this.f14215c = str;
        this.f14214b = data;
    }
}
