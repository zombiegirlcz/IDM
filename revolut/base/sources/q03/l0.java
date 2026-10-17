package q03;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i93.e f241089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i93.l f241090c;

    public l0(String cardId, i93.e cardSettingsType, i93.l transactionLimit) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        this.f241088a = cardId;
        this.f241089b = cardSettingsType;
        this.f241090c = transactionLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f241088a, l0Var.f241088a) && this.f241089b == l0Var.f241089b && Intrinsics.f(this.f241090c, l0Var.f241090c);
    }

    public final int hashCode() {
        return this.f241090c.hashCode() + ((this.f241089b.hashCode() + (this.f241088a.hashCode() * 31)) * 31);
    }
}
