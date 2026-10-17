package com.revolut.feature.kyc.impl.screens.addressconfirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/screens/addressconfirmation/AddressConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddressConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KycContract$Requirement f77847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f77848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt8.a f77849c;
    public final lx8.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressConfirmationScreenContract$InputData((KycContract$Requirement) parcel.readParcelable(AddressConfirmationScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), gt8.a.valueOf(parcel.readString()), lx8.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressConfirmationScreenContract$InputData[i];
        }
    }

    public AddressConfirmationScreenContract$InputData(KycContract$Requirement requirement, b bVar, gt8.a completionDialog, lx8.a backNavigationType) {
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f77847a = requirement;
        this.f77848b = bVar;
        this.f77849c = completionDialog;
        this.d = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressConfirmationScreenContract$InputData)) {
            return false;
        }
        AddressConfirmationScreenContract$InputData addressConfirmationScreenContract$InputData = (AddressConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77847a, addressConfirmationScreenContract$InputData.f77847a) && Intrinsics.f(this.f77848b, addressConfirmationScreenContract$InputData.f77848b) && this.f77849c == addressConfirmationScreenContract$InputData.f77849c && this.d == addressConfirmationScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f77847a.hashCode() * 31;
        b bVar = this.f77848b;
        return this.d.hashCode() + ((this.f77849c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77847a, i);
        dest.writeSerializable(this.f77848b);
        dest.writeString(this.f77849c.name());
        dest.writeString(this.d.name());
    }
}
