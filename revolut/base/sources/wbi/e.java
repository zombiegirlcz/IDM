package wbi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f296223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f296224b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296223a = items;
        this.f296224b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f296223a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f296223a, eVar.f296223a) && this.f296224b == eVar.f296224b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f296224b) + (this.f296223a.hashCode() * 31);
    }
}
