package com.revolut.feature.wealth.ui.api.navigation.holdings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/holdings/CashHoldingSelectorInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashHoldingSelectorInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CashHoldingSelectorInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f95932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qih.a f95934c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", CashHoldingSelectorInputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CashHoldingSelectorInputData(clause, arrayList, qih.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashHoldingSelectorInputData[i];
        }
    }

    public CashHoldingSelectorInputData(Clause title, List cashHoldings, qih.a cashDisplayAmountType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
        Intrinsics.checkNotNullParameter(cashDisplayAmountType, "cashDisplayAmountType");
        this.f95932a = title;
        this.f95933b = cashHoldings;
        this.f95934c = cashDisplayAmountType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashHoldingSelectorInputData)) {
            return false;
        }
        CashHoldingSelectorInputData cashHoldingSelectorInputData = (CashHoldingSelectorInputData) obj2;
        return Intrinsics.f(this.f95932a, cashHoldingSelectorInputData.f95932a) && Intrinsics.f(this.f95933b, cashHoldingSelectorInputData.f95933b) && this.f95934c == cashHoldingSelectorInputData.f95934c;
    }

    public final int hashCode() {
        return this.f95934c.hashCode() + p.a.d(this.f95932a.hashCode() * 31, 31, this.f95933b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95932a, i);
        Iterator itV = p.a.v(this.f95933b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeString(this.f95934c.name());
    }
}
