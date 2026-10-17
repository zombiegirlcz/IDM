package com.revolut.feature.spending_analytics.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CustomPeriodPicker$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsFeatureConfig$CustomPeriodPicker$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AnalyticsFeatureConfig$CustomPeriodPicker$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f87407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f87408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f87409c;
    public final boolean d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AnalyticsFeatureConfig$CustomPeriodPicker$Destination.class, parcel, arrayList, iE, 1);
            }
            return new AnalyticsFeatureConfig$CustomPeriodPicker$Destination(arrayList, (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsFeatureConfig$CustomPeriodPicker$Destination[i];
        }
    }

    public AnalyticsFeatureConfig$CustomPeriodPicker$Destination(ArrayList accounts, LocalDate initialStartDate, LocalDate initialEndDate, boolean z, String customPeriodCacheKey) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(initialStartDate, "initialStartDate");
        Intrinsics.checkNotNullParameter(initialEndDate, "initialEndDate");
        Intrinsics.checkNotNullParameter(customPeriodCacheKey, "customPeriodCacheKey");
        this.f87407a = accounts;
        this.f87408b = initialStartDate;
        this.f87409c = initialEndDate;
        this.d = z;
        this.e = customPeriodCacheKey;
    }

    public final List a() {
        return this.f87407a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getF87409c() {
        return this.f87409c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getF87408b() {
        return this.f87408b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsFeatureConfig$CustomPeriodPicker$Destination)) {
            return false;
        }
        AnalyticsFeatureConfig$CustomPeriodPicker$Destination analyticsFeatureConfig$CustomPeriodPicker$Destination = (AnalyticsFeatureConfig$CustomPeriodPicker$Destination) obj2;
        return this.f87407a.equals(analyticsFeatureConfig$CustomPeriodPicker$Destination.f87407a) && Intrinsics.f(this.f87408b, analyticsFeatureConfig$CustomPeriodPicker$Destination.f87408b) && Intrinsics.f(this.f87409c, analyticsFeatureConfig$CustomPeriodPicker$Destination.f87409c) && this.d == analyticsFeatureConfig$CustomPeriodPicker$Destination.d && Intrinsics.f(this.e, analyticsFeatureConfig$CustomPeriodPicker$Destination.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(y.a(y.a(this.f87407a.hashCode() * 31, 31, this.f87408b), 31, this.f87409c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f87407a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeSerializable(this.f87408b);
        dest.writeSerializable(this.f87409c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
    }
}
