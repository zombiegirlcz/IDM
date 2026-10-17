package com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address_v2/selection/CreditAddressSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAddressSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditAddressSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66986c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditAddressSelectionScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAddressSelectionScreenContract$InputData[i];
        }
    }

    public CreditAddressSelectionScreenContract$InputData(String title, String str, String buttonTitle, String applicationId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f66984a = title;
        this.f66985b = str;
        this.f66986c = buttonTitle;
        this.d = applicationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAddressSelectionScreenContract$InputData)) {
            return false;
        }
        CreditAddressSelectionScreenContract$InputData creditAddressSelectionScreenContract$InputData = (CreditAddressSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66984a, creditAddressSelectionScreenContract$InputData.f66984a) && Intrinsics.f(this.f66985b, creditAddressSelectionScreenContract$InputData.f66985b) && Intrinsics.f(this.f66986c, creditAddressSelectionScreenContract$InputData.f66986c) && Intrinsics.f(this.d, creditAddressSelectionScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f66984a.hashCode() * 31;
        String str = this.f66985b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66986c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66984a);
        dest.writeString(this.f66985b);
        dest.writeString(this.f66986c);
        dest.writeString(this.d);
    }
}
