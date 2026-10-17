package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kl7.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaQuoteError;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kl7/x0", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaQuoteError implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MtaQuoteError> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f75259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75260b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaQuoteError(x0.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaQuoteError[i];
        }
    }

    public MtaQuoteError(x0 reason, boolean z) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f75259a = reason;
        this.f75260b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaQuoteError)) {
            return false;
        }
        MtaQuoteError mtaQuoteError = (MtaQuoteError) obj2;
        return this.f75259a == mtaQuoteError.f75259a && this.f75260b == mtaQuoteError.f75260b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75260b) + (this.f75259a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75259a.name());
        dest.writeInt(this.f75260b ? 1 : 0);
    }
}
