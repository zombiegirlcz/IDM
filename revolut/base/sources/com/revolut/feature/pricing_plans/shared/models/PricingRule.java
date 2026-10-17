package com.revolut.feature.pricing_plans.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/PricingRule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingRule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingRule> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Conditions f80960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fee f80961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f80962c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingRule(Conditions.CREATOR.createFromParcel(parcel), (Fee) parcel.readParcelable(PricingRule.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingRule[i];
        }
    }

    public PricingRule(Conditions conditions, Fee fee2, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f80960a = conditions;
        this.f80961b = fee2;
        this.f80962c = dVar;
        this.d = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingRule)) {
            return false;
        }
        PricingRule pricingRule = (PricingRule) obj2;
        return Intrinsics.f(this.f80960a, pricingRule.f80960a) && Intrinsics.f(this.f80961b, pricingRule.f80961b) && Intrinsics.f(this.f80962c, pricingRule.f80962c) && Intrinsics.f(this.d, pricingRule.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f80961b.hashCode() + (this.f80960a.hashCode() * 31)) * 31;
        d dVar = this.f80962c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.d;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f80960a.writeToParcel(dest, i);
        dest.writeParcelable(this.f80961b, i);
        dest.writeSerializable(this.f80962c);
        dest.writeSerializable(this.d);
    }
}
