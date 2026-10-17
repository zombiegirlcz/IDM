package aj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f5357c;

    public /* synthetic */ i0(int i, String str, String str2, g gVar) {
        if (7 != (i & 7)) {
            j1.f(g0.f5353a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5355a = str;
        this.f5356b = str2;
        this.f5357c = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f5355a, i0Var.f5355a) && Intrinsics.f(this.f5356b, i0Var.f5356b) && Intrinsics.f(this.f5357c, i0Var.f5357c);
    }

    public final int hashCode() {
        int iHashCode = this.f5355a.hashCode() * 31;
        String str = this.f5356b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f5357c;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public i0(String subHeader, String str, g gVar) {
        Intrinsics.checkNotNullParameter(subHeader, "subHeader");
        this.f5355a = subHeader;
        this.f5356b = str;
        this.f5357c = gVar;
    }
}
