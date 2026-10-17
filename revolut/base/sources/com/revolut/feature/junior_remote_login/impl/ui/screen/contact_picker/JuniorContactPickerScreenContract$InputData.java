package com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/screen/contact_picker/JuniorContactPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorContactPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorContactPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77212b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorContactPickerScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorContactPickerScreenContract$InputData[i];
        }
    }

    public JuniorContactPickerScreenContract$InputData(String juniorFirstName, String juniorLastName) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(juniorLastName, "juniorLastName");
        this.f77211a = juniorFirstName;
        this.f77212b = juniorLastName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorContactPickerScreenContract$InputData)) {
            return false;
        }
        JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData = (JuniorContactPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77211a, juniorContactPickerScreenContract$InputData.f77211a) && Intrinsics.f(this.f77212b, juniorContactPickerScreenContract$InputData.f77212b);
    }

    public final int hashCode() {
        return this.f77212b.hashCode() + (this.f77211a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77211a);
        dest.writeString(this.f77212b);
    }
}
