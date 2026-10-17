package com.revolut.feature.cash_topup.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/api/declaration/CashTopUpFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashTopUpFlowDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CashTopUpFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb3.a f65580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65581b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashTopUpFlowDestination(cb3.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashTopUpFlowDestination[i];
        }
    }

    public CashTopUpFlowDestination(cb3.a flowType, boolean z) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f65580a = flowType;
        this.f65581b = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final cb3.a getF65580a() {
        return this.f65580a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF65581b() {
        return this.f65581b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashTopUpFlowDestination)) {
            return false;
        }
        CashTopUpFlowDestination cashTopUpFlowDestination = (CashTopUpFlowDestination) obj2;
        return this.f65580a == cashTopUpFlowDestination.f65580a && this.f65581b == cashTopUpFlowDestination.f65581b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65581b) + (this.f65580a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65580a.name());
        dest.writeInt(this.f65581b ? 1 : 0);
    }
}
