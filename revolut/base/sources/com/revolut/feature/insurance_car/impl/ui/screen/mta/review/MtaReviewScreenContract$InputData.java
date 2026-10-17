package com.revolut.feature.insurance_car.impl.ui.screen.mta.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.MtaContent;
import com.revolut.feature.insurance_car.impl.data.model.MtaQuote;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/mta/review/MtaReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MtaReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MtaContent f75539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MtaQuote f75540c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaReviewScreenContract$InputData(parcel.readString(), MtaContent.CREATOR.createFromParcel(parcel), MtaQuote.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaReviewScreenContract$InputData[i];
        }
    }

    public MtaReviewScreenContract$InputData(String policyId, MtaContent mtaContent, MtaQuote mtaQuote, String mtaId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(mtaContent, "mtaContent");
        Intrinsics.checkNotNullParameter(mtaQuote, "mtaQuote");
        Intrinsics.checkNotNullParameter(mtaId, "mtaId");
        this.f75538a = policyId;
        this.f75539b = mtaContent;
        this.f75540c = mtaQuote;
        this.d = mtaId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaReviewScreenContract$InputData)) {
            return false;
        }
        MtaReviewScreenContract$InputData mtaReviewScreenContract$InputData = (MtaReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75538a, mtaReviewScreenContract$InputData.f75538a) && Intrinsics.f(this.f75539b, mtaReviewScreenContract$InputData.f75539b) && Intrinsics.f(this.f75540c, mtaReviewScreenContract$InputData.f75540c) && Intrinsics.f(this.d, mtaReviewScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f75540c.hashCode() + ((this.f75539b.hashCode() + (this.f75538a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75538a);
        this.f75539b.writeToParcel(dest, i);
        this.f75540c.writeToParcel(dest, i);
        dest.writeString(this.d);
    }
}
