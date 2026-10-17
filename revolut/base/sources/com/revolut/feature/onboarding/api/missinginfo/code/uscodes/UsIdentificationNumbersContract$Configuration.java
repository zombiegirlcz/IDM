package com.revolut.feature.onboarding.api.missinginfo.code.uscodes;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/api/missinginfo/code/uscodes/UsIdentificationNumbersContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UsIdentificationNumbersContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UsIdentificationNumbersContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f78181c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UsIdentificationNumbersContract$Configuration(parcel.readInt() != 0, parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(UsIdentificationNumbersContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UsIdentificationNumbersContract$Configuration[i];
        }
    }

    public UsIdentificationNumbersContract$Configuration() {
        this(7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UsIdentificationNumbersContract$Configuration)) {
            return false;
        }
        UsIdentificationNumbersContract$Configuration usIdentificationNumbersContract$Configuration = (UsIdentificationNumbersContract$Configuration) obj2;
        return this.f78179a == usIdentificationNumbersContract$Configuration.f78179a && this.f78180b == usIdentificationNumbersContract$Configuration.f78180b && Intrinsics.f(this.f78181c, usIdentificationNumbersContract$Configuration.f78181c);
    }

    public final int hashCode() {
        return this.f78181c.hashCode() + j6.a.c(Boolean.hashCode(this.f78179a) * 31, 31, this.f78180b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f78179a ? 1 : 0);
        dest.writeInt(this.f78180b ? 1 : 0);
        dest.writeParcelable(this.f78181c, i);
    }

    public UsIdentificationNumbersContract$Configuration(boolean z, boolean z3, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f78179a = z;
        this.f78180b = z3;
        this.f78181c = automaticEventProduct;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UsIdentificationNumbersContract$Configuration(int i) {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137494a;
        this(false, false, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var));
    }
}
