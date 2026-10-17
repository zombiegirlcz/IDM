package com.revolut.feature_retail_user_declarations.employer.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/employer/screen/EmployerControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmployerControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmployerControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rbl.a f97641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f97642c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmployerControllerContract$InputData(parcel.readString(), rbl.a.valueOf(parcel.readString()), (wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmployerControllerContract$InputData[i];
        }
    }

    public EmployerControllerContract$InputData(String stepId, rbl.a backNavigationType, wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f97640a = stepId;
        this.f97641b = backNavigationType;
        this.f97642c = countryCode;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmployerControllerContract$InputData)) {
            return false;
        }
        EmployerControllerContract$InputData employerControllerContract$InputData = (EmployerControllerContract$InputData) obj2;
        return Intrinsics.f(this.f97640a, employerControllerContract$InputData.f97640a) && this.f97641b == employerControllerContract$InputData.f97641b && Intrinsics.f(this.f97642c, employerControllerContract$InputData.f97642c) && this.d == employerControllerContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c((this.f97641b.hashCode() + (this.f97640a.hashCode() * 31)) * 31, 31, this.f97642c.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97640a);
        dest.writeString(this.f97641b.name());
        dest.writeSerializable(this.f97642c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
