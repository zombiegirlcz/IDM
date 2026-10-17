package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188558b;

    public /* synthetic */ p1(float f, int i, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(n1.f188539a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188557a = str;
        this.f188558b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f188557a, p1Var.f188557a) && Float.compare(this.f188558b, p1Var.f188558b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f188558b) + (this.f188557a.hashCode() * 31);
    }

    public p1(String name, float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f188557a = name;
        this.f188558b = f;
    }
}
