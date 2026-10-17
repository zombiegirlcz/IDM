package cgc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23917c;
    public final String d;

    public j(String str, String normal, String str2, String str3) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.f23915a = str;
        this.f23916b = normal;
        this.f23917c = str2;
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
        return Intrinsics.f(this.f23915a, jVar.f23915a) && Intrinsics.f(this.f23916b, jVar.f23916b) && Intrinsics.f(this.f23917c, jVar.f23917c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        String str = this.f23915a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f23916b);
        String str2 = this.f23917c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
