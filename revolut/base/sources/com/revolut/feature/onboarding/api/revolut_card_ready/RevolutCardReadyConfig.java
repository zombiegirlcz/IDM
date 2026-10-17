package com.revolut.feature.onboarding.api.revolut_card_ready;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/revolut_card_ready/RevolutCardReadyConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutCardReadyConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<RevolutCardReadyConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f78207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f78208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f78209c;
    public final AccountId d;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutCardReadyConfig((f0) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(RevolutCardReadyConfig.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(RevolutCardReadyConfig.class.getClassLoader()), (AccountId) parcel.readParcelable(RevolutCardReadyConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutCardReadyConfig[i];
        }
    }

    public RevolutCardReadyConfig(f0 card, NaviCommand nextCommand, AnalyticsProduct automaticEventProduct, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f78207a = card;
        this.f78208b = nextCommand;
        this.f78209c = automaticEventProduct;
        this.d = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutCardReadyConfig)) {
            return false;
        }
        RevolutCardReadyConfig revolutCardReadyConfig = (RevolutCardReadyConfig) obj2;
        return Intrinsics.f(this.f78207a, revolutCardReadyConfig.f78207a) && Intrinsics.f(this.f78208b, revolutCardReadyConfig.f78208b) && Intrinsics.f(this.f78209c, revolutCardReadyConfig.f78209c) && Intrinsics.f(this.d, revolutCardReadyConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.a(n.a(this.f78208b, this.f78207a.hashCode() * 31, 31), 31, this.f78209c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78207a);
        dest.writeParcelable(this.f78208b, i);
        dest.writeParcelable(this.f78209c, i);
        dest.writeParcelable(this.d, i);
    }
}
