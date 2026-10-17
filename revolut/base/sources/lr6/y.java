package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199423a;

    public y(String str) {
        this.f199423a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f199423a, ((y) obj2).f199423a);
    }

    public final int hashCode() {
        String str = this.f199423a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
