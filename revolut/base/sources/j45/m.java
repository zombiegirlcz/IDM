package j45;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import qua.p;
import tof.a3;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f171306b;

    public /* synthetic */ m(Data data, int i) {
        this.f171305a = i;
        this.f171306b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVar;
        wi0.b bVar2;
        dda.f fVar;
        switch (this.f171305a) {
            case 0:
                Data data = this.f171306b;
                Intrinsics.h(data);
                return e.a((e) obj2, data, null, 2);
            case 1:
                return j4c.g.a((j4c.g) obj2, null, this.f171306b, null, null, 13);
            case 2:
                return j4c.g.a((j4c.g) obj2, this.f171306b, null, null, null, 14);
            case 3:
                return j4c.g.a((j4c.g) obj2, null, null, this.f171306b, null, 11);
            case 4:
                return j4c.g.a((j4c.g) obj2, null, null, null, this.f171306b, 7);
            case 5:
                return j4h.e.a((j4h.e) obj2, null, this.f171306b, null, null, 59);
            case 6:
                return j4h.e.a((j4h.e) obj2, this.f171306b, null, null, null, 61);
            case 7:
                j6a.g gVar = (j6a.g) obj2;
                xi0.b currency = gVar.d;
                Data data2 = this.f171306b;
                if (currency != null) {
                    bVar = currency;
                } else {
                    dda.a aVar = (dda.a) data2.getContent();
                    if (aVar == null || (fVar = (dda.f) d0.d0(aVar.f113159a)) == null) {
                        bVar = null;
                    } else {
                        currency = fVar.getCurrency();
                        bVar = currency;
                    }
                }
                wi0.b bVar3 = gVar.f171702c;
                if (bVar3 == null) {
                    dda.a aVar2 = (dda.a) data2.getContent();
                    bVar2 = aVar2 != null ? aVar2.f113160b.f113182b : null;
                } else {
                    bVar2 = bVar3;
                }
                return j6a.g.a(gVar, data2, null, bVar2, bVar, false, 114);
            case 8:
                return j6f.a.a((j6f.a) obj2, this.f171306b, null, null, false, 14);
            case 9:
                return j6f.a.a((j6f.a) obj2, null, null, null, this.f171306b.getContent() instanceof h7f.a, 7);
            case 10:
                j75.f update = (j75.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                Data content = this.f171306b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new j75.f(content);
            case 11:
                return j7b.i.a((j7b.i) obj2, this.f171306b, null, 6);
            case 12:
                ((j82.i) obj2).getClass();
                Data data3 = this.f171306b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new j82.i(data3);
            case 13:
                Data data4 = this.f171306b;
                Intrinsics.h(data4);
                return j83.f.a((j83.f) obj2, null, data4, 1);
            case 14:
                j87.f fVar2 = (j87.f) obj2;
                j87.e eVar = fVar2.f172140b;
                wi0.b bVar4 = eVar.d;
                Data data5 = this.f171306b;
                if (bVar4 == null) {
                    bVar4 = j87.j.f172146r;
                    if (data5.getContent() == null) {
                        bVar4 = null;
                    }
                }
                return j87.f.a(fVar2, j87.e.a(eVar, data5, null, null, bVar4, 22), null, 5);
            case 15:
                jb1.g gVar2 = (jb1.g) obj2;
                Data data6 = this.f171306b;
                List list = (List) data6.getContent();
                return jb1.g.a(gVar2, null, data6, null, list != null ? (PaymentMethod) d0.d0(list) : null, null, 0, 53);
            case 16:
                Data data7 = this.f171306b;
                Intrinsics.h(data7);
                return jb1.g.a((jb1.g) obj2, data7, null, null, null, null, 0, 62);
            case 17:
                return jb1.g.a((jb1.g) obj2, null, null, this.f171306b, null, null, 0, 59);
            case 18:
                jc6.j jVar = (jc6.j) obj2;
                p pVar = (p) this.f171306b.getContent();
                return jc6.j.a(jVar, null, null, null, null, null, pVar != null ? pVar.f249314a.f160150a : null, 63);
            case 19:
                return jc6.j.a((jc6.j) obj2, null, null, null, null, this.f171306b, null, 95);
            case 20:
                jcj.g gVar3 = (jcj.g) obj2;
                a3 transactionToReturn = gVar3.f172825a;
                CryptoAddress selectedAddress = gVar3.f172827c;
                Intrinsics.checkNotNullParameter(transactionToReturn, "transactionToReturn");
                Data feeData = this.f171306b;
                Intrinsics.checkNotNullParameter(feeData, "feeData");
                Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
                return new jcj.g(transactionToReturn, feeData, selectedAddress);
            case 21:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Data data8 = this.f171306b;
                return new Data(null, data8.getError(), data8.getLoading(), 1, null);
            case 22:
                return jd7.d.a((jd7.d) obj2, this.f171306b);
            case 23:
                Data property = this.f171306b;
                Intrinsics.h(property);
                ((jdg.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                return new jdg.c(property);
            case 24:
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a((com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2, null, null, this.f171306b, 0, null, LDSFile.EF_SOD_TAG);
            case 25:
                Data revPointsAccountStatus = this.f171306b;
                Intrinsics.h(revPointsAccountStatus);
                ((jgg.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
                return new jgg.b(revPointsAccountStatus);
            case 26:
                return ji1.e.a((ji1.e) obj2, null, new ji1.h(this.f171306b), null, 5);
            case 27:
                ((jig.c) obj2).getClass();
                Data airlinesAvailability = this.f171306b;
                Intrinsics.checkNotNullParameter(airlinesAvailability, "airlinesAvailability");
                return new jig.c(airlinesAvailability);
            case 28:
                return jk4.g.a((jk4.g) obj2, this.f171306b, null, null, 30);
            default:
                return kih.c.a((kih.c) obj2, this.f171306b, null, false, 6);
        }
    }

    public /* synthetic */ m(Data data, j87.j jVar) {
        this.f171305a = 14;
        this.f171306b = data;
    }
}
