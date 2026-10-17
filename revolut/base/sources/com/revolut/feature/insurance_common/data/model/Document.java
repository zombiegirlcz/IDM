package com.revolut.feature.insurance_common.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Document;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "nr7/a", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Document implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Document> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75715c;
    public final String d;
    public final nr7.a e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Document(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), nr7.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Document[i];
        }
    }

    public Document(String title, String str, String code, String link, nr7.a type, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f75713a = title;
        this.f75714b = str;
        this.f75715c = code;
        this.d = link;
        this.e = type;
        this.f = z;
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
        return Intrinsics.f(this.f75713a, document.f75713a) && Intrinsics.f(this.f75714b, document.f75714b) && Intrinsics.f(this.f75715c, document.f75715c) && Intrinsics.f(this.d, document.d) && this.e == document.e && this.f == document.f;
    }

    public final int hashCode() {
        int iHashCode = this.f75713a.hashCode() * 31;
        String str = this.f75714b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f75715c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75713a);
        dest.writeString(this.f75714b);
        dest.writeString(this.f75715c);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
    }
}
