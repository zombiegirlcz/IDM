package b02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11542b;

    public a(String str, String termsDocumentId) {
        Intrinsics.checkNotNullParameter(termsDocumentId, "termsDocumentId");
        this.f11541a = str;
        this.f11542b = termsDocumentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11541a, aVar.f11541a) && Intrinsics.f(this.f11542b, aVar.f11542b);
    }

    public final int hashCode() {
        String str = this.f11541a;
        return this.f11542b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
