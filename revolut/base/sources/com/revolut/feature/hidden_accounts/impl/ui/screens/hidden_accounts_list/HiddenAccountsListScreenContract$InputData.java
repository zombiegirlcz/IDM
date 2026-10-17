package com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import na7.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/hidden_accounts/impl/ui/screens/hidden_accounts_list/HiddenAccountsListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HiddenAccountsListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<HiddenAccountsListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HiddenAccountsConfig f74669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74671c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HiddenAccountsListScreenContract$InputData((HiddenAccountsConfig) parcel.readParcelable(HiddenAccountsListScreenContract$InputData.class.getClassLoader()), b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HiddenAccountsListScreenContract$InputData[i];
        }
    }

    public HiddenAccountsListScreenContract$InputData(HiddenAccountsConfig config, b accountType, boolean z) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f74669a = config;
        this.f74670b = accountType;
        this.f74671c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HiddenAccountsListScreenContract$InputData)) {
            return false;
        }
        HiddenAccountsListScreenContract$InputData hiddenAccountsListScreenContract$InputData = (HiddenAccountsListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74669a, hiddenAccountsListScreenContract$InputData.f74669a) && this.f74670b == hiddenAccountsListScreenContract$InputData.f74670b && this.f74671c == hiddenAccountsListScreenContract$InputData.f74671c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74671c) + ((this.f74670b.hashCode() + (this.f74669a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74669a, i);
        dest.writeString(this.f74670b.name());
        dest.writeInt(this.f74671c ? 1 : 0);
    }
}
