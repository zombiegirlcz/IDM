package com.revolut.feature.crypto.remittance.impl.ui.commonfields;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/crypto/remittance/impl/ui/commonfields/CommonRemittanceFieldDialogContract$DomainState", "Lcli/j;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommonRemittanceFieldDialogContract$DomainState implements j, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CommonRemittanceFieldDialogContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionCryptoRemittanceAction f70953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70954b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommonRemittanceFieldDialogContract$DomainState((TransactionCryptoRemittanceAction) parcel.readParcelable(CommonRemittanceFieldDialogContract$DomainState.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommonRemittanceFieldDialogContract$DomainState[i];
        }
    }

    public CommonRemittanceFieldDialogContract$DomainState(TransactionCryptoRemittanceAction action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f70953a = action;
        this.f70954b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommonRemittanceFieldDialogContract$DomainState)) {
            return false;
        }
        CommonRemittanceFieldDialogContract$DomainState commonRemittanceFieldDialogContract$DomainState = (CommonRemittanceFieldDialogContract$DomainState) obj2;
        return Intrinsics.f(this.f70953a, commonRemittanceFieldDialogContract$DomainState.f70953a) && Intrinsics.f(this.f70954b, commonRemittanceFieldDialogContract$DomainState.f70954b);
    }

    public final int hashCode() {
        int iHashCode = this.f70953a.hashCode() * 31;
        String str = this.f70954b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70953a, i);
        dest.writeString(this.f70954b);
    }
}
