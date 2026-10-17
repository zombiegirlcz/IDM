package vo8;

import com.revolut.data.model.Data;
import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f290887b;

    public /* synthetic */ i0(Data data, int i) {
        this.f290886a = i;
        this.f290887b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listA;
        Data layout;
        gu7.m0 m0Var;
        Data statusData;
        Data data;
        Data data2;
        switch (this.f290886a) {
            case 0:
                return p.a((p) obj2, null, null, null, null, this.f290887b, false, false, false, null, null, 1007);
            case 1:
                return p.a((p) obj2, null, null, null, null, null, false, false, false, this.f290887b, null, 767);
            case 2:
                ((vob.d) obj2).getClass();
                Data screenData = this.f290887b;
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new vob.d(screenData);
            case 3:
                return vpd.d.a((vpd.d) obj2, this.f290887b, null, null, 6);
            case 4:
                return vq5.g.a((vq5.g) obj2, null, null, null, null, this.f290887b, null, 7167);
            case 5:
                return vq5.g.a((vq5.g) obj2, null, null, this.f290887b, null, null, null, 7935);
            case 6:
                Data data3 = this.f290887b;
                Intrinsics.h(data3);
                return vq5.g.a((vq5.g) obj2, null, null, null, data3, null, null, 7679);
            case 7:
                return vq5.g.a((vq5.g) obj2, null, (n9l.a) this.f290887b.getContent(), null, null, null, null, 8063);
            case 8:
                ((vq7.e) obj2).getClass();
                Data telematicsDeviceDelivery = this.f290887b;
                Intrinsics.checkNotNullParameter(telematicsDeviceDelivery, "telematicsDeviceDelivery");
                return new vq7.e(telematicsDeviceDelivery);
            case 9:
                return vrb.c.a((vrb.c) obj2, this.f290887b, null, 2);
            case 10:
                vsl.c cVar = (vsl.c) obj2;
                Data data4 = this.f290887b;
                List list = (List) data4.getContent();
                if (list != null) {
                    vsl.g.Companion.getClass();
                    listA = vsl.e.a(list);
                } else {
                    listA = cVar.f291848b;
                }
                return vsl.c.a(cVar, null, listA, data4, 1);
            case 11:
                Data data5 = this.f290887b;
                vv7.h hVar = (vv7.h) obj2;
                try {
                    Object content = data5.getContent();
                    if (content != null) {
                        com.revolut.feature.insurance_embedded.impl.data.model.j jVar = ((com.revolut.feature.insurance_embedded.impl.data.model.l0) content).e;
                        Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.data.model.ClaimsLayout.ClaimsEmbedded");
                        m0Var = ((com.revolut.feature.insurance_embedded.impl.data.model.i) jVar).f75995b;
                    } else {
                        m0Var = null;
                    }
                    layout = new Data(m0Var, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th10) {
                    layout = new Data(null, th10, data5.getLoading());
                }
                hVar.getClass();
                Intrinsics.checkNotNullParameter(layout, "layout");
                return new vv7.h(layout);
            case 12:
                return vwb.f.a((vwb.f) obj2, this.f290887b, false, null, null, 14);
            case 13:
                return vwb.f.a((vwb.f) obj2, null, false, this.f290887b, null, 11);
            case 14:
                return vwb.f.a((vwb.f) obj2, null, false, null, this.f290887b, 7);
            case 15:
                Data data6 = this.f290887b;
                Intrinsics.h(data6);
                return vyi.i.a((vyi.i) obj2, data6, null, 2);
            case 16:
                Data data7 = this.f290887b;
                Intrinsics.h(data7);
                return vyi.i.a((vyi.i) obj2, null, data7, 1);
            case 17:
                return vzk.g.a((vzk.g) obj2, null, false, this.f290887b, 7);
            case 18:
                w07.j mode = ((w07.f) obj2).f293653a;
                Intrinsics.checkNotNullParameter(mode, "mode");
                Data termsData = this.f290887b;
                Intrinsics.checkNotNullParameter(termsData, "termsData");
                return new w07.f(mode, termsData);
            case 19:
                Data data8 = this.f290887b;
                w1a.a update = (w1a.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                try {
                    Object content2 = data8.getContent();
                    statusData = new Data(content2 != null ? (a2a.a) ((a2a.d) content2) : null, data8.getError(), data8.getLoading());
                    break;
                } catch (Throwable th11) {
                    statusData = new Data(null, th11, data8.getLoading());
                }
                update.getClass();
                Intrinsics.checkNotNullParameter(statusData, "statusData");
                return new w1a.a(statusData);
            case 20:
                w1a.a update2 = (w1a.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data statusData2 = new Data(null, null, this.f290887b.getLoading(), 3, null);
                update2.getClass();
                Intrinsics.checkNotNullParameter(statusData2, "statusData");
                return new w1a.a(statusData2);
            case 21:
                Data data9 = this.f290887b;
                Intrinsics.h(data9);
                return w2a.j.a((w2a.j) obj2, data9, null, null, 13);
            case 22:
                w3b.d dVar = (w3b.d) obj2;
                Data data10 = dVar.f294255a;
                e2b.a orderType = dVar.f294257c;
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                return new w3b.d(data10, this.f290887b, orderType);
            case 23:
                w3c.e update3 = (w3c.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return w3c.e.a(update3, null, null, this.f290887b, null, null, null, 59);
            case 24:
                Data data11 = this.f290887b;
                w3c.e eVar = (w3c.e) obj2;
                try {
                    Object content3 = data11.getContent();
                    data = new Data(content3 != null ? ((FiscalProfileDetails) content3).f84192a : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th12) {
                    data = new Data(null, th12, data11.getLoading());
                }
                Data data12 = data;
                try {
                    Object content4 = data11.getContent();
                    data2 = new Data(content4 != null ? ((FiscalProfileDetails) content4).f84193b : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th13) {
                    data2 = new Data(null, th13, data11.getLoading());
                }
                return w3c.e.a(eVar, null, null, null, data12, data2, null, 39);
            case 25:
                return w3c.e.a((w3c.e) obj2, null, null, null, null, null, this.f290887b, 31);
            case 26:
                w4d.g content5 = ((w4d.c) obj2).f294538a;
                Intrinsics.checkNotNullParameter(content5, "content");
                Data data13 = this.f290887b;
                Intrinsics.checkNotNullParameter(data13, "data");
                return new w4d.c(content5, data13);
            case 27:
                w4e.b bVar = (w4e.b) obj2;
                Data data14 = bVar.f294554b;
                bVar.getClass();
                return new w4e.b(this.f290887b, data14);
            case 28:
                w4e.b bVar2 = (w4e.b) obj2;
                Data data15 = bVar2.f294553a;
                bVar2.getClass();
                return new w4e.b(data15, this.f290887b);
            default:
                return w56.g.a((w56.g) obj2, this.f290887b, null, 5);
        }
    }
}
