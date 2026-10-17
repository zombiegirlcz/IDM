package hui;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.extension.earning_rates.RevPointsEarningRateAggregate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f155675b;

    public /* synthetic */ c0(Data data, int i) {
        this.f155674a = i;
        this.f155675b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        od0.i iVarA;
        switch (this.f155674a) {
            case 0:
                return k.a((k) obj2, null, this.f155675b, null, null, null, null, null, ISO781611.SMT_TAG);
            case 1:
                return hul.h.a((hul.h) obj2, null, null, null, this.f155675b, null, null, null, null, null, null, null, null, null, null, null, null, 524271);
            case 2:
                return hul.h.a((hul.h) obj2, null, null, null, null, this.f155675b, null, null, null, null, null, null, null, null, null, null, null, 524255);
            case 3:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, null, null, null, null, 524159);
            case 4:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, 458751);
            case 5:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, 262143);
            case 6:
                return hul.h.a((hul.h) obj2, null, null, this.f155675b, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279);
            case 7:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, this.f155675b, null, null, null, null, null, null, null, null, null, null, 524223);
            case 8:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, null, null, null, null, 524159);
            case 9:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, null, null, 523263);
            case 10:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, null, 522239);
            case 11:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, null, null, null, 524031);
            case 12:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, 520191);
            case 13:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, 516095);
            case 14:
                return hul.h.a((hul.h) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, 491519);
            case 15:
                ((hwf.c) obj2).getClass();
                Data data2 = this.f155675b;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new hwf.c(data2);
            case 16:
                ((hwk.a) obj2).getClass();
                return new hwk.a(this.f155675b);
            case 17:
                Data data3 = this.f155675b;
                Intrinsics.h(data3);
                return hz2.k.a((hz2.k) obj2, data3, null, 2);
            case 18:
                return hz2.k.a((hz2.k) obj2, null, this.f155675b, 1);
            case 19:
                Data data4 = this.f155675b;
                Intrinsics.h(data4);
                return hz6.e.a((hz6.e) obj2, data4, null, false, 6);
            case 20:
                return hzb.t.a((hzb.t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, 122879);
            case 21:
                return hzb.t.a((hzb.t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            case 22:
                Data data5 = this.f155675b;
                Intrinsics.h(data5);
                return hzb.t.a((hzb.t) obj2, null, null, null, null, null, null, null, data5, null, null, null, null, null, null, null, null, 130943);
            case 23:
                Data data6 = this.f155675b;
                Intrinsics.h(data6);
                return hzb.t.a((hzb.t) obj2, null, null, data6, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067);
            case 24:
                Data data7 = this.f155675b;
                Intrinsics.h(data7);
                return hzb.t.a((hzb.t) obj2, data7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070);
            case 25:
                return hzb.t.a((hzb.t) obj2, null, this.f155675b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069);
            case 26:
                return hzb.t.a((hzb.t) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, 126975);
            case 27:
                hzb.t tVar = (hzb.t) obj2;
                Data data8 = this.f155675b;
                Intrinsics.h(data8);
                try {
                    Object content = data8.getContent();
                    if (content != null) {
                        od0.i.Companion.getClass();
                        iVarA = od0.h.a((RevPointsEarningRateAggregate) content);
                    } else {
                        iVarA = null;
                    }
                    data = new Data(iVarA, data8.getError(), data8.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data8.getLoading());
                }
                return hzb.t.a(tVar, null, null, null, null, null, null, data, null, null, null, null, null, null, null, null, null, 131007);
            case 28:
                Data data9 = this.f155675b;
                Intrinsics.h(data9);
                return hzb.t.a((hzb.t) obj2, null, null, null, null, data9, null, null, null, null, null, null, null, null, null, null, null, 131055);
            default:
                return hzb.t.a((hzb.t) obj2, null, null, null, null, null, null, null, null, null, null, this.f155675b, null, null, null, null, null, 130047);
        }
    }
}
