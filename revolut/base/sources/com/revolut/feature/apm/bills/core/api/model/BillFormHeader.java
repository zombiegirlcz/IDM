package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFormHeader;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillFormHeader implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillFormHeader> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BillFormField.Tooltip f61297c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillFormHeader(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillFormField.Tooltip.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillFormHeader[i];
        }
    }

    public BillFormHeader(String str, String str2, BillFormField.Tooltip tooltip) {
        this.f61295a = str;
        this.f61296b = str2;
        this.f61297c = tooltip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillFormHeader)) {
            return false;
        }
        BillFormHeader billFormHeader = (BillFormHeader) obj2;
        return Intrinsics.f(this.f61295a, billFormHeader.f61295a) && Intrinsics.f(this.f61296b, billFormHeader.f61296b) && Intrinsics.f(this.f61297c, billFormHeader.f61297c);
    }

    public final int hashCode() {
        String str = this.f61295a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61296b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BillFormField.Tooltip tooltip = this.f61297c;
        return iHashCode2 + (tooltip != null ? tooltip.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61295a);
        dest.writeString(this.f61296b);
        BillFormField.Tooltip tooltip = this.f61297c;
        if (tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tooltip.writeToParcel(dest, i);
        }
    }
}
