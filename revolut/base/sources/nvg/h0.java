package nvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h0 {
    public abstract void a(List list);

    public void b(List charts, List points) {
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(points, "points");
        a(charts);
        c(points);
    }

    public abstract void c(List list);

    public abstract List d(iwg.a aVar, eel.c cVar, String str, String str2, Duration duration);
}
