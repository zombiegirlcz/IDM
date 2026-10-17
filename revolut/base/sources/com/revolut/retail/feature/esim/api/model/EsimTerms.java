package com.revolut.retail.feature.esim.api.model;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimHyperText f100526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimHyperText f100528c;
    public final boolean d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f100529g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<EsimHyperText<?, ?>> creator = EsimHyperText.CREATOR;
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel = creator.createFromParcel(parcel);
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel3 = parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            long j2 = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimTermsConsent.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimTerms(esimHyperTextCreateFromParcel, esimHyperTextCreateFromParcel2, esimHyperTextCreateFromParcel3, z, j2, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimTerms[i];
        }
    }

    public EsimTerms(EsimHyperText content, EsimHyperText esimHyperText, EsimHyperText esimHyperText2, boolean z, long j2, String contractVersion, List consents) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contractVersion, "contractVersion");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f100526a = content;
        this.f100527b = esimHyperText;
        this.f100528c = esimHyperText2;
        this.d = z;
        this.e = j2;
        this.f = contractVersion;
        this.f100529g = consents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimTerms)) {
            return false;
        }
        EsimTerms esimTerms = (EsimTerms) obj2;
        return Intrinsics.f(this.f100526a, esimTerms.f100526a) && Intrinsics.f(this.f100527b, esimTerms.f100527b) && Intrinsics.f(this.f100528c, esimTerms.f100528c) && this.d == esimTerms.d && this.e == esimTerms.e && Intrinsics.f(this.f, esimTerms.f) && Intrinsics.f(this.f100529g, esimTerms.f100529g);
    }

    public final int hashCode() {
        int iHashCode = this.f100526a.hashCode() * 31;
        EsimHyperText esimHyperText = this.f100527b;
        int iHashCode2 = (iHashCode + (esimHyperText == null ? 0 : esimHyperText.hashCode())) * 31;
        EsimHyperText esimHyperText2 = this.f100528c;
        return this.f100529g.hashCode() + p.a.c(d.c(j6.a.c((iHashCode2 + (esimHyperText2 != null ? esimHyperText2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f100526a.writeToParcel(dest, i);
        EsimHyperText esimHyperText = this.f100527b;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
        EsimHyperText esimHyperText2 = this.f100528c;
        if (esimHyperText2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText2.writeToParcel(dest, i);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeLong(this.e);
        dest.writeString(this.f);
        Iterator itV = p.a.v(this.f100529g, dest);
        while (itV.hasNext()) {
            ((EsimTermsConsent) itV.next()).writeToParcel(dest, i);
        }
    }
}
