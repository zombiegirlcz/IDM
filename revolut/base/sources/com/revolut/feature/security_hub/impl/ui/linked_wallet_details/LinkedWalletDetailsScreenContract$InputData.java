package com.revolut.feature.security_hub.impl.ui.linked_wallet_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tuc.m;
import vuc.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedWalletDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkedWalletDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f85591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DigitizedCard f85592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f85593c;
    public final m d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedWalletDetailsScreenContract$InputData((f0) parcel.readSerializable(), (DigitizedCard) parcel.readParcelable(LinkedWalletDetailsScreenContract$InputData.class.getClassLoader()), g.valueOf(parcel.readString()), m.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedWalletDetailsScreenContract$InputData[i];
        }
    }

    public LinkedWalletDetailsScreenContract$InputData(f0 revolutCard, DigitizedCard digitizedCard, g entryPoint, m screenType) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f85591a = revolutCard;
        this.f85592b = digitizedCard;
        this.f85593c = entryPoint;
        this.d = screenType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedWalletDetailsScreenContract$InputData)) {
            return false;
        }
        LinkedWalletDetailsScreenContract$InputData linkedWalletDetailsScreenContract$InputData = (LinkedWalletDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85591a, linkedWalletDetailsScreenContract$InputData.f85591a) && Intrinsics.f(this.f85592b, linkedWalletDetailsScreenContract$InputData.f85592b) && this.f85593c == linkedWalletDetailsScreenContract$InputData.f85593c && this.d == linkedWalletDetailsScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f85593c.hashCode() + ((this.f85592b.hashCode() + (this.f85591a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85591a);
        dest.writeParcelable(this.f85592b, i);
        dest.writeString(this.f85593c.name());
        dest.writeString(this.d.name());
    }
}
