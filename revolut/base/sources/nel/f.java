package nel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214572c;

    public f(String str, String str2, boolean z) {
        this.f214570a = str;
        this.f214571b = z;
        this.f214572c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f214570a, fVar.f214570a) && this.f214571b == fVar.f214571b && Intrinsics.f(this.f214572c, fVar.f214572c);
    }

    public final int hashCode() {
        String str = this.f214570a;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f214571b);
        String str2 = this.f214572c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
