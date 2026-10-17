package l19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191494a;

    public /* synthetic */ e(int i, String str) {
        if (1 == (i & 1)) {
            this.f191494a = str;
        } else {
            j1.f(c.f191493a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f191494a, ((e) obj2).f191494a);
    }

    public final int hashCode() {
        return this.f191494a.hashCode();
    }
}
