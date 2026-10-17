package com.revolut.feature.rev_points.spare_change.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yvh.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode", "Landroid/os/Parcelable;", "<init>", "()V", "OnBoarding", "Adjust", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode$Adjust;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode$OnBoarding;", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsSpareChangeControllerApi$Mode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode$Adjust;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Adjust extends RevPointsSpareChangeControllerApi$Mode {

        @NotNull
        public static final Parcelable.Creator<Adjust> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f84126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f84128c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Adjust((b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Adjust[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Adjust() {
            this(null, 0 == true ? 1 : 0, 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Adjust)) {
                return false;
            }
            Adjust adjust = (Adjust) obj2;
            return Intrinsics.f(this.f84126a, adjust.f84126a) && this.f84127b == adjust.f84127b && Intrinsics.f(this.f84128c, adjust.f84128c) && this.d == adjust.d;
        }

        public final int hashCode() {
            b bVar = this.f84126a;
            int iC = j6.a.c((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f84127b);
            Integer num = this.f84128c;
            return Boolean.hashCode(this.d) + ((iC + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f84126a);
            dest.writeInt(this.f84127b ? 1 : 0);
            Integer num = this.f84128c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeInt(this.d ? 1 : 0);
        }

        public Adjust(b bVar, boolean z, Integer num, boolean z3) {
            this.f84126a = bVar;
            this.f84127b = z;
            this.f84128c = num;
            this.d = z3;
        }

        public /* synthetic */ Adjust(b bVar, Integer num, int i) {
            this((i & 1) != 0 ? null : bVar, (i & 2) == 0, (i & 4) != 0 ? null : num, (i & 8) != 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode$OnBoarding;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Mode;", "<init>", "()V", "feature_rev_points_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OnBoarding extends RevPointsSpareChangeControllerApi$Mode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBoarding f84129a = new OnBoarding();

        @NotNull
        public static final Parcelable.Creator<OnBoarding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OnBoarding.f84129a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnBoarding[i];
            }
        }

        private OnBoarding() {
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

    private RevPointsSpareChangeControllerApi$Mode() {
    }
}
