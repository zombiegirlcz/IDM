package com.revolut.feature.vaults.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/common/SavingsDocumentToAccept;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_vaults_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsDocumentToAccept implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsDocumentToAccept> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94743c;
    public final SavingsDocument.DocumentType d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsDocumentToAccept(parcel.readString(), parcel.readString(), parcel.readString(), (SavingsDocument.DocumentType) parcel.readParcelable(SavingsDocumentToAccept.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsDocumentToAccept[i];
        }
    }

    public SavingsDocumentToAccept(String id10, String title, String description, SavingsDocument.DocumentType type, String url2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f94741a = id10;
        this.f94742b = title;
        this.f94743c = description;
        this.d = type;
        this.e = url2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsDocumentToAccept)) {
            return false;
        }
        SavingsDocumentToAccept savingsDocumentToAccept = (SavingsDocumentToAccept) obj2;
        return Intrinsics.f(this.f94741a, savingsDocumentToAccept.f94741a) && Intrinsics.f(this.f94742b, savingsDocumentToAccept.f94742b) && Intrinsics.f(this.f94743c, savingsDocumentToAccept.f94743c) && Intrinsics.f(this.d, savingsDocumentToAccept.d) && Intrinsics.f(this.e, savingsDocumentToAccept.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f94741a.hashCode() * 31, 31, this.f94742b), 31, this.f94743c), 31, this.d.f86607a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94741a);
        dest.writeString(this.f94742b);
        dest.writeString(this.f94743c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }
}
