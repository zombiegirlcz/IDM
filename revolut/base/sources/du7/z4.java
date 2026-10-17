package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z4 {

    @NotNull
    public static final y4 Companion = new y4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117930c;
    public final v4 d;

    public /* synthetic */ z4(int i, String str, String str2, String str3, v4 v4Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(x4.f117900a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117928a = str;
        this.f117929b = str2;
        this.f117930c = str3;
        this.d = v4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj2;
        return Intrinsics.f(this.f117928a, z4Var.f117928a) && Intrinsics.f(this.f117929b, z4Var.f117929b) && Intrinsics.f(this.f117930c, z4Var.f117930c) && Intrinsics.f(this.d, z4Var.d);
    }

    public final int hashCode() {
        String str = this.f117928a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117929b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117930c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        v4 v4Var = this.d;
        return iHashCode3 + (v4Var != null ? v4Var.hashCode() : 0);
    }
}
