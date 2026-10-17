package com.revolut.feature.junior.isa.impl.ui.update_name_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/isa/impl/ui/update_name_screen/UpdateNameScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpdateNameScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UpdateNameScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76812b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpdateNameScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpdateNameScreenContract$InputData[i];
        }
    }

    public UpdateNameScreenContract$InputData(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f76811a = firstName;
        this.f76812b = lastName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpdateNameScreenContract$InputData)) {
            return false;
        }
        UpdateNameScreenContract$InputData updateNameScreenContract$InputData = (UpdateNameScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76811a, updateNameScreenContract$InputData.f76811a) && Intrinsics.f(this.f76812b, updateNameScreenContract$InputData.f76812b);
    }

    public final int hashCode() {
        return this.f76812b.hashCode() + (this.f76811a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76811a);
        dest.writeString(this.f76812b);
    }
}
