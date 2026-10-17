package com.revolut.retail.feature.analytics.models.income_sorter;

import android.os.Parcel;
import android.os.Parcelable;
import hzi.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "Landroid/os/Parcelable;", "Pocket", "Savings", "Portfolio", "PeerToPeer", "Beneficiary", "Crypto", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Beneficiary;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Crypto;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$PeerToPeer;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Pocket;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Portfolio;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Savings;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterDestinationId extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Beneficiary;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Beneficiary implements IncomeSorterDestinationId {

        @NotNull
        public static final Parcelable.Creator<Beneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f99170c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Beneficiary(parcel.readString(), parcel.readString(), (c) parcel.readSerializable(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Beneficiary[i];
            }
        }

        public Beneficiary(String id10, String str, c cVar, d dVar) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f99168a = id10;
            this.f99169b = str;
            this.f99170c = cVar;
            this.d = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Beneficiary)) {
                return false;
            }
            Beneficiary beneficiary = (Beneficiary) obj2;
            return Intrinsics.f(this.f99168a, beneficiary.f99168a) && Intrinsics.f(this.f99169b, beneficiary.f99169b) && Intrinsics.f(this.f99170c, beneficiary.f99170c) && this.d == beneficiary.d;
        }

        public final int hashCode() {
            int iHashCode = this.f99168a.hashCode() * 31;
            String str = this.f99169b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            c cVar = this.f99170c;
            int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            d dVar = this.d;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99168a);
            dest.writeString(this.f99169b);
            dest.writeSerializable(this.f99170c);
            d dVar = this.d;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Crypto;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto implements IncomeSorterDestinationId {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99171a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public Crypto(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f99171a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Crypto) && Intrinsics.f(this.f99171a, ((Crypto) obj2).f99171a);
        }

        public final int hashCode() {
            return this.f99171a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99171a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$PeerToPeer;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeer implements IncomeSorterDestinationId {

        @NotNull
        public static final Parcelable.Creator<PeerToPeer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f99174c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeerToPeer(parcel.readString(), parcel.readString(), (c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeer[i];
            }
        }

        public PeerToPeer(String code, String str, c cVar) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f99172a = code;
            this.f99173b = str;
            this.f99174c = cVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PeerToPeer)) {
                return false;
            }
            PeerToPeer peerToPeer = (PeerToPeer) obj2;
            return Intrinsics.f(this.f99172a, peerToPeer.f99172a) && Intrinsics.f(this.f99173b, peerToPeer.f99173b) && Intrinsics.f(this.f99174c, peerToPeer.f99174c);
        }

        public final int hashCode() {
            int iHashCode = this.f99172a.hashCode() * 31;
            String str = this.f99173b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            c cVar = this.f99174c;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99172a);
            dest.writeString(this.f99173b);
            dest.writeSerializable(this.f99174c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Pocket;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket implements IncomeSorterDestinationId {

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99175a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(String pocketId) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f99175a = pocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pocket) && Intrinsics.f(this.f99175a, ((Pocket) obj2).f99175a);
        }

        public final int hashCode() {
            return this.f99175a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99175a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Portfolio;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Portfolio implements IncomeSorterDestinationId {

        @NotNull
        public static final Parcelable.Creator<Portfolio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99177b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Portfolio(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Portfolio[i];
            }
        }

        public Portfolio(String portfolioId, b bVar) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f99176a = portfolioId;
            this.f99177b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Portfolio)) {
                return false;
            }
            Portfolio portfolio = (Portfolio) obj2;
            return Intrinsics.f(this.f99176a, portfolio.f99176a) && Intrinsics.f(this.f99177b, portfolio.f99177b);
        }

        public final int hashCode() {
            int iHashCode = this.f99176a.hashCode() * 31;
            b bVar = this.f99177b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99176a);
            dest.writeSerializable(this.f99177b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId$Savings;", "Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestinationId;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements IncomeSorterDestinationId {

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99178a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Savings(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(String moneyBoxId) {
            Intrinsics.checkNotNullParameter(moneyBoxId, "moneyBoxId");
            this.f99178a = moneyBoxId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Savings) && Intrinsics.f(this.f99178a, ((Savings) obj2).f99178a);
        }

        public final int hashCode() {
            return this.f99178a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99178a);
        }
    }
}
