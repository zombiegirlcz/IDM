package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import hl4.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/CreditCardCancellationConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f68702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardCancellationContent f68703b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCancellationConfig(e.valueOf(parcel.readString()), CreditCardCancellationContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationConfig[i];
        }
    }

    public CreditCardCancellationConfig(e journeyType, CreditCardCancellationContent content) {
        Intrinsics.checkNotNullParameter(journeyType, "journeyType");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f68702a = journeyType;
        this.f68703b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationConfig)) {
            return false;
        }
        CreditCardCancellationConfig creditCardCancellationConfig = (CreditCardCancellationConfig) obj2;
        return this.f68702a == creditCardCancellationConfig.f68702a && Intrinsics.f(this.f68703b, creditCardCancellationConfig.f68703b);
    }

    public final int hashCode() {
        return this.f68703b.hashCode() + (this.f68702a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68702a.name());
        this.f68703b.writeToParcel(dest, i);
    }
}
