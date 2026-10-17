package com.revolut.feature.defi.asset_details.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/asset_details/api/model/DeFiAssetDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiAssetDetails implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefiCurrency f71665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f71667c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f71668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f71669h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f71670j;
    public final DeFiAssetRiskAssessment k;

    @NotNull
    public static final Parcelable.Creator<DeFiAssetDetails> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DefiCurrency defiCurrencyCreateFromParcel = DefiCurrency.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                String string2 = parcel.readString();
                if (i2 == i) {
                    return new DeFiAssetDetails(defiCurrencyCreateFromParcel, string, arrayList, string2, parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (DeFiAssetRiskAssessment) parcel.readParcelable(DeFiAssetDetails.class.getClassLoader()));
                }
                arrayList.add(a.valueOf(string2));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetDetails[i];
        }
    }

    public DeFiAssetDetails(DefiCurrency asset, String assetRepresentations, ArrayList chains, String str, String str2, String str3, d dVar, d dVar2, d dVar3, d dVar4, DeFiAssetRiskAssessment deFiAssetRiskAssessment) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(assetRepresentations, "assetRepresentations");
        Intrinsics.checkNotNullParameter(chains, "chains");
        this.f71665a = asset;
        this.f71666b = assetRepresentations;
        this.f71667c = chains;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f71668g = dVar;
        this.f71669h = dVar2;
        this.i = dVar3;
        this.f71670j = dVar4;
        this.k = deFiAssetRiskAssessment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiAssetDetails)) {
            return false;
        }
        DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) obj2;
        return Intrinsics.f(this.f71665a, deFiAssetDetails.f71665a) && Intrinsics.f(this.f71666b, deFiAssetDetails.f71666b) && this.f71667c.equals(deFiAssetDetails.f71667c) && Intrinsics.f(this.d, deFiAssetDetails.d) && Intrinsics.f(this.e, deFiAssetDetails.e) && Intrinsics.f(this.f, deFiAssetDetails.f) && Intrinsics.f(this.f71668g, deFiAssetDetails.f71668g) && Intrinsics.f(this.f71669h, deFiAssetDetails.f71669h) && Intrinsics.f(this.i, deFiAssetDetails.i) && Intrinsics.f(this.f71670j, deFiAssetDetails.f71670j) && Intrinsics.f(this.k, deFiAssetDetails.k);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f71667c, p.a.c(this.f71665a.hashCode() * 31, 31, this.f71666b), 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar = this.f71668g;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f71669h;
        int iHashCode5 = (iHashCode4 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.i;
        int iHashCode6 = (iHashCode5 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.f71670j;
        int iHashCode7 = (iHashCode6 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        DeFiAssetRiskAssessment deFiAssetRiskAssessment = this.k;
        return iHashCode7 + (deFiAssetRiskAssessment != null ? deFiAssetRiskAssessment.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71665a.writeToParcel(dest, i);
        dest.writeString(this.f71666b);
        Iterator itY = j6.a.y(this.f71667c, dest);
        while (itY.hasNext()) {
            dest.writeString(((a) itY.next()).name());
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeSerializable(this.f71668g);
        dest.writeSerializable(this.f71669h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f71670j);
        dest.writeParcelable(this.k, i);
    }
}
