package wr1;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f299497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f299498c;

    public m(List items, j8 navBarModel, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f299496a = items;
        this.f299497b = navBarModel;
        this.f299498c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f299496a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f299496a, mVar.f299496a) && Intrinsics.f(this.f299497b, mVar.f299497b) && this.f299498c == mVar.f299498c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f299498c) + ((this.f299497b.hashCode() + (this.f299496a.hashCode() * 31)) * 31);
    }
}
