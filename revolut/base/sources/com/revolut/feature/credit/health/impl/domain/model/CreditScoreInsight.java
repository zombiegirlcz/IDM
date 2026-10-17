package com.revolut.feature.credit.health.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s05.b;
import s05.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsight;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditScoreInsight implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditScoreInsight> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f69962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f69963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f69964c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c cVarValueOf = c.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditScoreInsightAction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditScoreInsight(cVarValueOf, bVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditScoreInsight[i];
        }
    }

    public CreditScoreInsight(c type, b status, ArrayList actions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f69962a = type;
        this.f69963b = status;
        this.f69964c = actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditScoreInsight)) {
            return false;
        }
        CreditScoreInsight creditScoreInsight = (CreditScoreInsight) obj2;
        return this.f69962a == creditScoreInsight.f69962a && this.f69963b == creditScoreInsight.f69963b && this.f69964c.equals(creditScoreInsight.f69964c);
    }

    public final int hashCode() {
        return this.f69964c.hashCode() + ((this.f69963b.hashCode() + (this.f69962a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69962a.name());
        dest.writeString(this.f69963b.name());
        Iterator itY = j6.a.y(this.f69964c, dest);
        while (itY.hasNext()) {
            ((CreditScoreInsightAction) itY.next()).writeToParcel(dest, i);
        }
    }
}
