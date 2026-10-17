package xg3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305496a;

    public /* synthetic */ m(int i, String str) {
        if (1 == (i & 1)) {
            this.f305496a = str;
        } else {
            j1.f(k.f305495a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f305496a, ((m) obj2).f305496a);
    }

    public final int hashCode() {
        return this.f305496a.hashCode();
    }
}
