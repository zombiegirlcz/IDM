package com.revolut.feature.credit.card.api.models.settings;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/settings/CreditCardSettings$RepaymentPreferenceSettings$DueDateOption", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardSettings$RepaymentPreferenceSettings$DueDateOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardSettings$RepaymentPreferenceSettings$DueDateOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f68862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f68863c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardSettings$RepaymentPreferenceSettings$DueDateOption(parcel.readInt(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardSettings$RepaymentPreferenceSettings$DueDateOption[i];
        }
    }

    public CreditCardSettings$RepaymentPreferenceSettings$DueDateOption(int i, LocalDate currentDueDate, LocalDate nextDueDate) {
        Intrinsics.checkNotNullParameter(currentDueDate, "currentDueDate");
        Intrinsics.checkNotNullParameter(nextDueDate, "nextDueDate");
        this.f68861a = i;
        this.f68862b = currentDueDate;
        this.f68863c = nextDueDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardSettings$RepaymentPreferenceSettings$DueDateOption)) {
            return false;
        }
        CreditCardSettings$RepaymentPreferenceSettings$DueDateOption creditCardSettings$RepaymentPreferenceSettings$DueDateOption = (CreditCardSettings$RepaymentPreferenceSettings$DueDateOption) obj2;
        return this.f68861a == creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68861a && Intrinsics.f(this.f68862b, creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68862b) && Intrinsics.f(this.f68863c, creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68863c);
    }

    public final int hashCode() {
        return this.f68863c.hashCode() + y.a(Integer.hashCode(this.f68861a) * 31, 31, this.f68862b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68861a);
        dest.writeSerializable(this.f68862b);
        dest.writeSerializable(this.f68863c);
    }
}
