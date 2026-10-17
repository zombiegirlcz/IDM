package com.revolut.feature.wealth.api.domain.model.collectionquote;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/collectionquote/CollectionQuoteFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectionQuoteFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CollectionQuoteFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f95270a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CollectionQuoteFeeBreakdown.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CollectionQuoteFee(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectionQuoteFee[i];
        }
    }

    public CollectionQuoteFee(ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f95270a = breakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CollectionQuoteFee) && this.f95270a.equals(((CollectionQuoteFee) obj2).f95270a);
    }

    public final int hashCode() {
        return this.f95270a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f95270a, dest);
        while (itY.hasNext()) {
            ((CollectionQuoteFeeBreakdown) itY.next()).writeToParcel(dest, i);
        }
    }
}
