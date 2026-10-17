package a2g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f844c;

    public l(List items, i navBarConfig, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f842a = items;
        this.f843b = navBarConfig;
        this.f844c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f842a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f842a, lVar.f842a) && Intrinsics.f(this.f843b, lVar.f843b) && this.f844c == lVar.f844c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f844c) + p.a.d(this.f842a.hashCode() * 31, 31, this.f843b.f839a);
    }
}
