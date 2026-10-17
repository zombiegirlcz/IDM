package com.revolut.feature.wealth.impl.ui.screens.composite_add_money;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/composite_add_money/CompositeAddMoneyScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompositeAddMoneyScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CompositeAddMoneyScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferSubjectId f95583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f95584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95585c;
    public final long d;
    public final RecurringDepositSchedule e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f95586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0h.a f95587h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CompositeAddMoneyScreenContract$Input((TransferSubjectId) parcel.readParcelable(CompositeAddMoneyScreenContract$Input.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CompositeAddMoneyScreenContract$Input.class.getClassLoader()), parcel.readString(), parcel.readLong(), (RecurringDepositSchedule) parcel.readParcelable(CompositeAddMoneyScreenContract$Input.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, j0h.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CompositeAddMoneyScreenContract$Input[i];
        }
    }

    public CompositeAddMoneyScreenContract$Input(TransferSubjectId transferSubjectId, AnalyticsProduct analyticsProduct, String str, long j2, RecurringDepositSchedule recurringDepositSchedule, String str2, boolean z, j0h.a mode) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f95583a = transferSubjectId;
        this.f95584b = analyticsProduct;
        this.f95585c = str;
        this.d = j2;
        this.e = recurringDepositSchedule;
        this.f = str2;
        this.f95586g = z;
        this.f95587h = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CompositeAddMoneyScreenContract$Input)) {
            return false;
        }
        CompositeAddMoneyScreenContract$Input compositeAddMoneyScreenContract$Input = (CompositeAddMoneyScreenContract$Input) obj2;
        return Intrinsics.f(this.f95583a, compositeAddMoneyScreenContract$Input.f95583a) && Intrinsics.f(this.f95584b, compositeAddMoneyScreenContract$Input.f95584b) && Intrinsics.f(this.f95585c, compositeAddMoneyScreenContract$Input.f95585c) && this.d == compositeAddMoneyScreenContract$Input.d && Intrinsics.f(this.e, compositeAddMoneyScreenContract$Input.e) && Intrinsics.f(this.f, compositeAddMoneyScreenContract$Input.f) && this.f95586g == compositeAddMoneyScreenContract$Input.f95586g && this.f95587h == compositeAddMoneyScreenContract$Input.f95587h;
    }

    public final int hashCode() {
        int iA = l.a(this.f95583a.hashCode() * 31, 31, this.f95584b);
        String str = this.f95585c;
        int iC = d.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        RecurringDepositSchedule recurringDepositSchedule = this.e;
        int iHashCode = (iC + (recurringDepositSchedule == null ? 0 : recurringDepositSchedule.hashCode())) * 31;
        String str2 = this.f;
        return this.f95587h.hashCode() + j6.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f95586g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95583a, i);
        dest.writeParcelable(this.f95584b, i);
        dest.writeString(this.f95585c);
        dest.writeLong(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeInt(this.f95586g ? 1 : 0);
        dest.writeString(this.f95587h.name());
    }
}
