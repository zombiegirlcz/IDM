package com.revolut.feature.crypto_investments.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import it5.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/CryptoCommodityPositions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityPositions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityPositions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f71382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f71383b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CryptoCommodityPosition.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CryptoCommodityPositions(eVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityPositions[i];
        }
    }

    public CryptoCommodityPositions(e type, ArrayList positions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f71382a = type;
        this.f71383b = positions;
    }

    public static CryptoCommodityPositions a(CryptoCommodityPositions cryptoCommodityPositions, ArrayList positions) {
        e type = cryptoCommodityPositions.f71382a;
        cryptoCommodityPositions.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(positions, "positions");
        return new CryptoCommodityPositions(type, positions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityPositions)) {
            return false;
        }
        CryptoCommodityPositions cryptoCommodityPositions = (CryptoCommodityPositions) obj2;
        return this.f71382a == cryptoCommodityPositions.f71382a && this.f71383b.equals(cryptoCommodityPositions.f71383b);
    }

    public final int hashCode() {
        return this.f71383b.hashCode() + (this.f71382a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71382a.name());
        Iterator itY = j6.a.y(this.f71383b, dest);
        while (itY.hasNext()) {
            ((CryptoCommodityPosition) itY.next()).writeToParcel(dest, i);
        }
    }
}
