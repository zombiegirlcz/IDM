package yv8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317147b;

    public i(boolean z, f0 items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317146a = z;
        this.f317147b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f317147b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f317146a == iVar.f317146a && Intrinsics.f(this.f317147b, iVar.f317147b);
    }

    public final int hashCode() {
        return this.f317147b.hashCode() + (Boolean.hashCode(this.f317146a) * 31);
    }
}
