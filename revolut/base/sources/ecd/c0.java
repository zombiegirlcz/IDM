package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124504b;

    public /* synthetic */ c0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a0.f124481a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124503a = str;
        this.f124504b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f124503a, c0Var.f124503a) && Intrinsics.f(this.f124504b, c0Var.f124504b);
    }

    public final int hashCode() {
        int iHashCode = this.f124503a.hashCode() * 31;
        String str = this.f124504b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public c0(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124503a = title;
        this.f124504b = str;
    }
}
