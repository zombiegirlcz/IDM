package com.revolut.feature.junior_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorTransferKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "TopUp", "JuniorTopUpPromptDestination", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorTransferKompotFeatureConfig$TopUp;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorTransferKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorTransferKompotFeatureConfig$JuniorTopUpPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorTopUpPromptDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<JuniorTopUpPromptDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f77418b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorTopUpPromptDestination(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorTopUpPromptDestination[i];
            }
        }

        public JuniorTopUpPromptDestination(String walletId, boolean z) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f77417a = walletId;
            this.f77418b = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF77418b() {
            return this.f77418b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF77417a() {
            return this.f77417a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorTopUpPromptDestination)) {
                return false;
            }
            JuniorTopUpPromptDestination juniorTopUpPromptDestination = (JuniorTopUpPromptDestination) obj2;
            return Intrinsics.f(this.f77417a, juniorTopUpPromptDestination.f77417a) && this.f77418b == juniorTopUpPromptDestination.f77418b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77418b) + (this.f77417a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77417a);
            dest.writeInt(this.f77418b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorTransferKompotFeatureConfig$TopUp;", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorTransferKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUp extends JuniorTransferKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f77419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f77420h;
        public final TransitionAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorTransferKompotFeatureConfig$TopUp$Destination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends InternalDestination<IOData$EmptyInput> {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f77421b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f77422c;
            public final TransitionAnimation d;

            /* JADX INFO: loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Destination(TransitionAnimation transitionAnimation, String walletId, boolean z) {
                super(IOData$EmptyInput.f98299a);
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                this.f77421b = walletId;
                this.f77422c = z;
                this.d = transitionAnimation;
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f77421b, destination.f77421b) && this.f77422c == destination.f77422c && Intrinsics.f(this.d, destination.d);
            }

            public final int hashCode() {
                int iC = j6.a.c(this.f77421b.hashCode() * 31, 31, this.f77422c);
                TransitionAnimation transitionAnimation = this.d;
                return iC + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f77421b);
                dest.writeInt(this.f77422c ? 1 : 0);
                dest.writeParcelable(this.d, i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TopUp(String walletId, boolean z, ZoomTransitionAnimation.Widgets widgets, int i) {
            z = (i & 2) != 0 ? true : z;
            widgets = (i & 4) != 0 ? null : widgets;
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            super(null, new Destination(widgets, walletId, z), false, null, 0, 61);
            this.f77419g = walletId;
            this.f77420h = z;
            this.i = widgets;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUp)) {
                return false;
            }
            TopUp topUp = (TopUp) obj2;
            return Intrinsics.f(this.f77419g, topUp.f77419g) && this.f77420h == topUp.f77420h && Intrinsics.f(this.i, topUp.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = a.c(this.f77419g.hashCode() * 31, 31, this.f77420h);
            TransitionAnimation transitionAnimation = this.i;
            return iC + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
        }
    }
}
