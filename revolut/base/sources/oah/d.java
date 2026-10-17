package oah;

import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferSubjectId f223636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAccountType f223637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f223638c;
    public final dj0.d d;
    public final RecurringDepositSchedule e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f223639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UUID f223640h;

    public d(TransferSubjectId transferSubjectId, WealthAccountType product, dj0.d dVar, dj0.d dVar2, RecurringDepositSchedule recurringDepositSchedule, String str, boolean z) {
        UUID idempotencyKey = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(idempotencyKey, "randomUUID(...)");
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f223636a = transferSubjectId;
        this.f223637b = product;
        this.f223638c = dVar;
        this.d = dVar2;
        this.e = recurringDepositSchedule;
        this.f = str;
        this.f223639g = z;
        this.f223640h = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f223636a, dVar.f223636a) && this.f223637b == dVar.f223637b && Intrinsics.f(this.f223638c, dVar.f223638c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f223639g == dVar.f223639g && Intrinsics.f(this.f223640h, dVar.f223640h);
    }

    public final int hashCode() {
        int iE = m72.b.e(this.f223637b, this.f223636a.hashCode() * 31, 31);
        dj0.d dVar = this.f223638c;
        int iHashCode = (iE + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        RecurringDepositSchedule recurringDepositSchedule = this.e;
        int iHashCode3 = (iHashCode2 + (recurringDepositSchedule == null ? 0 : recurringDepositSchedule.hashCode())) * 31;
        String str = this.f;
        return this.f223640h.hashCode() + j6.a.c((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f223639g);
    }
}
