package d71;

import com.revolut.domain.models.support.TroubleshootingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshootingSource f111760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111762c;

    public g(TroubleshootingSource source, String title, String link) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f111760a = source;
        this.f111761b = title;
        this.f111762c = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f111760a == gVar.f111760a && Intrinsics.f(this.f111761b, gVar.f111761b) && Intrinsics.f(this.f111762c, gVar.f111762c);
    }

    public final int hashCode() {
        return this.f111762c.hashCode() + p.a.c(this.f111760a.hashCode() * 31, 31, this.f111761b);
    }
}
