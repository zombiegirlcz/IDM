package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/Image;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Image implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Image> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f98054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f98055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98056c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Image(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), e.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image(Integer num, e type, String url2, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f98054a = num;
        this.f98055b = type;
        this.f98056c = url2;
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
        if (!(obj2 instanceof Image)) {
            return false;
        }
        Image image = (Image) obj2;
        return Intrinsics.f(this.f98054a, image.f98054a) && this.f98055b == image.f98055b && Intrinsics.f(this.f98056c, image.f98056c) && Intrinsics.f(this.d, image.d);
    }

    public final int hashCode() {
        Integer num = this.f98054a;
        int iC = p.a.c((this.f98055b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31, this.f98056c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f98054a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f98055b.name());
        dest.writeString(this.f98056c);
        dest.writeString(this.d);
    }
}
