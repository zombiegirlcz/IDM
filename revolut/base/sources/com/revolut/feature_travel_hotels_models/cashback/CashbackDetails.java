package com.revolut.feature_travel_hotels_models.cashback;

import android.os.Parcel;
import android.os.Parcelable;
import hha.d;
import hha.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vei.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/cashback/CashbackDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "vei/a", "a", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashbackDetails implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f97896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97897b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CashbackDetails> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature_travel_hotels_models.cashback.CashbackDetails$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static a a(d pricingPlan) {
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            if (s.m(pricingPlan)) {
                return a.PLUS;
            }
            if (s.j(pricingPlan)) {
                return a.METAL;
            }
            if (s.n(pricingPlan)) {
                return a.PREMIUM;
            }
            if (pricingPlan.f152296p) {
                return a.STANDARD;
            }
            if (s.p(pricingPlan)) {
                return a.ULTRA;
            }
            return null;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashbackDetails(a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashbackDetails[i];
        }
    }

    public CashbackDetails(a pricingPlanCode, String percentage) {
        Intrinsics.checkNotNullParameter(pricingPlanCode, "pricingPlanCode");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        this.f97896a = pricingPlanCode;
        this.f97897b = percentage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashbackDetails)) {
            return false;
        }
        CashbackDetails cashbackDetails = (CashbackDetails) obj2;
        return this.f97896a == cashbackDetails.f97896a && Intrinsics.f(this.f97897b, cashbackDetails.f97897b);
    }

    public final int hashCode() {
        return this.f97897b.hashCode() + (this.f97896a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97896a.name());
        dest.writeString(this.f97897b);
    }
}
