package com.revolut.feature.kyc.impl.flow.addressverification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$DocumentsUploadConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProofOfAddressFlowContract$DocumentsUploadConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProofOfAddressFlowContract$DocumentsUploadConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KycContract$Requirement f77678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt8.a f77679c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProofOfAddressFlowContract$DocumentsUploadConfig((KycContract$Requirement) parcel.readParcelable(ProofOfAddressFlowContract$DocumentsUploadConfig.class.getClassLoader()), gt8.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProofOfAddressFlowContract$DocumentsUploadConfig[i];
        }
    }

    public ProofOfAddressFlowContract$DocumentsUploadConfig(KycContract$Requirement requirement, gt8.a completionDialog, b bVar) {
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
        this.f77677a = bVar;
        this.f77678b = requirement;
        this.f77679c = completionDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProofOfAddressFlowContract$DocumentsUploadConfig)) {
            return false;
        }
        ProofOfAddressFlowContract$DocumentsUploadConfig proofOfAddressFlowContract$DocumentsUploadConfig = (ProofOfAddressFlowContract$DocumentsUploadConfig) obj2;
        return Intrinsics.f(this.f77677a, proofOfAddressFlowContract$DocumentsUploadConfig.f77677a) && Intrinsics.f(this.f77678b, proofOfAddressFlowContract$DocumentsUploadConfig.f77678b) && this.f77679c == proofOfAddressFlowContract$DocumentsUploadConfig.f77679c;
    }

    public final int hashCode() {
        b bVar = this.f77677a;
        return this.f77679c.hashCode() + ((this.f77678b.hashCode() + ((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77677a);
        dest.writeParcelable(this.f77678b, i);
        dest.writeString(this.f77679c.name());
    }
}
