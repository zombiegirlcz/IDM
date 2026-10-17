package tx0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d1 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f275101b;

    public d1(String listId, z0 page) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f275100a = listId;
        this.f275101b = page;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59236a() {
        return this.f275100a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f275100a, d1Var.f275100a) && Intrinsics.f(this.f275101b, d1Var.f275101b);
    }

    public final int hashCode() {
        return this.f275101b.hashCode() + (this.f275100a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof d1) {
            return Unit.f186387a;
        }
        return null;
    }
}
