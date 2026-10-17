package com.revolut.feature.retail.savings.api.core.navigation;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/api/core/navigation/CapitalAtRiskControllerDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CapitalAtRiskControllerDescriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<CapitalAtRiskControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f83122a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CapitalAtRiskControllerDescriptor(g.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CapitalAtRiskControllerDescriptor[i];
        }
    }

    public CapitalAtRiskControllerDescriptor(g groupType) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        this.f83122a = groupType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CapitalAtRiskControllerDescriptor) && this.f83122a == ((CapitalAtRiskControllerDescriptor) obj2).f83122a;
    }

    public final int hashCode() {
        return this.f83122a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83122a.name());
    }
}
