package com.revolut.feature.spending_analytics.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthSelectType$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsFeatureConfig$TotalWealthSelectType$Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AnalyticsFeatureConfig$TotalWealthSelectType$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f87435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87436c;
    public final d d;
    public final int e;
    public final TransitionAnimation f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsFeatureConfig$TotalWealthSelectType$Destination((d) parcel.readSerializable(), parcel.readInt(), (d) parcel.readSerializable(), parcel.readInt(), (TransitionAnimation) parcel.readParcelable(AnalyticsFeatureConfig$TotalWealthSelectType$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsFeatureConfig$TotalWealthSelectType$Destination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsFeatureConfig$TotalWealthSelectType$Destination(d assetsTotal, int i, d liabilitiesTotal, int i2, TransitionAnimation transitionAnimation) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(assetsTotal, "assetsTotal");
        Intrinsics.checkNotNullParameter(liabilitiesTotal, "liabilitiesTotal");
        this.f87435b = assetsTotal;
        this.f87436c = i;
        this.d = liabilitiesTotal;
        this.e = i2;
        this.f = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF87436c() {
        return this.f87436c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getF87435b() {
        return this.f87435b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsFeatureConfig$TotalWealthSelectType$Destination)) {
            return false;
        }
        AnalyticsFeatureConfig$TotalWealthSelectType$Destination analyticsFeatureConfig$TotalWealthSelectType$Destination = (AnalyticsFeatureConfig$TotalWealthSelectType$Destination) obj2;
        return Intrinsics.f(this.f87435b, analyticsFeatureConfig$TotalWealthSelectType$Destination.f87435b) && this.f87436c == analyticsFeatureConfig$TotalWealthSelectType$Destination.f87436c && Intrinsics.f(this.d, analyticsFeatureConfig$TotalWealthSelectType$Destination.d) && this.e == analyticsFeatureConfig$TotalWealthSelectType$Destination.e && Intrinsics.f(this.f, analyticsFeatureConfig$TotalWealthSelectType$Destination.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, v7.c(j6.a.b(this.f87436c, this.f87435b.hashCode() * 31, 31), 31, this.d), 31);
        TransitionAnimation transitionAnimation = this.f;
        return iB + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f87435b);
        dest.writeInt(this.f87436c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e);
        dest.writeParcelable(this.f, i);
    }
}
