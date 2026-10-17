package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236992c;
    public final p0 d;

    public /* synthetic */ s0(int i, String str, String str2, String str3, p0 p0Var) {
        if (15 != (i & 15)) {
            j1.f(q0.f236986a.getDescriptor(), i, 15);
            throw null;
        }
        this.f236990a = str;
        this.f236991b = str2;
        this.f236992c = str3;
        this.d = p0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f236990a, s0Var.f236990a) && Intrinsics.f(this.f236991b, s0Var.f236991b) && Intrinsics.f(this.f236992c, s0Var.f236992c) && Intrinsics.f(this.d, s0Var.d);
    }

    public final int hashCode() {
        String str = this.f236990a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f236991b);
        String str2 = this.f236992c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        p0 p0Var = this.d;
        return iHashCode + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public s0(String str, String text, String str2, p0 p0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f236990a = str;
        this.f236991b = text;
        this.f236992c = str2;
        this.d = p0Var;
    }
}
