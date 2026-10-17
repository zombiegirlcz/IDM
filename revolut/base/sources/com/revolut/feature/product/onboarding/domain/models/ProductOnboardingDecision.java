package com.revolut.feature.product.onboarding.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingDecision;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductOnboardingDecision implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductOnboardingDecision> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f81219a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ProductOnboardingDecision.class, parcel, arrayList, iE, 1);
            }
            return new ProductOnboardingDecision(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductOnboardingDecision[i];
        }
    }

    public ProductOnboardingDecision(ArrayList steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f81219a = steps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ProductOnboardingDecision) && this.f81219a.equals(((ProductOnboardingDecision) obj2).f81219a);
    }

    public final int hashCode() {
        return this.f81219a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f81219a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
