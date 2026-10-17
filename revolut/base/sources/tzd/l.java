package tzd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275933a;

    public l(String str) {
        this.f275933a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f275933a, ((l) obj2).f275933a);
    }

    public final int hashCode() {
        String str = this.f275933a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
