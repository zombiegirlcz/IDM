package z0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318217c;
    public final String d;

    public /* synthetic */ e(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(c.f318214a.getDescriptor(), i, 15);
            throw null;
        }
        this.f318215a = str;
        this.f318216b = str2;
        this.f318217c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f318215a, eVar.f318215a) && Intrinsics.f(this.f318216b, eVar.f318216b) && Intrinsics.f(this.f318217c, eVar.f318217c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        String str = this.f318215a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f318216b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f318217c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
