package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nq.e;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentType f50375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f50376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f50377c;
    public final e d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BiometricVerificationDocumentType biometricVerificationDocumentType = (BiometricVerificationDocumentType) j6.a.f(parcel, "parcel", BiometricVerificationDocument.class);
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BiometricVerificationDocumentPage.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BiometricVerificationDocument(biometricVerificationDocumentType, bVar, arrayList, e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationDocument[i];
        }
    }

    public BiometricVerificationDocument(BiometricVerificationDocumentType type, b country, ArrayList pages, e processor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f50375a = type;
        this.f50376b = country;
        this.f50377c = pages;
        this.d = processor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationDocument)) {
            return false;
        }
        BiometricVerificationDocument biometricVerificationDocument = (BiometricVerificationDocument) obj2;
        return Intrinsics.f(this.f50375a, biometricVerificationDocument.f50375a) && Intrinsics.f(this.f50376b, biometricVerificationDocument.f50376b) && this.f50377c.equals(biometricVerificationDocument.f50377c) && this.d == biometricVerificationDocument.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f50377c, p.a.c(this.f50375a.hashCode() * 31, 31, this.f50376b.f297794a), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50375a, i);
        dest.writeSerializable(this.f50376b);
        Iterator itY = j6.a.y(this.f50377c, dest);
        while (itY.hasNext()) {
            ((BiometricVerificationDocumentPage) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d.name());
    }
}
