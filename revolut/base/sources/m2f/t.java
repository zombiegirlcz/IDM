package m2f;

import com.revolut.feature.rev_points.models.RevPoints;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f201993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oki.h f201994c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ t(double d, String str, int i, com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar) {
        this.f201992a = 0;
        this.f201993b = d;
        this.e = str;
        this.d = i;
        this.f201994c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f201992a) {
            case 0:
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) this.f201994c;
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                DecimalFormat decimalFormat = aVar.f91168t.f201965a;
                int i = this.d;
                String str = decimalFormat.format(Integer.valueOf(i));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return l.a(update, null, null, this.f201993b, this.e, i, str, null, s.REV_POINTS, null, false, false, 7439);
            case 1:
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar2 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) this.f201994c;
                l update2 = (l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                DecimalFormat decimalFormat2 = aVar2.f91168t.f201965a;
                double d = this.f201993b;
                String str2 = decimalFormat2.format(d);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return l.a(update2, null, null, d, str2, this.d, this.e, null, s.PARTNER_POINTS, null, false, false, 7439);
            default:
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.f201994c;
                pig.j update3 = (pig.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                double d5 = this.f201993b;
                RevPoints revPointsA = qvb.a.a(d5);
                String str3 = aVar3.f94390s.f236476a.format(d5);
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return pig.j.a(update3, null, null, null, null, revPointsA, str3, this.d, this.e, null, pig.q.MILES, false, 2591);
        }
    }

    public /* synthetic */ t(double d, oki.h hVar, int i, String str, int i2) {
        this.f201992a = i2;
        this.f201993b = d;
        this.f201994c = hVar;
        this.d = i;
        this.e = str;
    }
}
