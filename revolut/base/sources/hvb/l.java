package hvb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155808a;

    public /* synthetic */ l(int i, String str) {
        if (1 == (i & 1)) {
            this.f155808a = str;
        } else {
            j1.f(j.f155807a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f155808a, ((l) obj2).f155808a);
    }

    public final int hashCode() {
        return this.f155808a.hashCode();
    }
}
