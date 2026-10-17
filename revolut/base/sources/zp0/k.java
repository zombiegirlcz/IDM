package zp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f324125c;
    public final String d;

    public k(String formattedText, String extractedText, int i, String str) {
        Intrinsics.checkNotNullParameter(formattedText, "formattedText");
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        this.f324123a = formattedText;
        this.f324124b = extractedText;
        this.f324125c = i;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f324123a, kVar.f324123a) && Intrinsics.f(this.f324124b, kVar.f324124b) && this.f324125c == kVar.f324125c && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f324125c, p.a.c(this.f324123a.hashCode() * 31, 31, this.f324124b), 31);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
