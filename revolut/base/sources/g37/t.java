package g37;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f140228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f140229b;

    public t(s headerState, aim.e items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140228a = headerState;
        this.f140229b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f140229b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f140228a, tVar.f140228a) && Intrinsics.f(this.f140229b, tVar.f140229b);
    }

    public final int hashCode() {
        return this.f140229b.hashCode() + (this.f140228a.hashCode() * 31);
    }
}
