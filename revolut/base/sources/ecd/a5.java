package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a5 {

    @NotNull
    public static final z4 Companion = new z4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124492b;

    public /* synthetic */ a5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(y4.f124714a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124491a = str;
        this.f124492b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj2;
        return Intrinsics.f(this.f124491a, a5Var.f124491a) && Intrinsics.f(this.f124492b, a5Var.f124492b);
    }

    public final int hashCode() {
        return this.f124492b.hashCode() + (this.f124491a.hashCode() * 31);
    }

    public a5(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f124491a = title;
        this.f124492b = deeplink;
    }
}
