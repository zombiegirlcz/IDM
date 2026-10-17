package com.revolut.feature.card_screen.api.activity;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/activity/CardsScreenFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsScreenFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CardsScreenFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.a f65323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f65325c;
    public final AccountId d;
    public final CardScreenAction e;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsScreenFeatureConfig(parcel.readInt() == 0 ? null : i63.a.valueOf(parcel.readString()), parcel.readString(), d.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardsScreenFeatureConfig.class.getClassLoader()), (CardScreenAction) parcel.readParcelable(CardsScreenFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsScreenFeatureConfig[i];
        }
    }

    public CardsScreenFeatureConfig() {
        this(null, null, null, null, null, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsScreenFeatureConfig)) {
            return false;
        }
        CardsScreenFeatureConfig cardsScreenFeatureConfig = (CardsScreenFeatureConfig) obj2;
        return this.f65323a == cardsScreenFeatureConfig.f65323a && Intrinsics.f(this.f65324b, cardsScreenFeatureConfig.f65324b) && this.f65325c == cardsScreenFeatureConfig.f65325c && Intrinsics.f(this.d, cardsScreenFeatureConfig.d) && Intrinsics.f(this.e, cardsScreenFeatureConfig.e);
    }

    public final int hashCode() {
        i63.a aVar = this.f65323a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f65324b;
        return this.e.hashCode() + l.b(this.d, (this.f65325c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        i63.a aVar = this.f65323a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f65324b);
        dest.writeString(this.f65325c.name());
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }

    public CardsScreenFeatureConfig(i63.a aVar, String str, d cardScope, AccountId accountId, CardScreenAction action) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f65323a = aVar;
        this.f65324b = str;
        this.f65325c = cardScope;
        this.d = accountId;
        this.e = action;
    }

    public /* synthetic */ CardsScreenFeatureConfig(i63.a aVar, String str, d dVar, AccountId accountId, CardScreenAction cardScreenAction, int i) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? d.RETAIL : dVar, (i & 8) != 0 ? AccountId.Personal.f51414a : accountId, (i & 16) != 0 ? CardScreenAction.Idle.f65329a : cardScreenAction);
    }
}
