package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import f8l.e;
import f8l.f;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/LegacyOrderQuoteParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class LegacyOrderQuoteParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f104734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Asset f104735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f104736c;
    public final BigDecimal d;
    public final f8l.b e;
    public final f8l.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f104737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f104738h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f104739j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f104740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f104741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f104742n;

    @NotNull
    public static final Parcelable.Creator<LegacyOrderQuoteParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<Asset> creator = Asset.CREATOR;
            Asset assetCreateFromParcel = creator.createFromParcel(parcel);
            Asset assetCreateFromParcel2 = creator.createFromParcel(parcel);
            e eVarValueOf = e.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            f8l.b bVarValueOf = f8l.b.valueOf(parcel.readString());
            f8l.b bVarValueOf2 = f8l.b.valueOf(parcel.readString());
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string = parcel.readString();
            f fVarValueOf = parcel.readInt() == 0 ? null : f.valueOf(parcel.readString());
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new LegacyOrderQuoteParams(assetCreateFromParcel, assetCreateFromParcel2, eVarValueOf, bigDecimal, bVarValueOf, bVarValueOf2, bigDecimal2, z4, string, fVarValueOf, string2, string3, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LegacyOrderQuoteParams[i];
        }
    }

    public LegacyOrderQuoteParams(Asset from, Asset to6, e orderType, BigDecimal bigDecimal, f8l.b amountIn, f8l.b baseRateAsset, BigDecimal bigDecimal2, boolean z, String str, f fVar, String str2, String str3, Boolean bool, String str4) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(amountIn, "amountIn");
        Intrinsics.checkNotNullParameter(baseRateAsset, "baseRateAsset");
        this.f104734a = from;
        this.f104735b = to6;
        this.f104736c = orderType;
        this.d = bigDecimal;
        this.e = amountIn;
        this.f = baseRateAsset;
        this.f104737g = bigDecimal2;
        this.f104738h = z;
        this.i = str;
        this.f104739j = fVar;
        this.k = str2;
        this.f104740l = str3;
        this.f104741m = bool;
        this.f104742n = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LegacyOrderQuoteParams)) {
            return false;
        }
        LegacyOrderQuoteParams legacyOrderQuoteParams = (LegacyOrderQuoteParams) obj2;
        return Intrinsics.f(this.f104734a, legacyOrderQuoteParams.f104734a) && Intrinsics.f(this.f104735b, legacyOrderQuoteParams.f104735b) && this.f104736c == legacyOrderQuoteParams.f104736c && Intrinsics.f(this.d, legacyOrderQuoteParams.d) && this.e == legacyOrderQuoteParams.e && this.f == legacyOrderQuoteParams.f && Intrinsics.f(this.f104737g, legacyOrderQuoteParams.f104737g) && this.f104738h == legacyOrderQuoteParams.f104738h && Intrinsics.f(this.i, legacyOrderQuoteParams.i) && this.f104739j == legacyOrderQuoteParams.f104739j && Intrinsics.f(this.k, legacyOrderQuoteParams.k) && Intrinsics.f(this.f104740l, legacyOrderQuoteParams.f104740l) && Intrinsics.f(this.f104741m, legacyOrderQuoteParams.f104741m) && Intrinsics.f(this.f104742n, legacyOrderQuoteParams.f104742n);
    }

    public final int hashCode() {
        int iHashCode = (this.f104736c.hashCode() + ((this.f104735b.hashCode() + (this.f104734a.hashCode() * 31)) * 31)) * 31;
        BigDecimal bigDecimal = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31)) * 31;
        BigDecimal bigDecimal2 = this.f104737g;
        int iC = j6.a.c((iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31, this.f104738h);
        String str = this.i;
        int iHashCode3 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.f104739j;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104740l;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f104741m;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f104742n;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f104734a.writeToParcel(dest, i);
        this.f104735b.writeToParcel(dest, i);
        dest.writeString(this.f104736c.name());
        dest.writeSerializable(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f104737g);
        dest.writeInt(this.f104738h ? 1 : 0);
        dest.writeString(this.i);
        f fVar = this.f104739j;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        dest.writeString(this.k);
        dest.writeString(this.f104740l);
        Boolean bool = this.f104741m;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeString(this.f104742n);
    }

    public /* synthetic */ LegacyOrderQuoteParams(Asset asset, Asset asset2, e eVar, BigDecimal bigDecimal, f8l.b bVar, f8l.b bVar2, BigDecimal bigDecimal2, boolean z, String str, f fVar, String str2, String str3, Boolean bool, String str4, int i) {
        this(asset, asset2, eVar, bigDecimal, bVar, bVar2, bigDecimal2, z, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : fVar, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str4);
    }
}
