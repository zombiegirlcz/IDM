package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ah0 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final koi.j f163447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163448c;

    public ah0(String listId, koi.j innerItem, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(innerItem, "innerItem");
        this.f163446a = listId;
        this.f163447b = innerItem;
        this.f163448c = z;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53082a() {
        return this.f163446a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ah0)) {
            return false;
        }
        ah0 ah0Var = (ah0) obj2;
        return Intrinsics.f(this.f163446a, ah0Var.f163446a) && Intrinsics.f(this.f163447b, ah0Var.f163447b) && this.f163448c == ah0Var.f163448c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163448c) + ((this.f163447b.hashCode() + (this.f163446a.hashCode() * 31)) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        ah0 ah0Var = oldItem instanceof ah0 ? (ah0) oldItem : null;
        if (ah0Var == null) {
            return null;
        }
        return new bh0(this.f163447b.z(ah0Var.f163447b), this.f163448c != ah0Var.f163448c);
    }
}
