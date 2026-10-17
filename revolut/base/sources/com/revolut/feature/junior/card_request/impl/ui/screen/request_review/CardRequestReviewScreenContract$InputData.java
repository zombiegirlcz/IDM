package com.revolut.feature.junior.card_request.impl.ui.screen.request_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import jc8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/card_request/impl/ui/screen/request_review/CardRequestReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardRequestReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardRequestReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f76731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76732c;
    public final NaviCommand d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            return new CardRequestReviewScreenContract$InputData((NaviCommand) parcel.readParcelable(CardRequestReviewScreenContract$InputData.class.getClassLoader()), string, parcel.readString(), cVarValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardRequestReviewScreenContract$InputData[i];
        }
    }

    public CardRequestReviewScreenContract$InputData(NaviCommand naviCommand, String juniorId, String str, c cardRequestType) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(cardRequestType, "cardRequestType");
        this.f76730a = juniorId;
        this.f76731b = cardRequestType;
        this.f76732c = str;
        this.d = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardRequestReviewScreenContract$InputData)) {
            return false;
        }
        CardRequestReviewScreenContract$InputData cardRequestReviewScreenContract$InputData = (CardRequestReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76730a, cardRequestReviewScreenContract$InputData.f76730a) && this.f76731b == cardRequestReviewScreenContract$InputData.f76731b && Intrinsics.f(this.f76732c, cardRequestReviewScreenContract$InputData.f76732c) && Intrinsics.f(this.d, cardRequestReviewScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f76731b.hashCode() + (this.f76730a.hashCode() * 31)) * 31;
        String str = this.f76732c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        NaviCommand naviCommand = this.d;
        return iHashCode2 + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76730a);
        dest.writeString(this.f76731b.name());
        dest.writeString(this.f76732c);
        dest.writeParcelable(this.d, i);
    }
}
