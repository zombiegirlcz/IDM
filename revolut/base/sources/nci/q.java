package nci;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njj.b0;
import org.jmrtd.cbeff.ISO781611;
import zh9.m1;
import zh9.o1;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f214213b;

    public /* synthetic */ q(Data data, int i) {
        this.f214212a = i;
        this.f214213b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f214212a) {
            case 0:
                return k.a((k) obj2, null, this.f214213b, false, 5);
            case 1:
                ((nd8.f) obj2).getClass();
                Data juniorName = this.f214213b;
                Intrinsics.checkNotNullParameter(juniorName, "juniorName");
                return new nd8.f(juniorName);
            case 2:
                return neg.l.a((neg.l) obj2, null, null, null, null, null, null, null, null, new Data(null, null, this.f214213b.getLoading(), 3, null), false, null, 0L, 3839);
            case 3:
                nf4.e update = (nf4.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return nf4.e.a(update, null, this.f214213b, 1);
            case 4:
                Data data2 = this.f214213b;
                Intrinsics.h(data2);
                return ngg.d.a((ngg.d) obj2, null, data2, 3);
            case 5:
                ((ngh.d) obj2).getClass();
                return new ngh.d(this.f214213b);
            case 6:
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2, null, null, null, null, null, null, null, null, false, null, this.f214213b, false, null, 7167);
            case 7:
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2, null, null, null, null, null, null, null, null, false, this.f214213b, null, false, null, 7679);
            case 8:
                Data data3 = this.f214213b;
                Intrinsics.h(data3);
                return nj9.h.a((nj9.h) obj2, data3, null, null, 6);
            case 9:
                nj9.h hVar = (nj9.h) obj2;
                m1 m1Var = hVar.f216420c;
                Data data4 = this.f214213b;
                if (m1Var == null) {
                    o1 o1Var = (o1) data4.getContent();
                    m1Var = o1Var != null ? (m1) d0.b0(o1Var.f322315a) : null;
                }
                return nj9.h.a(hVar, null, data4, m1Var, 1);
            case 10:
                return nje.f.a((nje.f) obj2, null, this.f214213b, null, null, null, null, null, ISO781611.SMT_TAG);
            case 11:
                return nje.f.a((nje.f) obj2, this.f214213b, null, null, null, null, null, null, 126);
            case 12:
                return b0.a((b0) obj2, null, null, this.f214213b, null, null, null, null, false, null, 507);
            case 13:
                return b0.a((b0) obj2, null, null, null, this.f214213b, null, null, null, false, null, 503);
            case 14:
                return b0.a((b0) obj2, null, null, null, null, null, this.f214213b, null, false, null, 479);
            case 15:
                return b0.a((b0) obj2, null, this.f214213b, null, null, null, null, null, false, null, 509);
            case 16:
                return nk4.a.a((nk4.a) obj2, this.f214213b, false, 30);
            case 17:
                Data data5 = this.f214213b;
                Intrinsics.h(data5);
                return nk6.e.a((nk6.e) obj2, data5, null, 2);
            case 18:
                ((nk9.g) obj2).getClass();
                Data content = this.f214213b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new nk9.g(content);
            case 19:
                return nm6.e.a((nm6.e) obj2, this.f214213b, null, 2);
            case 20:
                return nm9.g.a((nm9.g) obj2, this.f214213b);
            case 21:
                Data data6 = this.f214213b;
                nmb.c cVar = (nmb.c) obj2;
                try {
                    Object content2 = data6.getContent();
                    data = new Data(content2 != null ? (nmb.b) ((Pair) content2).f186386b : null, data6.getError(), data6.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data6.getLoading());
                }
                Pair pair = (Pair) data6.getContent();
                return nmb.c.a(cVar, data, pair != null ? (SavingsProductData) pair.f186385a : null, null, false, 28);
            case 22:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, this.f214213b, null, null, 234881023);
            case 23:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, (ld6.b) this.f214213b.getContent(), null, 201326591);
            case 24:
                Data data7 = this.f214213b;
                Intrinsics.h(data7);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, data7, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435453);
            case 25:
                Data data8 = this.f214213b;
                Intrinsics.h(data8);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, data8, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268431359);
            case 26:
                Data data9 = this.f214213b;
                Intrinsics.h(data9);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, data9, null, null, null, null, false, null, null, null, null, false, null, null, null, 268427263);
            case 27:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, this.f214213b, null, null, false, null, null, null, null, false, null, null, null, 268402687);
            case 28:
                Data data10 = this.f214213b;
                Intrinsics.h(data10);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, data10, null, null, null, false, null, null, null, null, false, null, null, null, 268419071);
            default:
                Data data11 = this.f214213b;
                Intrinsics.h(data11);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, data11, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435423);
        }
    }
}
