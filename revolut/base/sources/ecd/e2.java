package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e2 {

    @NotNull
    public static final d2 Companion = new d2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124536b;

    public /* synthetic */ e2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(c2.f124505a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124535a = str;
        this.f124536b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f124535a, e2Var.f124535a) && Intrinsics.f(this.f124536b, e2Var.f124536b);
    }

    public final int hashCode() {
        int iHashCode = this.f124535a.hashCode() * 31;
        String str = this.f124536b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public e2(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124535a = title;
        this.f124536b = str;
    }
}
