package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/DocumentType;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentType implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<DocumentType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85861c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentType[i];
        }
    }

    public DocumentType(String type, String title, String description, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f85859a = type;
        this.f85860b = title;
        this.f85861c = description;
        this.d = str;
    }

    public static DocumentType a(DocumentType documentType, String str) {
        String type = documentType.f85859a;
        String title = documentType.f85860b;
        String description = documentType.f85861c;
        documentType.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new DocumentType(type, title, description, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentType)) {
            return false;
        }
        DocumentType documentType = (DocumentType) obj2;
        return Intrinsics.f(this.f85859a, documentType.f85859a) && Intrinsics.f(this.f85860b, documentType.f85860b) && Intrinsics.f(this.f85861c, documentType.f85861c) && Intrinsics.f(this.d, documentType.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f85859a.hashCode() * 31, 31, this.f85860b), 31, this.f85861c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85859a);
        dest.writeString(this.f85860b);
        dest.writeString(this.f85861c);
        dest.writeString(this.d);
    }
}
