package ip0;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes19.dex */
public final class ey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f164162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f164163c;

    public ey(String pan, String cvv, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f164161a = pan;
        this.f164162b = cvv;
        this.f164163c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj2;
        return Intrinsics.f(this.f164161a, eyVar.f164161a) && Intrinsics.f(this.f164162b, eyVar.f164162b) && Intrinsics.f(this.f164163c, eyVar.f164163c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f164161a.hashCode() * 31, 31, this.f164162b);
        LocalDate localDate = this.f164163c;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }
}
