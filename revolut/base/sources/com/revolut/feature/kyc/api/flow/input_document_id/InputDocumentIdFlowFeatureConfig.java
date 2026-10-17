package com.revolut.feature.kyc.api.flow.input_document_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/flow/input_document_id/InputDocumentIdFlowFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputDocumentIdFlowFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<InputDocumentIdFlowFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f77473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f77474h;
    public final l i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDocumentIdFlowFeatureConfig(parcel.readInt(), (b) parcel.readSerializable(), (l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InputDocumentIdFlowFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDocumentIdFlowFeatureConfig(int i, b citizenship, l selectedDocument) {
        super((ActivityAnimation) null, (ParcelableDestination) new InputDocumentIdFlowDestination(citizenship, selectedDocument), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(selectedDocument, "selectedDocument");
        this.f77473g = i;
        this.f77474h = citizenship;
        this.i = selectedDocument;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF66060h() {
        return Integer.valueOf(this.f77473g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InputDocumentIdFlowFeatureConfig)) {
            return false;
        }
        InputDocumentIdFlowFeatureConfig inputDocumentIdFlowFeatureConfig = (InputDocumentIdFlowFeatureConfig) obj2;
        return this.f77473g == inputDocumentIdFlowFeatureConfig.f77473g && Intrinsics.f(this.f77474h, inputDocumentIdFlowFeatureConfig.f77474h) && Intrinsics.f(this.i, inputDocumentIdFlowFeatureConfig.i);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.i.hashCode() + p.a.c(Integer.hashCode(this.f77473g) * 31, 31, this.f77474h.f297794a);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f77473g);
        dest.writeSerializable(this.f77474h);
        dest.writeSerializable(this.i);
    }
}
