package com.revolut.core.ui_kit_core.displayers.video.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oz0.b;
import oz0.c;
import yhm.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/UrlVideo;", "Lcom/revolut/core/ui_kit_core/displayers/video/Video;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class UrlVideo implements Video {

    @NotNull
    public static final Parcelable.Creator<UrlVideo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60091c;
    public final b d;
    public final Boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f60092g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new UrlVideo(string, string2, z3, bVarValueOf, boolValueOf, z, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlVideo[i];
        }
    }

    public UrlVideo(String url2, String urlDark, boolean z, b bVar, Boolean bool, boolean z3, c transparencyMode) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f60089a = url2;
        this.f60090b = urlDark;
        this.f60091c = z;
        this.d = bVar;
        this.e = bool;
        this.f = z3;
        this.f60092g = transparencyMode;
    }

    public static UrlVideo a(UrlVideo urlVideo, boolean z, b bVar, c cVar, int i) {
        String url2 = urlVideo.f60089a;
        String urlDark = urlVideo.f60090b;
        if ((i & 4) != 0) {
            z = urlVideo.f60091c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            bVar = urlVideo.d;
        }
        b bVar2 = bVar;
        Boolean bool = urlVideo.e;
        boolean z4 = (i & 32) != 0 ? urlVideo.f : true;
        if ((i & 64) != 0) {
            cVar = urlVideo.f60092g;
        }
        c transparencyMode = cVar;
        urlVideo.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        return new UrlVideo(url2, urlDark, z3, bVar2, bool, z4, transparencyMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UrlVideo)) {
            return false;
        }
        UrlVideo urlVideo = (UrlVideo) obj2;
        return Intrinsics.f(this.f60089a, urlVideo.f60089a) && Intrinsics.f(this.f60090b, urlVideo.f60090b) && this.f60091c == urlVideo.f60091c && this.d == urlVideo.d && Intrinsics.f(this.e, urlVideo.e) && this.f == urlVideo.f && this.f60092g == urlVideo.f60092g;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f60089a.hashCode() * 31, 31, this.f60090b), 31, this.f60091c);
        b bVar = this.d;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.e;
        return this.f60092g.hashCode() + j6.a.c((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60089a);
        dest.writeString(this.f60090b);
        dest.writeInt(this.f60091c ? 1 : 0);
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
        dest.writeString(this.f60092g.name());
    }

    public /* synthetic */ UrlVideo(String str, String str2, boolean z, b bVar, boolean z3, c cVar, int i) {
        this(str, (i & 2) != 0 ? str : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : Boolean.TRUE, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? c.DISABLED : cVar);
    }
}
