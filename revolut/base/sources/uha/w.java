package uha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class w implements x {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280185c;

    public /* synthetic */ w(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(u.f280182a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280183a = str;
        this.f280184b = str2;
        this.f280185c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f280183a, wVar.f280183a) && Intrinsics.f(this.f280184b, wVar.f280184b) && Intrinsics.f(this.f280185c, wVar.f280185c);
    }

    public final int hashCode() {
        int iHashCode = this.f280183a.hashCode() * 31;
        String str = this.f280184b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f280185c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public w(String productName, String str, String str2) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f280183a = productName;
        this.f280184b = str;
        this.f280185c = str2;
    }
}
