package rj9;

import com.revolut.data.model.Data;
import dfj.p;
import dfj.q;
import jsl.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f254637b;

    public /* synthetic */ i(Data data, int i) {
        this.f254636a = i;
        this.f254637b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f254636a) {
            case 0:
                ((e) obj2).getClass();
                Data plans = this.f254637b;
                Intrinsics.checkNotNullParameter(plans, "plans");
                return new e(plans);
            case 1:
                Data data = this.f254637b;
                Intrinsics.h(data);
                return rk7.e.a((rk7.e) obj2, data, null, 14);
            case 2:
                Data data2 = this.f254637b;
                Intrinsics.h(data2);
                return rk7.e.a((rk7.e) obj2, null, data2, 13);
            case 3:
                return rk9.i.a((rk9.i) obj2, this.f254637b, false, 2);
            case 4:
                return rmb.a.a((rmb.a) obj2, null, null, this.f254637b, 3);
            case 5:
                return rmk.c.a((rmk.c) obj2, null, this.f254637b, 1);
            case 6:
                Data data3 = this.f254637b;
                Intrinsics.h(data3);
                return rmk.c.a((rmk.c) obj2, data3, null, 2);
            case 7:
                String currentLanguage = ((rna.d) obj2).f255536b;
                Data selectedTheme = this.f254637b;
                Intrinsics.checkNotNullParameter(selectedTheme, "selectedTheme");
                Intrinsics.checkNotNullParameter(currentLanguage, "currentLanguage");
                return new rna.d(selectedTheme, currentLanguage);
            case 8:
                rnj.c cVar = (rnj.c) obj2;
                q qVar = (q) this.f254637b.getContent();
                if (qVar == null) {
                    qVar = p.f114062a;
                }
                return rnj.c.a(cVar, null, null, qVar, 3);
            case 9:
                return rnj.c.a((rnj.c) obj2, this.f254637b, null, null, 6);
            case 10:
                return rnj.c.a((rnj.c) obj2, null, this.f254637b, null, 5);
            case 11:
                ((rob.f) obj2).getClass();
                Data accountData = this.f254637b;
                Intrinsics.checkNotNullParameter(accountData, "accountData");
                return new rob.f(accountData);
            case 12:
                Data data4 = this.f254637b;
                Intrinsics.h(data4);
                return rp9.a.a((rp9.a) obj2, data4, null, null, 6);
            case 13:
                return new rpd.a(this.f254637b);
            case 14:
                return rq7.j.a((rq7.j) obj2, this.f254637b, null, null, 6);
            case 15:
                return rq7.j.a((rq7.j) obj2, null, this.f254637b, null, 5);
            case 16:
                return rq7.j.a((rq7.j) obj2, null, null, this.f254637b, 3);
            case 17:
                return rqh.h.a((rqh.h) obj2, this.f254637b, null, 13);
            case 18:
                return new rrj.d(this.f254637b);
            case 19:
                y update = (y) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return y.a(update, null, null, null, null, null, this.f254637b, null, 95);
            case 20:
                return y.a((y) obj2, null, this.f254637b, null, null, null, null, null, ISO781611.SMT_TAG);
            case 21:
                return y.a((y) obj2, this.f254637b, null, null, null, null, null, null, 126);
            case 22:
                return y.a((y) obj2, null, null, null, null, null, null, this.f254637b, 63);
            case 23:
                return y.a((y) obj2, null, null, null, null, this.f254637b, null, null, LDSFile.EF_DG15_TAG);
            case 24:
                return y.a((y) obj2, null, null, null, this.f254637b, null, null, null, LDSFile.EF_SOD_TAG);
            case 25:
                dj0.d approvedLimit = ((rt4.e) obj2).f257170a;
                Intrinsics.checkNotNullParameter(approvedLimit, "approvedLimit");
                Data content = this.f254637b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new rt4.e(content, approvedLimit);
            case 26:
                return rtk.c.a((rtk.c) obj2, null, null, null, this.f254637b, 7);
            case 27:
                return rtk.c.a((rtk.c) obj2, this.f254637b, null, null, null, 14);
            case 28:
                return rtk.c.a((rtk.c) obj2, null, this.f254637b, null, null, 13);
            default:
                return rtk.c.a((rtk.c) obj2, null, null, this.f254637b, null, 11);
        }
    }
}
