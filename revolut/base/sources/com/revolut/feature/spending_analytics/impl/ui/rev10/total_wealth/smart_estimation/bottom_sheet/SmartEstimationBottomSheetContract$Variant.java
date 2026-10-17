package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import hha.w0;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant", "Landroid/os/Parcelable;", "<init>", "()V", "FreeInfo", "Remaining", "OutOfAssets", "Deferred", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$Deferred;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$FreeInfo;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$OutOfAssets;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$Remaining;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SmartEstimationBottomSheetContract$Variant implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$Deferred;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deferred extends SmartEstimationBottomSheetContract$Variant {

        @NotNull
        public static final Parcelable.Creator<Deferred> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f88029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88031c;
        public final ZonedDateTime d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deferred(w0.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, (ZonedDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deferred[i];
            }
        }

        public Deferred(w0 planTier, int i, boolean z, ZonedDateTime nextEstimationDate) {
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            Intrinsics.checkNotNullParameter(nextEstimationDate, "nextEstimationDate");
            this.f88029a = planTier;
            this.f88030b = i;
            this.f88031c = z;
            this.d = nextEstimationDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deferred)) {
                return false;
            }
            Deferred deferred = (Deferred) obj2;
            return this.f88029a == deferred.f88029a && this.f88030b == deferred.f88030b && this.f88031c == deferred.f88031c && Intrinsics.f(this.d, deferred.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(j6.a.b(this.f88030b, this.f88029a.hashCode() * 31, 31), 31, this.f88031c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88029a.name());
            dest.writeInt(this.f88030b);
            dest.writeInt(this.f88031c ? 1 : 0);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$FreeInfo;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreeInfo extends SmartEstimationBottomSheetContract$Variant {

        @NotNull
        public static final Parcelable.Creator<FreeInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88032a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreeInfo(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreeInfo[i];
            }
        }

        public FreeInfo(int i) {
            this.f88032a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FreeInfo) && this.f88032a == ((FreeInfo) obj2).f88032a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f88032a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f88032a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$OutOfAssets;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutOfAssets extends SmartEstimationBottomSheetContract$Variant {

        @NotNull
        public static final Parcelable.Creator<OutOfAssets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f88033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88035c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutOfAssets(w0.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OutOfAssets[i];
            }
        }

        public OutOfAssets(w0 planTier, int i, boolean z) {
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            this.f88033a = planTier;
            this.f88034b = i;
            this.f88035c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OutOfAssets)) {
                return false;
            }
            OutOfAssets outOfAssets = (OutOfAssets) obj2;
            return this.f88033a == outOfAssets.f88033a && this.f88034b == outOfAssets.f88034b && this.f88035c == outOfAssets.f88035c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88035c) + j6.a.b(this.f88034b, this.f88033a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88033a.name());
            dest.writeInt(this.f88034b);
            dest.writeInt(this.f88035c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant$Remaining;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetContract$Variant;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remaining extends SmartEstimationBottomSheetContract$Variant {

        @NotNull
        public static final Parcelable.Creator<Remaining> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f88036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f88038c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remaining(w0.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remaining[i];
            }
        }

        public Remaining(w0 planTier, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            this.f88036a = planTier;
            this.f88037b = i;
            this.f88038c = i2;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Remaining)) {
                return false;
            }
            Remaining remaining = (Remaining) obj2;
            return this.f88036a == remaining.f88036a && this.f88037b == remaining.f88037b && this.f88038c == remaining.f88038c && this.d == remaining.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.b(this.f88038c, j6.a.b(this.f88037b, this.f88036a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88036a.name());
            dest.writeInt(this.f88037b);
            dest.writeInt(this.f88038c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private SmartEstimationBottomSheetContract$Variant() {
    }
}
