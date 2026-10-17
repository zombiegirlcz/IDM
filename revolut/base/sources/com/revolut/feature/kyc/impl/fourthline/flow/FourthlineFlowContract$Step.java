package com.revolut.feature.kyc.impl.fourthline.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InstallFeature", "FourthlineScreen", "Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step$FourthlineScreen;", "Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step$InstallFeature;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FourthlineFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step$FourthlineScreen;", "Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FourthlineScreen implements FourthlineFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FourthlineScreen f77762a = new FourthlineScreen();

        @NotNull
        public static final Parcelable.Creator<FourthlineScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FourthlineScreen.f77762a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FourthlineScreen[i];
            }
        }

        private FourthlineScreen() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof FourthlineScreen);
        }

        public final int hashCode() {
            return 1423696317;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step$InstallFeature;", "Lcom/revolut/feature/kyc/impl/fourthline/flow/FourthlineFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstallFeature implements FourthlineFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstallFeature f77763a = new InstallFeature();

        @NotNull
        public static final Parcelable.Creator<InstallFeature> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstallFeature.f77763a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallFeature[i];
            }
        }

        private InstallFeature() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof InstallFeature);
        }

        public final int hashCode() {
            return -1068367810;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
