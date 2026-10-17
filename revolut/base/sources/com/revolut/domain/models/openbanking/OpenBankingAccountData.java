package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingAccountData;", "Landroid/os/Parcelable;", "<init>", "()V", "Iban", "Local", "Lcom/revolut/domain/models/openbanking/OpenBankingAccountData$Iban;", "Lcom/revolut/domain/models/openbanking/OpenBankingAccountData$Local;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingAccountData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingAccountData$Iban;", "Lcom/revolut/domain/models/openbanking/OpenBankingAccountData;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Iban extends OpenBankingAccountData {

        @NotNull
        public static final Parcelable.Creator<Iban> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60372a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Iban(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Iban[i];
            }
        }

        public Iban(String iban) {
            Intrinsics.checkNotNullParameter(iban, "iban");
            this.f60372a = iban;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Iban) && Intrinsics.f(this.f60372a, ((Iban) obj2).f60372a);
        }

        public final int hashCode() {
            return this.f60372a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60372a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingAccountData$Local;", "Lcom/revolut/domain/models/openbanking/OpenBankingAccountData;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local extends OpenBankingAccountData {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60374b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(String accountNumber, String sortCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            this.f60373a = accountNumber;
            this.f60374b = sortCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Local)) {
                return false;
            }
            Local local = (Local) obj2;
            return Intrinsics.f(this.f60373a, local.f60373a) && Intrinsics.f(this.f60374b, local.f60374b);
        }

        public final int hashCode() {
            return this.f60374b.hashCode() + (this.f60373a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60373a);
            dest.writeString(this.f60374b);
        }
    }

    private OpenBankingAccountData() {
    }
}
