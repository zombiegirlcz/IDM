package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MinAmountValidation;", "Lcom/revolut/feature/backend_flow/domain/models/MoneyValidation;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MinAmountValidation implements MoneyValidation {

    @NotNull
    public static final Parcelable.Creator<MinAmountValidation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63526c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MinAmountValidation(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MinAmountValidation[i];
        }
    }

    public MinAmountValidation(String currency, long j2, String errorMessage) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f63524a = currency;
        this.f63525b = j2;
        this.f63526c = errorMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MinAmountValidation)) {
            return false;
        }
        MinAmountValidation minAmountValidation = (MinAmountValidation) obj2;
        return Intrinsics.f(this.f63524a, minAmountValidation.f63524a) && this.f63525b == minAmountValidation.f63525b && Intrinsics.f(this.f63526c, minAmountValidation.f63526c);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.MoneyValidation
    /* JADX INFO: renamed from: getCurrency, reason: from getter */
    public final String getF63524a() {
        return this.f63524a;
    }

    public final int hashCode() {
        return this.f63526c.hashCode() + a0.d.c(this.f63524a.hashCode() * 31, 31, this.f63525b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63524a);
        dest.writeLong(this.f63525b);
        dest.writeString(this.f63526c);
    }
}
