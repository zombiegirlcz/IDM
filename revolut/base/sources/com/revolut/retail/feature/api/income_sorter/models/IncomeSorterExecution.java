package com.revolut.retail.feature.api.income_sorter.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yzi.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/income_sorter/models/IncomeSorterExecution;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "yzi/b", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterExecution implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterExecution> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f99240c;
    public final String d;
    public final long e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncomeSorterExecutionDestination f99241g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            String string3 = parcel.readString();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(IncomeSorterExecutionDestination.CREATOR, parcel, arrayList, iA, 1);
            }
            return new IncomeSorterExecution(string, string2, bVarValueOf, string3, j2, arrayList, parcel.readInt() == 0 ? null : IncomeSorterExecutionDestination.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterExecution[i];
        }
    }

    public IncomeSorterExecution(String id10, String incomeSorterId, b state, String sourceTransactionId, long j2, ArrayList destinations, IncomeSorterExecutionDestination incomeSorterExecutionDestination) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sourceTransactionId, "sourceTransactionId");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f99238a = id10;
        this.f99239b = incomeSorterId;
        this.f99240c = state;
        this.d = sourceTransactionId;
        this.e = j2;
        this.f = destinations;
        this.f99241g = incomeSorterExecutionDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterExecution)) {
            return false;
        }
        IncomeSorterExecution incomeSorterExecution = (IncomeSorterExecution) obj2;
        return Intrinsics.f(this.f99238a, incomeSorterExecution.f99238a) && Intrinsics.f(this.f99239b, incomeSorterExecution.f99239b) && this.f99240c == incomeSorterExecution.f99240c && Intrinsics.f(this.d, incomeSorterExecution.d) && this.e == incomeSorterExecution.e && this.f.equals(incomeSorterExecution.f) && Intrinsics.f(this.f99241g, incomeSorterExecution.f99241g);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, d.c(p.a.c((this.f99240c.hashCode() + p.a.c(this.f99238a.hashCode() * 31, 31, this.f99239b)) * 31, 31, this.d), 31, this.e), 31);
        IncomeSorterExecutionDestination incomeSorterExecutionDestination = this.f99241g;
        return iB + (incomeSorterExecutionDestination == null ? 0 : incomeSorterExecutionDestination.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99238a);
        dest.writeString(this.f99239b);
        dest.writeString(this.f99240c.name());
        dest.writeString(this.d);
        dest.writeLong(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((IncomeSorterExecutionDestination) itY.next()).writeToParcel(dest, i);
        }
        IncomeSorterExecutionDestination incomeSorterExecutionDestination = this.f99241g;
        if (incomeSorterExecutionDestination == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            incomeSorterExecutionDestination.writeToParcel(dest, i);
        }
    }
}
