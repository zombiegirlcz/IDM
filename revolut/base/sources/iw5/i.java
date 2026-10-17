package iw5;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f168967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168968b;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f168967a, iVar.f168967a) && this.f168968b == iVar.f168968b;
    }

    public final int hashCode() {
        Clause clause = this.f168967a;
        return Boolean.hashCode(this.f168968b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }

    public /* synthetic */ i(int i) {
        this(null, false);
    }

    public i(Clause clause, boolean z) {
        this.f168967a = clause;
        this.f168968b = z;
    }
}
