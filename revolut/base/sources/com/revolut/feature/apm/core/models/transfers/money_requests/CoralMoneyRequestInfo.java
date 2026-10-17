package com.revolut.feature.apm.core.models.transfers.money_requests;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/money_requests/CoralMoneyRequestInfo;", "Lcom/revolut/feature/apm/core/models/transfers/money_requests/ApmMoneyRequestInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoralMoneyRequestInfo implements ApmMoneyRequestInfo {

    @NotNull
    public static final Parcelable.Creator<CoralMoneyRequestInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmContact f62189b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoralMoneyRequestInfo(parcel.readString(), (ApmContact) parcel.readParcelable(CoralMoneyRequestInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoralMoneyRequestInfo[i];
        }
    }

    public CoralMoneyRequestInfo(String moneyRequestId, ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        Intrinsics.checkNotNullParameter(apmContact, "apmContact");
        this.f62188a = moneyRequestId;
        this.f62189b = apmContact;
    }

    @Override // com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo
    /* JADX INFO: renamed from: D2, reason: from getter */
    public final String getF62188a() {
        return this.f62188a;
    }

    @Override // com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo
    /* JADX INFO: renamed from: U1, reason: from getter */
    public final ApmContact getF62189b() {
        return this.f62189b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoralMoneyRequestInfo)) {
            return false;
        }
        CoralMoneyRequestInfo coralMoneyRequestInfo = (CoralMoneyRequestInfo) obj2;
        return Intrinsics.f(this.f62188a, coralMoneyRequestInfo.f62188a) && Intrinsics.f(this.f62189b, coralMoneyRequestInfo.f62189b);
    }

    public final int hashCode() {
        return this.f62189b.hashCode() + (this.f62188a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62188a);
        dest.writeParcelable(this.f62189b, i);
    }
}
