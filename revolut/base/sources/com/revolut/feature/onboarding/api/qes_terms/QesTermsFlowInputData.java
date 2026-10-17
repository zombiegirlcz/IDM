package com.revolut.feature.onboarding.api.qes_terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y89.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "y89/d", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QesTermsFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<QesTermsFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsConfiguration f78201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ESignatureWorkflowConfiguration f78202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78203c;
    public final boolean d;
    public final boolean e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78204g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            d dVar;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            QesTermsConfiguration qesTermsConfigurationCreateFromParcel = QesTermsConfiguration.CREATOR.createFromParcel(parcel);
            ESignatureWorkflowConfiguration eSignatureWorkflowConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : ESignatureWorkflowConfiguration.CREATOR.createFromParcel(parcel);
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            d dVarValueOf = d.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z6 = z4;
                dVar = dVarValueOf;
            } else {
                dVar = dVarValueOf;
                z6 = z;
            }
            return new QesTermsFlowInputData(qesTermsConfigurationCreateFromParcel, eSignatureWorkflowConfigurationCreateFromParcel, z11, z12, z3, dVar, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QesTermsFlowInputData[i];
        }
    }

    public QesTermsFlowInputData(QesTermsConfiguration qesTermsConfiguration, ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration, boolean z, boolean z3, boolean z4, d navigationButton, boolean z6) {
        Intrinsics.checkNotNullParameter(qesTermsConfiguration, "qesTermsConfiguration");
        Intrinsics.checkNotNullParameter(navigationButton, "navigationButton");
        this.f78201a = qesTermsConfiguration;
        this.f78202b = eSignatureWorkflowConfiguration;
        this.f78203c = z;
        this.d = z3;
        this.e = z4;
        this.f = navigationButton;
        this.f78204g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QesTermsFlowInputData)) {
            return false;
        }
        QesTermsFlowInputData qesTermsFlowInputData = (QesTermsFlowInputData) obj2;
        return Intrinsics.f(this.f78201a, qesTermsFlowInputData.f78201a) && Intrinsics.f(this.f78202b, qesTermsFlowInputData.f78202b) && this.f78203c == qesTermsFlowInputData.f78203c && this.d == qesTermsFlowInputData.d && this.e == qesTermsFlowInputData.e && this.f == qesTermsFlowInputData.f && this.f78204g == qesTermsFlowInputData.f78204g;
    }

    public final int hashCode() {
        int iHashCode = this.f78201a.hashCode() * 31;
        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = this.f78202b;
        return Boolean.hashCode(this.f78204g) + ((this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode + (eSignatureWorkflowConfiguration == null ? 0 : eSignatureWorkflowConfiguration.hashCode())) * 31, 31, this.f78203c), 31, this.d), 31, this.e)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f78201a.writeToParcel(dest, i);
        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = this.f78202b;
        if (eSignatureWorkflowConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eSignatureWorkflowConfiguration.writeToParcel(dest, i);
        }
        dest.writeInt(this.f78203c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f.name());
        dest.writeInt(this.f78204g ? 1 : 0);
    }

    public /* synthetic */ QesTermsFlowInputData(QesTermsConfiguration qesTermsConfiguration, d dVar, int i) {
        this(qesTermsConfiguration, null, (i & 4) != 0, (i & 8) != 0, (i & 16) != 0, dVar, (i & 64) == 0);
    }
}
