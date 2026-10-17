package sm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264375c;
    public final String d;

    public l(String link, String androidPackage, String str, String transactionId) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(androidPackage, "androidPackage");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f264373a = link;
        this.f264374b = androidPackage;
        this.f264375c = str;
        this.d = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f264373a, lVar.f264373a) && Intrinsics.f(this.f264374b, lVar.f264374b) && Intrinsics.f(this.f264375c, lVar.f264375c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f264373a.hashCode() * 31, 31, this.f264374b);
        String str = this.f264375c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
