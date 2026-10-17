package com.revolut.feature.rev_points.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon", "Landroid/os/Parcelable;", "<init>", "()V", "Resource", "Code", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon$Code;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon$Resource;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsEarnOptionsScreenApi$Icon implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon$Code;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Code extends RevPointsEarnOptionsScreenApi$Icon {

        @NotNull
        public static final Parcelable.Creator<Code> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83485a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Code(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Code[i];
            }
        }

        public Code(String iconCode) {
            Intrinsics.checkNotNullParameter(iconCode, "iconCode");
            this.f83485a = iconCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Code) && Intrinsics.f(this.f83485a, ((Code) obj2).f83485a);
        }

        public final int hashCode() {
            return this.f83485a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83485a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon$Resource;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsEarnOptionsScreenApi$Icon;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Resource extends RevPointsEarnOptionsScreenApi$Icon {

        @NotNull
        public static final Parcelable.Creator<Resource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83486a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Resource(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Resource[i];
            }
        }

        public Resource(int i) {
            this.f83486a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Resource) && this.f83486a == ((Resource) obj2).f83486a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f83486a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83486a);
        }
    }

    private RevPointsEarnOptionsScreenApi$Icon() {
    }
}
