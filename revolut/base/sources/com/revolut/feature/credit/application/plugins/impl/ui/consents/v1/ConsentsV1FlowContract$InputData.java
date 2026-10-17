package com.revolut.feature.credit.application.plugins.impl.ui.consents.v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/consents/v1/ConsentsV1FlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentsV1FlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<ConsentsV1FlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su3.a f67285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentViewerScreenConfig f67286c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentsV1FlowContract$InputData(parcel.readString(), (su3.a) parcel.readSerializable(), (DocumentViewerScreenConfig) parcel.readParcelable(ConsentsV1FlowContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(ConsentsV1FlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentsV1FlowContract$InputData[i];
        }
    }

    public ConsentsV1FlowContract$InputData(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67284a = documentId;
        this.f67285b = document;
        this.f67286c = screenConfig;
        this.d = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getD() {
        return this.d;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.d.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.d.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentsV1FlowContract$InputData)) {
            return false;
        }
        ConsentsV1FlowContract$InputData consentsV1FlowContract$InputData = (ConsentsV1FlowContract$InputData) obj2;
        return Intrinsics.f(this.f67284a, consentsV1FlowContract$InputData.f67284a) && Intrinsics.f(this.f67285b, consentsV1FlowContract$InputData.f67285b) && Intrinsics.f(this.f67286c, consentsV1FlowContract$InputData.f67286c) && Intrinsics.f(this.d, consentsV1FlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f67286c.hashCode() + ((this.f67285b.hashCode() + (this.f67284a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68415b().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67284a);
        dest.writeSerializable(this.f67285b);
        dest.writeParcelable(this.f67286c, i);
        dest.writeParcelable(this.d, i);
    }
}
