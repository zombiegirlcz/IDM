package com.revolut.feature.kyc_documents_scan.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/models/DocType;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocType implements Parcelable, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DocType f77925g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77926a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<DocType> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DocType f77923b = new DocType("DRIVING_LICENCE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DocType f77924c = new DocType("PASSPORT");
    public static final DocType d = new DocType("IDENTITY_CARD");
    public static final DocType e = new DocType("RESIDENCE_PERMIT");
    public static final DocType f = new DocType("VISA");

    /* JADX INFO: renamed from: com.revolut.feature.kyc_documents_scan.api.models.DocType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocType(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocType[i];
        }
    }

    static {
        new DocType("WORK_PERMIT");
        new DocType("MY_NUMBER_CARD");
        new DocType("MY_NUMBER_NOTIFICATION_CARD");
        new DocType("RESIDENT_RECORD");
        f77925g = new DocType("STUDIES_INSTITUTION_LETTER");
    }

    public DocType(String docType) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        this.f77926a = docType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DocType) && Intrinsics.f(this.f77926a, ((DocType) obj2).f77926a);
    }

    public final int hashCode() {
        return this.f77926a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77926a);
    }
}
