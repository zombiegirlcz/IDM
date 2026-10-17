package w7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f295539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295540b;

    public /* synthetic */ o(int i, boolean z, String str) {
        if (3 != (i & 3)) {
            j1.f(m.f295538a.getDescriptor(), i, 3);
            throw null;
        }
        this.f295539a = z;
        this.f295540b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f295539a == oVar.f295539a && Intrinsics.f(this.f295540b, oVar.f295540b);
    }

    public final int hashCode() {
        return this.f295540b.hashCode() + (Boolean.hashCode(this.f295539a) * 31);
    }
}
