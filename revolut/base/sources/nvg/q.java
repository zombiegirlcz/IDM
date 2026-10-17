package nvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q {
    public abstract void a(pvg.m mVar);

    public void b(pvg.m chart, List points) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(points, "points");
        a(chart);
        c(points);
    }

    public abstract void c(List list);

    public abstract List d(eel.c cVar, String str, String str2, String str3);
}
