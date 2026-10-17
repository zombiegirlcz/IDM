package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j2 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120640a;

    public j2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f120640a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j2) && Intrinsics.f(this.f120640a, ((j2) obj2).f120640a);
    }

    public final int hashCode() {
        return this.f120640a.hashCode();
    }
}
