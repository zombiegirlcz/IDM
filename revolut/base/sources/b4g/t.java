package b4g;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.q implements Function1 {
    public static final t f = new t();

    public t() {
        super(1, c8g.c.class, "toDomain", "toDomain(Lcom/revolut/feature/travel/flights/models/dto/documents/TravelFlightsReceiptsResponseDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        u7g.f p0 = (u7g.f) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List<u7g.c> list = p0.f277754a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (u7g.c cVar : list) {
            arrayList.add(new n7g.d(cVar.f277749a, cVar.f277750b, cVar.f277751c));
        }
        return arrayList;
    }
}
