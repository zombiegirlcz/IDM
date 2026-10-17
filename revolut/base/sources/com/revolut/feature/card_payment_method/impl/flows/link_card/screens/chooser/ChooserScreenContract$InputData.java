package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_payment_method/impl/flows/link_card/screens/chooser/ChooserScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooserScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChooserScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketWithSubaccount f65269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f65270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f65271c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooserScreenContract$InputData((PocketWithSubaccount) parcel.readParcelable(ChooserScreenContract$InputData.class.getClassLoader()), (AccountId) parcel.readParcelable(ChooserScreenContract$InputData.class.getClassLoader()), (f0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserScreenContract$InputData[i];
        }
    }

    public ChooserScreenContract$InputData(PocketWithSubaccount pocketWithSubaccount, AccountId accountId, f0 f0Var) {
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f65269a = pocketWithSubaccount;
        this.f65270b = accountId;
        this.f65271c = f0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooserScreenContract$InputData)) {
            return false;
        }
        ChooserScreenContract$InputData chooserScreenContract$InputData = (ChooserScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65269a, chooserScreenContract$InputData.f65269a) && Intrinsics.f(this.f65270b, chooserScreenContract$InputData.f65270b) && Intrinsics.f(this.f65271c, chooserScreenContract$InputData.f65271c);
    }

    public final int hashCode() {
        int iB = l.b(this.f65270b, this.f65269a.hashCode() * 31, 31);
        f0 f0Var = this.f65271c;
        return iB + (f0Var == null ? 0 : f0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65269a, i);
        dest.writeParcelable(this.f65270b, i);
        dest.writeSerializable(this.f65271c);
    }
}
