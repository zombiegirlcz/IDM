package aeg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3582c;

    public e(List items, d navBarConfig, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f3580a = items;
        this.f3581b = navBarConfig;
        this.f3582c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f3580a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f3580a, eVar.f3580a) && Intrinsics.f(this.f3581b, eVar.f3581b) && this.f3582c == eVar.f3582c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3582c) + p.a.d(this.f3580a.hashCode() * 31, 31, this.f3581b.f3579a);
    }
}
