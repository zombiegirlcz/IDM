package com.revolut.feature.credit.card.api.models.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/settings/CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardSettings$Action f68866c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason(parcel.readString(), parcel.readString(), CreditCardSettings$Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason[i];
        }
    }

    public CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason(String title, String description, CreditCardSettings$Action button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f68864a = title;
        this.f68865b = description;
        this.f68866c = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason)) {
            return false;
        }
        CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason = (CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason) obj2;
        return Intrinsics.f(this.f68864a, creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68864a) && Intrinsics.f(this.f68865b, creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68865b) && Intrinsics.f(this.f68866c, creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68866c);
    }

    public final int hashCode() {
        return this.f68866c.hashCode() + p.a.c(this.f68864a.hashCode() * 31, 31, this.f68865b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68864a);
        dest.writeString(this.f68865b);
        this.f68866c.writeToParcel(dest, i);
    }
}
