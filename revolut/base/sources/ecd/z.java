package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124717b;

    public /* synthetic */ z(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(x.f124702a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124716a = str;
        this.f124717b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f124716a, zVar.f124716a) && Intrinsics.f(this.f124717b, zVar.f124717b);
    }

    public final int hashCode() {
        String str = this.f124716a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f124717b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public z(String str, String str2) {
        this.f124716a = str;
        this.f124717b = str2;
    }
}
