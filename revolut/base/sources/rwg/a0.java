package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257907c;
    public final i d;

    public /* synthetic */ a0(int i, String str, String str2, String str3, i iVar) {
        if (15 != (i & 15)) {
            j1.f(y.f257949a.getDescriptor(), i, 15);
            throw null;
        }
        this.f257905a = str;
        this.f257906b = str2;
        this.f257907c = str3;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f257905a, a0Var.f257905a) && Intrinsics.f(this.f257906b, a0Var.f257906b) && Intrinsics.f(this.f257907c, a0Var.f257907c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f257905a.hashCode() * 31, 31, this.f257906b), 31, this.f257907c);
        i iVar = this.d;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
