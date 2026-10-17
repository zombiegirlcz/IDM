package com.revolut.retail.feature.analytics.models.income_sorter;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import hzi.b;
import hzi.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "hzi/b", "hzi/c", "hzi/a", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99162c;
    public final b d;
    public final c e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f99163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f99164h;
    public final hzi.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IncomeSorterDestinationId f99165j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String str = ((WalletId) parcel.readParcelable(IncomeSorter.class.getClassLoader())).f66106a;
            String string2 = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            c cVarValueOf = c.valueOf(parcel.readString());
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(IncomeSorterDestination.CREATOR, parcel, arrayList, iA, 1);
            }
            return new IncomeSorter(string, str, string2, bVarValueOf, cVarValueOf, j2, j3, arrayList, parcel.readInt() == 0 ? null : hzi.a.valueOf(parcel.readString()), (IncomeSorterDestinationId) parcel.readParcelable(IncomeSorter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorter[i];
        }
    }

    public IncomeSorter(String id10, String walletId, String baseTransactionId, b state, c type, long j2, long j3, ArrayList destinations, hzi.a aVar, IncomeSorterDestinationId incomeSorterDestinationId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(baseTransactionId, "baseTransactionId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f99160a = id10;
        this.f99161b = walletId;
        this.f99162c = baseTransactionId;
        this.d = state;
        this.e = type;
        this.f = j2;
        this.f99163g = j3;
        this.f99164h = destinations;
        this.i = aVar;
        this.f99165j = incomeSorterDestinationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorter)) {
            return false;
        }
        IncomeSorter incomeSorter = (IncomeSorter) obj2;
        return Intrinsics.f(this.f99160a, incomeSorter.f99160a) && Intrinsics.f(this.f99161b, incomeSorter.f99161b) && Intrinsics.f(this.f99162c, incomeSorter.f99162c) && this.d == incomeSorter.d && this.e == incomeSorter.e && this.f == incomeSorter.f && this.f99163g == incomeSorter.f99163g && this.f99164h.equals(incomeSorter.f99164h) && this.i == incomeSorter.i && Intrinsics.f(this.f99165j, incomeSorter.f99165j);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99164h, d.c(d.c((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f99160a.hashCode() * 31, 31, this.f99161b), 31, this.f99162c)) * 31)) * 31, 31, this.f), 31, this.f99163g), 31);
        hzi.a aVar = this.i;
        int iHashCode = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
        IncomeSorterDestinationId incomeSorterDestinationId = this.f99165j;
        return iHashCode + (incomeSorterDestinationId != null ? incomeSorterDestinationId.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99160a);
        dest.writeParcelable(new WalletId(this.f99161b), i);
        dest.writeString(this.f99162c);
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeLong(this.f);
        dest.writeLong(this.f99163g);
        Iterator itY = j6.a.y(this.f99164h, dest);
        while (itY.hasNext()) {
            ((IncomeSorterDestination) itY.next()).writeToParcel(dest, i);
        }
        hzi.a aVar = this.i;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.f99165j, i);
    }
}
