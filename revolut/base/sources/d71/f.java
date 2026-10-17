package d71;

import com.revolut.domain.models.support.TroubleshootingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshootingSource f111757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aj0.c f111759c;

    public f(TroubleshootingSource source, String str, aj0.c faqEntry) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(faqEntry, "faqEntry");
        this.f111757a = source;
        this.f111758b = str;
        this.f111759c = faqEntry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f111757a == fVar.f111757a && Intrinsics.f(this.f111758b, fVar.f111758b) && Intrinsics.f(this.f111759c, fVar.f111759c);
    }

    public final int hashCode() {
        int iHashCode = this.f111757a.hashCode() * 31;
        String str = this.f111758b;
        return this.f111759c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
