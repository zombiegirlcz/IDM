package gr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145785a;

    public /* synthetic */ m(int i, String str) {
        if (1 == (i & 1)) {
            this.f145785a = str;
        } else {
            j1.f(k.f145784a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f145785a, ((m) obj2).f145785a);
    }

    public final int hashCode() {
        return this.f145785a.hashCode();
    }
}
