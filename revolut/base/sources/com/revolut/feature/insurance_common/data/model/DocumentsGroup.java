package com.revolut.feature.insurance_common.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/DocumentsGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentsGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75717b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Document.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DocumentsGroup(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsGroup[i];
        }
    }

    public DocumentsGroup(String title, ArrayList documents) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f75716a = title;
        this.f75717b = documents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentsGroup)) {
            return false;
        }
        DocumentsGroup documentsGroup = (DocumentsGroup) obj2;
        return Intrinsics.f(this.f75716a, documentsGroup.f75716a) && this.f75717b.equals(documentsGroup.f75717b);
    }

    public final int hashCode() {
        return this.f75717b.hashCode() + (this.f75716a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75716a);
        Iterator itY = j6.a.y(this.f75717b, dest);
        while (itY.hasNext()) {
            ((Document) itY.next()).writeToParcel(dest, i);
        }
    }
}
