package com.revolut.feature.bank_account_switching.impl.ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f63961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormState f63962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f63963c;
    public final wn2.a d;
    public final d e;
    public final CardDigits f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountSwitchingReviewScreenContract$InputData(mn2.a.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), wn2.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() != 0 ? CardDigits.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingReviewScreenContract$InputData[i];
        }
    }

    public BankAccountSwitchingReviewScreenContract$InputData(mn2.a serviceType, FormState formState, LocalDate localDate, wn2.a targetAccountType, d dVar, CardDigits cardDigits) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        this.f63961a = serviceType;
        this.f63962b = formState;
        this.f63963c = localDate;
        this.d = targetAccountType;
        this.e = dVar;
        this.f = cardDigits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingReviewScreenContract$InputData)) {
            return false;
        }
        BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = (BankAccountSwitchingReviewScreenContract$InputData) obj2;
        return this.f63961a == bankAccountSwitchingReviewScreenContract$InputData.f63961a && Intrinsics.f(this.f63962b, bankAccountSwitchingReviewScreenContract$InputData.f63962b) && Intrinsics.f(this.f63963c, bankAccountSwitchingReviewScreenContract$InputData.f63963c) && this.d == bankAccountSwitchingReviewScreenContract$InputData.d && this.e == bankAccountSwitchingReviewScreenContract$InputData.e && Intrinsics.f(this.f, bankAccountSwitchingReviewScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f63962b.hashCode() + (this.f63961a.hashCode() * 31)) * 31;
        LocalDate localDate = this.f63963c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31;
        d dVar = this.e;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        CardDigits cardDigits = this.f;
        return iHashCode3 + (cardDigits != null ? cardDigits.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63961a.name());
        this.f63962b.writeToParcel(dest, i);
        dest.writeSerializable(this.f63963c);
        dest.writeString(this.d.name());
        d dVar = this.e;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        CardDigits cardDigits = this.f;
        if (cardDigits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardDigits.writeToParcel(dest, i);
        }
    }
}
