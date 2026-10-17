package yfd;

import com.revolut.data.model.Data;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f313229b;

    public /* synthetic */ u(Data data, int i) {
        this.f313228a = i;
        this.f313229b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        Boolean boolValueOf;
        String str;
        switch (this.f313228a) {
            case 0:
                return m.a((m) obj2, this.f313229b, null, null, false, null, 62);
            case 1:
                return yg5.g.a((yg5.g) obj2, (ug5.a) this.f313229b.getContent(), null, false, null, null, 30);
            case 2:
                return yg5.g.a((yg5.g) obj2, null, null, this.f313229b.getLoading(), null, null, 27);
            case 3:
                Data data3 = this.f313229b;
                Intrinsics.h(data3);
                return ygf.d.a((ygf.d) obj2, data3, null, 2);
            case 4:
                ((yh4.c) obj2).getClass();
                Data content = this.f313229b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new yh4.c(content);
            case 5:
                return yic.e.a((yic.e) obj2, null, null, this.f313229b, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 6:
                return yic.e.a((yic.e) obj2, this.f313229b, null, null, null, null, null, null, null, 254);
            case 7:
                return yic.e.a((yic.e) obj2, null, this.f313229b, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 8:
                Data data4 = this.f313229b;
                Intrinsics.h(data4);
                return yic.e.a((yic.e) obj2, null, null, null, null, data4, null, null, null, 239);
            case 9:
                Data data5 = this.f313229b;
                Intrinsics.h(data5);
                return yic.e.a((yic.e) obj2, null, null, null, data5, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 10:
                Data data6 = this.f313229b;
                Intrinsics.h(data6);
                return yid.i.a((yid.i) obj2, data6, false, 0L, 6);
            case 11:
                ((yj8.c) obj2).getClass();
                Data profile = this.f313229b;
                Intrinsics.checkNotNullParameter(profile, "profile");
                return new yj8.c(profile);
            case 12:
                ((yk6.e) obj2).getClass();
                Data data7 = this.f313229b;
                Intrinsics.checkNotNullParameter(data7, "data");
                return new yk6.e(data7);
            case 13:
                ((yl6.e) obj2).getClass();
                Data linkedAccountsConsent = this.f313229b;
                Intrinsics.checkNotNullParameter(linkedAccountsConsent, "linkedAccountsConsent");
                return new yl6.e(linkedAccountsConsent);
            case 14:
                return ymk.l.a((ymk.l) obj2, null, this.f313229b, false, 0, 13);
            case 15:
                Data data8 = this.f313229b;
                Intrinsics.h(data8);
                return ymk.l.a((ymk.l) obj2, data8, null, false, 0, 14);
            case 16:
                return yna.a.a((yna.a) obj2, null, null, null, null, null, null, null, false, false, null, false, null, null, this.f313229b, null, 49151);
            case 17:
                Data data9 = this.f313229b;
                Intrinsics.h(data9);
                return yna.a.a((yna.a) obj2, null, null, null, null, null, data9, null, false, false, null, false, null, null, null, null, 65471);
            case 18:
                Data data10 = this.f313229b;
                Intrinsics.h(data10);
                return yna.a.a((yna.a) obj2, null, null, null, null, null, null, data10, false, false, null, false, null, null, null, null, 65407);
            case 19:
                return yna.a.a((yna.a) obj2, null, null, null, null, null, null, null, false, false, null, false, null, this.f313229b, null, null, 57343);
            case 20:
                yr5.f fVar = (yr5.f) obj2;
                Data data11 = this.f313229b;
                Data data12 = (data11.getContent() == null && data11.getError() == null) ? null : data11;
                if (data12 == null) {
                    data12 = fVar.e;
                }
                return yr5.f.a(fVar, null, null, data12, (data11.getError() == null || data11.getContent() != null) ? fVar.f : new Data(null, data11.getError(), false, 5, null), 15);
            case 21:
                return yr5.f.a((yr5.f) obj2, null, null, null, this.f313229b, 31);
            case 22:
                yrb.x xVar = (yrb.x) obj2;
                Data data13 = this.f313229b;
                Pair pair = (Pair) data13.getContent();
                Map mapG = pair != null ? (Map) pair.f186385a : null;
                if (mapG == null) {
                    mapG = r0.g();
                }
                Map map = mapG;
                try {
                    Object content2 = data13.getContent();
                    data = new Data(content2 != null ? (List) ((Pair) content2).f186386b : null, data13.getError(), data13.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data13.getLoading());
                }
                Data data14 = data;
                try {
                    Object content3 = data13.getContent();
                    if (content3 != null) {
                        Pair pair2 = (Pair) content3;
                        boolValueOf = Boolean.valueOf((((Map) pair2.f186385a).isEmpty() || ((List) pair2.f186386b).isEmpty()) ? false : true);
                    } else {
                        boolValueOf = null;
                    }
                    data2 = new Data(boolValueOf, data13.getError(), data13.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data13.getLoading());
                }
                return yrb.x.a(xVar, null, null, null, null, null, null, false, data14, map, null, null, null, null, null, data2, 15999);
            case 23:
                return yrb.x.a((yrb.x) obj2, null, null, null, null, null, null, false, null, null, null, this.f313229b, null, null, null, null, 31743);
            case 24:
                return yrb.x.a((yrb.x) obj2, null, null, null, null, null, null, false, null, null, null, null, this.f313229b, null, null, null, 30719);
            case 25:
                return yrb.x.a((yrb.x) obj2, null, null, null, null, null, null, false, null, null, null, null, null, this.f313229b, null, null, 28671);
            case 26:
                return ytj.j.a((ytj.j) obj2, this.f313229b, null, null, false, false, 30);
            case 27:
                ytj.j jVar = (ytj.j) obj2;
                Data data15 = this.f313229b;
                d0j.k kVar = (d0j.k) data15.getContent();
                if (kVar == null || (str = kVar.f110411b) == null) {
                    str = jVar.f316818b;
                }
                String str2 = str;
                d0j.k kVar2 = (d0j.k) data15.getContent();
                return ytj.j.a(jVar, null, str2, kVar2 != null ? kVar2.f110410a : null, false, false, 25);
            case 28:
                ((yu7.f) obj2).getClass();
                Data cards = this.f313229b;
                Intrinsics.checkNotNullParameter(cards, "cards");
                return new yu7.f(cards);
            default:
                ((yv7.f) obj2).getClass();
                Data insuranceDetails = this.f313229b;
                Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
                return new yv7.f(insuranceDetails);
        }
    }
}
