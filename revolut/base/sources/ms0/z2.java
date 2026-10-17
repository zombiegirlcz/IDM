package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 extends y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208501a;

    public z2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f208501a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z2) && Intrinsics.f(this.f208501a, ((z2) obj2).f208501a);
    }

    public final int hashCode() {
        return this.f208501a.hashCode();
    }
}
