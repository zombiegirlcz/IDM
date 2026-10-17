package m6g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f203092c;

    public h(String listId, String rawText, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rawText, "rawText");
        this.f203090a = listId;
        this.f203091b = rawText;
        this.f203092c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f203090a, hVar.f203090a) && Intrinsics.f(this.f203091b, hVar.f203091b) && Intrinsics.f(this.f203092c, hVar.f203092c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f203090a.hashCode() * 31, 31, this.f203091b);
        LocalDate localDate = this.f203092c;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }
}
