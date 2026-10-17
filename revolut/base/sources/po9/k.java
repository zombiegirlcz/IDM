package po9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237917a;

    public /* synthetic */ k(int i, String str) {
        if (1 == (i & 1)) {
            this.f237917a = str;
        } else {
            j1.f(i.f237916a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f237917a, ((k) obj2).f237917a);
    }

    public final int hashCode() {
        return this.f237917a.hashCode();
    }
}
