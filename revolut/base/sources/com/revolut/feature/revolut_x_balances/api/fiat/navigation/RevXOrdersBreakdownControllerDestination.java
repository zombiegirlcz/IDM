package com.revolut.feature.revolut_x_balances.api.fiat.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_x_balances/api/fiat/navigation/RevXOrdersBreakdownControllerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_revolut_x_balances_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevXOrdersBreakdownControllerDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevXOrdersBreakdownControllerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f84246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4c.a f84247b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevXOrdersBreakdownControllerDestination((b) parcel.readSerializable(), t4c.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevXOrdersBreakdownControllerDestination[i];
        }
    }

    public RevXOrdersBreakdownControllerDestination(b currency, t4c.a breakdownStyle) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(breakdownStyle, "breakdownStyle");
        this.f84246a = currency;
        this.f84247b = breakdownStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevXOrdersBreakdownControllerDestination)) {
            return false;
        }
        RevXOrdersBreakdownControllerDestination revXOrdersBreakdownControllerDestination = (RevXOrdersBreakdownControllerDestination) obj2;
        return Intrinsics.f(this.f84246a, revXOrdersBreakdownControllerDestination.f84246a) && this.f84247b == revXOrdersBreakdownControllerDestination.f84247b;
    }

    public final int hashCode() {
        return this.f84247b.hashCode() + (this.f84246a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84246a);
        dest.writeString(this.f84247b.name());
    }
}
