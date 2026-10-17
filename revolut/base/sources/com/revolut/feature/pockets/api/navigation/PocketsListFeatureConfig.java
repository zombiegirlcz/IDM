package com.revolut.feature.pockets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketsListFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "fda/a", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketsListFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<PocketsListFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fda.a f80784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f80785b;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketsListFeatureConfig(fda.a.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(PocketsListFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketsListFeatureConfig[i];
        }
    }

    public PocketsListFeatureConfig(fda.a listType, AccountId accountId) {
        Intrinsics.checkNotNullParameter(listType, "listType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80784a = listType;
        this.f80785b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketsListFeatureConfig)) {
            return false;
        }
        PocketsListFeatureConfig pocketsListFeatureConfig = (PocketsListFeatureConfig) obj2;
        return this.f80784a == pocketsListFeatureConfig.f80784a && Intrinsics.f(this.f80785b, pocketsListFeatureConfig.f80785b);
    }

    public final int hashCode() {
        return this.f80785b.hashCode() + (this.f80784a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80784a.name());
        dest.writeParcelable(this.f80785b, i);
    }

    public /* synthetic */ PocketsListFeatureConfig(fda.a aVar) {
        this(aVar, AccountId.Personal.f51414a);
    }
}
