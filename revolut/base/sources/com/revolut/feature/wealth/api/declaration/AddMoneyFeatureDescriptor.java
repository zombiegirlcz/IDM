package com.revolut.feature.wealth.api.declaration;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddMoneyFeatureDescriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<AddMoneyFeatureDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddMoneyFeatureConfig.CompositeAddMoney.InputData f95191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalTransitionAnimation.Style f95192b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddMoneyFeatureDescriptor((AddMoneyFeatureConfig.CompositeAddMoney.InputData) parcel.readParcelable(AddMoneyFeatureDescriptor.class.getClassLoader()), (ModalTransitionAnimation.Style) parcel.readParcelable(AddMoneyFeatureDescriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddMoneyFeatureDescriptor[i];
        }
    }

    public AddMoneyFeatureDescriptor(AddMoneyFeatureConfig.CompositeAddMoney.InputData inputData, ModalTransitionAnimation.Style style) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f95191a = inputData;
        this.f95192b = style;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AddMoneyFeatureConfig.CompositeAddMoney.InputData getF95191a() {
        return this.f95191a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ModalTransitionAnimation.Style getF95192b() {
        return this.f95192b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddMoneyFeatureDescriptor)) {
            return false;
        }
        AddMoneyFeatureDescriptor addMoneyFeatureDescriptor = (AddMoneyFeatureDescriptor) obj2;
        return Intrinsics.f(this.f95191a, addMoneyFeatureDescriptor.f95191a) && Intrinsics.f(this.f95192b, addMoneyFeatureDescriptor.f95192b);
    }

    public final int hashCode() {
        int iHashCode = this.f95191a.hashCode() * 31;
        ModalTransitionAnimation.Style style = this.f95192b;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95191a, i);
        dest.writeParcelable(this.f95192b, i);
    }
}
