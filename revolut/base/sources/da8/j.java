package da8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112482b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f112481a = items;
        this.f112482b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f112481a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f112481a, jVar.f112481a) && this.f112482b == jVar.f112482b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112482b) + (this.f112481a.hashCode() * 31);
    }
}
