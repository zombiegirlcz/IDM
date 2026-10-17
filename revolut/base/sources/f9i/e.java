package f9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132978b;

    public e(String url2, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f132977a = url2;
        this.f132978b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f132977a, eVar.f132977a) && this.f132978b == eVar.f132978b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132978b) + (this.f132977a.hashCode() * 31);
    }
}
