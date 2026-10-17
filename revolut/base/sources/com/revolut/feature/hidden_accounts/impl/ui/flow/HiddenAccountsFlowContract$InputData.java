package com.revolut.feature.hidden_accounts.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import na7.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HiddenAccountsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<HiddenAccountsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HiddenAccountsConfig f74661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74662b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HiddenAccountsFlowContract$InputData((HiddenAccountsConfig) parcel.readParcelable(HiddenAccountsFlowContract$InputData.class.getClassLoader()), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HiddenAccountsFlowContract$InputData[i];
        }
    }

    public HiddenAccountsFlowContract$InputData(HiddenAccountsConfig config, b accountType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f74661a = config;
        this.f74662b = accountType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HiddenAccountsFlowContract$InputData)) {
            return false;
        }
        HiddenAccountsFlowContract$InputData hiddenAccountsFlowContract$InputData = (HiddenAccountsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74661a, hiddenAccountsFlowContract$InputData.f74661a) && this.f74662b == hiddenAccountsFlowContract$InputData.f74662b;
    }

    public final int hashCode() {
        return this.f74662b.hashCode() + (this.f74661a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74661a, i);
        dest.writeString(this.f74662b.name());
    }
}
