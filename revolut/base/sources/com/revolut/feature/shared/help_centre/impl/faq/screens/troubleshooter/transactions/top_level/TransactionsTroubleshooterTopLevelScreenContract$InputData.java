package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/top_level/TransactionsTroubleshooterTopLevelScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsTroubleshooterTopLevelScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionsTroubleshooterTopLevelScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j7d.a f86350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionTroubleshooterFilter f86351c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionsTroubleshooterTopLevelScreenContract$InputData(parcel.readString(), j7d.a.valueOf(parcel.readString()), (TransactionTroubleshooterFilter) parcel.readParcelable(TransactionsTroubleshooterTopLevelScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsTroubleshooterTopLevelScreenContract$InputData[i];
        }
    }

    public TransactionsTroubleshooterTopLevelScreenContract$InputData(String str, j7d.a transactionListType, TransactionTroubleshooterFilter transactionListFilter, boolean z) {
        Intrinsics.checkNotNullParameter(transactionListType, "transactionListType");
        Intrinsics.checkNotNullParameter(transactionListFilter, "transactionListFilter");
        this.f86349a = str;
        this.f86350b = transactionListType;
        this.f86351c = transactionListFilter;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsTroubleshooterTopLevelScreenContract$InputData)) {
            return false;
        }
        TransactionsTroubleshooterTopLevelScreenContract$InputData transactionsTroubleshooterTopLevelScreenContract$InputData = (TransactionsTroubleshooterTopLevelScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86349a, transactionsTroubleshooterTopLevelScreenContract$InputData.f86349a) && this.f86350b == transactionsTroubleshooterTopLevelScreenContract$InputData.f86350b && Intrinsics.f(this.f86351c, transactionsTroubleshooterTopLevelScreenContract$InputData.f86351c) && this.d == transactionsTroubleshooterTopLevelScreenContract$InputData.d;
    }

    public final int hashCode() {
        String str = this.f86349a;
        return Boolean.hashCode(this.d) + ((this.f86351c.hashCode() + ((this.f86350b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86349a);
        dest.writeString(this.f86350b.name());
        dest.writeParcelable(this.f86351c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
