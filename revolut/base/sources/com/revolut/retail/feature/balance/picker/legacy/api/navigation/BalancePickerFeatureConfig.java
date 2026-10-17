package com.revolut.retail.feature.balance.picker.legacy.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.balance.picker.api.models.BalanceRecipientInfo;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "Currencies", "ShowBalancesSetting", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class BalancePickerFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<BalancePickerFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f99540c;
    public final boolean d;
    public final Currencies e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f99541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f99542h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f99543j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f99544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ShowBalancesSetting f99545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f99546n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f99547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BalanceRecipientInfo f99548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dfa.a f99549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f99550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccountId f99551t;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "Landroid/os/Parcelable;", "<init>", "()V", "UserPockets", "TopUpCards", "TopUpAll", "TopUpRevXFiat", "HoldingAndExtraFx", "ExchangeDefaultCurrency", "Cashback", "Holding", "CustomActive", "All", "AllSelectable", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$All;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$AllSelectable;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$Cashback;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$CustomActive;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$ExchangeDefaultCurrency;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$Holding;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$HoldingAndExtraFx;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$TopUpAll;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$TopUpCards;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$TopUpRevXFiat;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$UserPockets;", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Currencies implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$All;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final class All extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final All f99552a = new All();

            @NotNull
            public static final Parcelable.Creator<All> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return All.f99552a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new All[i];
                }
            }

            private All() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$AllSelectable;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class AllSelectable extends Currencies {

            @NotNull
            public static final Parcelable.Creator<AllSelectable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashSet f99553a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = o.a(parcel, linkedHashSet, iA, 1);
                    }
                    return new AllSelectable(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllSelectable[i];
                }
            }

            public AllSelectable(LinkedHashSet currencies) {
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                this.f99553a = currencies;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AllSelectable) && this.f99553a.equals(((AllSelectable) obj2).f99553a);
            }

            public final int hashCode() {
                return this.f99553a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                LinkedHashSet linkedHashSet = this.f99553a;
                dest.writeInt(linkedHashSet.size());
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    dest.writeString((String) it8.next());
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$Cashback;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Cashback extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Cashback f99554a = new Cashback();

            @NotNull
            public static final Parcelable.Creator<Cashback> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Cashback.f99554a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cashback[i];
                }
            }

            private Cashback() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$CustomActive;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CustomActive extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CustomActive f99555a = new CustomActive();

            @NotNull
            public static final Parcelable.Creator<CustomActive> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CustomActive.f99555a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CustomActive[i];
                }
            }

            private CustomActive() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$ExchangeDefaultCurrency;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ExchangeDefaultCurrency extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ExchangeDefaultCurrency f99556a = new ExchangeDefaultCurrency();

            @NotNull
            public static final Parcelable.Creator<ExchangeDefaultCurrency> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ExchangeDefaultCurrency.f99556a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExchangeDefaultCurrency[i];
                }
            }

            private ExchangeDefaultCurrency() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$Holding;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Holding extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Holding f99557a = new Holding();

            @NotNull
            public static final Parcelable.Creator<Holding> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Holding.f99557a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Holding[i];
                }
            }

            private Holding() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$TopUpAll;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TopUpAll extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TopUpAll f99559a = new TopUpAll();

            @NotNull
            public static final Parcelable.Creator<TopUpAll> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TopUpAll.f99559a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TopUpAll[i];
                }
            }

            private TopUpAll() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$TopUpCards;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TopUpCards extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TopUpCards f99560a = new TopUpCards();

            @NotNull
            public static final Parcelable.Creator<TopUpCards> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TopUpCards.f99560a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TopUpCards[i];
                }
            }

            private TopUpCards() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$TopUpRevXFiat;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TopUpRevXFiat extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TopUpRevXFiat f99561a = new TopUpRevXFiat();

            @NotNull
            public static final Parcelable.Creator<TopUpRevXFiat> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TopUpRevXFiat.f99561a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TopUpRevXFiat[i];
                }
            }

            private TopUpRevXFiat() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$UserPockets;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UserPockets extends Currencies {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UserPockets f99562a = new UserPockets();

            @NotNull
            public static final Parcelable.Creator<UserPockets> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UserPockets.f99562a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UserPockets[i];
                }
            }

            private UserPockets() {
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

        private Currencies() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies$HoldingAndExtraFx;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$Currencies;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HoldingAndExtraFx extends Currencies {

            @NotNull
            public static final Parcelable.Creator<HoldingAndExtraFx> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f99558a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new HoldingAndExtraFx(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HoldingAndExtraFx[i];
                }
            }

            public HoldingAndExtraFx(boolean z) {
                this.f99558a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof HoldingAndExtraFx) && this.f99558a == ((HoldingAndExtraFx) obj2).f99558a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f99558a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f99558a ? 1 : 0);
            }

            public HoldingAndExtraFx() {
                this(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting;", "Landroid/os/Parcelable;", "<init>", "()V", "None", "InItemCurrency", "InItemAndBaseCurrencies", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting$InItemAndBaseCurrencies;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting$InItemCurrency;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting$None;", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ShowBalancesSetting implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting$InItemAndBaseCurrencies;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InItemAndBaseCurrencies extends ShowBalancesSetting {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InItemAndBaseCurrencies f99563a = new InItemAndBaseCurrencies();

            @NotNull
            public static final Parcelable.Creator<InItemAndBaseCurrencies> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InItemAndBaseCurrencies.f99563a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InItemAndBaseCurrencies[i];
                }
            }

            private InItemAndBaseCurrencies() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting$InItemCurrency;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InItemCurrency extends ShowBalancesSetting {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InItemCurrency f99564a = new InItemCurrency();

            @NotNull
            public static final Parcelable.Creator<InItemCurrency> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InItemCurrency.f99564a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InItemCurrency[i];
                }
            }

            private InItemCurrency() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting$None;", "Lcom/revolut/retail/feature/balance/picker/legacy/api/navigation/BalancePickerFeatureConfig$ShowBalancesSetting;", "<init>", "()V", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class None extends ShowBalancesSetting {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final None f99565a = new None();

            @NotNull
            public static final Parcelable.Creator<None> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.f99565a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new None[i];
                }
            }

            private None() {
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

        private ShowBalancesSetting() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            Currencies currencies;
            boolean z;
            Class cls2;
            boolean z3;
            Class cls3;
            boolean z4;
            Class cls4;
            boolean z6;
            Class cls5;
            boolean z11;
            LinkedHashSet linkedHashSet;
            boolean z12;
            LinkedHashSet linkedHashSet2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            l lVarValueOf = l.valueOf(parcel.readString());
            boolean z29 = parcel.readInt() != 0;
            Currencies currencies2 = (Currencies) parcel.readParcelable(BalancePickerFeatureConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = BalancePickerFeatureConfig.class;
                currencies = currencies2;
                z = true;
            } else {
                cls = BalancePickerFeatureConfig.class;
                currencies = currencies2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                cls2 = cls;
                z3 = true;
            } else {
                cls2 = cls;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                cls3 = cls2;
                z4 = true;
            } else {
                cls3 = cls2;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                cls4 = cls3;
                z6 = true;
            } else {
                cls4 = cls3;
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                cls5 = cls4;
                z11 = true;
            } else {
                cls5 = cls4;
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                z12 = z29;
                linkedHashSet2 = null;
            } else {
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                z12 = z29;
                int iA2 = 0;
                while (iA2 != i3) {
                    iA2 = o.a(parcel, linkedHashSet3, iA2, 1);
                }
                linkedHashSet2 = linkedHashSet3;
            }
            return new BalancePickerFeatureConfig(i, string, lVarValueOf, z12, currencies, z, z3, z4, z6, z11, linkedHashSet, linkedHashSet2, (ShowBalancesSetting) parcel.readParcelable(cls5.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BalanceRecipientInfo) parcel.readParcelable(cls5.getClassLoader()), parcel.readInt() == 0 ? null : dfa.a.valueOf(parcel.readString()), parcel.readInt() != 0, (AccountId) parcel.readParcelable(cls5.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalancePickerFeatureConfig[i];
        }
    }

    public BalancePickerFeatureConfig(int i, String str, l pocketType, boolean z, Currencies currencies, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ShowBalancesSetting showBalances, boolean z29, Integer num, Integer num2, BalanceRecipientInfo balanceRecipientInfo, dfa.a aVar, boolean z31, AccountId accountId) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(showBalances, "showBalances");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f99538a = i;
        this.f99539b = str;
        this.f99540c = pocketType;
        this.d = z;
        this.e = currencies;
        this.f = z3;
        this.f99541g = z4;
        this.f99542h = z6;
        this.i = z11;
        this.f99543j = z12;
        this.k = linkedHashSet;
        this.f99544l = linkedHashSet2;
        this.f99545m = showBalances;
        this.f99546n = z29;
        this.o = num;
        this.f99547p = num2;
        this.f99548q = balanceRecipientInfo;
        this.f99549r = aVar;
        this.f99550s = z31;
        this.f99551t = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BalancePickerFeatureConfig)) {
            return false;
        }
        BalancePickerFeatureConfig balancePickerFeatureConfig = (BalancePickerFeatureConfig) obj2;
        return this.f99538a == balancePickerFeatureConfig.f99538a && Intrinsics.f(this.f99539b, balancePickerFeatureConfig.f99539b) && this.f99540c == balancePickerFeatureConfig.f99540c && this.d == balancePickerFeatureConfig.d && Intrinsics.f(this.e, balancePickerFeatureConfig.e) && this.f == balancePickerFeatureConfig.f && this.f99541g == balancePickerFeatureConfig.f99541g && this.f99542h == balancePickerFeatureConfig.f99542h && this.i == balancePickerFeatureConfig.i && this.f99543j == balancePickerFeatureConfig.f99543j && Intrinsics.f(this.k, balancePickerFeatureConfig.k) && Intrinsics.f(this.f99544l, balancePickerFeatureConfig.f99544l) && Intrinsics.f(this.f99545m, balancePickerFeatureConfig.f99545m) && this.f99546n == balancePickerFeatureConfig.f99546n && Intrinsics.f(this.o, balancePickerFeatureConfig.o) && Intrinsics.f(this.f99547p, balancePickerFeatureConfig.f99547p) && Intrinsics.f(this.f99548q, balancePickerFeatureConfig.f99548q) && this.f99549r == balancePickerFeatureConfig.f99549r && this.f99550s == balancePickerFeatureConfig.f99550s && Intrinsics.f(this.f99551t, balancePickerFeatureConfig.f99551t);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f99538a) * 31;
        String str = this.f99539b;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.e.hashCode() + j6.a.c(t61.a.c(this.f99540c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d)) * 31, 31, this.f), 31, this.f99541g), 31, this.f99542h), 31, this.i), 31, this.f99543j);
        Set set = this.k;
        int iHashCode2 = (iC + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f99544l;
        int iC2 = j6.a.c((this.f99545m.hashCode() + ((iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31)) * 31, 31, this.f99546n);
        Integer num = this.o;
        int iHashCode3 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f99547p;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BalanceRecipientInfo balanceRecipientInfo = this.f99548q;
        int iHashCode5 = (iHashCode4 + (balanceRecipientInfo == null ? 0 : balanceRecipientInfo.hashCode())) * 31;
        dfa.a aVar = this.f99549r;
        return this.f99551t.hashCode() + j6.a.c((iHashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f99550s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f99538a);
        dest.writeString(this.f99539b);
        dest.writeString(this.f99540c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f99541g ? 1 : 0);
        dest.writeInt(this.f99542h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f99543j ? 1 : 0);
        Set set = this.k;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString((String) itQ.next());
            }
        }
        Set set2 = this.f99544l;
        if (set2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = e.q(dest, 1, set2);
            while (itQ2.hasNext()) {
                dest.writeString((String) itQ2.next());
            }
        }
        dest.writeParcelable(this.f99545m, i);
        dest.writeInt(this.f99546n ? 1 : 0);
        Integer num = this.o;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f99547p;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeParcelable(this.f99548q, i);
        dfa.a aVar = this.f99549r;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeInt(this.f99550s ? 1 : 0);
        dest.writeParcelable(this.f99551t, i);
    }
}
