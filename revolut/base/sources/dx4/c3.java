package dx4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c3 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f120565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTimeFormatter f120567c;

    public c3(String format, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f120565a = localDate;
        this.f120566b = format;
        this.f120567c = DateTimeFormatter.ofPattern(format);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f120565a, c3Var.f120565a) && Intrinsics.f(this.f120566b, c3Var.f120566b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f120565a;
        return this.f120566b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31);
    }
}
