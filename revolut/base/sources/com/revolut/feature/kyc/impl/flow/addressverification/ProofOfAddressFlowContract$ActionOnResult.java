package com.revolut.feature.kyc.impl.flow.addressverification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult", "Landroid/os/Parcelable;", "<init>", "()V", "CompleteFlow", "OpenNextScreen", "Finish", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult$CompleteFlow;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult$Finish;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult$OpenNextScreen;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProofOfAddressFlowContract$ActionOnResult implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult$CompleteFlow;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CompleteFlow extends ProofOfAddressFlowContract$ActionOnResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CompleteFlow f77674a = new CompleteFlow();

        @NotNull
        public static final Parcelable.Creator<CompleteFlow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompleteFlow.f77674a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompleteFlow[i];
            }
        }

        private CompleteFlow() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult$Finish;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Finish extends ProofOfAddressFlowContract$ActionOnResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Finish f77675a = new Finish();

        @NotNull
        public static final Parcelable.Creator<Finish> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Finish.f77675a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Finish[i];
            }
        }

        private Finish() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult$OpenNextScreen;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$ActionOnResult;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenNextScreen extends ProofOfAddressFlowContract$ActionOnResult {

        @NotNull
        public static final Parcelable.Creator<OpenNextScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f77676a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenNextScreen((NaviCommand) parcel.readParcelable(OpenNextScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenNextScreen[i];
            }
        }

        public OpenNextScreen(NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
            this.f77676a = naviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenNextScreen) && Intrinsics.f(this.f77676a, ((OpenNextScreen) obj2).f77676a);
        }

        public final int hashCode() {
            return this.f77676a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77676a, i);
        }
    }

    private ProofOfAddressFlowContract$ActionOnResult() {
    }
}
