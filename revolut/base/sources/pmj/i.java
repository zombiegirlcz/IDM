package pmj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f237602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f237603b;

    public i(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f237602a = title;
        this.f237603b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f237602a.equals(iVar.f237602a) && this.f237603b.equals(iVar.f237603b);
    }

    public final int hashCode() {
        return this.f237603b.hashCode() + (this.f237602a.hashCode() * 31);
    }
}
