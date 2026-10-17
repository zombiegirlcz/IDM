package com.revolut.feature.statements.api.documents_hub.period;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementPeriodSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StatementPeriodSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriodType f88217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f88218b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StatementPeriodSelection(StatementPeriodType.valueOf(parcel.readString()), StatementPeriod.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatementPeriodSelection[i];
        }
    }

    public StatementPeriodSelection(StatementPeriodType type, StatementPeriod period) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f88217a = type;
        this.f88218b = period;
    }

    public static StatementPeriodSelection a(StatementPeriodSelection statementPeriodSelection, StatementPeriod period) {
        StatementPeriodType type = statementPeriodSelection.f88217a;
        statementPeriodSelection.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        return new StatementPeriodSelection(type, period);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatementPeriodSelection)) {
            return false;
        }
        StatementPeriodSelection statementPeriodSelection = (StatementPeriodSelection) obj2;
        return this.f88217a == statementPeriodSelection.f88217a && Intrinsics.f(this.f88218b, statementPeriodSelection.f88218b);
    }

    public final int hashCode() {
        return this.f88218b.hashCode() + (this.f88217a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88217a.name());
        this.f88218b.writeToParcel(dest, i);
    }
}
