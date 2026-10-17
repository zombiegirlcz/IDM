package y4c;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1h.s;
import y7d.l;
import ybh.n;
import yed.o;
import yf1.m;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f310871b;

    public /* synthetic */ i(Data data, int i) {
        this.f310870a = i;
        this.f310871b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        Data data;
        s sVar;
        switch (this.f310870a) {
            case 0:
                return d.a((d) obj2, null, this.f310871b, null, 27);
            case 1:
                y4d.j content = ((y4d.e) obj2).f310876a;
                Intrinsics.checkNotNullParameter(content, "content");
                Data data2 = this.f310871b;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new y4d.e(content, data2);
            case 2:
                ((y4e.d) obj2).getClass();
                return new y4e.d(this.f310871b);
            case 3:
                return y4f.i.a((y4f.i) obj2, this.f310871b, null, null, 6);
            case 4:
                return y4f.i.a((y4f.i) obj2, null, null, this.f310871b, 3);
            case 5:
                return y4f.i.a((y4f.i) obj2, null, this.f310871b, null, 5);
            case 6:
                wdh.a ratingsProvider = ((y4h.d) obj2).f310938a;
                Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
                return new y4h.d(ratingsProvider, this.f310871b);
            case 7:
                return y5g.g.a((y5g.g) obj2, null, this.f310871b, 3);
            case 8:
                return y66.a.a((y66.a) obj2, this.f310871b, null, null, null, 14);
            case 9:
                ((y6b.f) obj2).getClass();
                Data billingData = this.f310871b;
                Intrinsics.checkNotNullParameter(billingData, "billingData");
                return new y6b.f(billingData);
            case 10:
                return l.a((l) obj2, null, this.f310871b, null, null, null, null, false, false, null, 0L, 1021);
            case 11:
                return l.a((l) obj2, null, null, null, null, this.f310871b, null, false, false, null, 0L, 1007);
            case 12:
                return l.a((l) obj2, null, null, null, null, null, null, false, false, this.f310871b, 0L, 767);
            case 13:
                Data data3 = this.f310871b;
                Intrinsics.h(data3);
                return y83.f.a((y83.f) obj2, data3, null, 2);
            case 14:
                Data data4 = this.f310871b;
                Intrinsics.h(data4);
                return y83.f.a((y83.f) obj2, null, data4, 1);
            case 15:
                Intrinsics.checkNotNullParameter((y9a.h) obj2, "$this$update");
                return new y9a.h(this.f310871b);
            case 16:
                return ya5.f.a((ya5.f) obj2, this.f310871b, null, 2);
            case 17:
                yai.k update = (yai.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data5 = this.f310871b;
                if ((data5.getError() == null || (list = f0.f322471a) == null) && (list = (List) data5.getContent()) == null) {
                    list = f0.f322471a;
                }
                return yai.k.a(update, null, null, false, null, list, 31);
            case 18:
                ((yb2.d) obj2).getClass();
                Data storedMethod = this.f310871b;
                Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
                return new yb2.d(storedMethod);
            case 19:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, this.f310871b, null, null, false, false, false, null, null, false, 130815);
            case 20:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, null, this.f310871b, null, false, false, false, null, null, false, 130559);
            case 21:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, null, null, null, false, false, false, this.f310871b, null, false, 114687);
            case 22:
                n nVar = (n) obj2;
                boolean z = nVar.f312333q;
                Data data6 = this.f310871b;
                return n.a(nVar, null, data6, null, null, null, null, null, null, null, null, null, false, false, false, null, null, z && Intrinsics.f(nVar.f312324b, data6), 65533);
            case 23:
                return n.a((n) obj2, null, null, this.f310871b, null, null, null, null, null, null, null, null, false, false, false, null, null, false, 131067);
            case 24:
                Data data7 = this.f310871b;
                n nVar2 = (n) obj2;
                try {
                    Object content2 = data7.getContent();
                    if (content2 != null) {
                        tsb.f fVar = (tsb.f) content2;
                        if (fVar instanceof tsb.a) {
                            sVar = s.ABOVE_MAXIMUM;
                            data = new Data(sVar, data7.getError(), data7.getLoading());
                        } else {
                            if (!(fVar instanceof tsb.b) && !(fVar instanceof tsb.c) && !fVar.equals(tsb.d.f274063a) && !(fVar instanceof tsb.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            sVar = null;
                            data = new Data(sVar, data7.getError(), data7.getLoading());
                        }
                    } else {
                        sVar = null;
                        data = new Data(sVar, data7.getError(), data7.getLoading());
                    }
                } catch (Throwable th10) {
                    data = new Data(null, th10, data7.getLoading());
                }
                return n.a(nVar2, null, null, null, data7, null, null, null, null, null, null, data, false, false, false, null, null, true, 64503);
            case 25:
                boolean z3 = ((aeg.c) obj2).f3578b;
                Data selectedBed = this.f310871b;
                Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
                return new aeg.c(selectedBed, z3);
            case 26:
                return o.a((o) obj2, null, null, null, null, false, false, null, null, null, null, false, null, false, null, this.f310871b, null, 786431);
            case 27:
                Data data8 = this.f310871b;
                Intrinsics.h(data8);
                return yeg.b.a((yeg.b) obj2, data8, null, 2);
            case 28:
                return m.a((m) obj2, null, null, this.f310871b, null, null, null, 59);
            default:
                Integer num = ((yf4.e) obj2).f313174b;
                Data config = this.f310871b;
                Intrinsics.checkNotNullParameter(config, "config");
                return new yf4.e(config, num);
        }
    }

    public /* synthetic */ i(Data data, com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar) {
        this.f310870a = 24;
        this.f310871b = data;
    }
}
