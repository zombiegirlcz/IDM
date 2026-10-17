package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r5 {

    @NotNull
    public static final q5 Companion = new q5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117830b;

    public /* synthetic */ r5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p5.f117810a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117829a = str;
        this.f117830b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj2;
        return Intrinsics.f(this.f117829a, r5Var.f117829a) && Intrinsics.f(this.f117830b, r5Var.f117830b);
    }

    public final int hashCode() {
        return this.f117830b.hashCode() + (this.f117829a.hashCode() * 31);
    }
}
