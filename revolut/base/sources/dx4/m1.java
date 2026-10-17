package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f120676b;

    public m1(String id10, l action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120675a = id10;
        this.f120676b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f120675a, m1Var.f120675a) && Intrinsics.f(this.f120676b, m1Var.f120676b);
    }

    public final int hashCode() {
        return this.f120676b.hashCode() + (this.f120675a.hashCode() * 31);
    }
}
