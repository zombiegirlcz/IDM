package com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/salary_switch/impl/ui/brazil/screen/review_details/ReviewDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReviewDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PayrollSwitchCounterparty f85293c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReviewDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), PayrollSwitchCounterparty.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReviewDetailsScreenContract$InputData[i];
        }
    }

    public ReviewDetailsScreenContract$InputData(String employerName, String cnpj, PayrollSwitchCounterparty counterparty) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(cnpj, "cnpj");
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        this.f85291a = employerName;
        this.f85292b = cnpj;
        this.f85293c = counterparty;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReviewDetailsScreenContract$InputData)) {
            return false;
        }
        ReviewDetailsScreenContract$InputData reviewDetailsScreenContract$InputData = (ReviewDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85291a, reviewDetailsScreenContract$InputData.f85291a) && Intrinsics.f(this.f85292b, reviewDetailsScreenContract$InputData.f85292b) && Intrinsics.f(this.f85293c, reviewDetailsScreenContract$InputData.f85293c);
    }

    public final int hashCode() {
        return this.f85293c.hashCode() + p.a.c(this.f85291a.hashCode() * 31, 31, this.f85292b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85291a);
        dest.writeString(this.f85292b);
        this.f85293c.writeToParcel(dest, i);
    }
}
