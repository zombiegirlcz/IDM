package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f10575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UriVideo f10576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10577c;
    public final i3 d;
    public final bv0.b e;
    public final boolean f;

    public v8(Image image, UriVideo uriVideo, Clause amount, i3 i3Var, bv0.b switcher, boolean z) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        this.f10575a = image;
        this.f10576b = uriVideo;
        this.f10577c = amount;
        this.d = i3Var;
        this.e = switcher;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj2;
        return Intrinsics.f(this.f10575a, v8Var.f10575a) && Intrinsics.f(this.f10576b, v8Var.f10576b) && Intrinsics.f(this.f10577c, v8Var.f10577c) && Intrinsics.f(this.d, v8Var.d) && Intrinsics.f(this.e, v8Var.e) && this.f == v8Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.f10575a.hashCode() * 31;
        UriVideo uriVideo = this.f10576b;
        int iA = p.a.a((iHashCode + (uriVideo == null ? 0 : uriVideo.hashCode())) * 31, 31, this.f10577c);
        i3 i3Var = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iA + (i3Var != null ? i3Var.f10352a.hashCode() : 0)) * 31)) * 31);
    }
}
