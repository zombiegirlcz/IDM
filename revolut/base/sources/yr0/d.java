package yr0;

import com.revolut.core.ui_kit.internal.popups.PopupMenuSectionHeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f316058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f316059c;

    public d(Clause title, String listId, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f316057a = listId;
        this.f316058b = title;
        this.f316059c = z;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PopupMenuSectionHeaderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55208b() {
        return this.f316057a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f316057a, dVar.f316057a) && Intrinsics.f(this.f316058b, dVar.f316058b) && this.f316059c == dVar.f316059c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316059c) + p.a.a(this.f316057a.hashCode() * 31, 31, this.f316058b);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof d ? (d) oldItem : null) == null) {
            return null;
        }
        return new e(!Intrinsics.f(r5.f316058b, this.f316058b), ((d) oldItem).f316059c != this.f316059c);
    }
}
