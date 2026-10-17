package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.ZonedDateTime;
import kl7.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/CancellationDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancellationDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancellationDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f75184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f75185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f75186c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancellationDetails((ZonedDateTime) parcel.readSerializable(), l1.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationDetails[i];
        }
    }

    public CancellationDetails(ZonedDateTime cancellationDateTime, l1 cancellationReason, d dVar, String str) {
        Intrinsics.checkNotNullParameter(cancellationDateTime, "cancellationDateTime");
        Intrinsics.checkNotNullParameter(cancellationReason, "cancellationReason");
        this.f75184a = cancellationDateTime;
        this.f75185b = cancellationReason;
        this.f75186c = dVar;
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
        if (!(obj2 instanceof CancellationDetails)) {
            return false;
        }
        CancellationDetails cancellationDetails = (CancellationDetails) obj2;
        return Intrinsics.f(this.f75184a, cancellationDetails.f75184a) && this.f75185b == cancellationDetails.f75185b && Intrinsics.f(this.f75186c, cancellationDetails.f75186c) && Intrinsics.f(this.d, cancellationDetails.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f75185b.hashCode() + (this.f75184a.hashCode() * 31)) * 31;
        d dVar = this.f75186c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f75184a);
        dest.writeString(this.f75185b.name());
        dest.writeSerializable(this.f75186c);
        dest.writeString(this.d);
    }
}
