package com.revolut.feature.credit.loan.api.models.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/legacy/UnavailabilityReason;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class UnavailabilityReason implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnavailabilityReason> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70104c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnavailabilityReason(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnavailabilityReason[i];
        }
    }

    public UnavailabilityReason(String reason, String title, String description) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f70102a = reason;
        this.f70103b = title;
        this.f70104c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UnavailabilityReason)) {
            return false;
        }
        UnavailabilityReason unavailabilityReason = (UnavailabilityReason) obj2;
        return Intrinsics.f(this.f70102a, unavailabilityReason.f70102a) && Intrinsics.f(this.f70103b, unavailabilityReason.f70103b) && Intrinsics.f(this.f70104c, unavailabilityReason.f70104c);
    }

    public final int hashCode() {
        return this.f70104c.hashCode() + p.a.c(this.f70102a.hashCode() * 31, 31, this.f70103b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70102a);
        dest.writeString(this.f70103b);
        dest.writeString(this.f70104c);
    }
}
