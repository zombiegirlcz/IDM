package com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/drop_out_form/DropOutFormFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropOutFormFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DropOutFormFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DropOutConfig.FeedbackForm f67618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67619c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DropOutFormFlowContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(DropOutFormFlowContract$InputData.class.getClassLoader()), (DropOutConfig.FeedbackForm) parcel.readParcelable(DropOutFormFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DropOutFormFlowContract$InputData[i];
        }
    }

    public DropOutFormFlowContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, DropOutConfig.FeedbackForm feedbackForm, boolean z) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(feedbackForm, "feedbackForm");
        this.f67617a = pluginConfiguration;
        this.f67618b = feedbackForm;
        this.f67619c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DropOutFormFlowContract$InputData)) {
            return false;
        }
        DropOutFormFlowContract$InputData dropOutFormFlowContract$InputData = (DropOutFormFlowContract$InputData) obj2;
        return Intrinsics.f(this.f67617a, dropOutFormFlowContract$InputData.f67617a) && Intrinsics.f(this.f67618b, dropOutFormFlowContract$InputData.f67618b) && this.f67619c == dropOutFormFlowContract$InputData.f67619c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67619c) + ((this.f67618b.hashCode() + (this.f67617a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67617a, i);
        dest.writeParcelable(this.f67618b, i);
        dest.writeInt(this.f67619c ? 1 : 0);
    }
}
