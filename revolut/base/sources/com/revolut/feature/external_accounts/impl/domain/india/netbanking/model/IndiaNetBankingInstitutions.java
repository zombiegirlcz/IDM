package com.revolut.feature.external_accounts.impl.domain.india.netbanking.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/india/netbanking/model/IndiaNetBankingInstitutions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaNetBankingInstitutions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndiaNetBankingInstitutions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f72367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f72368b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(IndiaNetBankingProvider.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(IndiaNetBankingProvider.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new IndiaNetBankingInstitutions(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaNetBankingInstitutions[i];
        }
    }

    public IndiaNetBankingInstitutions(ArrayList popular, ArrayList others) {
        Intrinsics.checkNotNullParameter(popular, "popular");
        Intrinsics.checkNotNullParameter(others, "others");
        this.f72367a = popular;
        this.f72368b = others;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndiaNetBankingInstitutions)) {
            return false;
        }
        IndiaNetBankingInstitutions indiaNetBankingInstitutions = (IndiaNetBankingInstitutions) obj2;
        return this.f72367a.equals(indiaNetBankingInstitutions.f72367a) && this.f72368b.equals(indiaNetBankingInstitutions.f72368b);
    }

    public final int hashCode() {
        return this.f72368b.hashCode() + (this.f72367a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f72367a, dest);
        while (itY.hasNext()) {
            ((IndiaNetBankingProvider) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f72368b, dest);
        while (itY2.hasNext()) {
            ((IndiaNetBankingProvider) itY2.next()).writeToParcel(dest, i);
        }
    }
}
