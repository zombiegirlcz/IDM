package com.revolut.feature.junior.card_request.impl.ui.flow.request_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import jc8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/card_request/impl/ui/flow/request_review/CardRequestReviewFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardRequestReviewFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardRequestReviewFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f76721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f76722c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new CardRequestReviewFlowContract$InputData((NaviCommand) parcel.readParcelable(CardRequestReviewFlowContract$InputData.class.getClassLoader()), string, parcel.readString(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardRequestReviewFlowContract$InputData[i];
        }
    }

    public CardRequestReviewFlowContract$InputData(NaviCommand naviCommand, String juniorId, String str, c cardRequestType) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(cardRequestType, "cardRequestType");
        this.f76720a = juniorId;
        this.f76721b = naviCommand;
        this.f76722c = cardRequestType;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardRequestReviewFlowContract$InputData)) {
            return false;
        }
        CardRequestReviewFlowContract$InputData cardRequestReviewFlowContract$InputData = (CardRequestReviewFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76720a, cardRequestReviewFlowContract$InputData.f76720a) && Intrinsics.f(this.f76721b, cardRequestReviewFlowContract$InputData.f76721b) && this.f76722c == cardRequestReviewFlowContract$InputData.f76722c && Intrinsics.f(this.d, cardRequestReviewFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f76720a.hashCode() * 31;
        NaviCommand naviCommand = this.f76721b;
        int iHashCode2 = (this.f76722c.hashCode() + ((iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31)) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76720a);
        dest.writeParcelable(this.f76721b, i);
        dest.writeString(this.f76722c.name());
        dest.writeString(this.d);
    }
}
