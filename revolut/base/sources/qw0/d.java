package qw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f249730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f249731c;

    public d(Clause name, Clause value, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f249729a = listId;
        this.f249730b = name;
        this.f249731c = value;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52148b() {
        return this.f249729a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f249729a, dVar.f249729a) && this.f249730b.equals(dVar.f249730b) && this.f249731c.equals(dVar.f249731c);
    }

    public final int hashCode() {
        return this.f249731c.hashCode() + p.a.b(this.f249729a.hashCode() * 31, 31, this.f249730b);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof d ? (d) oldItem : null) == null) {
            return null;
        }
        d dVar = (d) oldItem;
        return new c(!dVar.f249730b.equals(this.f249730b), !dVar.f249731c.equals(this.f249731c));
    }
}
