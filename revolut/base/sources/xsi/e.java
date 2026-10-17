package xsi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f308529b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308528a = items;
        this.f308529b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f308528a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f308528a, eVar.f308528a) && this.f308529b == eVar.f308529b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f308529b) + (this.f308528a.hashCode() * 31);
    }
}
