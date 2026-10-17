package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16031a;

    public /* synthetic */ n1(int i, String str) {
        if (1 == (i & 1)) {
            this.f16031a = str;
        } else {
            qlm.j1.f(l1.f16017a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n1) && Intrinsics.f(this.f16031a, ((n1) obj2).f16031a);
    }

    public final int hashCode() {
        return this.f16031a.hashCode();
    }
}
