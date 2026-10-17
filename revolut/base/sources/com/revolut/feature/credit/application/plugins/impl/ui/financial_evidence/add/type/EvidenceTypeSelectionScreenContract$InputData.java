package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu3.x;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/type/EvidenceTypeSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EvidenceTypeSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EvidenceTypeSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3.a f67704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f67705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67706c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EvidenceTypeSelectionScreenContract$InputData(zv3.a.valueOf(parcel.readString()), (x) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(EvidenceTypeSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EvidenceTypeSelectionScreenContract$InputData[i];
        }
    }

    public EvidenceTypeSelectionScreenContract$InputData(zv3.a navigationIcon, x configuration, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67704a = navigationIcon;
        this.f67705b = configuration;
        this.f67706c = pluginConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EvidenceTypeSelectionScreenContract$InputData)) {
            return false;
        }
        EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = (EvidenceTypeSelectionScreenContract$InputData) obj2;
        return this.f67704a == evidenceTypeSelectionScreenContract$InputData.f67704a && Intrinsics.f(this.f67705b, evidenceTypeSelectionScreenContract$InputData.f67705b) && Intrinsics.f(this.f67706c, evidenceTypeSelectionScreenContract$InputData.f67706c);
    }

    public final int hashCode() {
        return this.f67706c.hashCode() + ((this.f67705b.hashCode() + (this.f67704a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67704a.name());
        dest.writeSerializable(this.f67705b);
        dest.writeParcelable(this.f67706c, i);
    }
}
