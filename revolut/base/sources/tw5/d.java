package tw5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, pw5.a.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List<qw5.a> list = p0;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (qw5.a aVar : list) {
            arrayList.add(new cw5.b(aVar.getCurrency(), aVar.getMarketCap().getAmount(), aVar.getCurrentRate(), pw5.a.C(aVar.getPriceChange()), pw5.a.C(aVar.getBought()), pw5.a.C(aVar.getSold())));
        }
        return arrayList;
    }
}
