package com.revolut.feature.credit.health.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsights;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditScoreInsights implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditScoreInsights> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f69988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f69989b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditScoreInsight.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditScoreInsights(localDate, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditScoreInsights[i];
        }
    }

    public CreditScoreInsights(LocalDate snapshotDate, ArrayList insights) {
        Intrinsics.checkNotNullParameter(snapshotDate, "snapshotDate");
        Intrinsics.checkNotNullParameter(insights, "insights");
        this.f69988a = snapshotDate;
        this.f69989b = insights;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditScoreInsights)) {
            return false;
        }
        CreditScoreInsights creditScoreInsights = (CreditScoreInsights) obj2;
        return Intrinsics.f(this.f69988a, creditScoreInsights.f69988a) && this.f69989b.equals(creditScoreInsights.f69989b);
    }

    public final int hashCode() {
        return this.f69989b.hashCode() + (this.f69988a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69988a);
        Iterator itY = j6.a.y(this.f69989b, dest);
        while (itY.hasNext()) {
            ((CreditScoreInsight) itY.next()).writeToParcel(dest, i);
        }
    }
}
