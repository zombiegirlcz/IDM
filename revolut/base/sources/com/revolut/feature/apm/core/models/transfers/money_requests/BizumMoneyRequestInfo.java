package com.revolut.feature.apm.core.models.transfers.money_requests;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/money_requests/BizumMoneyRequestInfo;", "Lcom/revolut/feature/apm/core/models/transfers/money_requests/ApmMoneyRequestInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumMoneyRequestInfo implements ApmMoneyRequestInfo {

    @NotNull
    public static final Parcelable.Creator<BizumMoneyRequestInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BizumContact f62187b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumMoneyRequestInfo(parcel.readString(), BizumContact.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumMoneyRequestInfo[i];
        }
    }

    public BizumMoneyRequestInfo(String moneyRequestId, BizumContact apmContact) {
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        Intrinsics.checkNotNullParameter(apmContact, "apmContact");
        this.f62186a = moneyRequestId;
        this.f62187b = apmContact;
    }

    @Override // com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo
    /* JADX INFO: renamed from: D2, reason: from getter */
    public final String getF62186a() {
        return this.f62186a;
    }

    @Override // com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo
    /* JADX INFO: renamed from: U1 */
    public final ApmContact getF62189b() {
        return this.f62187b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BizumMoneyRequestInfo)) {
            return false;
        }
        BizumMoneyRequestInfo bizumMoneyRequestInfo = (BizumMoneyRequestInfo) obj2;
        return Intrinsics.f(this.f62186a, bizumMoneyRequestInfo.f62186a) && Intrinsics.f(this.f62187b, bizumMoneyRequestInfo.f62187b);
    }

    public final int hashCode() {
        return this.f62187b.hashCode() + (this.f62186a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62186a);
        this.f62187b.writeToParcel(dest, i);
    }
}
