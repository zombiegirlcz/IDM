package xoc;

import alc.j;
import dj0.d;
import ip0.v7;
import jlc.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f307785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f307786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f307787c;
    public final p d;

    public a(j templateProjection, d currentPortfolioValue, d recurringMonthlyContribution, p recurringDepositType) {
        Intrinsics.checkNotNullParameter(templateProjection, "templateProjection");
        Intrinsics.checkNotNullParameter(currentPortfolioValue, "currentPortfolioValue");
        Intrinsics.checkNotNullParameter(recurringMonthlyContribution, "recurringMonthlyContribution");
        Intrinsics.checkNotNullParameter(recurringDepositType, "recurringDepositType");
        this.f307785a = templateProjection;
        this.f307786b = currentPortfolioValue;
        this.f307787c = recurringMonthlyContribution;
        this.d = recurringDepositType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f307785a, aVar.f307785a) && Intrinsics.f(this.f307786b, aVar.f307786b) && Intrinsics.f(this.f307787c, aVar.f307787c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f307785a.hashCode() * 31, 31, this.f307786b), 31, this.f307787c);
    }
}
