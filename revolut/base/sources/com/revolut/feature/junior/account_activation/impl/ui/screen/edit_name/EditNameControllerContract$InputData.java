package com.revolut.feature.junior.account_activation.impl.ui.screen.edit_name;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/screen/edit_name/EditNameControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditNameControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EditNameControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76668c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditNameControllerContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditNameControllerContract$InputData[i];
        }
    }

    public EditNameControllerContract$InputData(String firstName, String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f76666a = firstName;
        this.f76667b = lastName;
        this.f76668c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditNameControllerContract$InputData)) {
            return false;
        }
        EditNameControllerContract$InputData editNameControllerContract$InputData = (EditNameControllerContract$InputData) obj2;
        return Intrinsics.f(this.f76666a, editNameControllerContract$InputData.f76666a) && Intrinsics.f(this.f76667b, editNameControllerContract$InputData.f76667b) && this.f76668c == editNameControllerContract$InputData.f76668c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76668c) + p.a.c(this.f76666a.hashCode() * 31, 31, this.f76667b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76666a);
        dest.writeString(this.f76667b);
        dest.writeInt(this.f76668c ? 1 : 0);
    }
}
