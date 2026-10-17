package com.revolut.feature.onboarding.impl.qes_terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/qes_terms/QesTermsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QesTermsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<QesTermsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsConfiguration f78549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ESignatureWorkflowConfiguration f78550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78551c;
    public final Image d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QesTermsScreenContract$InputData((QesTermsConfiguration) parcel.readParcelable(QesTermsScreenContract$InputData.class.getClassLoader()), (ESignatureWorkflowConfiguration) parcel.readParcelable(QesTermsScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (Image) parcel.readParcelable(QesTermsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QesTermsScreenContract$InputData[i];
        }
    }

    public QesTermsScreenContract$InputData(QesTermsConfiguration qesTermsConfiguration, ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration, boolean z, Image image) {
        Intrinsics.checkNotNullParameter(qesTermsConfiguration, "qesTermsConfiguration");
        this.f78549a = qesTermsConfiguration;
        this.f78550b = eSignatureWorkflowConfiguration;
        this.f78551c = z;
        this.d = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QesTermsScreenContract$InputData)) {
            return false;
        }
        QesTermsScreenContract$InputData qesTermsScreenContract$InputData = (QesTermsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78549a, qesTermsScreenContract$InputData.f78549a) && Intrinsics.f(this.f78550b, qesTermsScreenContract$InputData.f78550b) && this.f78551c == qesTermsScreenContract$InputData.f78551c && Intrinsics.f(this.d, qesTermsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f78549a.hashCode() * 31;
        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = this.f78550b;
        int iC = j6.a.c((iHashCode + (eSignatureWorkflowConfiguration == null ? 0 : eSignatureWorkflowConfiguration.hashCode())) * 31, 31, this.f78551c);
        Image image = this.d;
        return iC + (image != null ? image.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78549a, i);
        dest.writeParcelable(this.f78550b, i);
        dest.writeInt(this.f78551c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
