package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import ej0.b;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/MarginQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarginQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f82110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f82111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Amount f82112c;
    public final Amount d;
    public final g e;
    public final OrderRate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f82113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OvernightFee f82114h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f82115j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Fee f82116l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginQuote((Amount) parcel.readParcelable(MarginQuote.class.getClassLoader()), (Amount) parcel.readParcelable(MarginQuote.class.getClassLoader()), (Amount) parcel.readParcelable(MarginQuote.class.getClassLoader()), (Amount) parcel.readParcelable(MarginQuote.class.getClassLoader()), g.valueOf(parcel.readString()), (OrderRate) parcel.readParcelable(MarginQuote.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : OvernightFee.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), Fee.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarginQuote[i];
        }
    }

    public MarginQuote(Amount marginGross, Amount marginNet, Amount exposure, Amount asset, g side, OrderRate rate, BigDecimal marginRate, OvernightFee overnightFee, b bid2, b ask2, b spread, Fee fee2) {
        Intrinsics.checkNotNullParameter(marginGross, "marginGross");
        Intrinsics.checkNotNullParameter(marginNet, "marginNet");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(marginRate, "marginRate");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        Intrinsics.checkNotNullParameter(ask2, "ask");
        Intrinsics.checkNotNullParameter(spread, "spread");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f82110a = marginGross;
        this.f82111b = marginNet;
        this.f82112c = exposure;
        this.d = asset;
        this.e = side;
        this.f = rate;
        this.f82113g = marginRate;
        this.f82114h = overnightFee;
        this.i = bid2;
        this.f82115j = ask2;
        this.k = spread;
        this.f82116l = fee2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarginQuote)) {
            return false;
        }
        MarginQuote marginQuote = (MarginQuote) obj2;
        return Intrinsics.f(this.f82110a, marginQuote.f82110a) && Intrinsics.f(this.f82111b, marginQuote.f82111b) && Intrinsics.f(this.f82112c, marginQuote.f82112c) && Intrinsics.f(this.d, marginQuote.d) && this.e == marginQuote.e && Intrinsics.f(this.f, marginQuote.f) && Intrinsics.f(this.f82113g, marginQuote.f82113g) && Intrinsics.f(this.f82114h, marginQuote.f82114h) && Intrinsics.f(this.i, marginQuote.i) && Intrinsics.f(this.f82115j, marginQuote.f82115j) && Intrinsics.f(this.k, marginQuote.k) && Intrinsics.f(this.f82116l, marginQuote.f82116l);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f82113g, (this.f.hashCode() + y.b(this.e, y.d(this.d, y.d(this.f82112c, y.d(this.f82111b, this.f82110a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        OvernightFee overnightFee = this.f82114h;
        return this.f82116l.hashCode() + org.bouncycastle.jcajce.provider.digest.a.d(this.k, org.bouncycastle.jcajce.provider.digest.a.d(this.f82115j, org.bouncycastle.jcajce.provider.digest.a.d(this.i, (iD + (overnightFee == null ? 0 : overnightFee.hashCode())) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82110a, i);
        dest.writeParcelable(this.f82111b, i);
        dest.writeParcelable(this.f82112c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f82113g);
        OvernightFee overnightFee = this.f82114h;
        if (overnightFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            overnightFee.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f82115j);
        dest.writeSerializable(this.k);
        this.f82116l.writeToParcel(dest, i);
    }
}
