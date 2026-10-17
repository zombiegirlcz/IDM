package com.revolut.feature.kyc.impl.idnow.eid.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InstallFeature", "Sdk", "Lcom/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step$InstallFeature;", "Lcom/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step$Sdk;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IdnowEidFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step$InstallFeature;", "Lcom/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstallFeature implements IdnowEidFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstallFeature f77778a = new InstallFeature();

        @NotNull
        public static final Parcelable.Creator<InstallFeature> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstallFeature.f77778a;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step$Sdk;", "Lcom/revolut/feature/kyc/impl/idnow/eid/flow/IdnowEidFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sdk implements IdnowEidFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Sdk> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77779a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sdk(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sdk[i];
            }
        }

        public Sdk(String identToken) {
            Intrinsics.checkNotNullParameter(identToken, "identToken");
            this.f77779a = identToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Sdk) && Intrinsics.f(this.f77779a, ((Sdk) obj2).f77779a);
        }

        public final int hashCode() {
            return this.f77779a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77779a);
        }
    }
}
