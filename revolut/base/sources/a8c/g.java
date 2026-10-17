package a8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2162a;

    public g(String str) {
        this.f2162a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f2162a, ((g) obj2).f2162a);
    }

    public final int hashCode() {
        String str = this.f2162a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
