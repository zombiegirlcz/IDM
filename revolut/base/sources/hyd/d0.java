package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156795c;
    public final String d;
    public final i e;

    public /* synthetic */ d0(int i, String str, String str2, String str3, String str4, i iVar) {
        if (19 != (i & 19)) {
            j1.f(b0.f156789a.getDescriptor(), i, 19);
            throw null;
        }
        this.f156793a = str;
        this.f156794b = str2;
        if ((i & 4) == 0) {
            this.f156795c = null;
        } else {
            this.f156795c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f156793a, d0Var.f156793a) && Intrinsics.f(this.f156794b, d0Var.f156794b) && Intrinsics.f(this.f156795c, d0Var.f156795c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f156793a.hashCode() * 31, 31, this.f156794b);
        String str = this.f156795c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
