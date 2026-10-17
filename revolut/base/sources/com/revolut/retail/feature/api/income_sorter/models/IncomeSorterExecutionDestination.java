package com.revolut.retail.feature.api.income_sorter.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yzi.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/income_sorter/models/IncomeSorterExecutionDestination;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "yzi/c", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterExecutionDestination implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterExecutionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterDestination f99242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f99243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f99244c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            IncomeSorterDestination incomeSorterDestination = (IncomeSorterDestination) j6.a.f(parcel, "parcel", IncomeSorterExecutionDestination.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(IncomeSorterDestinationTransaction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new IncomeSorterExecutionDestination(incomeSorterDestination, arrayList, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterExecutionDestination[i];
        }
    }

    public IncomeSorterExecutionDestination(IncomeSorterDestination destination, ArrayList transactions, c state) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f99242a = destination;
        this.f99243b = transactions;
        this.f99244c = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterExecutionDestination)) {
            return false;
        }
        IncomeSorterExecutionDestination incomeSorterExecutionDestination = (IncomeSorterExecutionDestination) obj2;
        return Intrinsics.f(this.f99242a, incomeSorterExecutionDestination.f99242a) && this.f99243b.equals(incomeSorterExecutionDestination.f99243b) && this.f99244c == incomeSorterExecutionDestination.f99244c;
    }

    public final int hashCode() {
        return this.f99244c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99243b, this.f99242a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99242a, i);
        Iterator itY = j6.a.y(this.f99243b, dest);
        while (itY.hasNext()) {
            ((IncomeSorterDestinationTransaction) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f99244c.name());
    }
}
