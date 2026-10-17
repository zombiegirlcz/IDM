package com.revolut.feature.rev_points.impl.ui.earn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction", "Landroid/os/Parcelable;", "<init>", "()V", "None", "OpenSpareChange", "OpenPointsBuying", "Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction$None;", "Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction$OpenPointsBuying;", "Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction$OpenSpareChange;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsEarnScreenContract$PendingAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction$None;", "Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends RevPointsEarnScreenContract$PendingAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f83793a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f83793a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
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

    private RevPointsEarnScreenContract$PendingAction() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction$OpenPointsBuying;", "Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenPointsBuying extends RevPointsEarnScreenContract$PendingAction {

        @NotNull
        public static final Parcelable.Creator<OpenPointsBuying> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f83794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83795b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenPointsBuying(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenPointsBuying[i];
            }
        }

        public OpenPointsBuying(Integer num, boolean z) {
            this.f83794a = num;
            this.f83795b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenPointsBuying)) {
                return false;
            }
            OpenPointsBuying openPointsBuying = (OpenPointsBuying) obj2;
            return Intrinsics.f(this.f83794a, openPointsBuying.f83794a) && this.f83795b == openPointsBuying.f83795b;
        }

        public final int hashCode() {
            Integer num = this.f83794a;
            return Boolean.hashCode(this.f83795b) + ((num == null ? 0 : num.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f83794a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeInt(this.f83795b ? 1 : 0);
        }

        public OpenPointsBuying() {
            this(null, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction$OpenSpareChange;", "Lcom/revolut/feature/rev_points/impl/ui/earn/RevPointsEarnScreenContract$PendingAction;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenSpareChange extends RevPointsEarnScreenContract$PendingAction {

        @NotNull
        public static final Parcelable.Creator<OpenSpareChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f83796a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenSpareChange(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenSpareChange[i];
            }
        }

        public OpenSpareChange(Integer num) {
            this.f83796a = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenSpareChange) && Intrinsics.f(this.f83796a, ((OpenSpareChange) obj2).f83796a);
        }

        public final int hashCode() {
            Integer num = this.f83796a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f83796a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public OpenSpareChange() {
            this(null);
        }
    }
}
