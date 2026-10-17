package k8b;

import com.revolut.data.model.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    m8b.e a(iel.a aVar, String str, List list, Data data);

    List b(iel.a aVar, BigDecimal bigDecimal, boolean z, List list);

    default qv0.i c(iel.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    qv0.i d(iel.a aVar, boolean z, LocalDate localDate, ArrayList arrayList);
}
