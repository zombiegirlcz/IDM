package aka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5753c;

    public /* synthetic */ g(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(e.f5750a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5751a = str;
        this.f5752b = str2;
        this.f5753c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f5751a, gVar.f5751a) && Intrinsics.f(this.f5752b, gVar.f5752b) && Intrinsics.f(this.f5753c, gVar.f5753c);
    }

    public final int hashCode() {
        int iHashCode = this.f5751a.hashCode() * 31;
        String str = this.f5752b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5753c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public g(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f5751a = title;
        this.f5752b = str;
        this.f5753c = str2;
    }
}
