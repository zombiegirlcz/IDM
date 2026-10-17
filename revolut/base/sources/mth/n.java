package mth;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f208837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f208838c;

    public n(Clause clause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208836a = items;
        this.f208837b = z;
        this.f208838c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f208836a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f208836a, nVar.f208836a) && this.f208837b == nVar.f208837b && Intrinsics.f(this.f208838c, nVar.f208838c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f208836a.hashCode() * 31, 31, this.f208837b);
        Clause clause = this.f208838c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
