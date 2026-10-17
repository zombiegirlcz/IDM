package com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/colombia/pse/topup/PseTopupFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PseTopupFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PseTopupFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72733c;
    public final TopUpMethodsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PseTopupFlowContract$InputData((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (TopUpMethodsContext) parcel.readParcelable(PseTopupFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PseTopupFlowContract$InputData[i];
        }
    }

    public PseTopupFlowContract$InputData(d amount, String str, String str2, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f72731a = amount;
        this.f72732b = str;
        this.f72733c = str2;
        this.d = topUpMethodsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PseTopupFlowContract$InputData)) {
            return false;
        }
        PseTopupFlowContract$InputData pseTopupFlowContract$InputData = (PseTopupFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72731a, pseTopupFlowContract$InputData.f72731a) && Intrinsics.f(this.f72732b, pseTopupFlowContract$InputData.f72732b) && Intrinsics.f(this.f72733c, pseTopupFlowContract$InputData.f72733c) && Intrinsics.f(this.d, pseTopupFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f72731a.hashCode() * 31;
        String str = this.f72732b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72733c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TopUpMethodsContext topUpMethodsContext = this.d;
        return iHashCode3 + (topUpMethodsContext != null ? topUpMethodsContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72731a);
        dest.writeString(this.f72732b);
        dest.writeString(this.f72733c);
        dest.writeParcelable(this.d, i);
    }
}
