package nv0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f219347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f219348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel f219349c;
    public final Image d;
    public final i e;
    public final boolean f;

    public d(Clause title, Clause subtitle, AvatarModel avatar, Image image, i backgroundStyle, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(backgroundStyle, "backgroundStyle");
        this.f219347a = title;
        this.f219348b = subtitle;
        this.f219349c = avatar;
        this.d = image;
        this.e = backgroundStyle;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f219347a, dVar.f219347a) && Intrinsics.f(this.f219348b, dVar.f219348b) && Intrinsics.f(this.f219349c, dVar.f219349c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f219349c.hashCode() + p.a.a(this.f219347a.hashCode() * 31, 31, this.f219348b)) * 31;
        Image image = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31);
    }
}
