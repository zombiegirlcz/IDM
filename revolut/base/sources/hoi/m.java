package hoi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final koi.b f154332b;

    public m(String key, koi.b headerHolder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headerHolder, "headerHolder");
        this.f154331a = key;
        this.f154332b = headerHolder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f154331a, mVar.f154331a) && Intrinsics.f(this.f154332b, mVar.f154332b);
    }

    public final int hashCode() {
        return this.f154332b.hashCode() + (this.f154331a.hashCode() * 31);
    }
}
