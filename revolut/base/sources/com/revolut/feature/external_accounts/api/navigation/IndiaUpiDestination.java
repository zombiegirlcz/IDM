package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/IndiaUpiDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaUpiDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<IndiaUpiDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f72329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve6.a f72330c;
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
            return new IndiaUpiDestination(dVar, boolValueOf, (ve6.a) parcel.readSerializable(), parcel.readString(), (TopUpMethodsContext) parcel.readParcelable(IndiaUpiDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaUpiDestination[i];
        }
    }

    public IndiaUpiDestination(d amount, Boolean bool, ve6.a aVar, String str, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        this.f72328a = amount;
        this.f72329b = bool;
        this.f72330c = aVar;
        this.d = str;
        this.e = topUpMethodsContext;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final d getF72328a() {
        return this.f72328a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ve6.a getF72330c() {
        return this.f72330c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TopUpMethodsContext getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getF72329b() {
        return this.f72329b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndiaUpiDestination)) {
            return false;
        }
        IndiaUpiDestination indiaUpiDestination = (IndiaUpiDestination) obj2;
        return Intrinsics.f(this.f72328a, indiaUpiDestination.f72328a) && Intrinsics.f(this.f72329b, indiaUpiDestination.f72329b) && Intrinsics.f(this.f72330c, indiaUpiDestination.f72330c) && Intrinsics.f(this.d, indiaUpiDestination.d) && Intrinsics.f(this.e, indiaUpiDestination.e);
    }

    public final int hashCode() {
        int iHashCode = this.f72328a.hashCode() * 31;
        Boolean bool = this.f72329b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ve6.a aVar = this.f72330c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72328a);
        Boolean bool = this.f72329b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeSerializable(this.f72330c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ IndiaUpiDestination(d dVar, ve6.a aVar, String str, TopUpMethodsContext topUpMethodsContext, int i) {
        this(dVar, (Boolean) null, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : str, topUpMethodsContext);
    }
}
