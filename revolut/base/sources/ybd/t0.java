package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312276b;

    public /* synthetic */ t0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(r0.f312272a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312275a = str;
        this.f312276b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f312275a, t0Var.f312275a) && Intrinsics.f(this.f312276b, t0Var.f312276b);
    }

    public final int hashCode() {
        int iHashCode = this.f312275a.hashCode() * 31;
        String str = this.f312276b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public t0(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f312275a = text;
        this.f312276b = str;
    }
}
