package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300866b;

    public j(String value, String deeplink) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f300865a = value;
        this.f300866b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f300865a, jVar.f300865a) && Intrinsics.f(this.f300866b, jVar.f300866b);
    }

    public final int hashCode() {
        return this.f300866b.hashCode() + (this.f300865a.hashCode() * 31);
    }
}
