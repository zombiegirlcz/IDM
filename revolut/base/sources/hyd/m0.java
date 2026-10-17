package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156816c;

    public /* synthetic */ m0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(k0.f156809a.getDescriptor(), i, 7);
            throw null;
        }
        this.f156814a = str;
        this.f156815b = str2;
        this.f156816c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f156814a, m0Var.f156814a) && Intrinsics.f(this.f156815b, m0Var.f156815b) && Intrinsics.f(this.f156816c, m0Var.f156816c);
    }

    public final int hashCode() {
        return this.f156816c.hashCode() + p.a.c(this.f156814a.hashCode() * 31, 31, this.f156815b);
    }
}
