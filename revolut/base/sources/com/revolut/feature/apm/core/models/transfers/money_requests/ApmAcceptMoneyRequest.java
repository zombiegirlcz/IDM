package com.revolut.feature.apm.core.models.transfers.money_requests;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/money_requests/ApmAcceptMoneyRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmAcceptMoneyRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmAcceptMoneyRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f62183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmPaymentSource f62184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f62185c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmAcceptMoneyRequest((MoneyRequest) parcel.readParcelable(ApmAcceptMoneyRequest.class.getClassLoader()), ApmPaymentSource.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmAcceptMoneyRequest[i];
        }
    }

    public ApmAcceptMoneyRequest(MoneyRequest moneyRequest, ApmPaymentSource source, d dVar, String str) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f62183a = moneyRequest;
        this.f62184b = source;
        this.f62185c = dVar;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmAcceptMoneyRequest)) {
            return false;
        }
        ApmAcceptMoneyRequest apmAcceptMoneyRequest = (ApmAcceptMoneyRequest) obj2;
        return Intrinsics.f(this.f62183a, apmAcceptMoneyRequest.f62183a) && Intrinsics.f(this.f62184b, apmAcceptMoneyRequest.f62184b) && Intrinsics.f(this.f62185c, apmAcceptMoneyRequest.f62185c) && Intrinsics.f(this.d, apmAcceptMoneyRequest.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f62184b.hashCode() + (this.f62183a.hashCode() * 31)) * 31;
        d dVar = this.f62185c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62183a, i);
        this.f62184b.writeToParcel(dest, i);
        dest.writeSerializable(this.f62185c);
        dest.writeString(this.d);
    }
}
