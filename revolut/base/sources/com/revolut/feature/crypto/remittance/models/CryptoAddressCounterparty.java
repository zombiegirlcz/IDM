package com.revolut.feature.crypto.remittance.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0.a;
import wk5.d;
import wk5.e;
import wk5.f;
import wk5.g;
import wk5.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/crypto/remittance/models/CryptoAddressCounterparty;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Companion", "wk5/g", "wk5/d", "wk5/f", "wk5/e", "OwnershipPayload", "a", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddressCounterparty implements Parcelable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f70979c;
    public final h d;
    public final d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptoAddressRecipientDetails f70980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f70981h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OwnershipPayload f70982j;
    public final Instant k;

    @NotNull
    public static final Parcelable.Creator<CryptoAddressCounterparty> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/remittance/models/CryptoAddressCounterparty$OwnershipPayload;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OwnershipPayload implements Parcelable, Serializable {

        @NotNull
        public static final Parcelable.Creator<OwnershipPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70983a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OwnershipPayload(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OwnershipPayload[i];
            }
        }

        public OwnershipPayload(String str) {
            this.f70983a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OwnershipPayload) && Intrinsics.f(this.f70983a, ((OwnershipPayload) obj2).f70983a);
        }

        public final int hashCode() {
            String str = this.f70983a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70983a);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddressCounterparty(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : CryptoAddressRecipientDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), parcel.readInt() != 0 ? OwnershipPayload.CREATOR.createFromParcel(parcel) : null, (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddressCounterparty[i];
        }
    }

    public CryptoAddressCounterparty(String id10, String str, g gVar, h hVar, d dVar, String str2, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, f fVar, e eVar, OwnershipPayload ownershipPayload, Instant instant) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f70977a = id10;
        this.f70978b = str;
        this.f70979c = gVar;
        this.d = hVar;
        this.e = dVar;
        this.f = str2;
        this.f70980g = cryptoAddressRecipientDetails;
        this.f70981h = fVar;
        this.i = eVar;
        this.f70982j = ownershipPayload;
        this.k = instant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddressCounterparty)) {
            return false;
        }
        CryptoAddressCounterparty cryptoAddressCounterparty = (CryptoAddressCounterparty) obj2;
        return Intrinsics.f(this.f70977a, cryptoAddressCounterparty.f70977a) && Intrinsics.f(this.f70978b, cryptoAddressCounterparty.f70978b) && this.f70979c == cryptoAddressCounterparty.f70979c && this.d == cryptoAddressCounterparty.d && this.e == cryptoAddressCounterparty.e && Intrinsics.f(this.f, cryptoAddressCounterparty.f) && Intrinsics.f(this.f70980g, cryptoAddressCounterparty.f70980g) && this.f70981h == cryptoAddressCounterparty.f70981h && this.i == cryptoAddressCounterparty.i && Intrinsics.f(this.f70982j, cryptoAddressCounterparty.f70982j) && Intrinsics.f(this.k, cryptoAddressCounterparty.k);
    }

    public final int hashCode() {
        int iHashCode = this.f70977a.hashCode() * 31;
        String str = this.f70978b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f70979c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.d;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        d dVar = this.e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.f70980g;
        int iHashCode7 = (iHashCode6 + (cryptoAddressRecipientDetails == null ? 0 : cryptoAddressRecipientDetails.hashCode())) * 31;
        f fVar = this.f70981h;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar = this.i;
        int iHashCode9 = (iHashCode8 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        OwnershipPayload ownershipPayload = this.f70982j;
        int iHashCode10 = (iHashCode9 + (ownershipPayload == null ? 0 : ownershipPayload.hashCode())) * 31;
        Instant instant = this.k;
        return iHashCode10 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = a.m("CryptoAddressCounterparty(id=", this.f70977a, ", address=", this.f70978b, ", state=");
        sbM.append(this.f70979c);
        sbM.append(", hostingType=");
        sbM.append(this.d);
        sbM.append(", hostingVerification=");
        sbM.append(this.e);
        sbM.append(", hostingPlatform=");
        sbM.append(this.f);
        sbM.append(", details=");
        sbM.append(this.f70980g);
        sbM.append(", ownershipState=");
        sbM.append(this.f70981h);
        sbM.append(", ownershipMethod=");
        sbM.append(this.i);
        sbM.append(", updatedDate=");
        sbM.append(this.k);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70977a);
        dest.writeString(this.f70978b);
        g gVar = this.f70979c;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        h hVar = this.d;
        if (hVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(hVar.name());
        }
        d dVar = this.e;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        dest.writeString(this.f);
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.f70980g;
        if (cryptoAddressRecipientDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoAddressRecipientDetails.writeToParcel(dest, i);
        }
        f fVar = this.f70981h;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        e eVar = this.i;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        OwnershipPayload ownershipPayload = this.f70982j;
        if (ownershipPayload == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ownershipPayload.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.k);
    }
}
