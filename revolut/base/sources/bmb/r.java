package bmb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f16801b;

    public r(List items, q screenData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        this.f16800a = items;
        this.f16801b = screenData;
    }

    @Override // cli.p
    public final List c() {
        return this.f16800a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f16800a, rVar.f16800a) && Intrinsics.f(this.f16801b, rVar.f16801b);
    }

    public final int hashCode() {
        return this.f16801b.hashCode() + (this.f16800a.hashCode() * 31);
    }
}
