package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321407b;

    public /* synthetic */ p0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n0.f321401a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321406a = str;
        this.f321407b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f321406a, p0Var.f321406a) && Intrinsics.f(this.f321407b, p0Var.f321407b);
    }

    public final int hashCode() {
        return this.f321407b.hashCode() + (this.f321406a.hashCode() * 31);
    }

    public p0(String value, String icon) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f321406a = value;
        this.f321407b = icon;
    }
}
