package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import ej0.b;
import h30.l;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "Landroid/os/Parcelable;", "Transaction", "FeeDynamic", "FeeTransferQuoteDynamic", "FeeStatic", "Tax", "ChargeDescription", "TransactionPriceDescription", "DirtyPrice", "Units", "Faq", "CharityDescription", "EffectiveRateDescription", "RateExplanation", "Fee", "Interest", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$ChargeDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$CharityDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$DirtyPrice;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$EffectiveRateDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Faq;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$FeeDynamic;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$FeeStatic;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$FeeTransferQuoteDynamic;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$RateExplanation;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Tax;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Transaction;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$TransactionPriceDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Units;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Breakdown extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$ChargeDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChargeDescription implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<ChargeDescription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeEntry f97020a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChargeDescription((ChargeEntry) parcel.readParcelable(ChargeDescription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChargeDescription[i];
            }
        }

        public ChargeDescription(ChargeEntry chargeEntry) {
            Intrinsics.checkNotNullParameter(chargeEntry, "chargeEntry");
            this.f97020a = chargeEntry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChargeDescription) && Intrinsics.f(this.f97020a, ((ChargeDescription) obj2).f97020a);
        }

        public final int hashCode() {
            return this.f97020a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97020a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$CharityDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "<init>", "()V", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityDescription implements Breakdown {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityDescription f97021a = new CharityDescription();

        @NotNull
        public static final Parcelable.Creator<CharityDescription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityDescription.f97021a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityDescription[i];
            }
        }

        private CharityDescription() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$DirtyPrice;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirtyPrice implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<DirtyPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f97022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f97023b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirtyPrice((b) parcel.readSerializable(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirtyPrice[i];
            }
        }

        public DirtyPrice(b bVar, b bVar2) {
            this.f97022a = bVar;
            this.f97023b = bVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirtyPrice)) {
                return false;
            }
            DirtyPrice dirtyPrice = (DirtyPrice) obj2;
            return Intrinsics.f(this.f97022a, dirtyPrice.f97022a) && Intrinsics.f(this.f97023b, dirtyPrice.f97023b);
        }

        public final int hashCode() {
            b bVar = this.f97022a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            b bVar2 = this.f97023b;
            return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97022a);
            dest.writeSerializable(this.f97023b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$EffectiveRateDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "<init>", "()V", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EffectiveRateDescription implements Breakdown {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EffectiveRateDescription f97024a = new EffectiveRateDescription();

        @NotNull
        public static final Parcelable.Creator<EffectiveRateDescription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EffectiveRateDescription.f97024a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EffectiveRateDescription[i];
            }
        }

        private EffectiveRateDescription() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Faq;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Faq implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<Faq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f97025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f97026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97027c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Faq((Clause) parcel.readParcelable(Faq.class.getClassLoader()), (Clause) parcel.readParcelable(Faq.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Faq[i];
            }
        }

        public Faq(Clause title, Clause description, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f97025a = title;
            this.f97026b = description;
            this.f97027c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Faq)) {
                return false;
            }
            Faq faq = (Faq) obj2;
            return Intrinsics.f(this.f97025a, faq.f97025a) && Intrinsics.f(this.f97026b, faq.f97026b) && this.f97027c == faq.f97027c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97027c) + p.a.a(this.f97025a.hashCode() * 31, 31, this.f97026b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97025a, i);
            dest.writeParcelable(this.f97026b, i);
            dest.writeInt(this.f97027c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Fee;", "Landroid/os/Parcelable;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Fee extends Parcelable {
        /* JADX INFO: renamed from: A0 */
        ChargeBreakdown getF97037a();

        /* JADX INFO: renamed from: L4 */
        default boolean getF97040g() {
            return false;
        }

        /* JADX INFO: renamed from: P0 */
        default Clause getF97030c() {
            return null;
        }

        /* JADX INFO: renamed from: e3 */
        boolean getF();

        /* JADX INFO: renamed from: i0 */
        Clause getF97038b();

        /* JADX INFO: renamed from: o8 */
        default boolean getF97036g() {
            return false;
        }

        /* JADX INFO: renamed from: w5 */
        default xi0.b getF97034b() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$FeeDynamic;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Fee;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeDynamic implements Breakdown, Fee {

        @NotNull
        public static final Parcelable.Creator<FeeDynamic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeBreakdown f97028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f97029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f97030c;
        public final Clause d;
        public final OrderQuoteParamsVariant e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f97031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f97032h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ChargeBreakdown chargeBreakdown = (ChargeBreakdown) parcel.readParcelable(FeeDynamic.class.getClassLoader());
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                Clause clause = (Clause) parcel.readParcelable(FeeDynamic.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(FeeDynamic.class.getClassLoader());
                OrderQuoteParamsVariant orderQuoteParamsVariant = (OrderQuoteParamsVariant) parcel.readParcelable(FeeDynamic.class.getClassLoader());
                boolean z6 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new FeeDynamic(chargeBreakdown, bVar, clause, clause2, orderQuoteParamsVariant, z6, z11, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeDynamic[i];
            }
        }

        public FeeDynamic(ChargeBreakdown chargeBreakdown, xi0.b bVar, Clause clause, Clause clause2, OrderQuoteParamsVariant orderQuoteParams, boolean z, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
            this.f97028a = chargeBreakdown;
            this.f97029b = bVar;
            this.f97030c = clause;
            this.d = clause2;
            this.e = orderQuoteParams;
            this.f = z;
            this.f97031g = z3;
            this.f97032h = z4;
            this.i = z6;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: A0, reason: from getter */
        public final ChargeBreakdown getF97037a() {
            return this.f97028a;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: P0, reason: from getter */
        public final Clause getF97030c() {
            return this.f97030c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: e3, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeDynamic)) {
                return false;
            }
            FeeDynamic feeDynamic = (FeeDynamic) obj2;
            return Intrinsics.f(this.f97028a, feeDynamic.f97028a) && Intrinsics.f(this.f97029b, feeDynamic.f97029b) && Intrinsics.f(this.f97030c, feeDynamic.f97030c) && Intrinsics.f(this.d, feeDynamic.d) && Intrinsics.f(this.e, feeDynamic.e) && this.f == feeDynamic.f && this.f97031g == feeDynamic.f97031g && this.f97032h == feeDynamic.f97032h && this.i == feeDynamic.i;
        }

        public final int hashCode() {
            ChargeBreakdown chargeBreakdown = this.f97028a;
            int iHashCode = (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31;
            xi0.b bVar = this.f97029b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Clause clause = this.f97030c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c((this.e.hashCode() + ((iHashCode3 + (clause2 != null ? clause2.hashCode() : 0)) * 31)) * 31, 31, this.f), 31, this.f97031g), 31, this.f97032h);
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: i0, reason: from getter */
        public final Clause getF97038b() {
            return this.d;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: o8, reason: from getter */
        public final boolean getF97036g() {
            return this.f97032h;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: w5, reason: from getter */
        public final xi0.b getF97034b() {
            return this.f97029b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97028a, i);
            dest.writeSerializable(this.f97029b);
            dest.writeParcelable(this.f97030c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f97031g ? 1 : 0);
            dest.writeInt(this.f97032h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$FeeStatic;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Fee;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeStatic implements Breakdown, Fee {

        @NotNull
        public static final Parcelable.Creator<FeeStatic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeBreakdown f97033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f97034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f97035c;
        public final String d;
        public final z3i.b e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f97036g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ChargeBreakdown chargeBreakdown = (ChargeBreakdown) parcel.readParcelable(FeeStatic.class.getClassLoader());
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                Clause clause = (Clause) parcel.readParcelable(FeeStatic.class.getClassLoader());
                String string = parcel.readString();
                z3i.b bVarValueOf = z3i.b.valueOf(parcel.readString());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new FeeStatic(chargeBreakdown, bVar, clause, string, bVarValueOf, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeStatic[i];
            }
        }

        public FeeStatic(ChargeBreakdown chargeBreakdown, xi0.b bVar, Clause clause, String breakdownId, z3i.b feeBreakdownEndpoint, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
            Intrinsics.checkNotNullParameter(feeBreakdownEndpoint, "feeBreakdownEndpoint");
            this.f97033a = chargeBreakdown;
            this.f97034b = bVar;
            this.f97035c = clause;
            this.d = breakdownId;
            this.e = feeBreakdownEndpoint;
            this.f = z;
            this.f97036g = z3;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: A0, reason: from getter */
        public final ChargeBreakdown getF97037a() {
            return this.f97033a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: e3, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeStatic)) {
                return false;
            }
            FeeStatic feeStatic = (FeeStatic) obj2;
            return Intrinsics.f(this.f97033a, feeStatic.f97033a) && Intrinsics.f(this.f97034b, feeStatic.f97034b) && Intrinsics.f(this.f97035c, feeStatic.f97035c) && Intrinsics.f(this.d, feeStatic.d) && this.e == feeStatic.e && this.f == feeStatic.f && this.f97036g == feeStatic.f97036g;
        }

        public final int hashCode() {
            ChargeBreakdown chargeBreakdown = this.f97033a;
            int iHashCode = (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31;
            xi0.b bVar = this.f97034b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Clause clause = this.f97035c;
            return Boolean.hashCode(this.f97036g) + j6.a.c((this.e.hashCode() + p.a.c((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f);
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: i0, reason: from getter */
        public final Clause getF97038b() {
            return this.f97035c;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: o8, reason: from getter */
        public final boolean getF97036g() {
            return this.f97036g;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: w5, reason: from getter */
        public final xi0.b getF97034b() {
            return this.f97034b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97033a, i);
            dest.writeSerializable(this.f97034b);
            dest.writeParcelable(this.f97035c, i);
            dest.writeString(this.d);
            dest.writeString(this.e.name());
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f97036g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$FeeTransferQuoteDynamic;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Fee;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeTransferQuoteDynamic implements Breakdown, Fee {

        @NotNull
        public static final Parcelable.Creator<FeeTransferQuoteDynamic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeBreakdown f97037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f97038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferQuoteUserIdentifier f97039c;
        public final d d;
        public final xi0.b e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f97040g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeTransferQuoteDynamic((ChargeBreakdown) parcel.readParcelable(FeeTransferQuoteDynamic.class.getClassLoader()), (Clause) parcel.readParcelable(FeeTransferQuoteDynamic.class.getClassLoader()), (TransferQuoteUserIdentifier) parcel.readParcelable(FeeTransferQuoteDynamic.class.getClassLoader()), (d) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeTransferQuoteDynamic[i];
            }
        }

        public FeeTransferQuoteDynamic(ChargeBreakdown chargeBreakdown, Clause clause, TransferQuoteUserIdentifier userIdentifier, d recipientAmount, xi0.b senderCurrency, String str, boolean z) {
            Intrinsics.checkNotNullParameter(userIdentifier, "userIdentifier");
            Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
            Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
            this.f97037a = chargeBreakdown;
            this.f97038b = clause;
            this.f97039c = userIdentifier;
            this.d = recipientAmount;
            this.e = senderCurrency;
            this.f = str;
            this.f97040g = z;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: A0, reason: from getter */
        public final ChargeBreakdown getF97037a() {
            return this.f97037a;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: L4, reason: from getter */
        public final boolean getF97040g() {
            return this.f97040g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: e3 */
        public final boolean getF() {
            return true;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeTransferQuoteDynamic)) {
                return false;
            }
            FeeTransferQuoteDynamic feeTransferQuoteDynamic = (FeeTransferQuoteDynamic) obj2;
            return Intrinsics.f(this.f97037a, feeTransferQuoteDynamic.f97037a) && Intrinsics.f(this.f97038b, feeTransferQuoteDynamic.f97038b) && Intrinsics.f(this.f97039c, feeTransferQuoteDynamic.f97039c) && Intrinsics.f(this.d, feeTransferQuoteDynamic.d) && Intrinsics.f(this.e, feeTransferQuoteDynamic.e) && Intrinsics.f(this.f, feeTransferQuoteDynamic.f) && this.f97040g == feeTransferQuoteDynamic.f97040g;
        }

        public final int hashCode() {
            ChargeBreakdown chargeBreakdown = this.f97037a;
            int iHashCode = (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31;
            Clause clause = this.f97038b;
            int iJ = l.j(this.e, v7.c((this.f97039c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.d), 31);
            String str = this.f;
            return Boolean.hashCode(this.f97040g) + ((iJ + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature_market_data_api.navigation.Breakdown.Fee
        /* JADX INFO: renamed from: i0, reason: from getter */
        public final Clause getF97038b() {
            return this.f97038b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97037a, i);
            dest.writeParcelable(this.f97038b, i);
            dest.writeParcelable(this.f97039c, i);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeString(this.f);
            dest.writeInt(this.f97040g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "EstimatedInterest", "DailyEstimatedInterest", "InterestApplies", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest$DailyEstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest$EstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest$InterestApplies;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Interest extends Breakdown {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest$DailyEstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DailyEstimatedInterest implements Interest {

            @NotNull
            public static final Parcelable.Creator<DailyEstimatedInterest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f97042b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DailyEstimatedInterest((d) parcel.readSerializable(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DailyEstimatedInterest[i];
                }
            }

            public DailyEstimatedInterest(d dailyAmount, String str) {
                Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
                this.f97041a = dailyAmount;
                this.f97042b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DailyEstimatedInterest)) {
                    return false;
                }
                DailyEstimatedInterest dailyEstimatedInterest = (DailyEstimatedInterest) obj2;
                return Intrinsics.f(this.f97041a, dailyEstimatedInterest.f97041a) && Intrinsics.f(this.f97042b, dailyEstimatedInterest.f97042b);
            }

            public final int hashCode() {
                int iHashCode = this.f97041a.hashCode() * 31;
                String str = this.f97042b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97041a);
                dest.writeString(this.f97042b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest$EstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EstimatedInterest implements Interest {

            @NotNull
            public static final Parcelable.Creator<EstimatedInterest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97043a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final double f97044b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EstimatedInterest(parcel.readDouble(), (d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EstimatedInterest[i];
                }
            }

            public EstimatedInterest(double d, d amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.f97043a = amount;
                this.f97044b = d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EstimatedInterest)) {
                    return false;
                }
                EstimatedInterest estimatedInterest = (EstimatedInterest) obj2;
                return Intrinsics.f(this.f97043a, estimatedInterest.f97043a) && Double.compare(this.f97044b, estimatedInterest.f97044b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.f97044b) + (this.f97043a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97043a);
                dest.writeDouble(this.f97044b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest$InterestApplies;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InterestApplies implements Interest {

            @NotNull
            public static final Parcelable.Creator<InterestApplies> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97045a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f97046b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f97047c;
            public final wi0.b d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InterestApplies((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (wi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InterestApplies[i];
                }
            }

            public InterestApplies(d amount, String str, String str2, wi0.b bVar) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.f97045a = amount;
                this.f97046b = str;
                this.f97047c = str2;
                this.d = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InterestApplies)) {
                    return false;
                }
                InterestApplies interestApplies = (InterestApplies) obj2;
                return Intrinsics.f(this.f97045a, interestApplies.f97045a) && Intrinsics.f(this.f97046b, interestApplies.f97046b) && Intrinsics.f(this.f97047c, interestApplies.f97047c) && Intrinsics.f(this.d, interestApplies.d);
            }

            public final int hashCode() {
                int iHashCode = this.f97045a.hashCode() * 31;
                String str = this.f97046b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f97047c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                wi0.b bVar = this.d;
                return iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97045a);
                dest.writeString(this.f97046b);
                dest.writeString(this.f97047c);
                dest.writeSerializable(this.d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$RateExplanation;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "<init>", "()V", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RateExplanation implements Breakdown {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RateExplanation f97048a = new RateExplanation();

        @NotNull
        public static final Parcelable.Creator<RateExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RateExplanation.f97048a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RateExplanation[i];
            }
        }

        private RateExplanation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Tax;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tax implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<Tax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeBreakdown f97049a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tax((ChargeBreakdown) parcel.readParcelable(Tax.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tax[i];
            }
        }

        public Tax(ChargeBreakdown taxBreakdown) {
            Intrinsics.checkNotNullParameter(taxBreakdown, "taxBreakdown");
            this.f97049a = taxBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tax) && Intrinsics.f(this.f97049a, ((Tax) obj2).f97049a);
        }

        public final int hashCode() {
            return this.f97049a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97049a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Transaction;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transaction implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<Transaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderQuote f97050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderQuoteParamsVariant f97051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4i.a f97052c;
        public final boolean d;
        public final xi0.b e;
        public final TransactionUnitsType f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Instant f97053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f97054h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Clause f97055j;
        public final boolean k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                xi0.b bVar;
                Instant instant;
                Clause clause;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OrderQuote orderQuote = (OrderQuote) parcel.readParcelable(Transaction.class.getClassLoader());
                OrderQuoteParamsVariant orderQuoteParamsVariant = (OrderQuoteParamsVariant) parcel.readParcelable(Transaction.class.getClassLoader());
                c4i.a aVarValueOf = c4i.a.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                xi0.b bVar2 = (xi0.b) parcel.readSerializable();
                TransactionUnitsType transactionUnitsType = (TransactionUnitsType) parcel.readParcelable(Transaction.class.getClassLoader());
                Instant instant2 = (Instant) parcel.readSerializable();
                Clause clause2 = (Clause) parcel.readParcelable(Transaction.class.getClassLoader());
                Clause clause3 = (Clause) parcel.readParcelable(Transaction.class.getClassLoader());
                Clause clause4 = (Clause) parcel.readParcelable(Transaction.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bVar = bVar2;
                    instant = instant2;
                    clause = clause3;
                    z = true;
                } else {
                    z = false;
                    bVar = bVar2;
                    instant = instant2;
                    clause = clause3;
                }
                return new Transaction(orderQuote, orderQuoteParamsVariant, aVarValueOf, z3, bVar, transactionUnitsType, instant, clause2, clause, clause4, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transaction[i];
            }
        }

        public Transaction(OrderQuote orderQuote, OrderQuoteParamsVariant orderQuoteParams, c4i.a transactionType, boolean z, xi0.b bVar, TransactionUnitsType transactionUnitsType, Instant instant, Clause clause, Clause clause2, Clause clause3, boolean z3) {
            Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
            Intrinsics.checkNotNullParameter(transactionType, "transactionType");
            Intrinsics.checkNotNullParameter(transactionUnitsType, "transactionUnitsType");
            this.f97050a = orderQuote;
            this.f97051b = orderQuoteParams;
            this.f97052c = transactionType;
            this.d = z;
            this.e = bVar;
            this.f = transactionUnitsType;
            this.f97053g = instant;
            this.f97054h = clause;
            this.i = clause2;
            this.f97055j = clause3;
            this.k = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transaction)) {
                return false;
            }
            Transaction transaction = (Transaction) obj2;
            return Intrinsics.f(this.f97050a, transaction.f97050a) && Intrinsics.f(this.f97051b, transaction.f97051b) && this.f97052c == transaction.f97052c && this.d == transaction.d && Intrinsics.f(this.e, transaction.e) && Intrinsics.f(this.f, transaction.f) && Intrinsics.f(this.f97053g, transaction.f97053g) && Intrinsics.f(this.f97054h, transaction.f97054h) && Intrinsics.f(this.i, transaction.i) && Intrinsics.f(this.f97055j, transaction.f97055j) && this.k == transaction.k;
        }

        public final int hashCode() {
            OrderQuote orderQuote = this.f97050a;
            int iC = j6.a.c((this.f97052c.hashCode() + ((this.f97051b.hashCode() + ((orderQuote == null ? 0 : orderQuote.hashCode()) * 31)) * 31)) * 31, 31, this.d);
            xi0.b bVar = this.e;
            int iHashCode = (this.f.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            Instant instant = this.f97053g;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Clause clause = this.f97054h;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.i;
            int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.f97055j;
            return Boolean.hashCode(this.k) + ((iHashCode4 + (clause3 != null ? clause3.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97050a, i);
            dest.writeParcelable(this.f97051b, i);
            dest.writeString(this.f97052c.name());
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeSerializable(this.f97053g);
            dest.writeParcelable(this.f97054h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f97055j, i);
            dest.writeInt(this.k ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$TransactionPriceDescription;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionPriceDescription implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<TransactionPriceDescription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Asset f97056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f97057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Asset f97058c;
        public final TransactionUnitsType d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionPriceDescription((Asset) parcel.readParcelable(TransactionPriceDescription.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (Asset) parcel.readParcelable(TransactionPriceDescription.class.getClassLoader()), (TransactionUnitsType) parcel.readParcelable(TransactionPriceDescription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionPriceDescription[i];
            }
        }

        public TransactionPriceDescription(Asset baseAsset, BigDecimal expectedRate, Asset rateAsset, TransactionUnitsType unitsType) {
            Intrinsics.checkNotNullParameter(baseAsset, "baseAsset");
            Intrinsics.checkNotNullParameter(expectedRate, "expectedRate");
            Intrinsics.checkNotNullParameter(rateAsset, "rateAsset");
            Intrinsics.checkNotNullParameter(unitsType, "unitsType");
            this.f97056a = baseAsset;
            this.f97057b = expectedRate;
            this.f97058c = rateAsset;
            this.d = unitsType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionPriceDescription)) {
                return false;
            }
            TransactionPriceDescription transactionPriceDescription = (TransactionPriceDescription) obj2;
            return Intrinsics.f(this.f97056a, transactionPriceDescription.f97056a) && Intrinsics.f(this.f97057b, transactionPriceDescription.f97057b) && Intrinsics.f(this.f97058c, transactionPriceDescription.f97058c) && Intrinsics.f(this.d, transactionPriceDescription.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f97058c.hashCode() + t61.a.d(this.f97057b, this.f97056a.hashCode() * 31, 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97056a, i);
            dest.writeSerializable(this.f97057b);
            dest.writeParcelable(this.f97058c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/Breakdown$Units;", "Lcom/revolut/feature_market_data_api/navigation/Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Units implements Breakdown {

        @NotNull
        public static final Parcelable.Creator<Units> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f97059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f97060b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Units((d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Units[i];
            }
        }

        public Units(d dVar, BigDecimal lotQuantity) {
            Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
            this.f97059a = dVar;
            this.f97060b = lotQuantity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Units)) {
                return false;
            }
            Units units = (Units) obj2;
            return Intrinsics.f(this.f97059a, units.f97059a) && Intrinsics.f(this.f97060b, units.f97060b);
        }

        public final int hashCode() {
            d dVar = this.f97059a;
            return this.f97060b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97059a);
            dest.writeSerializable(this.f97060b);
        }
    }
}
