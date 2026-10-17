package com.revolut.feature.push_to_card.api.feature_config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/feature_config/PushToCardAddCardFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushToCardAddCardFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<PushToCardAddCardFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypa.a f81498a;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PushToCardAddCardFeatureConfig(ypa.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushToCardAddCardFeatureConfig[i];
        }
    }

    public PushToCardAddCardFeatureConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PushToCardAddCardFeatureConfig) && this.f81498a == ((PushToCardAddCardFeatureConfig) obj2).f81498a;
    }

    public final int hashCode() {
        return this.f81498a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81498a.name());
    }

    public PushToCardAddCardFeatureConfig(ypa.a finishMode) {
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        this.f81498a = finishMode;
    }

    public /* synthetic */ PushToCardAddCardFeatureConfig(int i) {
        this(ypa.a.DEFAULT);
    }
}
