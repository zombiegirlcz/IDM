package com.revolut.feature.in_app_calls.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Ringing", "RecordAudioPermission", "InProgress", "Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step$InProgress;", "Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step$RecordAudioPermission;", "Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step$Ringing;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InAppCallsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step$InProgress;", "Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InProgress implements InAppCallsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InProgress f74805a = new InProgress();

        @NotNull
        public static final Parcelable.Creator<InProgress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InProgress.f74805a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InProgress[i];
            }
        }

        private InProgress() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step$RecordAudioPermission;", "Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecordAudioPermission implements InAppCallsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecordAudioPermission f74806a = new RecordAudioPermission();

        @NotNull
        public static final Parcelable.Creator<RecordAudioPermission> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecordAudioPermission.f74806a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecordAudioPermission[i];
            }
        }

        private RecordAudioPermission() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step$Ringing;", "Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlowContract$Step;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Ringing implements InAppCallsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ringing f74807a = new Ringing();

        @NotNull
        public static final Parcelable.Creator<Ringing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Ringing.f74807a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ringing[i];
            }
        }

        private Ringing() {
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
