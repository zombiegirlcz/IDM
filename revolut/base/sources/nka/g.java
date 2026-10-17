package nka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216782c;

    public /* synthetic */ g(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(e.f216779a.getDescriptor(), i, 7);
            throw null;
        }
        this.f216780a = str;
        this.f216781b = str2;
        this.f216782c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f216780a, gVar.f216780a) && Intrinsics.f(this.f216781b, gVar.f216781b) && Intrinsics.f(this.f216782c, gVar.f216782c);
    }

    public final int hashCode() {
        int iHashCode = this.f216780a.hashCode() * 31;
        String str = this.f216781b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f216782c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public g(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f216780a = title;
        this.f216781b = str;
        this.f216782c = str2;
    }
}
