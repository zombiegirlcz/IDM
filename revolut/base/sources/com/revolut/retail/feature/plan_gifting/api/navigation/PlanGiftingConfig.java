package com.revolut.retail.feature.plan_gifting.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import kbk.a;
import kbk.k;
import kbk.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Sender", "Receiver", "SenderDestination", "ReceiverDestination", "Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig$Receiver;", "Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig$Sender;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanGiftingConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig$Receiver;", "Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Receiver extends PlanGiftingConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f102446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PlanGiftingClaimingExitRule f102447h;
        public final k i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Receiver(String planGiftId, PlanGiftingClaimingExitRule exitRule, k introVariant) {
            super(new ReceiverDestination(planGiftId, exitRule, introVariant));
            Intrinsics.checkNotNullParameter(planGiftId, "planGiftId");
            Intrinsics.checkNotNullParameter(exitRule, "exitRule");
            Intrinsics.checkNotNullParameter(introVariant, "introVariant");
            this.f102446g = planGiftId;
            this.f102447h = exitRule;
            this.i = introVariant;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF98953g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Receiver)) {
                return false;
            }
            Receiver receiver = (Receiver) obj2;
            return Intrinsics.f(this.f102446g, receiver.f102446g) && Intrinsics.f(this.f102447h, receiver.f102447h) && this.i == receiver.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return (this.i.hashCode() + ((this.f102447h.hashCode() + (this.f102446g.hashCode() * 31)) * 31)) * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig$ReceiverDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReceiverDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ReceiverDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlanGiftingClaimingExitRule f102449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f102450c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReceiverDestination(parcel.readString(), (PlanGiftingClaimingExitRule) parcel.readParcelable(ReceiverDestination.class.getClassLoader()), k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReceiverDestination[i];
            }
        }

        public ReceiverDestination(String giftId, PlanGiftingClaimingExitRule exitRule, k introVariant) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            Intrinsics.checkNotNullParameter(exitRule, "exitRule");
            Intrinsics.checkNotNullParameter(introVariant, "introVariant");
            this.f102448a = giftId;
            this.f102449b = exitRule;
            this.f102450c = introVariant;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PlanGiftingClaimingExitRule getF102449b() {
            return this.f102449b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF102448a() {
            return this.f102448a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final k getF102450c() {
            return this.f102450c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReceiverDestination)) {
                return false;
            }
            ReceiverDestination receiverDestination = (ReceiverDestination) obj2;
            return Intrinsics.f(this.f102448a, receiverDestination.f102448a) && Intrinsics.f(this.f102449b, receiverDestination.f102449b) && this.f102450c == receiverDestination.f102450c;
        }

        public final int hashCode() {
            return this.f102450c.hashCode() + ((this.f102449b.hashCode() + (this.f102448a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102448a);
            dest.writeParcelable(this.f102449b, i);
            dest.writeString(this.f102450c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig$Sender;", "Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sender extends PlanGiftingConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f102451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final l f102452h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sender(a birthdaySharingRequestStrategy, l source) {
            super(new SenderDestination(birthdaySharingRequestStrategy, source));
            Intrinsics.checkNotNullParameter(birthdaySharingRequestStrategy, "birthdaySharingRequestStrategy");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102451g = birthdaySharingRequestStrategy;
            this.f102452h = source;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF98953g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Sender)) {
                return false;
            }
            Sender sender = (Sender) obj2;
            return this.f102451g == sender.f102451g && this.f102452h == sender.f102452h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f102452h.hashCode() + (this.f102451g.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/navigation/PlanGiftingConfig$SenderDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SenderDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SenderDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kbk.a f102453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f102454b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SenderDestination(kbk.a.valueOf(parcel.readString()), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SenderDestination[i];
            }
        }

        public SenderDestination(kbk.a birthdaySharingRequestStrategy, l source) {
            Intrinsics.checkNotNullParameter(birthdaySharingRequestStrategy, "birthdaySharingRequestStrategy");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102453a = birthdaySharingRequestStrategy;
            this.f102454b = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final kbk.a getF102453a() {
            return this.f102453a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final l getF102454b() {
            return this.f102454b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SenderDestination)) {
                return false;
            }
            SenderDestination senderDestination = (SenderDestination) obj2;
            return this.f102453a == senderDestination.f102453a && this.f102454b == senderDestination.f102454b;
        }

        public final int hashCode() {
            return this.f102454b.hashCode() + (this.f102453a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102453a.name());
            dest.writeString(this.f102454b.name());
        }
    }

    public PlanGiftingConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }
}
