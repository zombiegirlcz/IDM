package ksb;

import com.revolut.data.model.Data;
import efm.d0;
import java.util.List;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tof.i1;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f189402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f189403c;

    public /* synthetic */ d(g gVar, String str, int i) {
        this.f189401a = i;
        this.f189402b = gVar;
        this.f189403c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f189401a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                List list = (List) obj3;
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                q qVar = (q) obj4;
                if (list.isEmpty()) {
                    return this.f189402b.c(this.f189403c, u.c(i1.f272794a));
                }
                return d0.m(new Pair(list, qVar));
            default:
                Data detailsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(detailsData, "detailsData");
                List list2 = (List) detailsData.getContent();
                return (list2 == null || list2.isEmpty()) ? zi0.c.J(com.revolut.domain.interactors.transactions.a.c(this.f189402b.f189406a, this.f189403c, null, false, 4)) : w.h(detailsData);
        }
    }
}
