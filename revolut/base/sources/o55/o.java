package o55;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function1 {
    public static final o f = new o();

    public o() {
        super(1, d55.f.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanListItemsDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i55.t p0 = (i55.t) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = d55.f.f111363a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List items = p0.getItems();
        ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            arrayList.add(d55.f.b((i55.l) it8.next()));
        }
        return arrayList;
    }
}
