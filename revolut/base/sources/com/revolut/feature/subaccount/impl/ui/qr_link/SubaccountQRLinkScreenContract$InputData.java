package com.revolut.feature.subaccount.impl.ui.qr_link;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/qr_link/SubaccountQRLinkScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubaccountQRLinkScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubaccountQRLinkScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountQRLinkScreenContract$SubaccountInfo f89103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89104b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubaccountQRLinkScreenContract$InputData(SubaccountQRLinkScreenContract$SubaccountInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubaccountQRLinkScreenContract$InputData[i];
        }
    }

    public SubaccountQRLinkScreenContract$InputData(SubaccountQRLinkScreenContract$SubaccountInfo subaccountInfo, String link) {
        Intrinsics.checkNotNullParameter(subaccountInfo, "subaccountInfo");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f89103a = subaccountInfo;
        this.f89104b = link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubaccountQRLinkScreenContract$InputData)) {
            return false;
        }
        SubaccountQRLinkScreenContract$InputData subaccountQRLinkScreenContract$InputData = (SubaccountQRLinkScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89103a, subaccountQRLinkScreenContract$InputData.f89103a) && Intrinsics.f(this.f89104b, subaccountQRLinkScreenContract$InputData.f89104b);
    }

    public final int hashCode() {
        return this.f89104b.hashCode() + (this.f89103a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f89103a.writeToParcel(dest, i);
        dest.writeString(this.f89104b);
    }
}
