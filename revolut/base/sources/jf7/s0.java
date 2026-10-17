package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173709c;
    public final String d;

    public /* synthetic */ s0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(q0.f173702a.getDescriptor(), i, 15);
            throw null;
        }
        this.f173707a = str;
        this.f173708b = str2;
        this.f173709c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f173707a, s0Var.f173707a) && Intrinsics.f(this.f173708b, s0Var.f173708b) && Intrinsics.f(this.f173709c, s0Var.f173709c) && Intrinsics.f(this.d, s0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f173707a.hashCode() * 31;
        String str = this.f173708b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f173709c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
