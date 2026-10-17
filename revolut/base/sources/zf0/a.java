package zf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321822c;

    public a(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f321820a = title;
        this.f321821b = str;
        this.f321822c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f321820a, aVar.f321820a) && Intrinsics.f(this.f321821b, aVar.f321821b) && Intrinsics.f(this.f321822c, aVar.f321822c);
    }

    public final int hashCode() {
        int iHashCode = this.f321820a.hashCode() * 31;
        String str = this.f321821b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f321822c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
