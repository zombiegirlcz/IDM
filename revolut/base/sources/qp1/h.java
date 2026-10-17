package qp1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248236a;

    public h(String str) {
        this.f248236a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f248236a, ((h) obj2).f248236a);
    }

    public final int hashCode() {
        String str = this.f248236a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
