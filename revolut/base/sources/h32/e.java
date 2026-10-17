package h32;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149008b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f149007a = items;
        this.f149008b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f149007a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149007a, eVar.f149007a) && this.f149008b == eVar.f149008b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149008b) + (this.f149007a.hashCode() * 31);
    }
}
