package com.revolut.feature.external_accounts.impl.mandate.limit_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import dj0.d;
import fh6.b;
import fh6.c;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig;", "Landroid/os/Parcelable;", "MaxPerTransfer", "MaxPerMonth", "fh6/c", "Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig$MaxPerMonth;", "Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig$MaxPerTransfer;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MandateLimitConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig$MaxPerMonth;", "Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaxPerMonth implements MandateLimitConfig {

        @NotNull
        public static final Parcelable.Creator<MaxPerMonth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f72454c;
        public final TextLocalisedClause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MaxPerMonth((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaxPerMonth[i];
            }
        }

        public MaxPerMonth(d initialValue, d maxPerTransfer, d upperLimit) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
            Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
            this.f72452a = initialValue;
            this.f72453b = maxPerTransfer;
            this.f72454c = upperLimit;
            this.d = new TextLocalisedClause(R$string.open_banking_mandate_max_per_month, null, null, 14);
        }

        @Override // com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig
        /* JADX INFO: renamed from: C, reason: from getter */
        public final d getF72455a() {
            return this.f72452a;
        }

        @Override // com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig
        public final c S0(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            if (amount.i(this.f72453b)) {
                return new fh6.a(new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_month_below_single_transfer, null, null, 14));
            }
            d dVar = this.f72454c;
            return amount.f(dVar) ? new fh6.a(new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_month_upper_limit_exceeded, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12)) : b.f135153a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MaxPerMonth)) {
                return false;
            }
            MaxPerMonth maxPerMonth = (MaxPerMonth) obj2;
            return Intrinsics.f(this.f72452a, maxPerMonth.f72452a) && Intrinsics.f(this.f72453b, maxPerMonth.f72453b) && Intrinsics.f(this.f72454c, maxPerMonth.f72454c);
        }

        @Override // com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final TextLocalisedClause getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f72454c.hashCode() + v7.c(this.f72452a.hashCode() * 31, 31, this.f72453b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72452a);
            dest.writeSerializable(this.f72453b);
            dest.writeSerializable(this.f72454c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig$MaxPerTransfer;", "Lcom/revolut/feature/external_accounts/impl/mandate/limit_input/MandateLimitConfig;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaxPerTransfer implements MandateLimitConfig {

        @NotNull
        public static final Parcelable.Creator<MaxPerTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f72457c;
        public final TextLocalisedClause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MaxPerTransfer((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaxPerTransfer[i];
            }
        }

        public MaxPerTransfer(d initialValue, d dVar, d maxPerMonth) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
            this.f72455a = initialValue;
            this.f72456b = dVar;
            this.f72457c = maxPerMonth;
            this.d = new TextLocalisedClause(R$string.open_banking_mandate_max_per_transfer, null, null, 14);
        }

        @Override // com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig
        /* JADX INFO: renamed from: C, reason: from getter */
        public final d getF72455a() {
            return this.f72455a;
        }

        @Override // com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig
        public final c S0(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            d dVar = this.f72456b;
            return (dVar == null || !amount.i(dVar)) ? amount.f(this.f72457c) ? new fh6.a(new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_transfer_max_per_month_exceeded, null, null, 14)) : b.f135153a : new fh6.a(new TextLocalisedClause(R$string.open_banking_mandate_limits_error_message, null, null, 14));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MaxPerTransfer)) {
                return false;
            }
            MaxPerTransfer maxPerTransfer = (MaxPerTransfer) obj2;
            return Intrinsics.f(this.f72455a, maxPerTransfer.f72455a) && Intrinsics.f(this.f72456b, maxPerTransfer.f72456b) && Intrinsics.f(this.f72457c, maxPerTransfer.f72457c);
        }

        @Override // com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final TextLocalisedClause getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f72455a.hashCode() * 31;
            d dVar = this.f72456b;
            return this.f72457c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72455a);
            dest.writeSerializable(this.f72456b);
            dest.writeSerializable(this.f72457c);
        }
    }

    /* JADX INFO: renamed from: C */
    d getF72455a();

    c S0(d dVar);

    /* JADX INFO: renamed from: getTitle */
    TextLocalisedClause getD();
}
