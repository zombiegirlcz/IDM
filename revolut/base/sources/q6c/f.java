package q6c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242536c;
    public final String d;
    public final boolean e;

    public f(String str, String str2, String name, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f242534a = str;
        this.f242535b = str2;
        this.f242536c = name;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f242534a, fVar.f242534a) && Intrinsics.f(this.f242535b, fVar.f242535b) && Intrinsics.f(this.f242536c, fVar.f242536c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        String str = this.f242534a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f242535b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f242536c);
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
