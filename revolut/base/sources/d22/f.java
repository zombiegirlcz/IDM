package d22;

import com.revolut.data.model.Data;
import fzd.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pzd.p;
import rg4.n;
import xzd.k;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f110706b;

    public /* synthetic */ f(int i, Exception exc2) {
        this.f110705a = i;
        this.f110706b = exc2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110705a) {
            case 0:
                return d.a((d) obj2, zi0.c.O(this.f110706b));
            case 1:
                dkj.g update = (dkj.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return dkj.g.a(update, new Data(null, this.f110706b, false, 5, null), null, 14);
            case 2:
                return ep2.f.a((ep2.f) obj2, new Data(null, this.f110706b, false, 5, null));
            case 3:
                j update2 = (j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return j.a(update2, new Data(null, this.f110706b, false, 5, null), null, 2);
            case 4:
                gq2.h update3 = (gq2.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return gq2.h.a(update3, 0, 0, new Data(null, this.f110706b, false, 5, null), 7);
            case 5:
                return hp2.f.a((hp2.f) obj2, null, zi0.c.O(this.f110706b), 3);
            case 6:
                return new j53.j(this.f110706b);
            case 7:
                return new j53.j(this.f110706b);
            case 8:
                return new j53.j(this.f110706b);
            case 9:
                Data areaContent = new Data(null, this.f110706b, false, 5, null);
                ((pe2.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(areaContent, "areaContent");
                return new pe2.g(areaContent);
            case 10:
                return p.a((p) obj2, null, null, null, null, null, zi0.c.O(this.f110706b), 383);
            case 11:
                Data taxYears = zi0.c.O(this.f110706b);
                ((r0e.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(taxYears, "taxYears");
                return new r0e.g(taxYears);
            case 12:
                return n.a((n) obj2, new Data(null, this.f110706b, false, 5, null), false, 2);
            case 13:
                return rq4.j.a((rq4.j) obj2, new Data(null, this.f110706b, false, 5, null), null, null, false, false, 62);
            case 14:
                return t0e.f.a((t0e.f) obj2, zi0.c.O(this.f110706b));
            case 15:
                Data baseCurrencyAndBalances = new Data(null, this.f110706b, false, 5, null);
                String str = ((tvh.c) obj2).f274768b;
                Intrinsics.checkNotNullParameter(baseCurrencyAndBalances, "baseCurrencyAndBalances");
                return new tvh.c(baseCurrencyAndBalances, str);
            default:
                return k.a((k) obj2, zi0.c.O(this.f110706b), null, null, false, 14);
        }
    }
}
