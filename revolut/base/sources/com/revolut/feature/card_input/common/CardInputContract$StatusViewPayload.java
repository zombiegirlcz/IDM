package com.revolut.feature.card_input.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_input/common/CardInputContract$StatusViewPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_input_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardInputContract$StatusViewPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardInputContract$StatusViewPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f64751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f64752b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardInputContract$StatusViewPayload((f0) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(CardInputContract$StatusViewPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardInputContract$StatusViewPayload[i];
        }
    }

    public CardInputContract$StatusViewPayload(f0 revolutCard, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        this.f64751a = revolutCard;
        this.f64752b = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardInputContract$StatusViewPayload)) {
            return false;
        }
        CardInputContract$StatusViewPayload cardInputContract$StatusViewPayload = (CardInputContract$StatusViewPayload) obj2;
        return Intrinsics.f(this.f64751a, cardInputContract$StatusViewPayload.f64751a) && Intrinsics.f(this.f64752b, cardInputContract$StatusViewPayload.f64752b);
    }

    public final int hashCode() {
        int iHashCode = this.f64751a.hashCode() * 31;
        NaviCommand naviCommand = this.f64752b;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64751a);
        dest.writeParcelable(this.f64752b, i);
    }
}
