package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nq.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationAcceptedDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationAcceptedDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationAcceptedDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentType f50372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f50374c;
    public final e d;
    public final BiometricVerificationDocumentNfcChip e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BiometricVerificationDocumentType biometricVerificationDocumentType = (BiometricVerificationDocumentType) j6.a.f(parcel, "parcel", BiometricVerificationAcceptedDocument.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BiometricVerificationDocumentPage.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new BiometricVerificationAcceptedDocument(biometricVerificationDocumentType, arrayList, arrayList2, e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BiometricVerificationDocumentNfcChip.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationAcceptedDocument[i];
        }
    }

    public BiometricVerificationAcceptedDocument(BiometricVerificationDocumentType type, ArrayList countries, ArrayList pages, e processor, BiometricVerificationDocumentNfcChip biometricVerificationDocumentNfcChip) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f50372a = type;
        this.f50373b = countries;
        this.f50374c = pages;
        this.d = processor;
        this.e = biometricVerificationDocumentNfcChip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationAcceptedDocument)) {
            return false;
        }
        BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument = (BiometricVerificationAcceptedDocument) obj2;
        return Intrinsics.f(this.f50372a, biometricVerificationAcceptedDocument.f50372a) && this.f50373b.equals(biometricVerificationAcceptedDocument.f50373b) && this.f50374c.equals(biometricVerificationAcceptedDocument.f50374c) && this.d == biometricVerificationAcceptedDocument.d && Intrinsics.f(this.e, biometricVerificationAcceptedDocument.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f50374c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f50373b, this.f50372a.hashCode() * 31, 31), 31)) * 31;
        BiometricVerificationDocumentNfcChip biometricVerificationDocumentNfcChip = this.e;
        return iHashCode + (biometricVerificationDocumentNfcChip == null ? 0 : Boolean.hashCode(biometricVerificationDocumentNfcChip.f50378a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50372a, i);
        Iterator itY = j6.a.y(this.f50373b, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        Iterator itY2 = j6.a.y(this.f50374c, dest);
        while (itY2.hasNext()) {
            ((BiometricVerificationDocumentPage) itY2.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d.name());
        BiometricVerificationDocumentNfcChip biometricVerificationDocumentNfcChip = this.e;
        if (biometricVerificationDocumentNfcChip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricVerificationDocumentNfcChip.writeToParcel(dest, i);
        }
    }
}
