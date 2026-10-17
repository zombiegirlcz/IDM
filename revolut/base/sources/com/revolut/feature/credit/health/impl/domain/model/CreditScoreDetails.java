package com.revolut.feature.credit.health.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditScoreDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditScoreDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f69959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f69960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f69961c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(ScoreSnapshot.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(PreapprovedOffer.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ActiveApplication.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new CreditScoreDetails(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditScoreDetails[i];
        }
    }

    public CreditScoreDetails(List scores, List preapprovedOffers, List activeApplications) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        Intrinsics.checkNotNullParameter(preapprovedOffers, "preapprovedOffers");
        Intrinsics.checkNotNullParameter(activeApplications, "activeApplications");
        this.f69959a = scores;
        this.f69960b = preapprovedOffers;
        this.f69961c = activeApplications;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditScoreDetails)) {
            return false;
        }
        CreditScoreDetails creditScoreDetails = (CreditScoreDetails) obj2;
        return Intrinsics.f(this.f69959a, creditScoreDetails.f69959a) && Intrinsics.f(this.f69960b, creditScoreDetails.f69960b) && Intrinsics.f(this.f69961c, creditScoreDetails.f69961c);
    }

    public final int hashCode() {
        return this.f69961c.hashCode() + p.a.d(this.f69959a.hashCode() * 31, 31, this.f69960b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f69959a, dest);
        while (itV.hasNext()) {
            ((ScoreSnapshot) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f69960b, dest);
        while (itV2.hasNext()) {
            ((PreapprovedOffer) itV2.next()).writeToParcel(dest, i);
        }
        Iterator itV3 = p.a.v(this.f69961c, dest);
        while (itV3.hasNext()) {
            ((ActiveApplication) itV3.next()).writeToParcel(dest, i);
        }
    }
}
