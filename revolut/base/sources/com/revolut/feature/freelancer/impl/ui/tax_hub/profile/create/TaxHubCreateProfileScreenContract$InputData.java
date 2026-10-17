package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubCreateProfileScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubCreateProfileScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f74338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f74340c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubCreateProfileScreenContract$InputData(parcel.readInt() != 0, parcel.readInt() != 0, j.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubCreateProfileScreenContract$InputData[i];
        }
    }

    public TaxHubCreateProfileScreenContract$InputData(boolean z, boolean z3, j taxType, String str) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f74338a = z;
        this.f74339b = z3;
        this.f74340c = taxType;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubCreateProfileScreenContract$InputData)) {
            return false;
        }
        TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = (TaxHubCreateProfileScreenContract$InputData) obj2;
        return this.f74338a == taxHubCreateProfileScreenContract$InputData.f74338a && this.f74339b == taxHubCreateProfileScreenContract$InputData.f74339b && this.f74340c == taxHubCreateProfileScreenContract$InputData.f74340c && Intrinsics.f(this.d, taxHubCreateProfileScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f74340c.hashCode() + j6.a.c(Boolean.hashCode(this.f74338a) * 31, 31, this.f74339b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f74338a ? 1 : 0);
        dest.writeInt(this.f74339b ? 1 : 0);
        dest.writeString(this.f74340c.name());
        dest.writeString(this.d);
    }
}
