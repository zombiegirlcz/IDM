package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n3 extends k3 {

    @NotNull
    public static final m3 Companion = new m3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117786a;

    public n3(int i, String str) {
        if (1 == (i & 1)) {
            this.f117786a = str;
        } else {
            qlm.j1.f(l3.f117743a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n3) && Intrinsics.f(this.f117786a, ((n3) obj2).f117786a);
    }

    public final int hashCode() {
        return this.f117786a.hashCode();
    }
}
