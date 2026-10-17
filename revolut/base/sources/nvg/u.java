package nvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u {
    public void a(List charts, List points) {
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(points, "points");
        c(charts);
        b(points);
    }

    public abstract void b(List list);

    public abstract void c(List list);

    public abstract List d(String str, String str2, eel.c cVar, String str3, String str4);
}
