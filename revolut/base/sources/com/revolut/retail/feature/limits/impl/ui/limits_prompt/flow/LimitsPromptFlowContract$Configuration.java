package com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LimitsPromptFlowContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LimitsPromptFlowContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitsPromptFlowContract$Limit f101787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f101788b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LimitsPromptFlowContract$Configuration((LimitsPromptFlowContract$Limit) parcel.readParcelable(LimitsPromptFlowContract$Configuration.class.getClassLoader()), (AccountId) parcel.readParcelable(LimitsPromptFlowContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LimitsPromptFlowContract$Configuration[i];
        }
    }

    public LimitsPromptFlowContract$Configuration(LimitsPromptFlowContract$Limit limit, AccountId accountId) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f101787a = limit;
        this.f101788b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LimitsPromptFlowContract$Configuration)) {
            return false;
        }
        LimitsPromptFlowContract$Configuration limitsPromptFlowContract$Configuration = (LimitsPromptFlowContract$Configuration) obj2;
        return Intrinsics.f(this.f101787a, limitsPromptFlowContract$Configuration.f101787a) && Intrinsics.f(this.f101788b, limitsPromptFlowContract$Configuration.f101788b);
    }

    public final int hashCode() {
        return this.f101788b.hashCode() + (this.f101787a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101787a, i);
        dest.writeParcelable(this.f101788b, i);
    }
}
