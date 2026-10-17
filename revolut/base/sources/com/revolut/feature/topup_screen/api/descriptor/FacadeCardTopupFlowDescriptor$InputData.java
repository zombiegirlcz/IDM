package com.revolut.feature.topup_screen.api.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/api/descriptor/FacadeCardTopupFlowDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FacadeCardTopupFlowDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FacadeCardTopupFlowDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTopUpType f90493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f90495c;
    public final TopUpContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacadeCardTopupFlowDescriptor$InputData((CardTopUpType) parcel.readParcelable(FacadeCardTopupFlowDescriptor$InputData.class.getClassLoader()), parcel.readString(), (TopUpTarget) parcel.readParcelable(FacadeCardTopupFlowDescriptor$InputData.class.getClassLoader()), (TopUpContext) parcel.readParcelable(FacadeCardTopupFlowDescriptor$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FacadeCardTopupFlowDescriptor$InputData[i];
        }
    }

    public FacadeCardTopupFlowDescriptor$InputData(CardTopUpType topUpType, String cardId, TopUpTarget topUpTarget, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(topUpType, "topUpType");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f90493a = topUpType;
        this.f90494b = cardId;
        this.f90495c = topUpTarget;
        this.d = topUpContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FacadeCardTopupFlowDescriptor$InputData)) {
            return false;
        }
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = (FacadeCardTopupFlowDescriptor$InputData) obj2;
        return Intrinsics.f(this.f90493a, facadeCardTopupFlowDescriptor$InputData.f90493a) && Intrinsics.f(this.f90494b, facadeCardTopupFlowDescriptor$InputData.f90494b) && Intrinsics.f(this.f90495c, facadeCardTopupFlowDescriptor$InputData.f90495c) && Intrinsics.f(this.d, facadeCardTopupFlowDescriptor$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f90495c.hashCode() + p.a.c(this.f90493a.hashCode() * 31, 31, this.f90494b)) * 31;
        TopUpContext topUpContext = this.d;
        return iHashCode + (topUpContext == null ? 0 : topUpContext.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90493a, i);
        dest.writeString(this.f90494b);
        dest.writeParcelable(this.f90495c, i);
        dest.writeParcelable(this.d, i);
    }
}
