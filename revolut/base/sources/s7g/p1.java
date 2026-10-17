package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7g.o f260782b;

    public /* synthetic */ p1(int i, String str, t7g.o oVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(n1.f260768a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260781a = str;
        this.f260782b = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f260781a, p1Var.f260781a) && Intrinsics.f(this.f260782b, p1Var.f260782b);
    }

    public final int hashCode() {
        return this.f260782b.hashCode() + (this.f260781a.hashCode() * 31);
    }

    public p1(String name, t7g.o phoneNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f260781a = name;
        this.f260782b = phoneNumber;
    }
}
