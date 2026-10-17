package w26;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f293958c;
    public final String d;

    public /* synthetic */ g(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(e.f293955a.getDescriptor(), i, 15);
            throw null;
        }
        this.f293956a = str;
        this.f293957b = str2;
        this.f293958c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f293956a, gVar.f293956a) && Intrinsics.f(this.f293957b, gVar.f293957b) && Intrinsics.f(this.f293958c, gVar.f293958c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        String str = this.f293956a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f293957b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f293958c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
