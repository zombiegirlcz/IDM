package cw5;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f109538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f109539c;

    public c(String ref2, d assetType, BigDecimal volumeChange) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(volumeChange, "volumeChange");
        this.f109537a = ref2;
        this.f109538b = assetType;
        this.f109539c = volumeChange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f109537a, cVar.f109537a) && this.f109538b == cVar.f109538b && Intrinsics.f(this.f109539c, cVar.f109539c);
    }

    public final int hashCode() {
        return this.f109539c.hashCode() + ((this.f109538b.hashCode() + (this.f109537a.hashCode() * 31)) * 31);
    }
}
