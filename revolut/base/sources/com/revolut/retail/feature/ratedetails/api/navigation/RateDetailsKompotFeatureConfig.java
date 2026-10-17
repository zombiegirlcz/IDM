package com.revolut.retail.feature.ratedetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/api/navigation/RateDetailsKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "RateDetails", "RateDetailsDestination", "Lcom/revolut/retail/feature/ratedetails/api/navigation/RateDetailsKompotFeatureConfig$RateDetails;", "feature_rate_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RateDetailsKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/api/navigation/RateDetailsKompotFeatureConfig$RateDetails;", "Lcom/revolut/retail/feature/ratedetails/api/navigation/RateDetailsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_rate_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RateDetails extends RateDetailsKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RateDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f103708g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f103709h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f103710j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f103711l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f103712m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final BuyFundingCurrencyPrefill f103713n;
        public final ActivityAnimation o;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                boolean z6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                b bVar2 = (b) parcel.readSerializable();
                boolean z11 = false;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z11 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z12 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                } else {
                    z6 = z4;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new RateDetails(bVar, bVar2, z11, z12, z3, z4, z6, (BuyFundingCurrencyPrefill) parcel.readParcelable(RateDetails.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(RateDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RateDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RateDetails(b currencyFrom, b currencyTo, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill, ActivityAnimation activityAnimation) {
            super(null, new RateDetailsDestination(currencyFrom, currencyTo, z, z3, z4, z6, z11, buyFundingCurrencyPrefill), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
            Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
            this.f103708g = currencyFrom;
            this.f103709h = currencyTo;
            this.i = z;
            this.f103710j = z3;
            this.k = z4;
            this.f103711l = z6;
            this.f103712m = z11;
            this.f103713n = buyFundingCurrencyPrefill;
            this.o = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF81832g() {
            return this.o;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RateDetails)) {
                return false;
            }
            RateDetails rateDetails = (RateDetails) obj2;
            return Intrinsics.f(this.f103708g, rateDetails.f103708g) && Intrinsics.f(this.f103709h, rateDetails.f103709h) && this.i == rateDetails.i && this.f103710j == rateDetails.f103710j && this.k == rateDetails.k && this.f103711l == rateDetails.f103711l && this.f103712m == rateDetails.f103712m && Intrinsics.f(this.f103713n, rateDetails.f103713n) && Intrinsics.f(this.o, rateDetails.o);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(l.j(this.f103709h, this.f103708g.hashCode() * 31, 31), 31, this.i), 31, this.f103710j), 31, this.k), 31, this.f103711l), 31, this.f103712m);
            BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.f103713n;
            int iHashCode = (iC + (buyFundingCurrencyPrefill == null ? 0 : buyFundingCurrencyPrefill.hashCode())) * 31;
            ActivityAnimation activityAnimation = this.o;
            return iHashCode + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103708g);
            dest.writeSerializable(this.f103709h);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f103710j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeInt(this.f103711l ? 1 : 0);
            dest.writeInt(this.f103712m ? 1 : 0);
            dest.writeParcelable(this.f103713n, i);
            dest.writeParcelable(this.o, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/api/navigation/RateDetailsKompotFeatureConfig$RateDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_rate_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RateDetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<RateDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f103714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f103715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103716c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f103717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final BuyFundingCurrencyPrefill f103718h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                boolean z6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                b bVar2 = (b) parcel.readSerializable();
                boolean z11 = false;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z11 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z12 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                } else {
                    z6 = z4;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new RateDetailsDestination(bVar, bVar2, z11, z12, z3, z4, z6, (BuyFundingCurrencyPrefill) parcel.readParcelable(RateDetailsDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RateDetailsDestination[i];
            }
        }

        public RateDetailsDestination(b currencyFrom, b currencyTo, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
            Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
            Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
            this.f103714a = currencyFrom;
            this.f103715b = currencyTo;
            this.f103716c = z;
            this.d = z3;
            this.e = z4;
            this.f = z6;
            this.f103717g = z11;
            this.f103718h = buyFundingCurrencyPrefill;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final boolean getF103717g() {
            return this.f103717g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF103716c() {
            return this.f103716c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BuyFundingCurrencyPrefill getF103718h() {
            return this.f103718h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RateDetailsDestination)) {
                return false;
            }
            RateDetailsDestination rateDetailsDestination = (RateDetailsDestination) obj2;
            return Intrinsics.f(this.f103714a, rateDetailsDestination.f103714a) && Intrinsics.f(this.f103715b, rateDetailsDestination.f103715b) && this.f103716c == rateDetailsDestination.f103716c && this.d == rateDetailsDestination.d && this.e == rateDetailsDestination.e && this.f == rateDetailsDestination.f && this.f103717g == rateDetailsDestination.f103717g && Intrinsics.f(this.f103718h, rateDetailsDestination.f103718h);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(l.j(this.f103715b, this.f103714a.hashCode() * 31, 31), 31, this.f103716c), 31, this.d), 31, this.e), 31, this.f), 31, this.f103717g);
            BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.f103718h;
            return iC + (buyFundingCurrencyPrefill == null ? 0 : buyFundingCurrencyPrefill.hashCode());
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final b getF103714a() {
            return this.f103714a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103714a);
            dest.writeSerializable(this.f103715b);
            dest.writeInt(this.f103716c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f103717g ? 1 : 0);
            dest.writeParcelable(this.f103718h, i);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final b getF103715b() {
            return this.f103715b;
        }

        public /* synthetic */ RateDetailsDestination(b bVar, b bVar2, boolean z, boolean z3, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill, int i) {
            this(bVar, bVar2, z, z3, true, true, false, (i & 128) != 0 ? null : buyFundingCurrencyPrefill);
        }
    }
}
