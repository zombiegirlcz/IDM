package com.revolut.feature.external_accounts.impl.domain.india.netbanking.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/india/netbanking/model/IndiaNetBankingProvider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaNetBankingProvider implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndiaNetBankingProvider> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72371c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndiaNetBankingProvider(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaNetBankingProvider[i];
        }
    }

    public IndiaNetBankingProvider(String id10, String name, String logo) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f72369a = id10;
        this.f72370b = name;
        this.f72371c = logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndiaNetBankingProvider)) {
            return false;
        }
        IndiaNetBankingProvider indiaNetBankingProvider = (IndiaNetBankingProvider) obj2;
        return Intrinsics.f(this.f72369a, indiaNetBankingProvider.f72369a) && Intrinsics.f(this.f72370b, indiaNetBankingProvider.f72370b) && Intrinsics.f(this.f72371c, indiaNetBankingProvider.f72371c);
    }

    public final int hashCode() {
        return this.f72371c.hashCode() + p.a.c(this.f72369a.hashCode() * 31, 31, this.f72370b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72369a);
        dest.writeString(this.f72370b);
        dest.writeString(this.f72371c);
    }
}
