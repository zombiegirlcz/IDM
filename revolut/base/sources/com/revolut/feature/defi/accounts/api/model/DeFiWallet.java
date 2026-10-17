package com.revolut.feature.defi.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import wk5.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/accounts/api/model/DeFiWallet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiWallet implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f71643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71644c;
    public final String d;
    public final Instant e;
    public final Instant f;

    @NotNull
    public static final Parcelable.Creator<DeFiWallet> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiWallet(parcel.readString(), k.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiWallet[i];
        }
    }

    public DeFiWallet(String id10, k chainType, String publicAddress, String str, Instant createdDate, Instant updatedDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(chainType, "chainType");
        Intrinsics.checkNotNullParameter(publicAddress, "publicAddress");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f71642a = id10;
        this.f71643b = chainType;
        this.f71644c = publicAddress;
        this.d = str;
        this.e = createdDate;
        this.f = updatedDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiWallet)) {
            return false;
        }
        DeFiWallet deFiWallet = (DeFiWallet) obj2;
        return Intrinsics.f(this.f71642a, deFiWallet.f71642a) && this.f71643b == deFiWallet.f71643b && Intrinsics.f(this.f71644c, deFiWallet.f71644c) && Intrinsics.f(this.d, deFiWallet.d) && Intrinsics.f(this.e, deFiWallet.e) && Intrinsics.f(this.f, deFiWallet.f);
    }

    public final int hashCode() {
        int iC = a.c((this.f71643b.hashCode() + (this.f71642a.hashCode() * 31)) * 31, 31, this.f71644c);
        String str = this.d;
        return this.f.hashCode() + r6.b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71642a);
        dest.writeString(this.f71643b.name());
        dest.writeString(this.f71644c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
