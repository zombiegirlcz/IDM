package com.revolut.feature.apm.core.models.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import i02.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingAccountDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "i02/c", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmOnboardingAccountDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmOnboardingAccountDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f61957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61959c;
    public final String d;
    public final ApmOnboardingConflict e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmOnboardingAccountDetails(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (ApmOnboardingConflict) parcel.readParcelable(ApmOnboardingAccountDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmOnboardingAccountDetails[i];
        }
    }

    public ApmOnboardingAccountDetails(c accountType, String str, String iban, String bic2, ApmOnboardingConflict apmOnboardingConflict) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(iban, "iban");
        Intrinsics.checkNotNullParameter(bic2, "bic");
        this.f61957a = accountType;
        this.f61958b = str;
        this.f61959c = iban;
        this.d = bic2;
        this.e = apmOnboardingConflict;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmOnboardingAccountDetails)) {
            return false;
        }
        ApmOnboardingAccountDetails apmOnboardingAccountDetails = (ApmOnboardingAccountDetails) obj2;
        return this.f61957a == apmOnboardingAccountDetails.f61957a && Intrinsics.f(this.f61958b, apmOnboardingAccountDetails.f61958b) && Intrinsics.f(this.f61959c, apmOnboardingAccountDetails.f61959c) && Intrinsics.f(this.d, apmOnboardingAccountDetails.d) && Intrinsics.f(this.e, apmOnboardingAccountDetails.e);
    }

    public final int hashCode() {
        int iHashCode = this.f61957a.hashCode() * 31;
        String str = this.f61958b;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61959c), 31, this.d);
        ApmOnboardingConflict apmOnboardingConflict = this.e;
        return iC + (apmOnboardingConflict != null ? apmOnboardingConflict.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61957a.name());
        dest.writeString(this.f61958b);
        dest.writeString(this.f61959c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
