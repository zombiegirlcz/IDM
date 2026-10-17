package n0f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211029b;

    public l(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f211028a = items;
        this.f211029b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f211028a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f211028a, lVar.f211028a) && this.f211029b == lVar.f211029b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211029b) + (this.f211028a.hashCode() * 31);
    }
}
