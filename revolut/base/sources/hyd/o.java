package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f156819b;

    public /* synthetic */ o(int i, String str, j0 j0Var) {
        if (3 != (i & 3)) {
            j1.f(m.f156813a.getDescriptor(), i, 3);
            throw null;
        }
        this.f156818a = str;
        this.f156819b = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f156818a, oVar.f156818a) && Intrinsics.f(this.f156819b, oVar.f156819b);
    }

    public final int hashCode() {
        return this.f156819b.hashCode() + (this.f156818a.hashCode() * 31);
    }
}
