package njb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216434a;

    public a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f216434a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f216434a, ((a) obj2).f216434a);
    }

    public final int hashCode() {
        return this.f216434a.hashCode();
    }
}
