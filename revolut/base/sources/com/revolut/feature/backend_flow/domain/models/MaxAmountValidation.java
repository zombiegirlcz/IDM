package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MaxAmountValidation;", "Lcom/revolut/feature/backend_flow/domain/models/MoneyValidation;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MaxAmountValidation implements MoneyValidation {

    @NotNull
    public static final Parcelable.Creator<MaxAmountValidation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63521c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaxAmountValidation(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaxAmountValidation[i];
        }
    }

    public MaxAmountValidation(String currency, long j2, String errorMessage) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f63519a = currency;
        this.f63520b = j2;
        this.f63521c = errorMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MaxAmountValidation)) {
            return false;
        }
        MaxAmountValidation maxAmountValidation = (MaxAmountValidation) obj2;
        return Intrinsics.f(this.f63519a, maxAmountValidation.f63519a) && this.f63520b == maxAmountValidation.f63520b && Intrinsics.f(this.f63521c, maxAmountValidation.f63521c);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.MoneyValidation
    /* JADX INFO: renamed from: getCurrency, reason: from getter */
    public final String getF63524a() {
        return this.f63519a;
    }

    public final int hashCode() {
        return this.f63521c.hashCode() + a0.d.c(this.f63519a.hashCode() * 31, 31, this.f63520b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63519a);
        dest.writeLong(this.f63520b);
        dest.writeString(this.f63521c);
    }
}
