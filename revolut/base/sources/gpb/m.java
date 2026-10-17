package gpb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f145420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145421b;

    public m(l header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145420a = header;
        this.f145421b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f145421b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f145420a, mVar.f145420a) && Intrinsics.f(this.f145421b, mVar.f145421b);
    }

    public final int hashCode() {
        return this.f145421b.hashCode() + (this.f145420a.hashCode() * 31);
    }
}
