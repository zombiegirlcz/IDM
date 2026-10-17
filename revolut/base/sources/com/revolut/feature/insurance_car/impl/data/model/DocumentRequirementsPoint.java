package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nr7.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/DocumentRequirementsPoint;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentRequirementsPoint implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentRequirementsPoint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f75214c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentRequirementsPoint(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentRequirementsPoint[i];
        }
    }

    public DocumentRequirementsPoint(String title, String description, b iconKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        this.f75212a = title;
        this.f75213b = description;
        this.f75214c = iconKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentRequirementsPoint)) {
            return false;
        }
        DocumentRequirementsPoint documentRequirementsPoint = (DocumentRequirementsPoint) obj2;
        return Intrinsics.f(this.f75212a, documentRequirementsPoint.f75212a) && Intrinsics.f(this.f75213b, documentRequirementsPoint.f75213b) && this.f75214c == documentRequirementsPoint.f75214c;
    }

    public final int hashCode() {
        return this.f75214c.hashCode() + p.a.c(this.f75212a.hashCode() * 31, 31, this.f75213b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75212a);
        dest.writeString(this.f75213b);
        dest.writeString(this.f75214c.name());
    }
}
