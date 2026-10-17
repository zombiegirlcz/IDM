package com.revolut.feature.card_add_to_googlepay.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.shared.cards.model.SharedRevolutCard;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/api/models/RetailCardWrapper;", "Lcom/revolut/feature/add_card_to_google_pay/integration/api/model/SharedRevolutCardWrapper;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RetailCardWrapper implements SharedRevolutCardWrapper {

    @NotNull
    public static final Parcelable.Creator<RetailCardWrapper> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCard f64443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f64444b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetailCardWrapper((SharedRevolutCard) parcel.readParcelable(RetailCardWrapper.class.getClassLoader()), (f0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RetailCardWrapper[i];
        }
    }

    public RetailCardWrapper(SharedRevolutCard sharedRevolutCard, f0 card) {
        Intrinsics.checkNotNullParameter(sharedRevolutCard, "sharedRevolutCard");
        Intrinsics.checkNotNullParameter(card, "card");
        this.f64443a = sharedRevolutCard;
        this.f64444b = card;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RetailCardWrapper)) {
            return false;
        }
        RetailCardWrapper retailCardWrapper = (RetailCardWrapper) obj2;
        return Intrinsics.f(this.f64443a, retailCardWrapper.f64443a) && Intrinsics.f(this.f64444b, retailCardWrapper.f64444b);
    }

    public final int hashCode() {
        return this.f64444b.hashCode() + (this.f64443a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64443a, i);
        dest.writeSerializable(this.f64444b);
    }
}
