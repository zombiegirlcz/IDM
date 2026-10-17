package com.revolut.feature.kyc.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor;", "Laii/e;", "Lks8/d;", "Landroid/os/Parcelable;", "Confirmation", "Verification", "Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor$Confirmation;", "Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor$Verification;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProofOfAddressFlowDescriptor extends e, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor$Confirmation;", "Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements ProofOfAddressFlowDescriptor {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KycContract$Requirement f77506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f77507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final gt8.a f77508c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(KycContract$Requirement.CREATOR.createFromParcel(parcel), gt8.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(KycContract$Requirement requirement, gt8.a completionDialog, b bVar) {
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
            this.f77506a = requirement;
            this.f77507b = bVar;
            this.f77508c = completionDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final gt8.a getF77508c() {
            return this.f77508c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getF77507b() {
            return this.f77507b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final KycContract$Requirement getF77506a() {
            return this.f77506a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f77506a, confirmation.f77506a) && Intrinsics.f(this.f77507b, confirmation.f77507b) && this.f77508c == confirmation.f77508c;
        }

        public final int hashCode() {
            int iHashCode = this.f77506a.hashCode() * 31;
            b bVar = this.f77507b;
            return this.f77508c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77506a.writeToParcel(dest, i);
            dest.writeSerializable(this.f77507b);
            dest.writeString(this.f77508c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor$Verification;", "Lcom/revolut/feature/kyc/api/navigation/ProofOfAddressFlowDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Verification implements ProofOfAddressFlowDescriptor {

        @NotNull
        public static final Parcelable.Creator<Verification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KycContract$Requirement f77509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f77510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final gt8.a f77511c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Verification(KycContract$Requirement.CREATOR.createFromParcel(parcel), gt8.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Verification[i];
            }
        }

        public Verification(KycContract$Requirement requirement, gt8.a completionDialog, b bVar) {
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
            this.f77509a = requirement;
            this.f77510b = bVar;
            this.f77511c = completionDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final gt8.a getF77511c() {
            return this.f77511c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getF77510b() {
            return this.f77510b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final KycContract$Requirement getF77509a() {
            return this.f77509a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) obj2;
            return Intrinsics.f(this.f77509a, verification.f77509a) && Intrinsics.f(this.f77510b, verification.f77510b) && this.f77511c == verification.f77511c;
        }

        public final int hashCode() {
            int iHashCode = this.f77509a.hashCode() * 31;
            b bVar = this.f77510b;
            return this.f77511c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77509a.writeToParcel(dest, i);
            dest.writeSerializable(this.f77510b);
            dest.writeString(this.f77511c.name());
        }
    }
}
