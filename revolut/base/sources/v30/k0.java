package v30;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f285802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f285803c;
    public final int d;
    public final ekd.i e;

    public k0(String id10, Clause pill, Clause prompt, int i, ekd.i iVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pill, "pill");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f285801a = id10;
        this.f285802b = pill;
        this.f285803c = prompt;
        this.d = i;
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f285801a, k0Var.f285801a) && Intrinsics.f(this.f285802b, k0Var.f285802b) && Intrinsics.f(this.f285803c, k0Var.f285803c) && this.d == k0Var.d && Intrinsics.f(this.e, k0Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.b(p.a.b(this.f285801a.hashCode() * 31, 31, this.f285802b), 31, this.f285803c), 31);
        ekd.i iVar = this.e;
        return iB + (iVar == null ? 0 : iVar.hashCode());
    }
}
