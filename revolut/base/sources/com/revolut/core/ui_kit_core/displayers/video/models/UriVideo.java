package com.revolut.core.ui_kit_core.displayers.video.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oz0.b;
import oz0.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/UriVideo;", "Lcom/revolut/core/ui_kit_core/displayers/video/Video;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UriVideo implements Video {

    @NotNull
    public static final Parcelable.Creator<UriVideo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f60085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f60086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60087c;
    public final b d;
    public final Boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f60088g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Uri uri2 = (Uri) parcel.readParcelable(UriVideo.class.getClassLoader());
            Uri uri3 = (Uri) parcel.readParcelable(UriVideo.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = null;
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new UriVideo(uri2, uri3, z3, bVarValueOf, boolValueOf, z, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UriVideo[i];
        }
    }

    public UriVideo(Uri uri2, Uri uriDark, boolean z, b bVar, Boolean bool, boolean z3, c transparencyMode) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(uriDark, "uriDark");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f60085a = uri2;
        this.f60086b = uriDark;
        this.f60087c = z;
        this.d = bVar;
        this.e = bool;
        this.f = z3;
        this.f60088g = transparencyMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UriVideo)) {
            return false;
        }
        UriVideo uriVideo = (UriVideo) obj2;
        return Intrinsics.f(this.f60085a, uriVideo.f60085a) && Intrinsics.f(this.f60086b, uriVideo.f60086b) && this.f60087c == uriVideo.f60087c && this.d == uriVideo.d && Intrinsics.f(this.e, uriVideo.e) && this.f == uriVideo.f && this.f60088g == uriVideo.f60088g;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f60086b.hashCode() + (this.f60085a.hashCode() * 31)) * 31, 31, this.f60087c);
        b bVar = this.d;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.e;
        return this.f60088g.hashCode() + j6.a.c((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60085a, i);
        dest.writeParcelable(this.f60086b, i);
        dest.writeInt(this.f60087c ? 1 : 0);
        b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        Boolean bool = this.e;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f60088g.name());
    }

    public /* synthetic */ UriVideo(Uri uri2, Uri uri3, boolean z, b bVar, Boolean bool, c cVar, int i) {
        this(uri2, (i & 2) != 0 ? uri2 : uri3, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : bool, true, (i & 64) != 0 ? c.DISABLED : cVar);
    }
}
