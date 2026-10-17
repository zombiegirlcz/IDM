package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/list/CreditLinkedAccountsV2ListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditLinkedAccountsV2ListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditLinkedAccountsV2ListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67852c;
    public final String d;
    public final CreditApplicationPluginFlowContract$Configuration e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new CreditLinkedAccountsV2ListScreenContract$InputData(z3, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditLinkedAccountsV2ListScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditLinkedAccountsV2ListScreenContract$InputData[i];
        }
    }

    public CreditLinkedAccountsV2ListScreenContract$InputData(boolean z, boolean z3, String str, String str2, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67850a = z;
        this.f67851b = z3;
        this.f67852c = str;
        this.d = str2;
        this.e = pluginConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditLinkedAccountsV2ListScreenContract$InputData)) {
            return false;
        }
        CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData = (CreditLinkedAccountsV2ListScreenContract$InputData) obj2;
        return this.f67850a == creditLinkedAccountsV2ListScreenContract$InputData.f67850a && this.f67851b == creditLinkedAccountsV2ListScreenContract$InputData.f67851b && Intrinsics.f(this.f67852c, creditLinkedAccountsV2ListScreenContract$InputData.f67852c) && Intrinsics.f(this.d, creditLinkedAccountsV2ListScreenContract$InputData.d) && Intrinsics.f(this.e, creditLinkedAccountsV2ListScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f67850a) * 31, 31, this.f67851b);
        String str = this.f67852c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f67850a ? 1 : 0);
        dest.writeInt(this.f67851b ? 1 : 0);
        dest.writeString(this.f67852c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
