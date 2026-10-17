package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f257915c;

    public /* synthetic */ d0(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            j1.f(b0.f257908a.getDescriptor(), i, 7);
            throw null;
        }
        this.f257913a = str;
        this.f257914b = str2;
        this.f257915c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f257913a, d0Var.f257913a) && Intrinsics.f(this.f257914b, d0Var.f257914b) && this.f257915c == d0Var.f257915c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257915c) + p.a.c(this.f257913a.hashCode() * 31, 31, this.f257914b);
    }
}
