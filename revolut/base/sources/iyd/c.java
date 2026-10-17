package iyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169655c;
    public final String d;

    public c(String type, String str, String str2, String str3, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        Intrinsics.checkNotNullParameter(type, "type");
        this.f169653a = type;
        this.f169654b = str;
        this.f169655c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f169653a, cVar.f169653a) && Intrinsics.f(this.f169654b, cVar.f169654b) && Intrinsics.f(this.f169655c, cVar.f169655c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f169653a.hashCode() * 31;
        String str = this.f169654b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f169655c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            j1.f(a.f169648a.getDescriptor(), i, 1);
            throw null;
        }
        this.f169653a = str;
        if ((i & 2) == 0) {
            this.f169654b = null;
        } else {
            this.f169654b = str2;
        }
        if ((i & 4) == 0) {
            this.f169655c = null;
        } else {
            this.f169655c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }
}
