package com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/india/netbanking/flow/IndiaNetBankingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaNetBankingFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IndiaNetBankingFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f72925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve6.a f72926c;
    public final String d;
    public final TopUpMethodsContext e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IndiaNetBankingFlowContract$InputData(dVar, boolValueOf, (ve6.a) parcel.readSerializable(), parcel.readString(), (TopUpMethodsContext) parcel.readParcelable(IndiaNetBankingFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaNetBankingFlowContract$InputData[i];
        }
    }

    public IndiaNetBankingFlowContract$InputData(d amount, Boolean bool, ve6.a aVar, String str, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f72924a = amount;
        this.f72925b = bool;
        this.f72926c = aVar;
        this.d = str;
        this.e = topUpMethodsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndiaNetBankingFlowContract$InputData)) {
            return false;
        }
        IndiaNetBankingFlowContract$InputData indiaNetBankingFlowContract$InputData = (IndiaNetBankingFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72924a, indiaNetBankingFlowContract$InputData.f72924a) && Intrinsics.f(this.f72925b, indiaNetBankingFlowContract$InputData.f72925b) && Intrinsics.f(this.f72926c, indiaNetBankingFlowContract$InputData.f72926c) && Intrinsics.f(this.d, indiaNetBankingFlowContract$InputData.d) && Intrinsics.f(this.e, indiaNetBankingFlowContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f72924a.hashCode() * 31;
        Boolean bool = this.f72925b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ve6.a aVar = this.f72926c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TopUpMethodsContext topUpMethodsContext = this.e;
        return iHashCode4 + (topUpMethodsContext != null ? topUpMethodsContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72924a);
        Boolean bool = this.f72925b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeSerializable(this.f72926c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
