package com.revolut.feature.credit.impl.ui.entry_points;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditEntryPointsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditEntryPointsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditEntryPointsControllerContract$Configuration f70058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f70059b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditEntryPointsControllerContract$InputData((CreditEntryPointsControllerContract$Configuration) parcel.readParcelable(CreditEntryPointsControllerContract$InputData.class.getClassLoader()), r2.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditEntryPointsControllerContract$InputData[i];
        }
    }

    public CreditEntryPointsControllerContract$InputData(CreditEntryPointsControllerContract$Configuration configuration, r2 creditEntryPoint) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(creditEntryPoint, "creditEntryPoint");
        this.f70058a = configuration;
        this.f70059b = creditEntryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditEntryPointsControllerContract$InputData)) {
            return false;
        }
        CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData = (CreditEntryPointsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f70058a, creditEntryPointsControllerContract$InputData.f70058a) && this.f70059b == creditEntryPointsControllerContract$InputData.f70059b;
    }

    public final int hashCode() {
        return this.f70059b.hashCode() + (this.f70058a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70058a, i);
        dest.writeString(this.f70059b.name());
    }
}
