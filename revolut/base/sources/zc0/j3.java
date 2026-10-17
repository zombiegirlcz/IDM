package zc0;

import com.revolut.feature.backend_flow.domain.models.EntityType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j3 extends k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityType f321070b;

    public j3(String itemId, EntityType type) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f321069a = itemId;
        this.f321070b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f321069a, j3Var.f321069a) && Intrinsics.f(this.f321070b, j3Var.f321070b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321069a;
    }

    public final int hashCode() {
        return this.f321070b.hashCode() + (this.f321069a.hashCode() * 31);
    }
}
