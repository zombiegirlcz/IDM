package com.revolut.feature.onboarding.impl.revolut_card_ready.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/revolut_card_ready/flow/RevolutCardReadyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutCardReadyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutCardReadyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f78573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f78574b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutCardReadyFlowContract$InputData((f0) parcel.readSerializable(), (AccountId) parcel.readParcelable(RevolutCardReadyFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutCardReadyFlowContract$InputData[i];
        }
    }

    public RevolutCardReadyFlowContract$InputData(f0 card, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f78573a = card;
        this.f78574b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutCardReadyFlowContract$InputData)) {
            return false;
        }
        RevolutCardReadyFlowContract$InputData revolutCardReadyFlowContract$InputData = (RevolutCardReadyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78573a, revolutCardReadyFlowContract$InputData.f78573a) && Intrinsics.f(this.f78574b, revolutCardReadyFlowContract$InputData.f78574b);
    }

    public final int hashCode() {
        return this.f78574b.hashCode() + (this.f78573a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78573a);
        dest.writeParcelable(this.f78574b, i);
    }
}
