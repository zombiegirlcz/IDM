package com.revolut.feature.user_declarations.shared.flows.tracking.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Consent", "LearnMore", "Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step$Consent;", "Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step$LearnMore;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrackingConsentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step$Consent;", "Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Consent implements TrackingConsentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Consent f94683a = new Consent();

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Consent.f94683a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        private Consent() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step$LearnMore;", "Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlowContract$Step;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LearnMore implements TrackingConsentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LearnMore f94684a = new LearnMore();

        @NotNull
        public static final Parcelable.Creator<LearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LearnMore.f94684a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMore[i];
            }
        }

        private LearnMore() {
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
}
