package gh7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f143867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f143868b;

    public m(k name, l value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f143867a = name;
        this.f143868b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f143867a, mVar.f143867a) && this.f143868b == mVar.f143868b;
    }

    public final int hashCode() {
        return this.f143868b.hashCode() + (this.f143867a.hashCode() * 31);
    }
}
