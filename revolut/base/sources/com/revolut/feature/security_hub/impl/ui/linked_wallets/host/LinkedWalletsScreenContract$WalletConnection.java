package com.revolut.feature.security_hub.impl.ui.linked_wallets.host;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.Enrollment;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$WalletConnection", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedWalletsScreenContract$WalletConnection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LinkedWalletsScreenContract$WalletConnection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f85612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DigitizedCard f85613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enrollment f85614c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedWalletsScreenContract$WalletConnection((f0) parcel.readSerializable(), (DigitizedCard) parcel.readParcelable(LinkedWalletsScreenContract$WalletConnection.class.getClassLoader()), (Enrollment) parcel.readParcelable(LinkedWalletsScreenContract$WalletConnection.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedWalletsScreenContract$WalletConnection[i];
        }
    }

    public LinkedWalletsScreenContract$WalletConnection(f0 card, DigitizedCard digitizedCard, Enrollment enrollment) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f85612a = card;
        this.f85613b = digitizedCard;
        this.f85614c = enrollment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedWalletsScreenContract$WalletConnection)) {
            return false;
        }
        LinkedWalletsScreenContract$WalletConnection linkedWalletsScreenContract$WalletConnection = (LinkedWalletsScreenContract$WalletConnection) obj2;
        return Intrinsics.f(this.f85612a, linkedWalletsScreenContract$WalletConnection.f85612a) && Intrinsics.f(this.f85613b, linkedWalletsScreenContract$WalletConnection.f85613b) && Intrinsics.f(this.f85614c, linkedWalletsScreenContract$WalletConnection.f85614c);
    }

    public final int hashCode() {
        int iHashCode = this.f85612a.hashCode() * 31;
        DigitizedCard digitizedCard = this.f85613b;
        int iHashCode2 = (iHashCode + (digitizedCard == null ? 0 : digitizedCard.hashCode())) * 31;
        Enrollment enrollment = this.f85614c;
        return iHashCode2 + (enrollment != null ? enrollment.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85612a);
        dest.writeParcelable(this.f85613b, i);
        dest.writeParcelable(this.f85614c, i);
    }
}
