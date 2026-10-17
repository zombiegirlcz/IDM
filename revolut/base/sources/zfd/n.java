package zfd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321939a;

    public n(String str) {
        this.f321939a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f321939a, ((n) obj2).f321939a);
    }

    public final int hashCode() {
        String str = this.f321939a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
