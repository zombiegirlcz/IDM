package mic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205679a;

    public t(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f205679a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f205679a, ((t) obj2).f205679a);
    }

    public final int hashCode() {
        return this.f205679a.hashCode();
    }
}
