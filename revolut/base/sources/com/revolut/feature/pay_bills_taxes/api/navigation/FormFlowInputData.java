package com.revolut.feature.pay_bills_taxes.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/api/navigation/FormFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FormFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78679b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FormFlowInputData(g.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormFlowInputData[i];
        }
    }

    public FormFlowInputData(g paymentMethod, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f78678a = paymentMethod;
        this.f78679b = str;
    }

    /* JADX INFO: renamed from: S3, reason: from getter */
    public final g getF78678a() {
        return this.f78678a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF78679b() {
        return this.f78679b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormFlowInputData)) {
            return false;
        }
        FormFlowInputData formFlowInputData = (FormFlowInputData) obj2;
        return this.f78678a == formFlowInputData.f78678a && Intrinsics.f(this.f78679b, formFlowInputData.f78679b);
    }

    public final int hashCode() {
        int iHashCode = this.f78678a.hashCode() * 31;
        String str = this.f78679b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78678a.name());
        dest.writeString(this.f78679b);
    }
}
