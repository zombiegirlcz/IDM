package ip0;

import com.revolut.core.ui_kit.delegates.ProfileItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t30 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166429c;

    public t30(Clause topText, Clause bottomText, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(topText, "topText");
        Intrinsics.checkNotNullParameter(bottomText, "bottomText");
        this.f166427a = listId;
        this.f166428b = topText;
        this.f166429c = bottomText;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProfileItemDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51809a() {
        return this.f166427a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj2;
        return Intrinsics.f(this.f166427a, t30Var.f166427a) && Intrinsics.f(this.f166428b, t30Var.f166428b) && Intrinsics.f(this.f166429c, t30Var.f166429c);
    }

    public final int hashCode() {
        return this.f166429c.hashCode() + p.a.a(this.f166427a.hashCode() * 31, 31, this.f166428b);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof t30)) {
            return null;
        }
        t30 t30Var = (t30) oldItem;
        return new u30(!Intrinsics.f(this.f166428b, t30Var.f166428b), !Intrinsics.f(this.f166429c, t30Var.f166429c));
    }
}
