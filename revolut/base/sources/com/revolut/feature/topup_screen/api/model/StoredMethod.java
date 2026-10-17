package com.revolut.feature.topup_screen.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import io3.o;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Institution", "AccountDetails", "LinkedAccount", "Mandate", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoredMethod implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoredMethod> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Institution f90529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountDetails f90530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f90531c;
    public final LinkedAccount d;
    public final Boolean e;
    public final Mandate f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$AccountDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "AccountNumber", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90534c;
        public final xi0.b d;
        public final List e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$AccountDetails$AccountNumber;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Field", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AccountNumber implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AccountNumber> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f90535a;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$AccountDetails$AccountNumber$Field;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Field implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Field> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f90536a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f90537b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Field(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Field[i];
                    }
                }

                public Field(String label, String value) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.f90536a = label;
                    this.f90537b = value;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Field)) {
                        return false;
                    }
                    Field field = (Field) obj2;
                    return Intrinsics.f(this.f90536a, field.f90536a) && Intrinsics.f(this.f90537b, field.f90537b);
                }

                public final int hashCode() {
                    return this.f90537b.hashCode() + (this.f90536a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f90536a);
                    dest.writeString(this.f90537b);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(Field.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new AccountNumber(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AccountNumber[i];
                }
            }

            public AccountNumber(ArrayList fields) {
                Intrinsics.checkNotNullParameter(fields, "fields");
                this.f90535a = fields;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AccountNumber) && this.f90535a.equals(((AccountNumber) obj2).f90535a);
            }

            public final int hashCode() {
                return this.f90535a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f90535a, dest);
                while (itY.hasNext()) {
                    ((Field) itY.next()).writeToParcel(dest, i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AccountNumber.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AccountDetails(string, string2, string3, bVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        public AccountDetails(String id10, String accountLabel, String accountName, xi0.b currency, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountLabel, "accountLabel");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f90532a = id10;
            this.f90533b = accountLabel;
            this.f90534c = accountName;
            this.d = currency;
            this.e = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountDetails)) {
                return false;
            }
            AccountDetails accountDetails = (AccountDetails) obj2;
            return Intrinsics.f(this.f90532a, accountDetails.f90532a) && Intrinsics.f(this.f90533b, accountDetails.f90533b) && Intrinsics.f(this.f90534c, accountDetails.f90534c) && Intrinsics.f(this.d, accountDetails.d) && Intrinsics.f(this.e, accountDetails.e);
        }

        public final int hashCode() {
            int iJ = l.j(this.d, p.a.c(p.a.c(this.f90532a.hashCode() * 31, 31, this.f90533b), 31, this.f90534c), 31);
            List list = this.e;
            return iJ + (list == null ? 0 : list.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90532a);
            dest.writeString(this.f90533b);
            dest.writeString(this.f90534c);
            dest.writeSerializable(this.d);
            List list = this.e;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AccountNumber) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Institution;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Institution implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Institution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f90540c;
        public final o d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Institution(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), (o) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Institution[i];
            }
        }

        public Institution(String id10, String name, io3.b bVar, o oVar, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f90538a = id10;
            this.f90539b = name;
            this.f90540c = bVar;
            this.d = oVar;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Institution)) {
                return false;
            }
            Institution institution = (Institution) obj2;
            return Intrinsics.f(this.f90538a, institution.f90538a) && Intrinsics.f(this.f90539b, institution.f90539b) && Intrinsics.f(this.f90540c, institution.f90540c) && Intrinsics.f(this.d, institution.d) && this.e == institution.e;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f90538a.hashCode() * 31, 31, this.f90539b);
            io3.b bVar = this.f90540c;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            o oVar = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (oVar != null ? oVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90538a);
            dest.writeString(this.f90539b);
            dest.writeSerializable(this.f90540c);
            dest.writeSerializable(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$LinkedAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/topup_screen/api/model/a", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccount implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LinkedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.topup_screen.api.model.a f90542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f90543c;
        public final Instant d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccount(parcel.readString(), com.revolut.feature.topup_screen.api.model.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccount[i];
            }
        }

        public LinkedAccount(String id10, com.revolut.feature.topup_screen.api.model.a state, d dVar, Instant instant) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f90541a = id10;
            this.f90542b = state;
            this.f90543c = dVar;
            this.d = instant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccount)) {
                return false;
            }
            LinkedAccount linkedAccount = (LinkedAccount) obj2;
            return Intrinsics.f(this.f90541a, linkedAccount.f90541a) && this.f90542b == linkedAccount.f90542b && Intrinsics.f(this.f90543c, linkedAccount.f90543c) && Intrinsics.f(this.d, linkedAccount.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f90542b.hashCode() + (this.f90541a.hashCode() * 31)) * 31;
            d dVar = this.f90543c;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Instant instant = this.d;
            return iHashCode2 + (instant != null ? instant.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90541a);
            dest.writeString(this.f90542b.name());
            dest.writeSerializable(this.f90543c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate;", "Landroid/os/Parcelable;", "OpenBanking", "PayTo", "Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate$OpenBanking;", "Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate$PayTo;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mandate extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate$OpenBanking;", "Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBanking implements Mandate {

            @NotNull
            public static final Parcelable.Creator<OpenBanking> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f90544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f90545b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f90546c;
            public final d d;
            public final d e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenBanking(parcel.readString(), parcel.readInt() != 0, (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenBanking[i];
                }
            }

            public OpenBanking(String id10, boolean z, d maximumIndividualLimit, d monthlyPeriodicLimit, d monthlyAmountRemaining) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(maximumIndividualLimit, "maximumIndividualLimit");
                Intrinsics.checkNotNullParameter(monthlyPeriodicLimit, "monthlyPeriodicLimit");
                Intrinsics.checkNotNullParameter(monthlyAmountRemaining, "monthlyAmountRemaining");
                this.f90544a = id10;
                this.f90545b = z;
                this.f90546c = maximumIndividualLimit;
                this.d = monthlyPeriodicLimit;
                this.e = monthlyAmountRemaining;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenBanking)) {
                    return false;
                }
                OpenBanking openBanking = (OpenBanking) obj2;
                return Intrinsics.f(this.f90544a, openBanking.f90544a) && this.f90545b == openBanking.f90545b && Intrinsics.f(this.f90546c, openBanking.f90546c) && Intrinsics.f(this.d, openBanking.d) && Intrinsics.f(this.e, openBanking.e);
            }

            @Override // com.revolut.feature.topup_screen.api.model.StoredMethod.Mandate
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF90547a() {
                return this.f90544a;
            }

            public final int hashCode() {
                return this.e.hashCode() + v7.c(v7.c(j6.a.c(this.f90544a.hashCode() * 31, 31, this.f90545b), 31, this.f90546c), 31, this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f90544a);
                dest.writeInt(this.f90545b ? 1 : 0);
                dest.writeSerializable(this.f90546c);
                dest.writeSerializable(this.d);
                dest.writeSerializable(this.e);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate$PayTo;", "Lcom/revolut/feature/topup_screen/api/model/StoredMethod$Mandate;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/topup_screen/api/model/b", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PayTo implements Mandate {

            @NotNull
            public static final Parcelable.Creator<PayTo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f90547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f90548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f90549c;
            public final b d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PayTo(parcel.readString(), parcel.readInt() != 0, (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PayTo[i];
                }
            }

            public PayTo(String id10, boolean z, d maximumIndividualLimit, b bVar) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(maximumIndividualLimit, "maximumIndividualLimit");
                this.f90547a = id10;
                this.f90548b = z;
                this.f90549c = maximumIndividualLimit;
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
                if (!(obj2 instanceof PayTo)) {
                    return false;
                }
                PayTo payTo = (PayTo) obj2;
                return Intrinsics.f(this.f90547a, payTo.f90547a) && this.f90548b == payTo.f90548b && Intrinsics.f(this.f90549c, payTo.f90549c) && this.d == payTo.d;
            }

            @Override // com.revolut.feature.topup_screen.api.model.StoredMethod.Mandate
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF90547a() {
                return this.f90547a;
            }

            public final int hashCode() {
                int iC = v7.c(j6.a.c(this.f90547a.hashCode() * 31, 31, this.f90548b), 31, this.f90549c);
                b bVar = this.d;
                return iC + (bVar == null ? 0 : bVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f90547a);
                dest.writeInt(this.f90548b ? 1 : 0);
                dest.writeSerializable(this.f90549c);
                b bVar = this.d;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
            }
        }

        /* JADX INFO: renamed from: getId */
        String getF90547a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Institution institutionCreateFromParcel = Institution.CREATOR.createFromParcel(parcel);
            AccountDetails accountDetailsCreateFromParcel = AccountDetails.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccount linkedAccountCreateFromParcel = parcel.readInt() == 0 ? null : LinkedAccount.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoredMethod(institutionCreateFromParcel, accountDetailsCreateFromParcel, boolValueOf, linkedAccountCreateFromParcel, boolValueOf2, (Mandate) parcel.readParcelable(StoredMethod.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoredMethod[i];
        }
    }

    public StoredMethod(Institution institution, AccountDetails accountDetails, Boolean bool, LinkedAccount linkedAccount, Boolean bool2, Mandate mandate) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        this.f90529a = institution;
        this.f90530b = accountDetails;
        this.f90531c = bool;
        this.d = linkedAccount;
        this.e = bool2;
        this.f = mandate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoredMethod)) {
            return false;
        }
        StoredMethod storedMethod = (StoredMethod) obj2;
        return Intrinsics.f(this.f90529a, storedMethod.f90529a) && Intrinsics.f(this.f90530b, storedMethod.f90530b) && Intrinsics.f(this.f90531c, storedMethod.f90531c) && Intrinsics.f(this.d, storedMethod.d) && Intrinsics.f(this.e, storedMethod.e) && Intrinsics.f(this.f, storedMethod.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f90530b.hashCode() + (this.f90529a.hashCode() * 31)) * 31;
        Boolean bool = this.f90531c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        LinkedAccount linkedAccount = this.d;
        int iHashCode3 = (iHashCode2 + (linkedAccount == null ? 0 : linkedAccount.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Mandate mandate = this.f;
        return iHashCode4 + (mandate != null ? mandate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f90529a.writeToParcel(dest, i);
        this.f90530b.writeToParcel(dest, i);
        Boolean bool = this.f90531c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        LinkedAccount linkedAccount = this.d;
        if (linkedAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkedAccount.writeToParcel(dest, i);
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeParcelable(this.f, i);
    }
}
