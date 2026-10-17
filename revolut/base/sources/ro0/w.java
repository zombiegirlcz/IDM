package ro0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f255784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f255785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f255786c;

    public w(int i, int i2, List excludedBounds) {
        Intrinsics.checkNotNullParameter(excludedBounds, "excludedBounds");
        this.f255784a = i;
        this.f255785b = i2;
        this.f255786c = excludedBounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f255784a == wVar.f255784a && this.f255785b == wVar.f255785b && Intrinsics.f(this.f255786c, wVar.f255786c);
    }

    public final int hashCode() {
        return this.f255786c.hashCode() + j6.a.b(this.f255785b, Integer.hashCode(this.f255784a) * 31, 31);
    }
}
