package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201365b;

    public g(String str, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f201364a = str;
        this.f201365b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f201364a, gVar.f201364a) && Intrinsics.f(this.f201365b, gVar.f201365b);
    }

    public final int hashCode() {
        String str = this.f201364a;
        return this.f201365b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
