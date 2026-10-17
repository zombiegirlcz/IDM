package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyPaymentOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyPaymentOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyPaymentOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98043b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyPaymentOptions(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyPaymentOptions[i];
        }
    }

    public HotelsPropertyPaymentOptions(boolean z, boolean z3) {
        this.f98042a = z;
        this.f98043b = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyPaymentOptions)) {
            return false;
        }
        HotelsPropertyPaymentOptions hotelsPropertyPaymentOptions = (HotelsPropertyPaymentOptions) obj2;
        return this.f98042a == hotelsPropertyPaymentOptions.f98042a && this.f98043b == hotelsPropertyPaymentOptions.f98043b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98043b) + (Boolean.hashCode(this.f98042a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98042a ? 1 : 0);
        dest.writeInt(this.f98043b ? 1 : 0);
    }
}
