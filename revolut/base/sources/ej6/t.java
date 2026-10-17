package ej6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f126756c;

    public t(dj0.d paymentAmount, String selectedPocketId, String initialPocketId) {
        Intrinsics.checkNotNullParameter(selectedPocketId, "selectedPocketId");
        Intrinsics.checkNotNullParameter(initialPocketId, "initialPocketId");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        this.f126754a = selectedPocketId;
        this.f126755b = initialPocketId;
        this.f126756c = paymentAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f126754a, tVar.f126754a) && Intrinsics.f(this.f126755b, tVar.f126755b) && Intrinsics.f(this.f126756c, tVar.f126756c);
    }

    public final int hashCode() {
        return this.f126756c.hashCode() + p.a.c(this.f126754a.hashCode() * 31, 31, this.f126755b);
    }
}
