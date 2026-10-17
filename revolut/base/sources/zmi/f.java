package zmi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323525a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f323525a = str;
        } else {
            j1.f(d.f323524a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f323525a, ((f) obj2).f323525a);
    }

    public final int hashCode() {
        return this.f323525a.hashCode();
    }
}
