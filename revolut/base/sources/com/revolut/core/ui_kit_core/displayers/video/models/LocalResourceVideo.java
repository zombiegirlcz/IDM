package com.revolut.core.ui_kit_core.displayers.video.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oz0.b;
import oz0.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/video/models/LocalResourceVideo;", "Lcom/revolut/core/ui_kit_core/displayers/video/Video;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalResourceVideo implements Video {

    @NotNull
    public static final Parcelable.Creator<LocalResourceVideo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VideoShutter f60084c;
    public final b d;
    public final boolean e;
    public final c f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            VideoShutter videoShutter = (VideoShutter) parcel.readParcelable(LocalResourceVideo.class.getClassLoader());
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new LocalResourceVideo(i, z3, videoShutter, bVarValueOf, z, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocalResourceVideo[i];
        }
    }

    public LocalResourceVideo(int i, boolean z, VideoShutter videoShutter, b bVar, boolean z3, c transparencyMode) {
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f60082a = i;
        this.f60083b = z;
        this.f60084c = videoShutter;
        this.d = bVar;
        this.e = z3;
        this.f = transparencyMode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF60083b() {
        return this.f60083b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF60082a() {
        return this.f60082a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VideoShutter getF60084c() {
        return this.f60084c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocalResourceVideo)) {
            return false;
        }
        LocalResourceVideo localResourceVideo = (LocalResourceVideo) obj2;
        return this.f60082a == localResourceVideo.f60082a && this.f60083b == localResourceVideo.f60083b && Intrinsics.f(this.f60084c, localResourceVideo.f60084c) && this.d == localResourceVideo.d && this.e == localResourceVideo.e && this.f == localResourceVideo.f;
    }

    public final int hashCode() {
        int iC = j6.a.c(Integer.hashCode(this.f60082a) * 31, 31, this.f60083b);
        VideoShutter videoShutter = this.f60084c;
        int iHashCode = (iC + (videoShutter == null ? 0 : videoShutter.hashCode())) * 31;
        b bVar = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.e);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f60082a);
        dest.writeInt(this.f60083b ? 1 : 0);
        dest.writeParcelable(this.f60084c, i);
        b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f.name());
    }
}
