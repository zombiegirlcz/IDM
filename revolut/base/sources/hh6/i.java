package hh6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe6.b f152259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f152260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f152261c;
    public final boolean d;
    public final bh6.e e;

    public i(qe6.b mandateItem, dj0.d maxPerTransfer, dj0.d maxPerMonth, boolean z, bh6.e revolutAccountDetails) {
        Intrinsics.checkNotNullParameter(mandateItem, "mandateItem");
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(revolutAccountDetails, "revolutAccountDetails");
        this.f152259a = mandateItem;
        this.f152260b = maxPerTransfer;
        this.f152261c = maxPerMonth;
        this.d = z;
        this.e = revolutAccountDetails;
    }

    public static i a(i iVar, dj0.d dVar, dj0.d dVar2, boolean z, int i) {
        qe6.b mandateItem = iVar.f152259a;
        if ((i & 2) != 0) {
            dVar = iVar.f152260b;
        }
        dj0.d maxPerTransfer = dVar;
        if ((i & 4) != 0) {
            dVar2 = iVar.f152261c;
        }
        dj0.d maxPerMonth = dVar2;
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        bh6.e revolutAccountDetails = iVar.e;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(mandateItem, "mandateItem");
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(revolutAccountDetails, "revolutAccountDetails");
        return new i(mandateItem, maxPerTransfer, maxPerMonth, z, revolutAccountDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f152259a, iVar.f152259a) && Intrinsics.f(this.f152260b, iVar.f152260b) && Intrinsics.f(this.f152261c, iVar.f152261c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(v7.c(v7.c(this.f152259a.hashCode() * 31, 31, this.f152260b), 31, this.f152261c), 31, this.d);
    }
}
