package com.revolut.feature.external_accounts.impl.domain.india.upi.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/india/upi/model/IndiaUpiApplications;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaUpiApplications implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndiaUpiApplications> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f72372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f72373b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(IndiaUpiProvider.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(IndiaUpiProvider.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new IndiaUpiApplications(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaUpiApplications[i];
        }
    }

    public IndiaUpiApplications(List popular, List others) {
        Intrinsics.checkNotNullParameter(popular, "popular");
        Intrinsics.checkNotNullParameter(others, "others");
        this.f72372a = popular;
        this.f72373b = others;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndiaUpiApplications)) {
            return false;
        }
        IndiaUpiApplications indiaUpiApplications = (IndiaUpiApplications) obj2;
        return Intrinsics.f(this.f72372a, indiaUpiApplications.f72372a) && Intrinsics.f(this.f72373b, indiaUpiApplications.f72373b);
    }

    public final int hashCode() {
        return this.f72373b.hashCode() + (this.f72372a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f72372a, dest);
        while (itV.hasNext()) {
            ((IndiaUpiProvider) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f72373b, dest);
        while (itV2.hasNext()) {
            ((IndiaUpiProvider) itV2.next()).writeToParcel(dest, i);
        }
    }
}
