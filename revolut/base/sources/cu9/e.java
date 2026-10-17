package cu9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108919a;

    public e(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f108919a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f108919a, ((e) obj2).f108919a);
    }

    public final int hashCode() {
        return this.f108919a.hashCode();
    }
}
