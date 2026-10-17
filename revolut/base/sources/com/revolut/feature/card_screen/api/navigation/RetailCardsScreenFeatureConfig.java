package com.revolut.feature.card_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "ShowPinAuth", "ResetContactlessLimit", "Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig$ResetContactlessLimit;", "Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig$ShowPinAuth;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RetailCardsScreenFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig$ResetContactlessLimit;", "Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResetContactlessLimit extends RetailCardsScreenFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ResetContactlessLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65367b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResetContactlessLimit(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResetContactlessLimit[i];
            }
        }

        public ResetContactlessLimit(String str, int i) {
            this.f65366a = str;
            this.f65367b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ResetContactlessLimit)) {
                return false;
            }
            ResetContactlessLimit resetContactlessLimit = (ResetContactlessLimit) obj2;
            return Intrinsics.f(this.f65366a, resetContactlessLimit.f65366a) && this.f65367b == resetContactlessLimit.f65367b;
        }

        public final int hashCode() {
            String str = this.f65366a;
            return Integer.hashCode(this.f65367b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65366a);
            dest.writeInt(this.f65367b);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig$ShowPinAuth;", "Lcom/revolut/feature/card_screen/api/navigation/RetailCardsScreenFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowPinAuth extends RetailCardsScreenFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ShowPinAuth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f65368a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowPinAuth(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowPinAuth[i];
            }
        }

        public ShowPinAuth(Integer num) {
            this.f65368a = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowPinAuth) && Intrinsics.f(this.f65368a, ((ShowPinAuth) obj2).f65368a);
        }

        public final int hashCode() {
            Integer num = this.f65368a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f65368a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    private RetailCardsScreenFeatureConfig() {
    }
}
