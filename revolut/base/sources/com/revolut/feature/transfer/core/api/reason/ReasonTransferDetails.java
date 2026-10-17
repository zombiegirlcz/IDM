package com.revolut.feature.transfer.core.api.reason;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails;", "Landroid/os/Parcelable;", "<init>", "()V", "Bank", "Remittance", "Peer", "Link", "Card", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Bank;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Card;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Link;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Peer;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Remittance;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReasonTransferDetails implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Bank;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bank extends ReasonTransferDetails {

        @NotNull
        public static final Parcelable.Creator<Bank> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f92125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f92126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f92127c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bank((f5j.a) parcel.readSerializable(), parcel.readLong(), (b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bank[i];
            }
        }

        public Bank(f5j.a beneficiary, long j2, b currency, String str) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f92125a = beneficiary;
            this.f92126b = j2;
            this.f92127c = currency;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Bank)) {
                return false;
            }
            Bank bank = (Bank) obj2;
            return Intrinsics.f(this.f92125a, bank.f92125a) && this.f92126b == bank.f92126b && Intrinsics.f(this.f92127c, bank.f92127c) && Intrinsics.f(this.d, bank.d);
        }

        public final int hashCode() {
            int iJ = l.j(this.f92127c, d.c(this.f92125a.hashCode() * 31, 31, this.f92126b), 31);
            String str = this.d;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92125a);
            dest.writeLong(this.f92126b);
            dest.writeSerializable(this.f92127c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Card;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card extends ReasonTransferDetails {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f92128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f92129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f92130c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card((CardOwner) parcel.readParcelable(Card.class.getClassLoader()), parcel.readLong(), (b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(CardOwner cardOwner, long j2, b currency, String str) {
            Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f92128a = cardOwner;
            this.f92129b = j2;
            this.f92130c = currency;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Card)) {
                return false;
            }
            Card card = (Card) obj2;
            return Intrinsics.f(this.f92128a, card.f92128a) && this.f92129b == card.f92129b && Intrinsics.f(this.f92130c, card.f92130c) && Intrinsics.f(this.d, card.d);
        }

        public final int hashCode() {
            int iJ = l.j(this.f92130c, d.c(this.f92128a.hashCode() * 31, 31, this.f92129b), 31);
            String str = this.d;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92128a, i);
            dest.writeLong(this.f92129b);
            dest.writeSerializable(this.f92130c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Link;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Link extends ReasonTransferDetails {

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f92131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f92132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92133c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Link(parcel.readLong(), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(long j2, String str, b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f92131a = j2;
            this.f92132b = currency;
            this.f92133c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Link)) {
                return false;
            }
            Link link = (Link) obj2;
            return this.f92131a == link.f92131a && Intrinsics.f(this.f92132b, link.f92132b) && Intrinsics.f(this.f92133c, link.f92133c);
        }

        public final int hashCode() {
            int iJ = l.j(this.f92132b, Long.hashCode(this.f92131a) * 31, 31);
            String str = this.f92133c;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f92131a);
            dest.writeSerializable(this.f92132b);
            dest.writeString(this.f92133c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Remittance;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remittance extends ReasonTransferDetails {

        @NotNull
        public static final Parcelable.Creator<Remittance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f92140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f92141c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new Remittance(parcel.readLong(), string, parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remittance[i];
            }
        }

        public Remittance(long j2, String countryName, String str, b currency) {
            Intrinsics.checkNotNullParameter(countryName, "countryName");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f92139a = countryName;
            this.f92140b = j2;
            this.f92141c = currency;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Remittance)) {
                return false;
            }
            Remittance remittance = (Remittance) obj2;
            return Intrinsics.f(this.f92139a, remittance.f92139a) && this.f92140b == remittance.f92140b && Intrinsics.f(this.f92141c, remittance.f92141c) && Intrinsics.f(this.d, remittance.d);
        }

        public final int hashCode() {
            int iJ = l.j(this.f92141c, d.c(this.f92139a.hashCode() * 31, 31, this.f92140b), 31);
            String str = this.d;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92139a);
            dest.writeLong(this.f92140b);
            dest.writeSerializable(this.f92141c);
            dest.writeString(this.d);
        }
    }

    private ReasonTransferDetails() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails$Peer;", "Lcom/revolut/feature/transfer/core/api/reason/ReasonTransferDetails;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Peer extends ReasonTransferDetails {

        @NotNull
        public static final Parcelable.Creator<Peer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f92135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f92136c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f92137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f92138h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Peer(parcel.readString(), parcel.readLong(), (b) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Peer[i];
            }
        }

        public Peer(String name, long j2, b currency, String country, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(country, "country");
            this.f92134a = name;
            this.f92135b = j2;
            this.f92136c = currency;
            this.d = country;
            this.e = str;
            this.f = str2;
            this.f92137g = str3;
            this.f92138h = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Peer)) {
                return false;
            }
            Peer peer = (Peer) obj2;
            return Intrinsics.f(this.f92134a, peer.f92134a) && this.f92135b == peer.f92135b && Intrinsics.f(this.f92136c, peer.f92136c) && Intrinsics.f(this.d, peer.d) && Intrinsics.f(this.e, peer.e) && Intrinsics.f(this.f, peer.f) && Intrinsics.f(this.f92137g, peer.f92137g) && Intrinsics.f(this.f92138h, peer.f92138h);
        }

        public final int hashCode() {
            int iC = p.a.c(l.j(this.f92136c, d.c(this.f92134a.hashCode() * 31, 31, this.f92135b), 31), 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f92137g;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f92138h;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92134a);
            dest.writeLong(this.f92135b);
            dest.writeSerializable(this.f92136c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f92137g);
            dest.writeString(this.f92138h);
        }

        public /* synthetic */ Peer(String str, long j2, b bVar, String str2, String str3, String str4) {
            this(str, j2, bVar, str2, null, null, str3, str4);
        }
    }
}
