package ax4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10886b;

    public k(String str, String displayLabel) {
        Intrinsics.checkNotNullParameter(displayLabel, "displayLabel");
        this.f10885a = str;
        this.f10886b = displayLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f10885a, kVar.f10885a) && Intrinsics.f(this.f10886b, kVar.f10886b);
    }

    public final int hashCode() {
        String str = this.f10885a;
        return this.f10886b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
