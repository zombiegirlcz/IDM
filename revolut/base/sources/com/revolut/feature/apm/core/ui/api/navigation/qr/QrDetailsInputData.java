package com.revolut.feature.apm.core.ui.api.navigation.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrDetailsInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrDetailsInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<QrDetailsInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f62329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QrData f62330b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QrDetailsInputData((Clause) parcel.readParcelable(QrDetailsInputData.class.getClassLoader()), QrData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrDetailsInputData[i];
        }
    }

    public QrDetailsInputData(Clause title, QrData qrData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(qrData, "qrData");
        this.f62329a = title;
        this.f62330b = qrData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrDetailsInputData)) {
            return false;
        }
        QrDetailsInputData qrDetailsInputData = (QrDetailsInputData) obj2;
        return Intrinsics.f(this.f62329a, qrDetailsInputData.f62329a) && Intrinsics.f(this.f62330b, qrDetailsInputData.f62330b);
    }

    public final int hashCode() {
        return this.f62330b.hashCode() + (this.f62329a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62329a, i);
        this.f62330b.writeToParcel(dest, i);
    }
}
