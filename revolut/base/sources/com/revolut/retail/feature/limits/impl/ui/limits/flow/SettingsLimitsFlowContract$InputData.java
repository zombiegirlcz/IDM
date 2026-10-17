package com.revolut.retail.feature.limits.impl.ui.limits.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.limits.api.navigation.b;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/limits/impl/ui/limits/flow/SettingsLimitsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SettingsLimitsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SettingsLimitsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f101781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f101782b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(b.valueOf(parcel.readString()));
            }
            return new SettingsLimitsFlowContract$InputData((AccountId) parcel.readParcelable(SettingsLimitsFlowContract$InputData.class.getClassLoader()), linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SettingsLimitsFlowContract$InputData[i];
        }
    }

    public SettingsLimitsFlowContract$InputData(AccountId accountId, Set limitTypes) {
        Intrinsics.checkNotNullParameter(limitTypes, "limitTypes");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f101781a = limitTypes;
        this.f101782b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SettingsLimitsFlowContract$InputData)) {
            return false;
        }
        SettingsLimitsFlowContract$InputData settingsLimitsFlowContract$InputData = (SettingsLimitsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f101781a, settingsLimitsFlowContract$InputData.f101781a) && Intrinsics.f(this.f101782b, settingsLimitsFlowContract$InputData.f101782b);
    }

    public final int hashCode() {
        return this.f101782b.hashCode() + (this.f101781a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f101781a, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
        dest.writeParcelable(this.f101782b, i);
    }
}
