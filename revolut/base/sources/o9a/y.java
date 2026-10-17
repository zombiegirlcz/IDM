package o9a;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o9c.m0;
import o9c.n0;
import o9c.o0;
import ojk.j0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f223179b;

    public /* synthetic */ y(Data data, int i) {
        this.f223178a = i;
        this.f223179b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        Data data7;
        Data data8;
        Boolean bool;
        switch (this.f223178a) {
            case 0:
                j jVar = (j) obj2;
                Data data9 = this.f223179b;
                g8a.k kVar = (g8a.k) data9.getContent();
                boolean zK = pd.b.k(kVar != null ? Boolean.valueOf(kVar.f141319n) : null);
                g8a.k kVar2 = (g8a.k) data9.getContent();
                return j.a(jVar, null, null, data9, kVar2 != null ? kVar2.f141318m : null, zK, null, 71);
            case 1:
                Data data10 = this.f223179b;
                o9c.s update = (o9c.s) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                try {
                    Object content = data10.getContent();
                    data = new Data(content != null ? ((m0) content).f223211c : null, data10.getError(), data10.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data10.getLoading());
                }
                return o9c.s.a(update, null, null, null, data, null, null, null, null, null, null, null, null, false, null, null, null, 262111);
            case 2:
                Data data11 = this.f223179b;
                o9c.s update2 = (o9c.s) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                try {
                    Object content2 = data11.getContent();
                    data2 = new Data(content2 != null ? ((o0) content2).f223215a : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data11.getLoading());
                }
                Data data12 = data2;
                try {
                    Object content3 = data11.getContent();
                    data3 = new Data(content3 != null ? ((o0) content3).f223216b : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th12) {
                    data3 = new Data(null, th12, data11.getLoading());
                }
                Data data13 = data3;
                try {
                    Object content4 = data11.getContent();
                    data4 = new Data(content4 != null ? ((o0) content4).f223217c : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th13) {
                    data4 = new Data(null, th13, data11.getLoading());
                }
                return o9c.s.a(update2, null, null, null, data4, null, data13, null, null, data12, null, null, null, false, null, null, null, 260959);
            case 3:
                Data data14 = this.f223179b;
                o9c.s update3 = (o9c.s) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                try {
                    Object content5 = data14.getContent();
                    data5 = new Data(content5 != null ? ((n0) content5).f223213b : null, data14.getError(), data14.getLoading());
                    break;
                } catch (Throwable th14) {
                    data5 = new Data(null, th14, data14.getLoading());
                }
                Data data15 = data5;
                try {
                    Object content6 = data14.getContent();
                    data6 = new Data(content6 != null ? ((n0) content6).f223214c : null, data14.getError(), data14.getLoading());
                    break;
                } catch (Throwable th15) {
                    data6 = new Data(null, th15, data14.getLoading());
                }
                return o9c.s.a(update3, null, null, null, data6, data15, null, null, null, null, null, null, null, false, null, null, null, 262047);
            case 4:
                return o9c.s.a((o9c.s) obj2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.f223179b, 131071);
            case 5:
                Data data16 = this.f223179b;
                o9c.s sVar = (o9c.s) obj2;
                try {
                    Object content7 = data16.getContent();
                    data7 = new Data(content7 != null ? (q6c.h) ((Pair) content7).f186385a : null, data16.getError(), data16.getLoading());
                    break;
                } catch (Throwable th16) {
                    data7 = new Data(null, th16, data16.getLoading());
                }
                try {
                    Object content8 = data16.getContent();
                    if (content8 != null) {
                        bool = (Boolean) ((Pair) content8).f186386b;
                        bool.getClass();
                    } else {
                        bool = null;
                    }
                    data8 = new Data(bool, data16.getError(), data16.getLoading());
                    break;
                } catch (Throwable th17) {
                    data8 = new Data(null, th17, data16.getLoading());
                }
                return o9c.s.a(sVar, data7, null, null, null, null, null, null, null, null, data8, null, null, false, null, null, null, 260091);
            case 6:
                Data data17 = this.f223179b;
                Intrinsics.h(data17);
                return o9c.s.a((o9c.s) obj2, null, null, data17, null, null, null, null, null, null, null, null, null, false, null, null, null, 262127);
            case 7:
                Data data18 = this.f223179b;
                Intrinsics.h(data18);
                return o9c.s.a((o9c.s) obj2, null, data18, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 262135);
            case 8:
                return o9c.s.a((o9c.s) obj2, null, null, null, null, null, null, this.f223179b, null, null, null, null, null, false, null, null, null, 261887);
            case 9:
                return o9c.s.a((o9c.s) obj2, null, null, null, null, null, null, null, null, null, null, null, null, false, this.f223179b, null, null, 229375);
            case 10:
                Data documents = this.f223179b;
                Intrinsics.h(documents);
                ((oa9.a) obj2).getClass();
                Intrinsics.checkNotNullParameter(documents, "documents");
                return new oa9.a(documents);
            case 11:
                ob1.f fVar = (ob1.f) obj2;
                Data data19 = this.f223179b;
                Intrinsics.h(data19);
                CardReaderOrderProductDetails cardReaderOrderProductDetails = (CardReaderOrderProductDetails) data19.getContent();
                return ob1.f.a(fVar, data19, null, new Data(cardReaderOrderProductDetails != null ? new dj0.d(0L, cardReaderOrderProductDetails.f60575a.f115083b) : null, data19.getError(), data19.getLoading()), 2);
            case 12:
                return obc.h.a((obc.h) obj2, this.f223179b, null, 2);
            case 13:
                oc4.d update4 = (oc4.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return oc4.d.a(update4, null, this.f223179b, 1);
            case 14:
                Data data20 = this.f223179b;
                Intrinsics.h(data20);
                return oc9.v.a((oc9.v) obj2, null, null, null, null, data20, null, 47);
            case 15:
                Data data21 = this.f223179b;
                Intrinsics.h(data21);
                return oc9.v.a((oc9.v) obj2, null, data21, null, null, null, null, 61);
            case 16:
                Data data22 = this.f223179b;
                Intrinsics.h(data22);
                return oc9.v.a((oc9.v) obj2, null, null, data22, null, null, null, 59);
            case 17:
                Data data23 = this.f223179b;
                Intrinsics.h(data23);
                return oc9.v.a((oc9.v) obj2, data23, null, null, null, null, null, 62);
            case 18:
                Data data24 = this.f223179b;
                Intrinsics.h(data24);
                return ocb.g.a((ocb.g) obj2, data24, false, null, false, false, null, null, null, null, false, false, false, null, false, null, 32766);
            case 19:
                return occ.a.a((occ.a) obj2, this.f223179b, null, 5);
            case 20:
                return occ.a.a((occ.a) obj2, null, this.f223179b, 3);
            case 21:
                Data data25 = this.f223179b;
                Intrinsics.h(data25);
                return ocg.g.a((ocg.g) obj2, data25, null, 2);
            case 22:
                return ocg.g.a((ocg.g) obj2, null, this.f223179b, 1);
            case 23:
                return oj2.e.a((oj2.e) obj2, this.f223179b, null, 2);
            case 24:
                Data data26 = this.f223179b;
                Intrinsics.h(data26);
                return j0.c((j0) obj2, data26, null, 2);
            case 25:
                return olk.e.a((olk.e) obj2, null, this.f223179b, null, 5);
            case 26:
                Data data27 = this.f223179b;
                Intrinsics.h(data27);
                return olk.e.a((olk.e) obj2, null, null, data27, 3);
            case 27:
                Data config = this.f223179b;
                Intrinsics.h(config);
                ((ona.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                return new ona.c(config);
            case 28:
                return onk.d.c((onk.d) obj2, this.f223179b, null, 2);
            default:
                return oo2.i.a((oo2.i) obj2, this.f223179b, null, 55);
        }
    }

    public /* synthetic */ y(Data data, ob1.o oVar) {
        this.f223178a = 11;
        this.f223179b = data;
    }
}
