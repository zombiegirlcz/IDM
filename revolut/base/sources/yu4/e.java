package yu4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f316879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f316880b;

    public e(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f316879a = items;
        this.f316880b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f316879a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f316879a, eVar.f316879a) && this.f316880b == eVar.f316880b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316880b) + (this.f316879a.hashCode() * 31);
    }
}
