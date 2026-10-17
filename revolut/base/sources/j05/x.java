package j05;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f169979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169980c;
    public final String d;

    public /* synthetic */ x(int i, String str, String str2, String str3, jo3.a aVar) {
        if (15 != (i & 15)) {
            j1.f(v.f169977a.getDescriptor(), i, 15);
            throw null;
        }
        this.f169978a = str;
        this.f169979b = aVar;
        this.f169980c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f169978a, xVar.f169978a) && Intrinsics.f(this.f169979b, xVar.f169979b) && Intrinsics.f(this.f169980c, xVar.f169980c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iJ = v7.j(this.f169979b, this.f169978a.hashCode() * 31, 31);
        String str = this.f169980c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
