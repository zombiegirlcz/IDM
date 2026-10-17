package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Document;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Document> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f105591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocType f105592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105593c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Document((DocType) parcel.readParcelable(Document.class.getClassLoader()), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Document[i];
        }
    }

    public Document(DocType type, String name, String str, b issuingCountry) {
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f105591a = issuingCountry;
        this.f105592b = type;
        this.f105593c = name;
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
        if (!(obj2 instanceof Document)) {
            return false;
        }
        Document document = (Document) obj2;
        return Intrinsics.f(this.f105591a, document.f105591a) && Intrinsics.f(this.f105592b, document.f105592b) && Intrinsics.f(this.f105593c, document.f105593c) && Intrinsics.f(this.d, document.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f105591a.f297794a.hashCode() * 31, 31, this.f105592b.f77926a), 31, this.f105593c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105591a);
        dest.writeParcelable(this.f105592b, i);
        dest.writeString(this.f105593c);
        dest.writeString(this.d);
    }
}
