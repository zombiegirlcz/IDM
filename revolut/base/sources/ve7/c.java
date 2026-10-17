package ve7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c implements k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288135a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f288135a = str;
        } else {
            j1.f(a.f288134a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f288135a, ((c) obj2).f288135a);
    }

    public final int hashCode() {
        return this.f288135a.hashCode();
    }
}
