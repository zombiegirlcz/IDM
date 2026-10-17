package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/student_email_validation/StudentEmailValidationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentEmailValidationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StudentEmailValidationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103640c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StudentEmailValidationScreenContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StudentEmailValidationScreenContract$InputData[i];
        }
    }

    public StudentEmailValidationScreenContract$InputData(String str, boolean z, boolean z3) {
        this.f103638a = str;
        this.f103639b = z;
        this.f103640c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StudentEmailValidationScreenContract$InputData)) {
            return false;
        }
        StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData = (StudentEmailValidationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103638a, studentEmailValidationScreenContract$InputData.f103638a) && this.f103639b == studentEmailValidationScreenContract$InputData.f103639b && this.f103640c == studentEmailValidationScreenContract$InputData.f103640c;
    }

    public final int hashCode() {
        String str = this.f103638a;
        return Boolean.hashCode(this.f103640c) + j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f103639b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103638a);
        dest.writeInt(this.f103639b ? 1 : 0);
        dest.writeInt(this.f103640c ? 1 : 0);
    }

    public StudentEmailValidationScreenContract$InputData() {
        this(null, false, true);
    }
}
