package qw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f249726b;

    public b(Clause title, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f249725a = listId;
        this.f249726b = title;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53082a() {
        return this.f249725a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f249725a, bVar.f249725a) && this.f249726b.equals(bVar.f249726b);
    }

    public final int hashCode() {
        return this.f249726b.hashCode() + (this.f249725a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof b ? (b) oldItem : null) != null) {
            return new a(!((b) oldItem).f249726b.equals(this.f249726b));
        }
        return null;
    }
}
