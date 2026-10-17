package u10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276308b;

    public m(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f276307a = key;
        this.f276308b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f276307a, mVar.f276307a) && Intrinsics.f(this.f276308b, mVar.f276308b);
    }

    public final int hashCode() {
        return this.f276308b.hashCode() + (this.f276307a.hashCode() * 31);
    }
}
