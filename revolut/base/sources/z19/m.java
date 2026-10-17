package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318786c;

    public m(String title, String value, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f318784a = title;
        this.f318785b = value;
        this.f318786c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f318784a, mVar.f318784a) && Intrinsics.f(this.f318785b, mVar.f318785b) && Intrinsics.f(this.f318786c, mVar.f318786c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318784a.hashCode() * 31, 31, this.f318785b);
        String str = this.f318786c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
