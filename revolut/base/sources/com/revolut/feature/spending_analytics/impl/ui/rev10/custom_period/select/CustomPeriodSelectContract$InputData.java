package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/select/CustomPeriodSelectContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomPeriodSelectContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CustomPeriodSelectContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f87676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f87677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f87678c;
    public final LocalDate d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CustomPeriodSelectContract$CustomPeriodConfig f87679g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CustomPeriodSelectContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CustomPeriodSelectContract$InputData(arrayList, (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : CustomPeriodSelectContract$CustomPeriodConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomPeriodSelectContract$InputData[i];
        }
    }

    public CustomPeriodSelectContract$InputData(List accounts, LocalDate localDate, LocalDate initialStartDate, LocalDate initialEndDate, boolean z, String customPeriodCacheKey, CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(initialStartDate, "initialStartDate");
        Intrinsics.checkNotNullParameter(initialEndDate, "initialEndDate");
        Intrinsics.checkNotNullParameter(customPeriodCacheKey, "customPeriodCacheKey");
        this.f87676a = accounts;
        this.f87677b = localDate;
        this.f87678c = initialStartDate;
        this.d = initialEndDate;
        this.e = z;
        this.f = customPeriodCacheKey;
        this.f87679g = customPeriodSelectContract$CustomPeriodConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomPeriodSelectContract$InputData)) {
            return false;
        }
        CustomPeriodSelectContract$InputData customPeriodSelectContract$InputData = (CustomPeriodSelectContract$InputData) obj2;
        return Intrinsics.f(this.f87676a, customPeriodSelectContract$InputData.f87676a) && Intrinsics.f(this.f87677b, customPeriodSelectContract$InputData.f87677b) && Intrinsics.f(this.f87678c, customPeriodSelectContract$InputData.f87678c) && Intrinsics.f(this.d, customPeriodSelectContract$InputData.d) && this.e == customPeriodSelectContract$InputData.e && Intrinsics.f(this.f, customPeriodSelectContract$InputData.f) && Intrinsics.f(this.f87679g, customPeriodSelectContract$InputData.f87679g);
    }

    public final int hashCode() {
        int iHashCode = this.f87676a.hashCode() * 31;
        LocalDate localDate = this.f87677b;
        int iC = p.a.c(j6.a.c(y.a(y.a((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f87678c), 31, this.d), 31, this.e), 31, this.f);
        CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = this.f87679g;
        return iC + (customPeriodSelectContract$CustomPeriodConfig != null ? customPeriodSelectContract$CustomPeriodConfig.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f87676a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.f87677b);
        dest.writeSerializable(this.f87678c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = this.f87679g;
        if (customPeriodSelectContract$CustomPeriodConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customPeriodSelectContract$CustomPeriodConfig.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ CustomPeriodSelectContract$InputData(List list, LocalDate localDate, LocalDate localDate2, boolean z, String str) {
        this(list, null, localDate, localDate2, z, str, null);
    }
}
