package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/models/DocumentWithValidation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentWithValidation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentWithValidation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentValidationResult f67950c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentWithValidation(parcel.readString(), parcel.readString(), (DocumentValidationResult) parcel.readParcelable(DocumentWithValidation.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentWithValidation[i];
        }
    }

    public DocumentWithValidation(String filePath, String fileName, DocumentValidationResult validationResult, String str) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        this.f67948a = filePath;
        this.f67949b = fileName;
        this.f67950c = validationResult;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentWithValidation)) {
            return false;
        }
        DocumentWithValidation documentWithValidation = (DocumentWithValidation) obj2;
        return Intrinsics.f(this.f67948a, documentWithValidation.f67948a) && Intrinsics.f(this.f67949b, documentWithValidation.f67949b) && Intrinsics.f(this.f67950c, documentWithValidation.f67950c) && Intrinsics.f(this.d, documentWithValidation.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f67950c.hashCode() + p.a.c(this.f67948a.hashCode() * 31, 31, this.f67949b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67948a);
        dest.writeString(this.f67949b);
        dest.writeParcelable(this.f67950c, i);
        dest.writeString(this.d);
    }
}
