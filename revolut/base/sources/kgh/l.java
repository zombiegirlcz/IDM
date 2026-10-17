package kgh;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f183997b;

    public l(String ref2, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f183996a = ref2;
        this.f183997b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f183996a, lVar.f183996a) && Intrinsics.f(this.f183997b, lVar.f183997b);
    }

    public final int hashCode() {
        int iHashCode = this.f183996a.hashCode() * 31;
        LocalDate localDate = this.f183997b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
