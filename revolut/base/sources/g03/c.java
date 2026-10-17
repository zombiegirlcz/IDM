package g03;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i93.e f139263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i93.l f139264c;

    public c(String cardId, i93.e cardSettingsType, i93.l transactionLimit) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        this.f139262a = cardId;
        this.f139263b = cardSettingsType;
        this.f139264c = transactionLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f139262a, cVar.f139262a) && this.f139263b == cVar.f139263b && Intrinsics.f(this.f139264c, cVar.f139264c);
    }

    public final int hashCode() {
        return this.f139264c.hashCode() + ((this.f139263b.hashCode() + (this.f139262a.hashCode() * 31)) * 31);
    }
}
