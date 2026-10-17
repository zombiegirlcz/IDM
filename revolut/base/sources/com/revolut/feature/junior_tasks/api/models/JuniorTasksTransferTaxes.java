package com.revolut.feature.junior_tasks.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/models/JuniorTasksTransferTaxes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorTasksTransferTaxes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorTasksTransferTaxes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f77354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f77355b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(JuniorTasksTransferTaxBreakdown.CREATOR, parcel, arrayList, iA, 1);
            }
            return new JuniorTasksTransferTaxes(dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorTasksTransferTaxes[i];
        }
    }

    public JuniorTasksTransferTaxes(d total, ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f77354a = total;
        this.f77355b = breakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorTasksTransferTaxes)) {
            return false;
        }
        JuniorTasksTransferTaxes juniorTasksTransferTaxes = (JuniorTasksTransferTaxes) obj2;
        return Intrinsics.f(this.f77354a, juniorTasksTransferTaxes.f77354a) && this.f77355b.equals(juniorTasksTransferTaxes.f77355b);
    }

    public final int hashCode() {
        return this.f77355b.hashCode() + (this.f77354a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77354a);
        Iterator itY = j6.a.y(this.f77355b, dest);
        while (itY.hasNext()) {
            ((JuniorTasksTransferTaxBreakdown) itY.next()).writeToParcel(dest, i);
        }
    }
}
