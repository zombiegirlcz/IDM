package ku8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.l f189755a;

    public v(my8.l document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f189755a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f189755a, ((v) obj2).f189755a);
    }

    public final int hashCode() {
        return this.f189755a.hashCode();
    }
}
