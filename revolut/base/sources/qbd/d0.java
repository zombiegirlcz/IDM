package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f244176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244178c;

    public /* synthetic */ d0(double d, int i, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(b0.f244174a.getDescriptor(), i, 7);
            throw null;
        }
        this.f244176a = d;
        this.f244177b = str;
        this.f244178c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Double.compare(this.f244176a, d0Var.f244176a) == 0 && Intrinsics.f(this.f244177b, d0Var.f244177b) && Intrinsics.f(this.f244178c, d0Var.f244178c);
    }

    public final int hashCode() {
        return this.f244178c.hashCode() + p.a.c(Double.hashCode(this.f244176a) * 31, 31, this.f244177b);
    }

    public d0(double d, String suffix, String type) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f244176a = d;
        this.f244177b = suffix;
        this.f244178c = type;
    }
}
