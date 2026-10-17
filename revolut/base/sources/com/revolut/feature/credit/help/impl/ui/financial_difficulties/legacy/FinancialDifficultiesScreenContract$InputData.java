package com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ux4.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/feature/credit/help/impl/ui/financial_difficulties/legacy/FinancialDifficultiesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_credit_help_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FinancialDifficultiesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FinancialDifficultiesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f70009a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialDifficultiesScreenContract$InputData((k) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FinancialDifficultiesScreenContract$InputData[i];
        }
    }

    public FinancialDifficultiesScreenContract$InputData(k creditFacility) {
        Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
        this.f70009a = creditFacility;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70009a);
    }
}
