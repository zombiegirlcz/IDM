package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74985c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACDocument(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACDocument[i];
        }
    }

    public CFACDocument(String name, String str, String str2, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f74983a = name;
        this.f74984b = str;
        this.f74985c = str2;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACDocument)) {
            return false;
        }
        CFACDocument cFACDocument = (CFACDocument) obj2;
        return Intrinsics.f(this.f74983a, cFACDocument.f74983a) && Intrinsics.f(this.f74984b, cFACDocument.f74984b) && Intrinsics.f(this.f74985c, cFACDocument.f74985c) && Intrinsics.f(this.d, cFACDocument.d);
    }

    public final int hashCode() {
        int iHashCode = this.f74983a.hashCode() * 31;
        String str = this.f74984b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74985c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74983a);
        dest.writeString(this.f74984b);
        dest.writeString(this.f74985c);
        dest.writeStringList(this.d);
    }
}
