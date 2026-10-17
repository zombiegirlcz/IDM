package com.revolut.feature.support.impl.transfer_tracker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferArrivalContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferArrivalContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f89375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferArrivalOutcome f89376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferArrivalWarning f89377c;
    public final tde.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Section.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TransferArrivalContent(arrayList, (TransferArrivalOutcome) parcel.readParcelable(TransferArrivalContent.class.getClassLoader()), parcel.readInt() == 0 ? null : TransferArrivalWarning.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? tde.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferArrivalContent[i];
        }
    }

    public TransferArrivalContent(ArrayList sections, TransferArrivalOutcome outcome, TransferArrivalWarning transferArrivalWarning, tde.a aVar) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this.f89375a = sections;
        this.f89376b = outcome;
        this.f89377c = transferArrivalWarning;
        this.d = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferArrivalContent)) {
            return false;
        }
        TransferArrivalContent transferArrivalContent = (TransferArrivalContent) obj2;
        return this.f89375a.equals(transferArrivalContent.f89375a) && Intrinsics.f(this.f89376b, transferArrivalContent.f89376b) && Intrinsics.f(this.f89377c, transferArrivalContent.f89377c) && this.d == transferArrivalContent.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f89376b.hashCode() + (this.f89375a.hashCode() * 31)) * 31;
        TransferArrivalWarning transferArrivalWarning = this.f89377c;
        int iHashCode2 = (iHashCode + (transferArrivalWarning == null ? 0 : transferArrivalWarning.hashCode())) * 31;
        tde.a aVar = this.d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f89375a, dest);
        while (itY.hasNext()) {
            ((Section) itY.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f89376b, i);
        TransferArrivalWarning transferArrivalWarning = this.f89377c;
        if (transferArrivalWarning == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferArrivalWarning.writeToParcel(dest, i);
        }
        tde.a aVar = this.d;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
