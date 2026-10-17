package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/WallpaperImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WallpaperImage implements Image {

    @NotNull
    public static final Parcelable.Creator<WallpaperImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f60056c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WallpaperImage(parcel.readString(), parcel.readString(), (Clause) parcel.readParcelable(WallpaperImage.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WallpaperImage[i];
        }
    }

    public WallpaperImage(String url2, String urlDark, Clause clause, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        this.f60054a = url2;
        this.f60055b = urlDark;
        this.f60056c = clause;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WallpaperImage)) {
            return false;
        }
        WallpaperImage wallpaperImage = (WallpaperImage) obj2;
        return Intrinsics.f(this.f60054a, wallpaperImage.f60054a) && Intrinsics.f(this.f60055b, wallpaperImage.f60055b) && Intrinsics.f(this.f60056c, wallpaperImage.f60056c) && this.d == wallpaperImage.d && Intrinsics.f(this.e, wallpaperImage.e) && Intrinsics.f(this.f, wallpaperImage.f);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF() {
        return this.f60056c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60054a.hashCode() * 31, 31, this.f60055b);
        Clause clause = this.f60056c;
        int iC2 = j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60054a);
        dest.writeString(this.f60055b);
        dest.writeParcelable(this.f60056c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
