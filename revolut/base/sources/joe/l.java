package joe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, a.class, "toDomain", "toDomain(Lcom/revolut/feature/tax_residency/impl/models/SkippableTinCountriesResponseDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ioe.i p0 = (ioe.i) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = a.f176928a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List skippableTinCountries = p0.getSkippableTinCountries();
        ArrayList arrayList = new ArrayList(w.t(skippableTinCountries, 10));
        Iterator it8 = skippableTinCountries.iterator();
        while (it8.hasNext()) {
            kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList);
        }
        return arrayList;
    }
}
