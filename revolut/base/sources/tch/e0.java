package tch;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f269822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f269823b;

    public e0(d0 d0Var, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269822a = d0Var;
        this.f269823b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f269823b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f269822a, e0Var.f269822a) && this.f269823b.equals(e0Var.f269823b);
    }

    public final int hashCode() {
        d0 d0Var = this.f269822a;
        return this.f269823b.hashCode() + ((d0Var == null ? 0 : d0Var.hashCode()) * 31);
    }
}
