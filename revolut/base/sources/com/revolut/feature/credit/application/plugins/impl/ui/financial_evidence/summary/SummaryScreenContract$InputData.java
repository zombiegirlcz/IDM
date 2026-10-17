package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu3.m0;
import xu3.o0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f67734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f67735b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SummaryScreenContract$InputData((m0) parcel.readSerializable(), parcel.readInt() == 0 ? null : o0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SummaryScreenContract$InputData[i];
        }
    }

    public SummaryScreenContract$InputData(m0 configuration, o0 o0Var) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f67734a = configuration;
        this.f67735b = o0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SummaryScreenContract$InputData)) {
            return false;
        }
        SummaryScreenContract$InputData summaryScreenContract$InputData = (SummaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67734a, summaryScreenContract$InputData.f67734a) && this.f67735b == summaryScreenContract$InputData.f67735b;
    }

    public final int hashCode() {
        int iHashCode = this.f67734a.hashCode() * 31;
        o0 o0Var = this.f67735b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67734a);
        o0 o0Var = this.f67735b;
        if (o0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(o0Var.name());
        }
    }
}
