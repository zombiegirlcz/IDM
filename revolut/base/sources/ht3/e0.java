package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f155266b;

    public e0(String id10, f0 action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f155265a = id10;
        this.f155266b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f155265a, e0Var.f155265a) && Intrinsics.f(this.f155266b, e0Var.f155266b);
    }

    public final int hashCode() {
        return this.f155266b.hashCode() + (this.f155265a.hashCode() * 31);
    }
}
