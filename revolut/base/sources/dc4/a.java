package dc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112784a;

    public a(String str) {
        this.f112784a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f112784a, ((a) obj2).f112784a);
    }

    public final int hashCode() {
        String str = this.f112784a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
