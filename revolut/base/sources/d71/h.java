package d71;

import com.revolut.domain.models.support.TroubleshootingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshootingSource f111763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111764b;

    public h(TroubleshootingSource source, String title) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f111763a = source;
        this.f111764b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f111763a == hVar.f111763a && Intrinsics.f(this.f111764b, hVar.f111764b);
    }

    public final int hashCode() {
        return this.f111764b.hashCode() + (this.f111763a.hashCode() * 31);
    }
}
