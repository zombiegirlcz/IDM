package com.revolut.feature.wealth.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType;", "Landroid/os/Parcelable;", "Stocks", "ROBO", "COMMODITY", "MarginTrading", "TaxAdvantageDocument", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$COMMODITY;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$MarginTrading;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$ROBO;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$Stocks;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$TaxAdvantageDocument;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestDocumentsType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$COMMODITY;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class COMMODITY implements InvestDocumentsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final COMMODITY f95910a = new COMMODITY();

        @NotNull
        public static final Parcelable.Creator<COMMODITY> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return COMMODITY.f95910a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new COMMODITY[i];
            }
        }

        private COMMODITY() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$MarginTrading;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarginTrading implements InvestDocumentsType {

        @NotNull
        public static final Parcelable.Creator<MarginTrading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95911a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginTrading(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginTrading[i];
            }
        }

        public MarginTrading(String accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f95911a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarginTrading) && Intrinsics.f(this.f95911a, ((MarginTrading) obj2).f95911a);
        }

        public final int hashCode() {
            return this.f95911a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95911a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$ROBO;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ROBO implements InvestDocumentsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ROBO f95912a = new ROBO();

        @NotNull
        public static final Parcelable.Creator<ROBO> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ROBO.f95912a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ROBO[i];
            }
        }

        private ROBO() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$Stocks;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stocks implements InvestDocumentsType {

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f95913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0 f95914b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stocks((UUID) parcel.readSerializable(), q0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        public Stocks(UUID portfolioId, q0 accountHolderType) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            this.f95913a = portfolioId;
            this.f95914b = accountHolderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stocks)) {
                return false;
            }
            Stocks stocks = (Stocks) obj2;
            return Intrinsics.f(this.f95913a, stocks.f95913a) && this.f95914b == stocks.f95914b;
        }

        public final int hashCode() {
            return this.f95914b.hashCode() + (this.f95913a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95913a);
            dest.writeString(this.f95914b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType$TaxAdvantageDocument;", "Lcom/revolut/feature/wealth/ui/api/navigation/InvestDocumentsType;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxAdvantageDocument implements InvestDocumentsType {

        @NotNull
        public static final Parcelable.Creator<TaxAdvantageDocument> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthAccount.TaxAdvantageWealthAccount f95915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f95916b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxAdvantageDocument((WealthAccount.TaxAdvantageWealthAccount) parcel.readParcelable(TaxAdvantageDocument.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxAdvantageDocument[i];
            }
        }

        public TaxAdvantageDocument(WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount, UUID portfolioId) {
            Intrinsics.checkNotNullParameter(taxAdvantageWealthAccount, "taxAdvantageWealthAccount");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95915a = taxAdvantageWealthAccount;
            this.f95916b = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxAdvantageDocument)) {
                return false;
            }
            TaxAdvantageDocument taxAdvantageDocument = (TaxAdvantageDocument) obj2;
            return Intrinsics.f(this.f95915a, taxAdvantageDocument.f95915a) && Intrinsics.f(this.f95916b, taxAdvantageDocument.f95916b);
        }

        public final int hashCode() {
            return this.f95916b.hashCode() + (this.f95915a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95915a, i);
            dest.writeSerializable(this.f95916b);
        }
    }
}
