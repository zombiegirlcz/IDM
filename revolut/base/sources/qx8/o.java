package qx8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f250042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f250043b;

    public o(boolean z, f0 items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f250042a = z;
        this.f250043b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f250043b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f250042a == oVar.f250042a && Intrinsics.f(this.f250043b, oVar.f250043b);
    }

    public final int hashCode() {
        return this.f250043b.hashCode() + (Boolean.hashCode(this.f250042a) * 31);
    }
}
