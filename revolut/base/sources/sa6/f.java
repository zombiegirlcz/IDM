package sa6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.r1;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityTransactionsParams f261315b;

    public /* synthetic */ f(CharityTransactionsParams charityTransactionsParams, int i) {
        this.f261314a = i;
        this.f261315b = charityTransactionsParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261314a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                whf.p pVar = (whf.p) pair.f186386b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new qa6.b((r1) it8.next()));
                }
                List list3 = pVar.f297646a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(new qa6.a((a3) it9.next()));
                }
                return new qa6.d(zhm.d0.V0(zhm.d0.P0(zhm.d0.E0(arrayList2, arrayList), new g()), this.f261315b.f71990a), pVar.f297647b);
            case 1:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ta6.b.a(it10, this.f261315b.f71992c);
            default:
                Data pageData = (Data) obj2;
                Intrinsics.checkNotNullParameter(pageData, "pageData");
                List listL = zhm.v.l(pageData.getContent());
                Throwable error = pageData.getError();
                return new lk0.e(listL, this.f261315b, pageData.getLoading(), null, error, 8);
        }
    }
}
