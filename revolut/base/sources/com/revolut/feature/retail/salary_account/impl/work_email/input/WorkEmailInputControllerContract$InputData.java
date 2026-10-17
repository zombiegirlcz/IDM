package com.revolut.feature.retail.salary_account.impl.work_email.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/salary_account/impl/work_email/input/WorkEmailInputControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkEmailInputControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WorkEmailInputControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83070b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkEmailInputControllerContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkEmailInputControllerContract$InputData[i];
        }
    }

    public WorkEmailInputControllerContract$InputData(String str, boolean z) {
        this.f83069a = str;
        this.f83070b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkEmailInputControllerContract$InputData)) {
            return false;
        }
        WorkEmailInputControllerContract$InputData workEmailInputControllerContract$InputData = (WorkEmailInputControllerContract$InputData) obj2;
        return Intrinsics.f(this.f83069a, workEmailInputControllerContract$InputData.f83069a) && this.f83070b == workEmailInputControllerContract$InputData.f83070b;
    }

    public final int hashCode() {
        String str = this.f83069a;
        return Boolean.hashCode(this.f83070b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83069a);
        dest.writeInt(this.f83070b ? 1 : 0);
    }

    public WorkEmailInputControllerContract$InputData() {
        this(null, false);
    }
}
