package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d8 {

    @NotNull
    public static final c8 Companion = new c8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153070c;
    public final pa d;
    public final boolean e;

    public /* synthetic */ d8(int i, String str, String str2, String str3, pa paVar, boolean z) {
        if (31 != (i & 31)) {
            qlm.j1.f(b8.f153038a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153068a = str;
        this.f153069b = str2;
        this.f153070c = str3;
        this.d = paVar;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj2;
        return Intrinsics.f(this.f153068a, d8Var.f153068a) && Intrinsics.f(this.f153069b, d8Var.f153069b) && Intrinsics.f(this.f153070c, d8Var.f153070c) && Intrinsics.f(this.d, d8Var.d) && this.e == d8Var.e;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f153068a.hashCode() * 31, 31, this.f153069b), 31, this.f153070c);
        pa paVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (paVar == null ? 0 : paVar.hashCode())) * 31);
    }
}
