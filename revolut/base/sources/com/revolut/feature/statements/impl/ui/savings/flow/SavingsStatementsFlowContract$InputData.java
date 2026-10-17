package com.revolut.feature.statements.impl.ui.savings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/impl/ui/savings/flow/SavingsStatementsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsStatementsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SavingsStatementsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88384b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SavingsStatementsFlowContract$InputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList2.add(b.valueOf(parcel.readString()));
            }
            return new SavingsStatementsFlowContract$InputData(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsStatementsFlowContract$InputData[i];
        }
    }

    public SavingsStatementsFlowContract$InputData(List savingsAccounts, List accountTypes) {
        Intrinsics.checkNotNullParameter(savingsAccounts, "savingsAccounts");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        this.f88383a = savingsAccounts;
        this.f88384b = accountTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsStatementsFlowContract$InputData)) {
            return false;
        }
        SavingsStatementsFlowContract$InputData savingsStatementsFlowContract$InputData = (SavingsStatementsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f88383a, savingsStatementsFlowContract$InputData.f88383a) && Intrinsics.f(this.f88384b, savingsStatementsFlowContract$InputData.f88384b);
    }

    public final int hashCode() {
        return this.f88384b.hashCode() + (this.f88383a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f88383a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f88384b, dest);
        while (itV2.hasNext()) {
            dest.writeString(((b) itV2.next()).name());
        }
    }
}
