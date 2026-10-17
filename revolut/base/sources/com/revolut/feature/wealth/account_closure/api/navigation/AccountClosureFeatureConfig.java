package com.revolut.feature.wealth.account_closure.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mtg.b;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/navigation/AccountClosureFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "mtg/b", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class AccountClosureFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<AccountClosureFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f94886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94887b;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureFeatureConfig(b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureFeatureConfig[i];
        }
    }

    public AccountClosureFeatureConfig(b accountType, String portfolioId) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f94886a = accountType;
        this.f94887b = portfolioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureFeatureConfig)) {
            return false;
        }
        AccountClosureFeatureConfig accountClosureFeatureConfig = (AccountClosureFeatureConfig) obj2;
        return this.f94886a == accountClosureFeatureConfig.f94886a && Intrinsics.f(this.f94887b, accountClosureFeatureConfig.f94887b);
    }

    public final int hashCode() {
        return this.f94887b.hashCode() + (this.f94886a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94886a.name());
        dest.writeString(this.f94887b);
    }
}
