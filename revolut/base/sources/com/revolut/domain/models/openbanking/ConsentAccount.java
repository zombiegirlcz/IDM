package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/ConsentAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConsentAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentAccountType f60369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60371c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentAccount(ConsentAccountType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentAccount[i];
        }
    }

    public ConsentAccount(ConsentAccountType type, String branchCode, String accountNumber) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(branchCode, "branchCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f60369a = type;
        this.f60370b = branchCode;
        this.f60371c = accountNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentAccount)) {
            return false;
        }
        ConsentAccount consentAccount = (ConsentAccount) obj2;
        return this.f60369a == consentAccount.f60369a && Intrinsics.f(this.f60370b, consentAccount.f60370b) && Intrinsics.f(this.f60371c, consentAccount.f60371c);
    }

    public final int hashCode() {
        return this.f60371c.hashCode() + p.a.c(this.f60369a.hashCode() * 31, 31, this.f60370b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60369a.name());
        dest.writeString(this.f60370b);
        dest.writeString(this.f60371c);
    }
}
