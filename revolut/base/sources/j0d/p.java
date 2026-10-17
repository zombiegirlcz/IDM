package j0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170012c;
    public final String d;

    public /* synthetic */ p(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(n.f170009a.getDescriptor(), i, 15);
            throw null;
        }
        this.f170010a = str;
        this.f170011b = str2;
        this.f170012c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f170010a, pVar.f170010a) && Intrinsics.f(this.f170011b, pVar.f170011b) && Intrinsics.f(this.f170012c, pVar.f170012c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f170010a.hashCode() * 31, 31, this.f170011b), 31, this.f170012c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
