package zc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f321039b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f321038a = items;
        this.f321039b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f321038a, eVar.f321038a) && this.f321039b == eVar.f321039b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321039b) + (this.f321038a.hashCode() * 31);
    }
}
