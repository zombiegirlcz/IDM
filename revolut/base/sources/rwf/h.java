package rwf;

import cli.o;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f257901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f257902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f257903c;

    public h(LocalDate localDate, TextClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f257901a = localDate;
        this.f257902b = title;
        this.f257903c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f257901a, hVar.f257901a) && this.f257902b.equals(hVar.f257902b) && this.f257903c == hVar.f257903c;
    }

    public final int hashCode() {
        LocalDate localDate = this.f257901a;
        return Boolean.hashCode(this.f257903c) + v7.b((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f257902b);
    }
}
