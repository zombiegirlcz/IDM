package com.revolut.feature.rev_points.impl.ui.transactions.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/rev_points/impl/ui/transactions/list/RevPointsTransactionsListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "UiOverrides", "EmptyStateOverride", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTransactionsListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsTransactionsListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransactionPageParams f83876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UiOverrides f83877b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/list/RevPointsTransactionsListScreenContract$InputData$UiOverrides;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UiOverrides implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiOverrides> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResourceId f83881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83883c;
        public final EmptyStateOverride d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiOverrides((ResourceId) parcel.readParcelable(UiOverrides.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : EmptyStateOverride.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UiOverrides[i];
            }
        }

        public UiOverrides() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UiOverrides)) {
                return false;
            }
            UiOverrides uiOverrides = (UiOverrides) obj2;
            return Intrinsics.f(this.f83881a, uiOverrides.f83881a) && this.f83882b == uiOverrides.f83882b && this.f83883c == uiOverrides.f83883c && Intrinsics.f(this.d, uiOverrides.d);
        }

        public final int hashCode() {
            ResourceId resourceId = this.f83881a;
            int iC = j6.a.c(j6.a.c((resourceId == null ? 0 : resourceId.hashCode()) * 31, 31, this.f83882b), 31, this.f83883c);
            EmptyStateOverride emptyStateOverride = this.d;
            return iC + (emptyStateOverride != null ? emptyStateOverride.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83881a, i);
            dest.writeInt(this.f83882b ? 1 : 0);
            dest.writeInt(this.f83883c ? 1 : 0);
            EmptyStateOverride emptyStateOverride = this.d;
            if (emptyStateOverride == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                emptyStateOverride.writeToParcel(dest, i);
            }
        }

        public UiOverrides(ResourceId resourceId, boolean z, boolean z3, EmptyStateOverride emptyStateOverride) {
            this.f83881a = resourceId;
            this.f83882b = z;
            this.f83883c = z3;
            this.d = emptyStateOverride;
        }

        public /* synthetic */ UiOverrides(int i) {
            this(null, true, false, null);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsTransactionsListScreenContract$InputData((RevPointsTransactionPageParams) parcel.readParcelable(RevPointsTransactionsListScreenContract$InputData.class.getClassLoader()), UiOverrides.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTransactionsListScreenContract$InputData[i];
        }
    }

    public RevPointsTransactionsListScreenContract$InputData(RevPointsTransactionPageParams pageParams, UiOverrides uiOverrides) {
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        Intrinsics.checkNotNullParameter(uiOverrides, "uiOverrides");
        this.f83876a = pageParams;
        this.f83877b = uiOverrides;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsTransactionsListScreenContract$InputData)) {
            return false;
        }
        RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData = (RevPointsTransactionsListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f83876a, revPointsTransactionsListScreenContract$InputData.f83876a) && Intrinsics.f(this.f83877b, revPointsTransactionsListScreenContract$InputData.f83877b);
    }

    public final int hashCode() {
        return this.f83877b.hashCode() + (this.f83876a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83876a, i);
        this.f83877b.writeToParcel(dest, i);
    }

    public RevPointsTransactionsListScreenContract$InputData() {
        this(new RevPointsTransactionPageParams(0, null, null, null, null, null, null, null, null, 511), new UiOverrides(0));
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/list/RevPointsTransactionsListScreenContract$InputData$EmptyStateOverride;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmptyStateOverride implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EmptyStateOverride> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResourceId f83878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResourceId f83879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceId f83880c;
        public final ComplexImage d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmptyStateOverride((ResourceId) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()), (ResourceId) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()), (ResourceId) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()), (ComplexImage) parcel.readParcelable(EmptyStateOverride.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmptyStateOverride[i];
            }
        }

        public EmptyStateOverride(ResourceId resourceId, ResourceId resourceId2, ResourceId resourceId3, ComplexImage complexImage) {
            this.f83878a = resourceId;
            this.f83879b = resourceId2;
            this.f83880c = resourceId3;
            this.d = complexImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmptyStateOverride)) {
                return false;
            }
            EmptyStateOverride emptyStateOverride = (EmptyStateOverride) obj2;
            return Intrinsics.f(this.f83878a, emptyStateOverride.f83878a) && Intrinsics.f(this.f83879b, emptyStateOverride.f83879b) && Intrinsics.f(this.f83880c, emptyStateOverride.f83880c) && Intrinsics.f(this.d, emptyStateOverride.d);
        }

        public final int hashCode() {
            ResourceId resourceId = this.f83878a;
            int iHashCode = (resourceId == null ? 0 : resourceId.hashCode()) * 31;
            ResourceId resourceId2 = this.f83879b;
            int iHashCode2 = (iHashCode + (resourceId2 == null ? 0 : resourceId2.hashCode())) * 31;
            ResourceId resourceId3 = this.f83880c;
            int iHashCode3 = (iHashCode2 + (resourceId3 == null ? 0 : resourceId3.hashCode())) * 31;
            ComplexImage complexImage = this.d;
            return iHashCode3 + (complexImage != null ? complexImage.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83878a, i);
            dest.writeParcelable(this.f83879b, i);
            dest.writeParcelable(this.f83880c, i);
            dest.writeParcelable(this.d, i);
        }

        public EmptyStateOverride() {
            this(null, null, null, null);
        }
    }
}
