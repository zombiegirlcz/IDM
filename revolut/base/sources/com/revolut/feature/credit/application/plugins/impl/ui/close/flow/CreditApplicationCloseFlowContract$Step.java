package com.revolut.feature.credit.application.plugins.impl.ui.close.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/close/flow/CreditApplicationCloseFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationCloseFlowContract$Step implements FlowStep {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationCloseFlowContract$Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginPayload f67214a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationCloseFlowContract$Step((PluginPayload) parcel.readParcelable(CreditApplicationCloseFlowContract$Step.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationCloseFlowContract$Step[i];
        }
    }

    public CreditApplicationCloseFlowContract$Step(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        this.f67214a = pluginPayload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditApplicationCloseFlowContract$Step) && Intrinsics.f(this.f67214a, ((CreditApplicationCloseFlowContract$Step) obj2).f67214a);
    }

    public final int hashCode() {
        return this.f67214a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67214a, i);
    }
}
