package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18493c;
    public final String d;

    public /* synthetic */ j(int i, String str, boolean z, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(h.f18490a.getDescriptor(), i, 15);
            throw null;
        }
        this.f18491a = str;
        this.f18492b = z;
        this.f18493c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f18491a, jVar.f18491a) && this.f18492b == jVar.f18492b && Intrinsics.f(this.f18493c, jVar.f18493c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f18491a.hashCode() * 31, 31, this.f18492b);
        String str = this.f18493c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public j(String title, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18491a = title;
        this.f18492b = z;
        this.f18493c = str;
        this.d = str2;
    }
}
