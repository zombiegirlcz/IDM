package com.revolut.feature.wealth.api.declaration;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.declaration.WithdrawFeatureConfig;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/WithdrawFeatureDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WithdrawFeatureDescriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<WithdrawFeatureDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WithdrawFeatureConfig.Destination f95222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalTransitionAnimation.Style f95223b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawFeatureDescriptor(WithdrawFeatureConfig.Destination.CREATOR.createFromParcel(parcel), (ModalTransitionAnimation.Style) parcel.readParcelable(WithdrawFeatureDescriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WithdrawFeatureDescriptor[i];
        }
    }

    public WithdrawFeatureDescriptor(WithdrawFeatureConfig.Destination destination, ModalTransitionAnimation.Style style) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f95222a = destination;
        this.f95223b = style;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WithdrawFeatureConfig.Destination getF95222a() {
        return this.f95222a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ModalTransitionAnimation.Style getF95223b() {
        return this.f95223b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WithdrawFeatureDescriptor)) {
            return false;
        }
        WithdrawFeatureDescriptor withdrawFeatureDescriptor = (WithdrawFeatureDescriptor) obj2;
        return Intrinsics.f(this.f95222a, withdrawFeatureDescriptor.f95222a) && Intrinsics.f(this.f95223b, withdrawFeatureDescriptor.f95223b);
    }

    public final int hashCode() {
        int iHashCode = this.f95222a.hashCode() * 31;
        ModalTransitionAnimation.Style style = this.f95223b;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f95222a.writeToParcel(dest, i);
        dest.writeParcelable(this.f95223b, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WithdrawFeatureDescriptor(TransferSubjectId transferSubjectId, WealthAccountType product, b targetCurrency) {
        this(new WithdrawFeatureConfig.Destination(transferSubjectId, product, targetCurrency), ModalTransitionAnimation.Style.POPUP.f98391a);
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
    }
}
