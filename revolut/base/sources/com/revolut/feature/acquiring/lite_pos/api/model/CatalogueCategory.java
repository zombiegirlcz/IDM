package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/CatalogueCategory;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CatalogueCategory implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CatalogueCategory> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60671c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CatalogueCategory(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogueCategory[i];
        }
    }

    public CatalogueCategory(String categoryId, String name, String str) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f60669a = categoryId;
        this.f60670b = name;
        this.f60671c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CatalogueCategory)) {
            return false;
        }
        CatalogueCategory catalogueCategory = (CatalogueCategory) obj2;
        return Intrinsics.f(this.f60669a, catalogueCategory.f60669a) && Intrinsics.f(this.f60670b, catalogueCategory.f60670b) && Intrinsics.f(this.f60671c, catalogueCategory.f60671c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60669a.hashCode() * 31, 31, this.f60670b);
        String str = this.f60671c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60669a);
        dest.writeString(this.f60670b);
        dest.writeString(this.f60671c);
    }
}
