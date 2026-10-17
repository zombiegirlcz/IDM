package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendEntityItem f321081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl2.r f321082b;

    public l3(BackendEntityItem item, xl2.r entity) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.f321081a = item;
        this.f321082b = entity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj2;
        return Intrinsics.f(this.f321081a, l3Var.f321081a) && Intrinsics.f(this.f321082b, l3Var.f321082b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321081a.getF63467a();
    }

    public final int hashCode() {
        return this.f321082b.hashCode() + (this.f321081a.hashCode() * 31);
    }
}
