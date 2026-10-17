package d73;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b93.d f111778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111779b;

    public c(String str, b93.d cardScope) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        this.f111778a = cardScope;
        this.f111779b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f111778a == cVar.f111778a && Intrinsics.f(this.f111779b, cVar.f111779b);
    }

    public final int hashCode() {
        int iHashCode = this.f111778a.hashCode() * 31;
        String str = this.f111779b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
