package com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import h30.l;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p4i.s;
import p4i.t;
import p4i.u;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "Landroid/os/Parcelable;", "<init>", "()V", "TransactionBreakdown", "FeeBreakdown", "TaxBreakdown", "InterestBreakdown", "ChargeDescription", "TransactionPriceDescription", "TransactionPriceDescriptionDetails", "Faq", "CharityDescription", "EffectiveRateDescription", "RateExplanation", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$ChargeDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$CharityDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$EffectiveRateDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$Faq;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$RateExplanation;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TaxBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Screen implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$ChargeDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChargeDescription extends Screen {

        @NotNull
        public static final Parcelable.Creator<ChargeDescription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeEntry f97107a;

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
            this.f97107a = chargeEntry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChargeDescription) && Intrinsics.f(this.f97107a, ((ChargeDescription) obj2).f97107a);
        }

        public final int hashCode() {
            return this.f97107a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97107a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$CharityDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "<init>", "()V", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityDescription extends Screen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityDescription f97108a = new CharityDescription();

        @NotNull
        public static final Parcelable.Creator<CharityDescription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityDescription.f97108a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$EffectiveRateDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "<init>", "()V", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EffectiveRateDescription extends Screen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EffectiveRateDescription f97109a = new EffectiveRateDescription();

        @NotNull
        public static final Parcelable.Creator<EffectiveRateDescription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EffectiveRateDescription.f97109a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$Faq;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "", "toString", "()Ljava/lang/String;", "FaqItem", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Faq extends Screen {

        @NotNull
        public static final Parcelable.Creator<Faq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f97110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f97111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f97112c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$Faq$FaqItem;", "Landroid/os/Parcelable;", "<init>", "()V", "GotItButton", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$Faq$FaqItem$GotItButton;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class FaqItem implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$Faq$FaqItem$GotItButton;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$Faq$FaqItem;", "<init>", "()V", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class GotItButton extends FaqItem {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final GotItButton f97113a = new GotItButton();

                @NotNull
                public static final Parcelable.Creator<GotItButton> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return GotItButton.f97113a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new GotItButton[i];
                    }
                }

                private GotItButton() {
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

            private FaqItem() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", Faq.class);
                Clause clause2 = (Clause) parcel.readParcelable(Faq.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Faq.class, parcel, arrayList, iE, 1);
                }
                return new Faq(clause, clause2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Faq[i];
            }
        }

        public Faq(Clause title, Clause description, List items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f97110a = title;
            this.f97111b = description;
            this.f97112c = items;
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
            return Intrinsics.f(this.f97110a, faq.f97110a) && Intrinsics.f(this.f97111b, faq.f97111b) && Intrinsics.f(this.f97112c, faq.f97112c);
        }

        public final int hashCode() {
            return this.f97112c.hashCode() + p.a.a(this.f97110a.hashCode() * 31, 31, this.f97111b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97110a, i);
            dest.writeParcelable(this.f97111b, i);
            Iterator itV = p.a.v(this.f97112c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "Lp4i/u;", "Lp4i/s;", "<init>", "()V", "Dynamic", "TransferQuoteDynamic", "Static", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown$Dynamic;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown$Static;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown$TransferQuoteDynamic;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class FeeBreakdown extends Screen implements u, s {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown$Dynamic;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dynamic extends FeeBreakdown {

            @NotNull
            public static final Parcelable.Creator<Dynamic> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChargeBreakdown f97114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OrderQuoteParamsVariant f97115b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final c4i.a f97116c;
            public final boolean d;
            public final b e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f97117g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Clause f97118h;
            public final boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final Clause f97119j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    b bVar;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ChargeBreakdown chargeBreakdown = (ChargeBreakdown) parcel.readParcelable(Dynamic.class.getClassLoader());
                    OrderQuoteParamsVariant orderQuoteParamsVariant = (OrderQuoteParamsVariant) parcel.readParcelable(Dynamic.class.getClassLoader());
                    c4i.a aVarValueOf = c4i.a.valueOf(parcel.readString());
                    boolean z6 = true;
                    boolean z11 = parcel.readInt() != 0;
                    b bVar2 = (b) parcel.readSerializable();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z6 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = false;
                        bVar = bVar2;
                        z4 = z;
                    } else {
                        z3 = false;
                        bVar = bVar2;
                        z4 = false;
                    }
                    Clause clause = (Clause) parcel.readParcelable(Dynamic.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z3 = z;
                    }
                    return new Dynamic(chargeBreakdown, orderQuoteParamsVariant, aVarValueOf, z11, bVar, z6, z4, clause, z3, (Clause) parcel.readParcelable(Dynamic.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dynamic[i];
                }
            }

            public Dynamic(ChargeBreakdown chargeBreakdown, OrderQuoteParamsVariant orderQuoteParams, c4i.a transactionType, boolean z, b bVar, boolean z3, boolean z4, Clause clause, boolean z6, Clause clause2) {
                Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                Intrinsics.checkNotNullParameter(transactionType, "transactionType");
                this.f97114a = chargeBreakdown;
                this.f97115b = orderQuoteParams;
                this.f97116c = transactionType;
                this.d = z;
                this.e = bVar;
                this.f = z3;
                this.f97117g = z4;
                this.f97118h = clause;
                this.i = z6;
                this.f97119j = clause2;
            }

            @Override // com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen.FeeBreakdown
            /* JADX INFO: renamed from: A0, reason: from getter */
            public final ChargeBreakdown getF97125a() {
                return this.f97114a;
            }

            @Override // p4i.s
            /* JADX INFO: renamed from: P0, reason: from getter */
            public final Clause getF97145j() {
                return this.f97119j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj2;
                return Intrinsics.f(this.f97114a, dynamic.f97114a) && Intrinsics.f(this.f97115b, dynamic.f97115b) && this.f97116c == dynamic.f97116c && this.d == dynamic.d && Intrinsics.f(this.e, dynamic.e) && this.f == dynamic.f && this.f97117g == dynamic.f97117g && Intrinsics.f(this.f97118h, dynamic.f97118h) && this.i == dynamic.i && Intrinsics.f(this.f97119j, dynamic.f97119j);
            }

            public final int hashCode() {
                ChargeBreakdown chargeBreakdown = this.f97114a;
                int iC = j6.a.c((this.f97116c.hashCode() + ((this.f97115b.hashCode() + ((chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31)) * 31)) * 31, 31, this.d);
                b bVar = this.e;
                int iC2 = j6.a.c(j6.a.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f), 31, this.f97117g);
                Clause clause = this.f97118h;
                int iC3 = j6.a.c((iC2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.i);
                Clause clause2 = this.f97119j;
                return iC3 + (clause2 != null ? clause2.hashCode() : 0);
            }

            @Override // p4i.u
            /* JADX INFO: renamed from: i0, reason: from getter */
            public final Clause getF97129h() {
                return this.f97118h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f97114a, i);
                dest.writeParcelable(this.f97115b, i);
                dest.writeString(this.f97116c.name());
                dest.writeInt(this.d ? 1 : 0);
                dest.writeSerializable(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f97117g ? 1 : 0);
                dest.writeParcelable(this.f97118h, i);
                dest.writeInt(this.i ? 1 : 0);
                dest.writeParcelable(this.f97119j, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown$Static;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Static extends FeeBreakdown {

            @NotNull
            public static final Parcelable.Creator<Static> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChargeBreakdown f97120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f97121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final z3i.b f97122c;
            public final c4i.a d;
            public final b e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f97123g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Clause f97124h;
            public final Clause i;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Static((ChargeBreakdown) parcel.readParcelable(Static.class.getClassLoader()), parcel.readString(), z3i.b.valueOf(parcel.readString()), c4i.a.valueOf(parcel.readString()), (b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, (Clause) parcel.readParcelable(Static.class.getClassLoader()), (Clause) parcel.readParcelable(Static.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Static[i];
                }
            }

            public Static(ChargeBreakdown chargeBreakdown, String breakdownId, z3i.b feeBreakdownEndpoint, c4i.a transactionType, b bVar, boolean z, boolean z3, Clause clause, Clause clause2) {
                Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
                Intrinsics.checkNotNullParameter(feeBreakdownEndpoint, "feeBreakdownEndpoint");
                Intrinsics.checkNotNullParameter(transactionType, "transactionType");
                this.f97120a = chargeBreakdown;
                this.f97121b = breakdownId;
                this.f97122c = feeBreakdownEndpoint;
                this.d = transactionType;
                this.e = bVar;
                this.f = z;
                this.f97123g = z3;
                this.f97124h = clause;
                this.i = clause2;
            }

            @Override // com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen.FeeBreakdown
            /* JADX INFO: renamed from: A0, reason: from getter */
            public final ChargeBreakdown getF97125a() {
                return this.f97120a;
            }

            @Override // p4i.s
            /* JADX INFO: renamed from: P0, reason: from getter */
            public final Clause getF97145j() {
                return this.i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Static)) {
                    return false;
                }
                Static r56 = (Static) obj2;
                return Intrinsics.f(this.f97120a, r56.f97120a) && Intrinsics.f(this.f97121b, r56.f97121b) && this.f97122c == r56.f97122c && this.d == r56.d && Intrinsics.f(this.e, r56.e) && this.f == r56.f && this.f97123g == r56.f97123g && Intrinsics.f(this.f97124h, r56.f97124h) && Intrinsics.f(this.i, r56.i);
            }

            public final int hashCode() {
                ChargeBreakdown chargeBreakdown = this.f97120a;
                int iHashCode = (this.d.hashCode() + ((this.f97122c.hashCode() + p.a.c((chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31, 31, this.f97121b)) * 31)) * 31;
                b bVar = this.e;
                int iC = j6.a.c(j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f), 31, this.f97123g);
                Clause clause = this.f97124h;
                int iHashCode2 = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.i;
                return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
            }

            @Override // p4i.u
            /* JADX INFO: renamed from: i0, reason: from getter */
            public final Clause getF97129h() {
                return this.f97124h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f97120a, i);
                dest.writeString(this.f97121b);
                dest.writeString(this.f97122c.name());
                dest.writeString(this.d.name());
                dest.writeSerializable(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f97123g ? 1 : 0);
                dest.writeParcelable(this.f97124h, i);
                dest.writeParcelable(this.i, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown$TransferQuoteDynamic;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$FeeBreakdown;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransferQuoteDynamic extends FeeBreakdown {

            @NotNull
            public static final Parcelable.Creator<TransferQuoteDynamic> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChargeBreakdown f97125a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c4i.a f97126b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransferQuoteUserIdentifier f97127c;
            public final d d;
            public final b e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f97128g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Clause f97129h;
            public final Clause i;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TransferQuoteDynamic((ChargeBreakdown) parcel.readParcelable(TransferQuoteDynamic.class.getClassLoader()), c4i.a.valueOf(parcel.readString()), (TransferQuoteUserIdentifier) parcel.readParcelable(TransferQuoteDynamic.class.getClassLoader()), (d) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, (Clause) parcel.readParcelable(TransferQuoteDynamic.class.getClassLoader()), (Clause) parcel.readParcelable(TransferQuoteDynamic.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TransferQuoteDynamic[i];
                }
            }

            public TransferQuoteDynamic(ChargeBreakdown chargeBreakdown, c4i.a transactionType, TransferQuoteUserIdentifier userIdentifier, d recipientAmount, b senderCurrency, String str, boolean z, Clause clause, Clause clause2) {
                Intrinsics.checkNotNullParameter(transactionType, "transactionType");
                Intrinsics.checkNotNullParameter(userIdentifier, "userIdentifier");
                Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
                Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
                this.f97125a = chargeBreakdown;
                this.f97126b = transactionType;
                this.f97127c = userIdentifier;
                this.d = recipientAmount;
                this.e = senderCurrency;
                this.f = str;
                this.f97128g = z;
                this.f97129h = clause;
                this.i = clause2;
            }

            @Override // com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen.FeeBreakdown
            /* JADX INFO: renamed from: A0, reason: from getter */
            public final ChargeBreakdown getF97125a() {
                return this.f97125a;
            }

            @Override // p4i.s
            /* JADX INFO: renamed from: P0, reason: from getter */
            public final Clause getF97145j() {
                return this.i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TransferQuoteDynamic)) {
                    return false;
                }
                TransferQuoteDynamic transferQuoteDynamic = (TransferQuoteDynamic) obj2;
                return Intrinsics.f(this.f97125a, transferQuoteDynamic.f97125a) && this.f97126b == transferQuoteDynamic.f97126b && Intrinsics.f(this.f97127c, transferQuoteDynamic.f97127c) && Intrinsics.f(this.d, transferQuoteDynamic.d) && Intrinsics.f(this.e, transferQuoteDynamic.e) && Intrinsics.f(this.f, transferQuoteDynamic.f) && this.f97128g == transferQuoteDynamic.f97128g && Intrinsics.f(this.f97129h, transferQuoteDynamic.f97129h) && Intrinsics.f(this.i, transferQuoteDynamic.i);
            }

            public final int hashCode() {
                ChargeBreakdown chargeBreakdown = this.f97125a;
                int iJ = l.j(this.e, v7.c((this.f97127c.hashCode() + ((this.f97126b.hashCode() + ((chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31);
                String str = this.f;
                int iC = j6.a.c((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f97128g);
                Clause clause = this.f97129h;
                int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.i;
                return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
            }

            @Override // p4i.u
            /* JADX INFO: renamed from: i0, reason: from getter */
            public final Clause getF97129h() {
                return this.f97129h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f97125a, i);
                dest.writeString(this.f97126b.name());
                dest.writeParcelable(this.f97127c, i);
                dest.writeSerializable(this.d);
                dest.writeSerializable(this.e);
                dest.writeString(this.f);
                dest.writeInt(this.f97128g ? 1 : 0);
                dest.writeParcelable(this.f97129h, i);
                dest.writeParcelable(this.i, i);
            }
        }

        private FeeBreakdown() {
        }

        /* JADX INFO: renamed from: A0 */
        public abstract ChargeBreakdown getF97125a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "", "toString", "()Ljava/lang/String;", "Interest", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestBreakdown extends Screen {

        @NotNull
        public static final Parcelable.Creator<InterestBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Interest f97130a;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest;", "Landroid/os/Parcelable;", "EstimatedInterest", "DailyEstimatedInterest", "InterestApplies", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest$DailyEstimatedInterest;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest$EstimatedInterest;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest$InterestApplies;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Interest extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest$DailyEstimatedInterest;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DailyEstimatedInterest implements Interest {

                @NotNull
                public static final Parcelable.Creator<DailyEstimatedInterest> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f97131a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f97132b;

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
                    this.f97131a = dailyAmount;
                    this.f97132b = str;
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
                    return Intrinsics.f(this.f97131a, dailyEstimatedInterest.f97131a) && Intrinsics.f(this.f97132b, dailyEstimatedInterest.f97132b);
                }

                public final int hashCode() {
                    int iHashCode = this.f97131a.hashCode() * 31;
                    String str = this.f97132b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f97131a);
                    dest.writeString(this.f97132b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest$EstimatedInterest;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EstimatedInterest implements Interest {

                @NotNull
                public static final Parcelable.Creator<EstimatedInterest> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f97133a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final double f97134b;

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
                    this.f97133a = amount;
                    this.f97134b = d;
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
                    return Intrinsics.f(this.f97133a, estimatedInterest.f97133a) && Double.compare(this.f97134b, estimatedInterest.f97134b) == 0;
                }

                public final int hashCode() {
                    return Double.hashCode(this.f97134b) + (this.f97133a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f97133a);
                    dest.writeDouble(this.f97134b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest$InterestApplies;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$InterestBreakdown$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class InterestApplies implements Interest {

                @NotNull
                public static final Parcelable.Creator<InterestApplies> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f97135a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f97136b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f97137c;
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
                    this.f97135a = amount;
                    this.f97136b = str;
                    this.f97137c = str2;
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
                    return Intrinsics.f(this.f97135a, interestApplies.f97135a) && Intrinsics.f(this.f97136b, interestApplies.f97136b) && Intrinsics.f(this.f97137c, interestApplies.f97137c) && Intrinsics.f(this.d, interestApplies.d);
                }

                public final int hashCode() {
                    int iHashCode = this.f97135a.hashCode() * 31;
                    String str = this.f97136b;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f97137c;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    wi0.b bVar = this.d;
                    return iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f97135a);
                    dest.writeString(this.f97136b);
                    dest.writeString(this.f97137c);
                    dest.writeSerializable(this.d);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InterestBreakdown((Interest) parcel.readParcelable(InterestBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestBreakdown[i];
            }
        }

        public InterestBreakdown(Interest interest) {
            Intrinsics.checkNotNullParameter(interest, "interest");
            this.f97130a = interest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InterestBreakdown) && Intrinsics.f(this.f97130a, ((InterestBreakdown) obj2).f97130a);
        }

        public final int hashCode() {
            return this.f97130a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97130a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$RateExplanation;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "<init>", "()V", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RateExplanation extends Screen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RateExplanation f97138a = new RateExplanation();

        @NotNull
        public static final Parcelable.Creator<RateExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RateExplanation.f97138a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TaxBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxBreakdown extends Screen {

        @NotNull
        public static final Parcelable.Creator<TaxBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChargeBreakdown f97139a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxBreakdown((ChargeBreakdown) parcel.readParcelable(TaxBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxBreakdown[i];
            }
        }

        public TaxBreakdown(ChargeBreakdown taxBreakdown) {
            Intrinsics.checkNotNullParameter(taxBreakdown, "taxBreakdown");
            this.f97139a = taxBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxBreakdown) && Intrinsics.f(this.f97139a, ((TaxBreakdown) obj2).f97139a);
        }

        public final int hashCode() {
            return this.f97139a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97139a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionBreakdown;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "Lp4i/u;", "Lp4i/t;", "Lp4i/s;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionBreakdown extends Screen implements u, t, s {

        @NotNull
        public static final Parcelable.Creator<TransactionBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderQuote f97140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderQuoteParamsVariant f97141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4i.a f97142c;
        public final boolean d;
        public final b e;
        public final TransactionUnitsType f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Instant f97143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f97144h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Clause f97145j;
        public final boolean k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                b bVar;
                Instant instant;
                Clause clause;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OrderQuote orderQuote = (OrderQuote) parcel.readParcelable(TransactionBreakdown.class.getClassLoader());
                OrderQuoteParamsVariant orderQuoteParamsVariant = (OrderQuoteParamsVariant) parcel.readParcelable(TransactionBreakdown.class.getClassLoader());
                c4i.a aVarValueOf = c4i.a.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                b bVar2 = (b) parcel.readSerializable();
                TransactionUnitsType transactionUnitsType = (TransactionUnitsType) parcel.readParcelable(TransactionBreakdown.class.getClassLoader());
                Instant instant2 = (Instant) parcel.readSerializable();
                Clause clause2 = (Clause) parcel.readParcelable(TransactionBreakdown.class.getClassLoader());
                Clause clause3 = (Clause) parcel.readParcelable(TransactionBreakdown.class.getClassLoader());
                Clause clause4 = (Clause) parcel.readParcelable(TransactionBreakdown.class.getClassLoader());
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
                return new TransactionBreakdown(orderQuote, orderQuoteParamsVariant, aVarValueOf, z3, bVar, transactionUnitsType, instant, clause2, clause, clause4, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionBreakdown[i];
            }
        }

        public TransactionBreakdown(OrderQuote orderQuote, OrderQuoteParamsVariant orderQuoteParams, c4i.a transactionType, boolean z, b bVar, TransactionUnitsType transactionUnitsType, Instant instant, Clause clause, Clause clause2, Clause clause3, boolean z3) {
            Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
            Intrinsics.checkNotNullParameter(transactionType, "transactionType");
            Intrinsics.checkNotNullParameter(transactionUnitsType, "transactionUnitsType");
            this.f97140a = orderQuote;
            this.f97141b = orderQuoteParams;
            this.f97142c = transactionType;
            this.d = z;
            this.e = bVar;
            this.f = transactionUnitsType;
            this.f97143g = instant;
            this.f97144h = clause;
            this.i = clause2;
            this.f97145j = clause3;
            this.k = z3;
        }

        @Override // p4i.s
        /* JADX INFO: renamed from: P0, reason: from getter */
        public final Clause getF97145j() {
            return this.f97145j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionBreakdown)) {
                return false;
            }
            TransactionBreakdown transactionBreakdown = (TransactionBreakdown) obj2;
            return Intrinsics.f(this.f97140a, transactionBreakdown.f97140a) && Intrinsics.f(this.f97141b, transactionBreakdown.f97141b) && this.f97142c == transactionBreakdown.f97142c && this.d == transactionBreakdown.d && Intrinsics.f(this.e, transactionBreakdown.e) && Intrinsics.f(this.f, transactionBreakdown.f) && Intrinsics.f(this.f97143g, transactionBreakdown.f97143g) && Intrinsics.f(this.f97144h, transactionBreakdown.f97144h) && Intrinsics.f(this.i, transactionBreakdown.i) && Intrinsics.f(this.f97145j, transactionBreakdown.f97145j) && this.k == transactionBreakdown.k;
        }

        public final int hashCode() {
            OrderQuote orderQuote = this.f97140a;
            int iC = j6.a.c((this.f97142c.hashCode() + ((this.f97141b.hashCode() + ((orderQuote == null ? 0 : orderQuote.hashCode()) * 31)) * 31)) * 31, 31, this.d);
            b bVar = this.e;
            int iHashCode = (this.f.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            Instant instant = this.f97143g;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Clause clause = this.f97144h;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.i;
            int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.f97145j;
            return Boolean.hashCode(this.k) + ((iHashCode4 + (clause3 != null ? clause3.hashCode() : 0)) * 31);
        }

        @Override // p4i.u
        /* JADX INFO: renamed from: i0 */
        public final Clause getF97129h() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97140a, i);
            dest.writeParcelable(this.f97141b, i);
            dest.writeString(this.f97142c.name());
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeSerializable(this.f97143g);
            dest.writeParcelable(this.f97144h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f97145j, i);
            dest.writeInt(this.k ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescription;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionPriceDescription extends Screen {

        @NotNull
        public static final Parcelable.Creator<TransactionPriceDescription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c4i.a f97146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Asset f97147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f97148c;
        public final Asset d;
        public final TransactionUnitsType e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionPriceDescription(c4i.a.valueOf(parcel.readString()), (Asset) parcel.readParcelable(TransactionPriceDescription.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (Asset) parcel.readParcelable(TransactionPriceDescription.class.getClassLoader()), (TransactionUnitsType) parcel.readParcelable(TransactionPriceDescription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionPriceDescription[i];
            }
        }

        public TransactionPriceDescription(c4i.a transactionType, Asset baseAsset, BigDecimal expectedRate, Asset rateAsset, TransactionUnitsType unitsType) {
            Intrinsics.checkNotNullParameter(transactionType, "transactionType");
            Intrinsics.checkNotNullParameter(baseAsset, "baseAsset");
            Intrinsics.checkNotNullParameter(expectedRate, "expectedRate");
            Intrinsics.checkNotNullParameter(rateAsset, "rateAsset");
            Intrinsics.checkNotNullParameter(unitsType, "unitsType");
            this.f97146a = transactionType;
            this.f97147b = baseAsset;
            this.f97148c = expectedRate;
            this.d = rateAsset;
            this.e = unitsType;
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
            return this.f97146a == transactionPriceDescription.f97146a && Intrinsics.f(this.f97147b, transactionPriceDescription.f97147b) && Intrinsics.f(this.f97148c, transactionPriceDescription.f97148c) && Intrinsics.f(this.d, transactionPriceDescription.d) && Intrinsics.f(this.e, transactionPriceDescription.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + t61.a.d(this.f97148c, (this.f97147b.hashCode() + (this.f97146a.hashCode() * 31)) * 31, 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97146a.name());
            dest.writeParcelable(this.f97147b, i);
            dest.writeSerializable(this.f97148c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen;", "<init>", "()V", "DirtyPrice", "Units", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails$DirtyPrice;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails$Units;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class TransactionPriceDescriptionDetails extends Screen {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails$DirtyPrice;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DirtyPrice extends TransactionPriceDescriptionDetails {

            @NotNull
            public static final Parcelable.Creator<DirtyPrice> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ej0.b f97149a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ej0.b f97150b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DirtyPrice((ej0.b) parcel.readSerializable(), (ej0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DirtyPrice[i];
                }
            }

            public DirtyPrice(ej0.b bVar, ej0.b bVar2) {
                this.f97149a = bVar;
                this.f97150b = bVar2;
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
                return Intrinsics.f(this.f97149a, dirtyPrice.f97149a) && Intrinsics.f(this.f97150b, dirtyPrice.f97150b);
            }

            public final int hashCode() {
                ej0.b bVar = this.f97149a;
                int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
                ej0.b bVar2 = this.f97150b;
                return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97149a);
                dest.writeSerializable(this.f97150b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails$Units;", "Lcom/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/Screen$TransactionPriceDescriptionDetails;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Units extends TransactionPriceDescriptionDetails {

            @NotNull
            public static final Parcelable.Creator<Units> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97151a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BigDecimal f97152b;

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
                this.f97151a = dVar;
                this.f97152b = lotQuantity;
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
                return Intrinsics.f(this.f97151a, units.f97151a) && Intrinsics.f(this.f97152b, units.f97152b);
            }

            public final int hashCode() {
                d dVar = this.f97151a;
                return this.f97152b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97151a);
                dest.writeSerializable(this.f97152b);
            }
        }

        private TransactionPriceDescriptionDetails() {
        }
    }

    private Screen() {
    }
}
