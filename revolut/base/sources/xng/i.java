package xng;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends com.revolut.feature.user_declarations.shared.flows.income.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sil.c f307497b;

    public i(dj0.d incomeAmount, sil.c pickedFrequency) {
        Intrinsics.checkNotNullParameter(incomeAmount, "incomeAmount");
        Intrinsics.checkNotNullParameter(pickedFrequency, "pickedFrequency");
        this.f307496a = incomeAmount;
        this.f307497b = pickedFrequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f307496a, iVar.f307496a) && this.f307497b == iVar.f307497b;
    }

    public final int hashCode() {
        return this.f307497b.hashCode() + (this.f307496a.hashCode() * 31);
    }
}
