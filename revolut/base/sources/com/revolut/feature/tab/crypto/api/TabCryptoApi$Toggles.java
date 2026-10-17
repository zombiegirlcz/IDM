package com.revolut.feature.tab.crypto.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class TabCryptoApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/api/TabCryptoApi$Toggles$CryptoHomeMultipleAccounts;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_tab_crypto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoHomeMultipleAccounts extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CryptoHomeMultipleAccounts f89774c = new CryptoHomeMultipleAccounts();

        @NotNull
        public static final Parcelable.Creator<CryptoHomeMultipleAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoHomeMultipleAccounts.f89774c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoHomeMultipleAccounts[i];
            }
        }

        private CryptoHomeMultipleAccounts() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoHomeMultipleAccounts");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/api/TabCryptoApi$Toggles$CryptoNotAllowedCurrenciesHandling;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_tab_crypto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoNotAllowedCurrenciesHandling extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CryptoNotAllowedCurrenciesHandling f89775c = new CryptoNotAllowedCurrenciesHandling();

        @NotNull
        public static final Parcelable.Creator<CryptoNotAllowedCurrenciesHandling> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoNotAllowedCurrenciesHandling.f89775c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoNotAllowedCurrenciesHandling[i];
            }
        }

        private CryptoNotAllowedCurrenciesHandling() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoNotAllowedCurrenciesHandling");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/api/TabCryptoApi$Toggles$InviteFriends;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_tab_crypto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InviteFriends extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InviteFriends f89776c = new InviteFriends();

        @NotNull
        public static final Parcelable.Creator<InviteFriends> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InviteFriends.f89776c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteFriends[i];
            }
        }

        private InviteFriends() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("growthCryptoReferrals");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private TabCryptoApi$Toggles() {
    }

    public static List a() {
        return v.k(InviteFriends.f89776c, CryptoNotAllowedCurrenciesHandling.f89775c, CryptoHomeMultipleAccounts.f89774c);
    }
}
