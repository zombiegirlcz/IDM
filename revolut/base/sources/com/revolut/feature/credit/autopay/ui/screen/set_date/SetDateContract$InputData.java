package com.revolut.feature.credit.autopay.ui.screen.set_date;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mb5.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/set_date/SetDateContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetDateContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SetDateContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f68666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68667c;
    public final long d;
    public final u e;
    public final AnalyticsContext f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new SetDateContract$InputData(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readLong(), u.valueOf(parcel.readString()), (AnalyticsContext) parcel.readParcelable(SetDateContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SetDateContract$InputData[i];
        }
    }

    public SetDateContract$InputData(List filteredDays, Integer num, boolean z, long j2, u selectedPaymentType, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(filteredDays, "filteredDays");
        Intrinsics.checkNotNullParameter(selectedPaymentType, "selectedPaymentType");
        this.f68665a = filteredDays;
        this.f68666b = num;
        this.f68667c = z;
        this.d = j2;
        this.e = selectedPaymentType;
        this.f = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SetDateContract$InputData)) {
            return false;
        }
        SetDateContract$InputData setDateContract$InputData = (SetDateContract$InputData) obj2;
        return Intrinsics.f(this.f68665a, setDateContract$InputData.f68665a) && Intrinsics.f(this.f68666b, setDateContract$InputData.f68666b) && this.f68667c == setDateContract$InputData.f68667c && this.d == setDateContract$InputData.d && this.e == setDateContract$InputData.e && Intrinsics.f(this.f, setDateContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = this.f68665a.hashCode() * 31;
        Integer num = this.f68666b;
        int iHashCode2 = (this.e.hashCode() + d.c(j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f68667c), 31, this.d)) * 31;
        AnalyticsContext analyticsContext = this.f;
        return iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f68665a, dest);
        while (itV.hasNext()) {
            dest.writeInt(((Number) itV.next()).intValue());
        }
        Integer num = this.f68666b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f68667c ? 1 : 0);
        dest.writeLong(this.d);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
    }
}
