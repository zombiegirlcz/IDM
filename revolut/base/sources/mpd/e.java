package mpd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207792b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f207791a = items;
        this.f207792b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f207791a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f207791a, eVar.f207791a) && this.f207792b == eVar.f207792b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207792b) + (this.f207791a.hashCode() * 31);
    }
}
