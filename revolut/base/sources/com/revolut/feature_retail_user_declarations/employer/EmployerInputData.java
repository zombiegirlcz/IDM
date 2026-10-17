package com.revolut.feature_retail_user_declarations.employer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/employer/EmployerInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmployerInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmployerInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f97636c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmployerInputData(parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmployerInputData[i];
        }
    }

    public EmployerInputData(String stepId, b countryCode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f97634a = stepId;
        this.f97635b = z;
        this.f97636c = countryCode;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmployerInputData)) {
            return false;
        }
        EmployerInputData employerInputData = (EmployerInputData) obj2;
        return Intrinsics.f(this.f97634a, employerInputData.f97634a) && this.f97635b == employerInputData.f97635b && Intrinsics.f(this.f97636c, employerInputData.f97636c) && this.d == employerInputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(j6.a.c(this.f97634a.hashCode() * 31, 31, this.f97635b), 31, this.f97636c.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97634a);
        dest.writeInt(this.f97635b ? 1 : 0);
        dest.writeSerializable(this.f97636c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
