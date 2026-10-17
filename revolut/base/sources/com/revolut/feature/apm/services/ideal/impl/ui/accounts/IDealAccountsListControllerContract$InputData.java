package com.revolut.feature.apm.services.ideal.impl.ui.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import gd2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/services/ideal/impl/ui/accounts/IDealAccountsListControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IDealAccountsListControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IDealAccountsListControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f62839b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IDealAccountsListControllerContract$InputData(parcel.readString(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IDealAccountsListControllerContract$InputData[i];
        }
    }

    public IDealAccountsListControllerContract$InputData(String str, d entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f62838a = str;
        this.f62839b = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IDealAccountsListControllerContract$InputData)) {
            return false;
        }
        IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = (IDealAccountsListControllerContract$InputData) obj2;
        return Intrinsics.f(this.f62838a, iDealAccountsListControllerContract$InputData.f62838a) && this.f62839b == iDealAccountsListControllerContract$InputData.f62839b;
    }

    public final int hashCode() {
        String str = this.f62838a;
        return this.f62839b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62838a);
        dest.writeString(this.f62839b.name());
    }
}
