package pf1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.j;
import qf1.k;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    k a(d dVar);

    default List b(d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return f0.f322471a;
    }

    j c(d dVar);
}
