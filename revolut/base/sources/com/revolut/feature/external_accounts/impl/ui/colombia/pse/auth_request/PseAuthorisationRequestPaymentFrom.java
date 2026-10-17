package com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request;

import android.os.Parcel;
import android.os.Parcelable;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/auth_request/PseAuthorisationRequestPaymentFrom;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PseAuthorisationRequestPaymentFrom implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PseAuthorisationRequestPaymentFrom> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo3.d f72723b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PseAuthorisationRequestPaymentFrom((d) parcel.readSerializable(), fo3.d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PseAuthorisationRequestPaymentFrom[i];
        }
    }

    public PseAuthorisationRequestPaymentFrom(d pocket, fo3.d identityType) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        this.f72722a = pocket;
        this.f72723b = identityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PseAuthorisationRequestPaymentFrom)) {
            return false;
        }
        PseAuthorisationRequestPaymentFrom pseAuthorisationRequestPaymentFrom = (PseAuthorisationRequestPaymentFrom) obj2;
        return Intrinsics.f(this.f72722a, pseAuthorisationRequestPaymentFrom.f72722a) && this.f72723b == pseAuthorisationRequestPaymentFrom.f72723b;
    }

    public final int hashCode() {
        return this.f72723b.hashCode() + (this.f72722a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72722a);
        dest.writeString(this.f72723b.name());
    }
}
