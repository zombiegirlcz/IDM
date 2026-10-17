package com.revolut.feature.statements.api.documents_hub.period;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelectorBottomSheetProvider$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementPeriodSelectorBottomSheetProvider$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StatementPeriodSelectorBottomSheetProvider$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriod f88219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriodSelection f88220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f88221c;
    public final TaxPeriod d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StatementPeriod statementPeriodCreateFromParcel = StatementPeriod.CREATOR.createFromParcel(parcel);
            StatementPeriodSelection statementPeriodSelectionCreateFromParcel = StatementPeriodSelection.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(StatementPeriodType.valueOf(parcel.readString()));
            }
            return new StatementPeriodSelectorBottomSheetProvider$InputData(statementPeriodCreateFromParcel, statementPeriodSelectionCreateFromParcel, linkedHashSet, parcel.readInt() == 0 ? null : TaxPeriod.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatementPeriodSelectorBottomSheetProvider$InputData[i];
        }
    }

    public StatementPeriodSelectorBottomSheetProvider$InputData(StatementPeriod availablePeriod, StatementPeriodSelection appliedSelection, Set supportedTypes, TaxPeriod taxPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(appliedSelection, "appliedSelection");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        this.f88219a = availablePeriod;
        this.f88220b = appliedSelection;
        this.f88221c = supportedTypes;
        this.d = taxPeriod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatementPeriodSelectorBottomSheetProvider$InputData)) {
            return false;
        }
        StatementPeriodSelectorBottomSheetProvider$InputData statementPeriodSelectorBottomSheetProvider$InputData = (StatementPeriodSelectorBottomSheetProvider$InputData) obj2;
        return Intrinsics.f(this.f88219a, statementPeriodSelectorBottomSheetProvider$InputData.f88219a) && Intrinsics.f(this.f88220b, statementPeriodSelectorBottomSheetProvider$InputData.f88220b) && Intrinsics.f(this.f88221c, statementPeriodSelectorBottomSheetProvider$InputData.f88221c) && Intrinsics.f(this.d, statementPeriodSelectorBottomSheetProvider$InputData.d);
    }

    public final int hashCode() {
        int iF = p.a.f((this.f88220b.hashCode() + (this.f88219a.hashCode() * 31)) * 31, 31, this.f88221c);
        TaxPeriod taxPeriod = this.d;
        return iF + (taxPeriod == null ? 0 : taxPeriod.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88219a.writeToParcel(dest, i);
        this.f88220b.writeToParcel(dest, i);
        Iterator itV = n.v(this.f88221c, dest);
        while (itV.hasNext()) {
            dest.writeString(((StatementPeriodType) itV.next()).name());
        }
        TaxPeriod taxPeriod = this.d;
        if (taxPeriod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            taxPeriod.writeToParcel(dest, i);
        }
    }
}
