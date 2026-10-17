package com.revolut.feature.apm.services.ideal.impl.ui.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import jd2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/services/ideal/impl/ui/registration/IDealStartRegistrationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IDealStartRegistrationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IDealStartRegistrationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f62858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62859b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IDealStartRegistrationScreenContract$InputData(b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IDealStartRegistrationScreenContract$InputData[i];
        }
    }

    public IDealStartRegistrationScreenContract$InputData(b entryPoint, String str) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f62858a = entryPoint;
        this.f62859b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IDealStartRegistrationScreenContract$InputData)) {
            return false;
        }
        IDealStartRegistrationScreenContract$InputData iDealStartRegistrationScreenContract$InputData = (IDealStartRegistrationScreenContract$InputData) obj2;
        return this.f62858a == iDealStartRegistrationScreenContract$InputData.f62858a && Intrinsics.f(this.f62859b, iDealStartRegistrationScreenContract$InputData.f62859b);
    }

    public final int hashCode() {
        int iHashCode = this.f62858a.hashCode() * 31;
        String str = this.f62859b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62858a.name());
        dest.writeString(this.f62859b);
    }
}
