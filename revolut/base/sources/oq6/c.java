package oq6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f227754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f227755b;

    public c(dj0.d currentValue, dj0.d maxValue) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.f227754a = currentValue;
        this.f227755b = maxValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f227754a, cVar.f227754a) && Intrinsics.f(this.f227755b, cVar.f227755b);
    }

    public final int hashCode() {
        return this.f227755b.hashCode() + (this.f227754a.hashCode() * 31);
    }
}
