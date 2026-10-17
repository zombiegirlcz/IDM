package z0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318236c;

    public /* synthetic */ w(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(u.f318233a.getDescriptor(), i, 7);
            throw null;
        }
        this.f318234a = str;
        this.f318235b = str2;
        this.f318236c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f318234a, wVar.f318234a) && Intrinsics.f(this.f318235b, wVar.f318235b) && Intrinsics.f(this.f318236c, wVar.f318236c);
    }

    public final int hashCode() {
        int iHashCode = this.f318234a.hashCode() * 31;
        String str = this.f318235b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f318236c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
