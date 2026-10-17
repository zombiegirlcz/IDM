package jxi;

import com.revolut.data.model.Data;
import java.util.List;
import k50.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f179214b;

    public /* synthetic */ e0(Data data, int i) {
        this.f179213a = i;
        this.f179214b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data customerOrderReference;
        Data data2;
        switch (this.f179213a) {
            case 0:
                Data data3 = this.f179214b;
                Intrinsics.h(data3);
                return r.a((r) obj2, null, null, null, null, null, null, data3, null, null, null, null, null, null, null, 16319);
            case 1:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f179214b, 8191);
            case 2:
                Data data4 = this.f179214b;
                Intrinsics.h(data4);
                return r.a((r) obj2, null, null, data4, null, null, null, null, null, null, null, null, null, null, null, 16379);
            case 3:
                Data data5 = this.f179214b;
                Intrinsics.h(data5);
                return r.a((r) obj2, null, null, null, data5, null, null, null, null, null, null, null, null, null, null, 16375);
            case 4:
                Data data6 = this.f179214b;
                Intrinsics.h(data6);
                return r.a((r) obj2, null, null, null, null, data6, null, null, null, null, null, null, null, null, null, 16367);
            case 5:
                Data data7 = this.f179214b;
                Intrinsics.h(data7);
                return r.a((r) obj2, null, null, null, null, null, null, null, data7, null, null, null, null, null, null, 16255);
            case 6:
                return jy6.h.a((jy6.h) obj2, null, false, false, this.f179214b, 7);
            case 7:
                return jyg.c.a((jyg.c) obj2, null, this.f179214b, 3);
            case 8:
                return jzh.r.a((jzh.r) obj2, null, null, null, null, this.f179214b, null, null, LDSFile.EF_DG15_TAG);
            case 9:
                return jzh.r.a((jzh.r) obj2, null, null, null, this.f179214b, null, null, null, LDSFile.EF_SOD_TAG);
            case 10:
                Data data8 = this.f179214b;
                k0e.e eVar = (k0e.e) obj2;
                try {
                    Object content = data8.getContent();
                    data = new Data(content != null ? ((uib.a) content).f280367b : null, data8.getError(), data8.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data8.getLoading());
                }
                return k0e.e.a(eVar, null, null, null, null, data, null, LDSFile.EF_DG15_TAG);
            case 11:
                return k0e.e.a((k0e.e) obj2, null, null, null, null, null, this.f179214b, 63);
            case 12:
                return k1g.e.a((k1g.e) obj2, null, this.f179214b, 3);
            case 13:
                return k2h.f.a((k2h.f) obj2, null, this.f179214b, 7);
            case 14:
                return k37.g.a((k37.g) obj2, this.f179214b, null, 5);
            case 15:
                return k4a.k.a((k4a.k) obj2, null, false, null, null, null, this.f179214b, 63);
            case 16:
                h0 h0Var = (h0) obj2;
                return h0.a(h0Var, null, null, null, null, null, v30.i.a(h0Var.f, false, null, false, this.f179214b, false, 23), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            case 17:
                h0 h0Var2 = (h0) obj2;
                v30.s sVar = (v30.s) this.f179214b.getContent();
                if (sVar == null) {
                    sVar = v30.s.NONE;
                }
                return h0.a(h0Var2, null, null, null, null, null, null, null, null, null, sVar, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268434943);
            case 18:
                h0 h0Var3 = (h0) obj2;
                return h0.a(h0Var3, null, null, null, null, null, v30.i.a(h0Var3.f, false, this.f179214b, false, null, false, 29), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            case 19:
                Data data9 = this.f179214b;
                Intrinsics.h(data9);
                return h0.a((h0) obj2, null, null, data9, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435451);
            case 20:
                return k5e.c.a((k5e.c) obj2, this.f179214b, null, null, 6);
            case 21:
                return k5e.c.a((k5e.c) obj2, null, this.f179214b, null, 5);
            case 22:
                return k5e.c.a((k5e.c) obj2, null, null, this.f179214b, 3);
            case 23:
                Data data10 = this.f179214b;
                k6g.e eVar2 = (k6g.e) obj2;
                try {
                    Object content2 = data10.getContent();
                    customerOrderReference = new Data(content2 != null ? ((l7g.b0) content2).e : null, data10.getError(), data10.getLoading());
                    break;
                } catch (Throwable th11) {
                    customerOrderReference = new Data(null, th11, data10.getLoading());
                }
                String bookingId = eVar2.f181712a;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                Intrinsics.checkNotNullParameter(customerOrderReference, "customerOrderReference");
                return new k6g.e(customerOrderReference, bookingId);
            case 24:
                Data data11 = this.f179214b;
                k8d.g updateState = (k8d.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                try {
                    Object content3 = data11.getContent();
                    data2 = new Data(content3 != null ? l8d.a.a((List) content3) : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th12) {
                    data2 = new Data(null, th12, data11.getLoading());
                }
                return k8d.g.a(updateState, null, null, null, data2, null, null, 503);
            case 25:
                return k8d.g.a((k8d.g) obj2, null, this.f179214b, null, null, null, null, 509);
            case 26:
                return k8g.k.a((k8g.k) obj2, null, null, null, this.f179214b, false, false, 55);
            case 27:
                Data pendingCashbackDetailsData = this.f179214b;
                Intrinsics.h(pendingCashbackDetailsData);
                ((k9c.f) obj2).getClass();
                Intrinsics.checkNotNullParameter(pendingCashbackDetailsData, "pendingCashbackDetailsData");
                return new k9c.f(pendingCashbackDetailsData);
            case 28:
                ka2.h hVar = (ka2.h) obj2;
                List list = (List) this.f179214b.getContent();
                boolean z = false;
                if (list != null && !list.isEmpty()) {
                    z = true;
                }
                return ka2.h.a(hVar, z, false, null, null, 14);
            default:
                Data data12 = this.f179214b;
                Intrinsics.h(data12);
                return ka2.h.a((ka2.h) obj2, false, false, null, data12, 7);
        }
    }
}
