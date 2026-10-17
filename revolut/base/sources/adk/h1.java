package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3389b;

    public /* synthetic */ h1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(f1.f3385a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3388a = str;
        this.f3389b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f3388a, h1Var.f3388a) && Intrinsics.f(this.f3389b, h1Var.f3389b);
    }

    public final int hashCode() {
        return this.f3389b.hashCode() + (this.f3388a.hashCode() * 31);
    }

    public h1(String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f3388a = title;
        this.f3389b = icon;
    }
}
