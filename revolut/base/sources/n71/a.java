package n71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212973b;

    public a(String key, String transferTime) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(transferTime, "transferTime");
        this.f212972a = key;
        this.f212973b = transferTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f212972a, aVar.f212972a) && Intrinsics.f(this.f212973b, aVar.f212973b);
    }

    public final int hashCode() {
        return this.f212973b.hashCode() + (this.f212972a.hashCode() * 31);
    }
}
