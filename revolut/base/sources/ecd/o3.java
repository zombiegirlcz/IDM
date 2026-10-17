package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o3 {

    @NotNull
    public static final n3 Companion = new n3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124636b;

    public /* synthetic */ o3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(m3.f124618a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124635a = str;
        this.f124636b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.f124635a, o3Var.f124635a) && Intrinsics.f(this.f124636b, o3Var.f124636b);
    }

    public final int hashCode() {
        int iHashCode = this.f124635a.hashCode() * 31;
        String str = this.f124636b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public o3(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124635a = title;
        this.f124636b = str;
    }
}
