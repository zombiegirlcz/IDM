package n4d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogd.d f212350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f212351b;

    public c(List assetTypeKeys, ogd.d sortingOption) {
        Intrinsics.checkNotNullParameter(sortingOption, "sortingOption");
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        this.f212350a = sortingOption;
        this.f212351b = assetTypeKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f212350a == cVar.f212350a && Intrinsics.f(this.f212351b, cVar.f212351b);
    }

    public final int hashCode() {
        return this.f212351b.hashCode() + (this.f212350a.hashCode() * 31);
    }
}
