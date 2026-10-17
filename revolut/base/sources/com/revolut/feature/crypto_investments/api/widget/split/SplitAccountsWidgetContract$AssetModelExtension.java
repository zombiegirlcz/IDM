package com.revolut.feature.crypto_investments.api.widget.split;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SplitAccountsWidgetContract$AssetModelExtension extends n {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel;", "Landroid/os/Parcelable;", "AutoEarnItemParcel", "MainItemParcel", "EarnItemParcel", "PerpetualItemParcel", "SpotMarginTradingItemParcel", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$AutoEarnItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$EarnItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$MainItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$PerpetualItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$SpotMarginTradingItemParcel;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SplitAccountParcel extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$AutoEarnItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel;", "<init>", "()V", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AutoEarnItemParcel implements SplitAccountParcel {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AutoEarnItemParcel f71411a = new AutoEarnItemParcel();

            @NotNull
            public static final Parcelable.Creator<AutoEarnItemParcel> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AutoEarnItemParcel.f71411a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AutoEarnItemParcel[i];
                }
            }

            private AutoEarnItemParcel() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$EarnItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel;", "<init>", "()V", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class EarnItemParcel implements SplitAccountParcel {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final EarnItemParcel f71412a = new EarnItemParcel();

            @NotNull
            public static final Parcelable.Creator<EarnItemParcel> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return EarnItemParcel.f71412a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EarnItemParcel[i];
                }
            }

            private EarnItemParcel() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$MainItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel;", "<init>", "()V", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MainItemParcel implements SplitAccountParcel {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MainItemParcel f71413a = new MainItemParcel();

            @NotNull
            public static final Parcelable.Creator<MainItemParcel> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MainItemParcel.f71413a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MainItemParcel[i];
                }
            }

            private MainItemParcel() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$PerpetualItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PerpetualItemParcel implements SplitAccountParcel {

            @NotNull
            public static final Parcelable.Creator<PerpetualItemParcel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Parcelable f71414a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PerpetualItemParcel(parcel.readParcelable(PerpetualItemParcel.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PerpetualItemParcel[i];
                }
            }

            public PerpetualItemParcel(Parcelable payload) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                this.f71414a = payload;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PerpetualItemParcel) && Intrinsics.f(this.f71414a, ((PerpetualItemParcel) obj2).f71414a);
            }

            public final int hashCode() {
                return this.f71414a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f71414a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel$SpotMarginTradingItemParcel;", "Lcom/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SpotMarginTradingItemParcel implements SplitAccountParcel {

            @NotNull
            public static final Parcelable.Creator<SpotMarginTradingItemParcel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Parcelable f71415a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SpotMarginTradingItemParcel(parcel.readParcelable(SpotMarginTradingItemParcel.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SpotMarginTradingItemParcel[i];
                }
            }

            public SpotMarginTradingItemParcel(Parcelable payload) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                this.f71415a = payload;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SpotMarginTradingItemParcel) && Intrinsics.f(this.f71415a, ((SpotMarginTradingItemParcel) obj2).f71415a);
            }

            public final int hashCode() {
                return this.f71415a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f71415a, i);
            }
        }
    }

    public abstract void Z2(RowDelegate.Model model);
}
