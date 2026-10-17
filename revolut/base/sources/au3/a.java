package au3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9466b;

    public a(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9465a = title;
        this.f9466b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f9465a, aVar.f9465a) && Intrinsics.f(this.f9466b, aVar.f9466b);
    }

    public final int hashCode() {
        int iHashCode = this.f9465a.hashCode() * 31;
        String str = this.f9466b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
