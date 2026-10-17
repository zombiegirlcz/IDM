package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f120578b;

    public d5(String title, l action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120577a = title;
        this.f120578b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f120577a, d5Var.f120577a) && Intrinsics.f(this.f120578b, d5Var.f120578b);
    }

    public final int hashCode() {
        return this.f120578b.hashCode() + (this.f120577a.hashCode() * 31);
    }
}
