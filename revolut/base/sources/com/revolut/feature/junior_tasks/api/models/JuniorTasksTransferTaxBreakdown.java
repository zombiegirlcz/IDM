package com.revolut.feature.junior_tasks.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/api/models/JuniorTasksTransferTaxBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorTasksTransferTaxBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorTasksTransferTaxBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f77352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorTaskTaxBreakdownType f77353b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorTasksTransferTaxBreakdown((d) parcel.readSerializable(), (JuniorTaskTaxBreakdownType) parcel.readParcelable(JuniorTasksTransferTaxBreakdown.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorTasksTransferTaxBreakdown[i];
        }
    }

    public JuniorTasksTransferTaxBreakdown(d amount, JuniorTaskTaxBreakdownType type) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f77352a = amount;
        this.f77353b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorTasksTransferTaxBreakdown)) {
            return false;
        }
        JuniorTasksTransferTaxBreakdown juniorTasksTransferTaxBreakdown = (JuniorTasksTransferTaxBreakdown) obj2;
        return Intrinsics.f(this.f77352a, juniorTasksTransferTaxBreakdown.f77352a) && Intrinsics.f(this.f77353b, juniorTasksTransferTaxBreakdown.f77353b);
    }

    public final int hashCode() {
        return this.f77353b.hashCode() + (this.f77352a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77352a);
        dest.writeParcelable(this.f77353b, i);
    }
}
