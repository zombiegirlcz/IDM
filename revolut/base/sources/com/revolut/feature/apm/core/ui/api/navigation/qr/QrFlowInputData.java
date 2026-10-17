package com.revolut.feature.apm.core.ui.api.navigation.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import g12.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/qr/QrFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<QrFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f62331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f62332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f62333c;
    public final Clause d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            r rVarValueOf = r.valueOf(parcel.readString());
            Clause clause = (Clause) parcel.readParcelable(QrFlowInputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(QrFlowInputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(QrFlowInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(QrData.CREATOR, parcel, arrayList, iA, 1);
            }
            return new QrFlowInputData(rVarValueOf, clause, clause2, clause3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrFlowInputData[i];
        }
    }

    public QrFlowInputData(r tab2, Clause title, Clause scannerTabClause, Clause detailsTabClause, List detailsConfig) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(scannerTabClause, "scannerTabClause");
        Intrinsics.checkNotNullParameter(detailsTabClause, "detailsTabClause");
        Intrinsics.checkNotNullParameter(detailsConfig, "detailsConfig");
        this.f62331a = tab2;
        this.f62332b = title;
        this.f62333c = scannerTabClause;
        this.d = detailsTabClause;
        this.e = detailsConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrFlowInputData)) {
            return false;
        }
        QrFlowInputData qrFlowInputData = (QrFlowInputData) obj2;
        return this.f62331a == qrFlowInputData.f62331a && Intrinsics.f(this.f62332b, qrFlowInputData.f62332b) && Intrinsics.f(this.f62333c, qrFlowInputData.f62333c) && Intrinsics.f(this.d, qrFlowInputData.d) && Intrinsics.f(this.e, qrFlowInputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.a(p.a.a(p.a.a(this.f62331a.hashCode() * 31, 31, this.f62332b), 31, this.f62333c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62331a.name());
        dest.writeParcelable(this.f62332b, i);
        dest.writeParcelable(this.f62333c, i);
        dest.writeParcelable(this.d, i);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((QrData) itV.next()).writeToParcel(dest, i);
        }
    }
}
