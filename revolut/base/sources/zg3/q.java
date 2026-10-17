package zg3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322068a;

    public /* synthetic */ q(int i, String str) {
        if (1 == (i & 1)) {
            this.f322068a = str;
        } else {
            j1.f(o.f322067a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f322068a, ((q) obj2).f322068a);
    }

    public final int hashCode() {
        return this.f322068a.hashCode();
    }
}
