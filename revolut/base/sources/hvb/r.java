package hvb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155814c;
    public final String d;

    public /* synthetic */ r(int i, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            j1.f(p.f155811a.getDescriptor(), i, 1);
            throw null;
        }
        this.f155812a = str;
        if ((i & 2) == 0) {
            this.f155813b = null;
        } else {
            this.f155813b = str2;
        }
        if ((i & 4) == 0) {
            this.f155814c = null;
        } else {
            this.f155814c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f155812a, rVar.f155812a) && Intrinsics.f(this.f155813b, rVar.f155813b) && Intrinsics.f(this.f155814c, rVar.f155814c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f155812a.hashCode() * 31;
        String str = this.f155813b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155814c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
