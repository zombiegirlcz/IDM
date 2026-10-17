package qn9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247883a;

    public h(String str) {
        this.f247883a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f247883a, ((h) obj2).f247883a);
    }

    public final int hashCode() {
        String str = this.f247883a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
