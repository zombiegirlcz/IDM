package com.revolut.feature.apm.payid.impl.extension.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/extension/dialog/NewBeneficiaryNameParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewBeneficiaryNameParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NewBeneficiaryNameParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62696a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewBeneficiaryNameParcel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewBeneficiaryNameParcel[i];
        }
    }

    public NewBeneficiaryNameParcel(String newBeneficiaryName) {
        Intrinsics.checkNotNullParameter(newBeneficiaryName, "newBeneficiaryName");
        this.f62696a = newBeneficiaryName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NewBeneficiaryNameParcel) && Intrinsics.f(this.f62696a, ((NewBeneficiaryNameParcel) obj2).f62696a);
    }

    public final int hashCode() {
        return this.f62696a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62696a);
    }
}
