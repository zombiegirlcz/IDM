package eyj;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f130868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f130869b;

    public e(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130868a = z;
        this.f130869b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f130869b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f130868a == eVar.f130868a && Intrinsics.f(this.f130869b, eVar.f130869b);
    }

    public final int hashCode() {
        return this.f130869b.hashCode() + (Boolean.hashCode(this.f130868a) * 31);
    }
}
