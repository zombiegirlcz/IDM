package zmi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323529c;
    public final String d;
    public final String e;

    public /* synthetic */ i(int i, String str, String str2, String str3, String str4, String str5) {
        if (7 != (i & 7)) {
            j1.f(g.f323526a.getDescriptor(), i, 7);
            throw null;
        }
        this.f323527a = str;
        this.f323528b = str2;
        this.f323529c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f323527a, iVar.f323527a) && Intrinsics.f(this.f323528b, iVar.f323528b) && Intrinsics.f(this.f323529c, iVar.f323529c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f323527a.hashCode() * 31, 31, this.f323528b), 31, this.f323529c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
