package hx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c93.e f156369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f156370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156371c;
    public final String d;

    public l(c93.e cardType, h infoVariant, boolean z, String str) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(infoVariant, "infoVariant");
        this.f156369a = cardType;
        this.f156370b = infoVariant;
        this.f156371c = z;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f156369a == lVar.f156369a && this.f156370b == lVar.f156370b && this.f156371c == lVar.f156371c && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f156370b.hashCode() + (this.f156369a.hashCode() * 31)) * 31, 31, this.f156371c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
