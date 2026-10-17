package gck;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f142515b;

    public t(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f142514a = z;
        this.f142515b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f142515b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f142514a == tVar.f142514a && Intrinsics.f(this.f142515b, tVar.f142515b);
    }

    public final int hashCode() {
        return this.f142515b.hashCode() + (Boolean.hashCode(this.f142514a) * 31);
    }
}
