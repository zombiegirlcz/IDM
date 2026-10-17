package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f237726b;

    public /* synthetic */ l(int i, String str, h0 h0Var) {
        if (3 != (i & 3)) {
            j1.f(j.f237724a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237725a = str;
        this.f237726b = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f237725a, lVar.f237725a) && Intrinsics.f(this.f237726b, lVar.f237726b);
    }

    public final int hashCode() {
        return this.f237726b.hashCode() + (this.f237725a.hashCode() * 31);
    }

    public l(String code, h0 validityPeriod) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        this.f237725a = code;
        this.f237726b = validityPeriod;
    }
}
