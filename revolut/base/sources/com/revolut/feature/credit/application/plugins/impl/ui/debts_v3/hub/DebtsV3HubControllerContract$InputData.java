package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my3.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v3/hub/DebtsV3HubControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DebtsV3HubControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DebtsV3HubControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f67523b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DebtsV3HubControllerContract$InputData(parcel.readString(), (f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DebtsV3HubControllerContract$InputData[i];
        }
    }

    public DebtsV3HubControllerContract$InputData(String applicationId, f config) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f67522a = applicationId;
        this.f67523b = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DebtsV3HubControllerContract$InputData)) {
            return false;
        }
        DebtsV3HubControllerContract$InputData debtsV3HubControllerContract$InputData = (DebtsV3HubControllerContract$InputData) obj2;
        return Intrinsics.f(this.f67522a, debtsV3HubControllerContract$InputData.f67522a) && Intrinsics.f(this.f67523b, debtsV3HubControllerContract$InputData.f67523b);
    }

    public final int hashCode() {
        return this.f67523b.hashCode() + (this.f67522a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67522a);
        dest.writeSerializable(this.f67523b);
    }
}
