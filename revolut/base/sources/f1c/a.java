package f1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131232a;

    public a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f131232a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f131232a, ((a) obj2).f131232a);
    }

    public final int hashCode() {
        return this.f131232a.hashCode();
    }
}
