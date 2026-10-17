package k50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s2 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s2 f181237c = new s2("", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f181239b;

    public s2(String query, boolean z) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f181238a = query;
        this.f181239b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f181238a, s2Var.f181238a) && this.f181239b == s2Var.f181239b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181239b) + (this.f181238a.hashCode() * 31);
    }
}
