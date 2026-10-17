package com.revolut.feature.apm.core.ui.api.navigation.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrScannerInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrScannerInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<QrScannerInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionsControllerContract$Explanation f62334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f62335b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QrScannerInputData((PermissionsControllerContract$Explanation) parcel.readParcelable(QrScannerInputData.class.getClassLoader()), (Clause) parcel.readParcelable(QrScannerInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrScannerInputData[i];
        }
    }

    public QrScannerInputData(PermissionsControllerContract$Explanation cameraPermissionsExplanation, Clause clause) {
        Intrinsics.checkNotNullParameter(cameraPermissionsExplanation, "cameraPermissionsExplanation");
        this.f62334a = cameraPermissionsExplanation;
        this.f62335b = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrScannerInputData)) {
            return false;
        }
        QrScannerInputData qrScannerInputData = (QrScannerInputData) obj2;
        return Intrinsics.f(this.f62334a, qrScannerInputData.f62334a) && Intrinsics.f(this.f62335b, qrScannerInputData.f62335b);
    }

    public final int hashCode() {
        int iHashCode = this.f62334a.hashCode() * 31;
        Clause clause = this.f62335b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62334a, i);
        dest.writeParcelable(this.f62335b, i);
    }

    public /* synthetic */ QrScannerInputData() {
        this(PermissionsControllerContract$Explanation.None.f80324a, null);
    }
}
