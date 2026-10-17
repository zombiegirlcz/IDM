package com.revolut.feature.rev_points.impl.ui.trophy_room.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y19.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Home", "RevPointsOptIn", "RevPointsRedeem", "Details", "HighlightsSharing", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$Details;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$HighlightsSharing;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$Home;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$RevPointsRedeem;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsTrophyRoomFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$Details;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends RevPointsTrophyRoomFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f83911a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(i type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f83911a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && this.f83911a == ((Details) obj2).f83911a;
        }

        public final int hashCode() {
            return this.f83911a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83911a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$HighlightsSharing;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HighlightsSharing extends RevPointsTrophyRoomFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<HighlightsSharing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f83912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83913b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(HighlightsSharing.class, parcel, arrayList, iE, 1);
                }
                return new HighlightsSharing(parcel.readInt(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HighlightsSharing[i];
            }
        }

        public HighlightsSharing(int i, ArrayList highlights) {
            Intrinsics.checkNotNullParameter(highlights, "highlights");
            this.f83912a = highlights;
            this.f83913b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HighlightsSharing)) {
                return false;
            }
            HighlightsSharing highlightsSharing = (HighlightsSharing) obj2;
            return this.f83912a.equals(highlightsSharing.f83912a) && this.f83913b == highlightsSharing.f83913b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f83913b) + (this.f83912a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f83912a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.f83913b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$Home;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home extends RevPointsTrophyRoomFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f83914a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f83914a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsOptIn extends RevPointsTrophyRoomFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsOptIn f83915a = new RevPointsOptIn();

        @NotNull
        public static final Parcelable.Creator<RevPointsOptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsOptIn.f83915a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsOptIn[i];
            }
        }

        private RevPointsOptIn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step$RevPointsRedeem;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/flow/RevPointsTrophyRoomFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsRedeem extends RevPointsTrophyRoomFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsRedeem f83916a = new RevPointsRedeem();

        @NotNull
        public static final Parcelable.Creator<RevPointsRedeem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsRedeem.f83916a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsRedeem[i];
            }
        }

        private RevPointsRedeem() {
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

    private RevPointsTrophyRoomFlowContract$Step() {
    }
}
