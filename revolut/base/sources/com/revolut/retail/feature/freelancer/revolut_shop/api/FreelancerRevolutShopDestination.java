package com.revolut.retail.feature.freelancer.revolut_shop.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolut_shop.api.RevolutShopDestination$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/freelancer/revolut_shop/api/FreelancerRevolutShopDestination;", "Lb3c/a;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerRevolutShopDestination extends InternalDestination<RevolutShopDestination$InputData> implements b3c.a, KompotDestination {

    @NotNull
    public static final Parcelable.Creator<FreelancerRevolutShopDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutShopDestination$InputData f101491b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerRevolutShopDestination((RevolutShopDestination$InputData) parcel.readParcelable(FreelancerRevolutShopDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerRevolutShopDestination[i];
        }
    }

    public FreelancerRevolutShopDestination() {
        this(0);
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f101491b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreelancerRevolutShopDestination) && Intrinsics.f(this.f101491b, ((FreelancerRevolutShopDestination) obj2).f101491b);
    }

    public final int hashCode() {
        return this.f101491b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101491b, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreelancerRevolutShopDestination(RevolutShopDestination$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101491b = inputData;
    }

    public /* synthetic */ FreelancerRevolutShopDestination(int i) {
        this(RevolutShopDestination$InputData.Catalog.f84188a);
    }
}
