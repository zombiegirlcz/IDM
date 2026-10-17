package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w2 extends t2 {

    @NotNull
    public static final v2 Companion = new v2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117890a;

    public w2(int i, String str) {
        if (1 == (i & 1)) {
            this.f117890a = str;
        } else {
            qlm.j1.f(u2.f117864a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w2) && Intrinsics.f(this.f117890a, ((w2) obj2).f117890a);
    }

    public final int hashCode() {
        return this.f117890a.hashCode();
    }
}
