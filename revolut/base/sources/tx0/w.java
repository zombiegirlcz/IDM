package tx0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f275255b;

    public w(String listId, r model) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f275254a = listId;
        this.f275255b = model;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f275254a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f275254a, wVar.f275254a) && Intrinsics.f(this.f275255b, wVar.f275255b);
    }

    public final int hashCode() {
        return this.f275255b.hashCode() + (this.f275254a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return Unit.f186387a;
    }
}
