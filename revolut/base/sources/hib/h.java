package hib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152579a;

    public h(String str) {
        this.f152579a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f152579a, ((h) obj2).f152579a);
    }

    public final int hashCode() {
        String str = this.f152579a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
