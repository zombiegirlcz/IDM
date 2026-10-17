package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class z3 {

    @NotNull
    public static final y3 Companion = new y3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3 f216093b;

    public /* synthetic */ z3(int i, String str, r3 r3Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(x3.f216070a.getDescriptor(), i, 3);
            throw null;
        }
        this.f216092a = str;
        this.f216093b = r3Var;
    }

    public final String a() {
        return this.f216092a;
    }

    public final r3 b() {
        return this.f216093b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f216092a, z3Var.f216092a) && Intrinsics.f(this.f216093b, z3Var.f216093b);
    }

    public final int hashCode() {
        return this.f216093b.hashCode() + (this.f216092a.hashCode() * 31);
    }

    public z3(String title, r3 value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f216092a = title;
        this.f216093b = value;
    }
}
