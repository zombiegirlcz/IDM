package mwg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f209448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f209449c;

    public d(String asset, dj0.d value, float f) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f209447a = asset;
        this.f209448b = value;
        this.f209449c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f209447a, dVar.f209447a) && Intrinsics.f(this.f209448b, dVar.f209448b) && Float.compare(this.f209449c, dVar.f209449c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f209449c) + v7.c(this.f209447a.hashCode() * 31, 31, this.f209448b);
    }
}
