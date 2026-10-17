package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117689c;

    public /* synthetic */ h0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(f0.f117669a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117687a = str;
        this.f117688b = str2;
        this.f117689c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f117687a, h0Var.f117687a) && Intrinsics.f(this.f117688b, h0Var.f117688b) && Intrinsics.f(this.f117689c, h0Var.f117689c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117687a.hashCode() * 31, 31, this.f117688b);
        String str = this.f117689c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
