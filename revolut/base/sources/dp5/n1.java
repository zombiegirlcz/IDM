package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116786a;

    public /* synthetic */ n1(int i, String str) {
        if (1 == (i & 1)) {
            this.f116786a = str;
        } else {
            qlm.j1.f(l1.f116778a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n1) && Intrinsics.f(this.f116786a, ((n1) obj2).f116786a);
    }

    public final int hashCode() {
        String str = this.f116786a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public n1(String str) {
        this.f116786a = str;
    }
}
