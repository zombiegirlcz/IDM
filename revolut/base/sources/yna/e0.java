package yna;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f315333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f315334b;

    public e0(d0 d0Var, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f315333a = d0Var;
        this.f315334b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f315334b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f315333a.equals(e0Var.f315333a) && this.f315334b.equals(e0Var.f315334b);
    }

    public final int hashCode() {
        return this.f315334b.hashCode() + (this.f315333a.hashCode() * 31);
    }
}
