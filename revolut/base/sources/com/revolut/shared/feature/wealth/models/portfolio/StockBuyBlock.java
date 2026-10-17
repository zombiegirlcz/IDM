package com.revolut.shared.feature.wealth.models.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock;", "Landroid/os/Parcelable;", "<init>", "()V", "Inactive", "Active", "PendingDeactivation", "Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock$Active;", "Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock$Inactive;", "Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock$PendingDeactivation;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StockBuyBlock implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock$Active;", "Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Active extends StockBuyBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Active f105144a = new Active();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Active.f105144a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        private Active() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock$Inactive;", "Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Inactive extends StockBuyBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Inactive f105145a = new Inactive();

        @NotNull
        public static final Parcelable.Creator<Inactive> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Inactive.f105145a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Inactive[i];
            }
        }

        private Inactive() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock$PendingDeactivation;", "Lcom/revolut/shared/feature/wealth/models/portfolio/StockBuyBlock;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingDeactivation extends StockBuyBlock {

        @NotNull
        public static final Parcelable.Creator<PendingDeactivation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f105146a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingDeactivation(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingDeactivation[i];
            }
        }

        public PendingDeactivation(Long l2) {
            this.f105146a = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingDeactivation) && Intrinsics.f(this.f105146a, ((PendingDeactivation) obj2).f105146a);
        }

        public final int hashCode() {
            Long l2 = this.f105146a;
            if (l2 == null) {
                return 0;
            }
            return l2.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l2 = this.f105146a;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
        }
    }

    private StockBuyBlock() {
    }
}
