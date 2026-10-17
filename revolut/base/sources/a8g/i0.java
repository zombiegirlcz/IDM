package a8g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2224b;

    public /* synthetic */ i0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g0.f2221a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2223a = str;
        this.f2224b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f2223a, i0Var.f2223a) && Intrinsics.f(this.f2224b, i0Var.f2224b);
    }

    public final int hashCode() {
        return this.f2224b.hashCode() + (this.f2223a.hashCode() * 31);
    }

    public i0(String code, String type) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f2223a = code;
        this.f2224b = type;
    }
}
