package com.revolut.feature.trade_rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsRedeemOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsRedeemOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsRedeemOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f91197c;
    public final String d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TradeRevPointsRedeemOptionItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TradeRevPointsRedeemOption(string, string2, arrayList, parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsRedeemOption[i];
        }
    }

    public TradeRevPointsRedeemOption(String title, String icon, ArrayList options, String str, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f91195a = title;
        this.f91196b = icon;
        this.f91197c = options;
        this.d = str;
        this.e = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsRedeemOption)) {
            return false;
        }
        TradeRevPointsRedeemOption tradeRevPointsRedeemOption = (TradeRevPointsRedeemOption) obj2;
        return Intrinsics.f(this.f91195a, tradeRevPointsRedeemOption.f91195a) && Intrinsics.f(this.f91196b, tradeRevPointsRedeemOption.f91196b) && this.f91197c.equals(tradeRevPointsRedeemOption.f91197c) && Intrinsics.f(this.d, tradeRevPointsRedeemOption.d) && Intrinsics.f(this.e, tradeRevPointsRedeemOption.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91197c, p.a.c(this.f91195a.hashCode() * 31, 31, this.f91196b), 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.e;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91195a);
        dest.writeString(this.f91196b);
        Iterator itY = j6.a.y(this.f91197c, dest);
        while (itY.hasNext()) {
            ((TradeRevPointsRedeemOptionItem) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
    }
}
