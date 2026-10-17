package ewh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130270a;

    public h(String linkUrl) {
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        this.f130270a = linkUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f130270a, ((h) obj2).f130270a);
    }

    public final int hashCode() {
        return this.f130270a.hashCode();
    }
}
