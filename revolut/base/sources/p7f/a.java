package p7f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233755a;

    public a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f233755a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f233755a, ((a) obj2).f233755a);
    }

    public final int hashCode() {
        return this.f233755a.hashCode();
    }
}
