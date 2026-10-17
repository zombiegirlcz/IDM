package com.revolut.feature.rev_points.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsOptInDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsOptInDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevPointsOptInDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsOptInNextDestination f83522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsOptInNextDestination f83523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LifestyleRevPointsOptInController$InputData f83524c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsOptInDestination((RevPointsOptInNextDestination) parcel.readParcelable(RevPointsOptInDestination.class.getClassLoader()), (RevPointsOptInNextDestination) parcel.readParcelable(RevPointsOptInDestination.class.getClassLoader()), LifestyleRevPointsOptInController$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsOptInDestination[i];
        }
    }

    public RevPointsOptInDestination(RevPointsOptInNextDestination nextDestination, RevPointsOptInNextDestination skipDestination, LifestyleRevPointsOptInController$InputData inputData) {
        Intrinsics.checkNotNullParameter(nextDestination, "nextDestination");
        Intrinsics.checkNotNullParameter(skipDestination, "skipDestination");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f83522a = nextDestination;
        this.f83523b = skipDestination;
        this.f83524c = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LifestyleRevPointsOptInController$InputData getF83524c() {
        return this.f83524c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RevPointsOptInNextDestination getF83522a() {
        return this.f83522a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RevPointsOptInNextDestination getF83523b() {
        return this.f83523b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsOptInDestination)) {
            return false;
        }
        RevPointsOptInDestination revPointsOptInDestination = (RevPointsOptInDestination) obj2;
        return Intrinsics.f(this.f83522a, revPointsOptInDestination.f83522a) && Intrinsics.f(this.f83523b, revPointsOptInDestination.f83523b) && Intrinsics.f(this.f83524c, revPointsOptInDestination.f83524c);
    }

    public final int hashCode() {
        return this.f83524c.hashCode() + ((this.f83523b.hashCode() + (this.f83522a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83522a, i);
        dest.writeParcelable(this.f83523b, i);
        this.f83524c.writeToParcel(dest, i);
    }
}
