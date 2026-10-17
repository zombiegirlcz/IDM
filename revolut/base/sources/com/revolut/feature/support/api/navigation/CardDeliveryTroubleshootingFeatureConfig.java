package com.revolut.feature.support.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uce.c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/api/navigation/CardDeliveryTroubleshootingFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDeliveryTroubleshootingFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CardDeliveryTroubleshootingFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDeliveryTroubleshootingFeatureFlow f89349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89350c;
    public final int d;
    public final AccountId e;
    public final c f;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDeliveryTroubleshootingFeatureConfig(parcel.readString(), CardDeliveryTroubleshootingFeatureFlow.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), (AccountId) parcel.readParcelable(CardDeliveryTroubleshootingFeatureConfig.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryTroubleshootingFeatureConfig[i];
        }
    }

    public CardDeliveryTroubleshootingFeatureConfig(String cardId, CardDeliveryTroubleshootingFeatureFlow flow, String str, int i, AccountId accountId, c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f89348a = cardId;
        this.f89349b = flow;
        this.f89350c = str;
        this.d = i;
        this.e = accountId;
        this.f = neverReceivedCardMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDeliveryTroubleshootingFeatureConfig)) {
            return false;
        }
        CardDeliveryTroubleshootingFeatureConfig cardDeliveryTroubleshootingFeatureConfig = (CardDeliveryTroubleshootingFeatureConfig) obj2;
        return Intrinsics.f(this.f89348a, cardDeliveryTroubleshootingFeatureConfig.f89348a) && this.f89349b == cardDeliveryTroubleshootingFeatureConfig.f89349b && Intrinsics.f(this.f89350c, cardDeliveryTroubleshootingFeatureConfig.f89350c) && this.d == cardDeliveryTroubleshootingFeatureConfig.d && Intrinsics.f(this.e, cardDeliveryTroubleshootingFeatureConfig.e) && this.f == cardDeliveryTroubleshootingFeatureConfig.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f89349b.hashCode() + (this.f89348a.hashCode() * 31)) * 31;
        String str = this.f89350c;
        return this.f.hashCode() + l.b(this.e, j6.a.b(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89348a);
        this.f89349b.writeToParcel(dest, i);
        dest.writeString(this.f89350c);
        dest.writeInt(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
    }

    public /* synthetic */ CardDeliveryTroubleshootingFeatureConfig(String str, CardDeliveryTroubleshootingFeatureFlow cardDeliveryTroubleshootingFeatureFlow, String str2, AccountId accountId, c cVar, int i) {
        this(str, cardDeliveryTroubleshootingFeatureFlow, str2, (i & 8) != 0 ? 0 : 67108864, (i & 16) != 0 ? AccountId.Personal.f51414a : accountId, (i & 32) != 0 ? c.ALL_OPTIONS : cVar);
    }
}
