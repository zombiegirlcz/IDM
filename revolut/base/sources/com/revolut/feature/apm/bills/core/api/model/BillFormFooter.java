package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFormFooter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillFormFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillFormFooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61294c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillFormFooter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillFormFooter[i];
        }
    }

    public BillFormFooter(String str, String str2, String str3) {
        this.f61292a = str;
        this.f61293b = str2;
        this.f61294c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillFormFooter)) {
            return false;
        }
        BillFormFooter billFormFooter = (BillFormFooter) obj2;
        return Intrinsics.f(this.f61292a, billFormFooter.f61292a) && Intrinsics.f(this.f61293b, billFormFooter.f61293b) && Intrinsics.f(this.f61294c, billFormFooter.f61294c);
    }

    public final int hashCode() {
        String str = this.f61292a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61293b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61294c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61292a);
        dest.writeString(this.f61293b);
        dest.writeString(this.f61294c);
    }
}
