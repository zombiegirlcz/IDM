package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k7 {

    @NotNull
    public static final j7 Companion = new j7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117738b;

    public /* synthetic */ k7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(i7.f117722a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117737a = str;
        this.f117738b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj2;
        return Intrinsics.f(this.f117737a, k7Var.f117737a) && Intrinsics.f(this.f117738b, k7Var.f117738b);
    }

    public final int hashCode() {
        return this.f117738b.hashCode() + (this.f117737a.hashCode() * 31);
    }
}
