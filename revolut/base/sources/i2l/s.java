package i2l;

import au0.z0;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f158043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f158044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f158045c;
    public final aw0.k d;

    public s(z0 tierTitle, UrlImage background, UrlImage partnerAvatar, aw0.k partnerNameStatusLabel) {
        Intrinsics.checkNotNullParameter(tierTitle, "tierTitle");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(partnerAvatar, "partnerAvatar");
        Intrinsics.checkNotNullParameter(partnerNameStatusLabel, "partnerNameStatusLabel");
        this.f158043a = tierTitle;
        this.f158044b = background;
        this.f158045c = partnerAvatar;
        this.d = partnerNameStatusLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f158043a.equals(sVar.f158043a) && this.f158044b.equals(sVar.f158044b) && this.f158045c.equals(sVar.f158045c) && this.d.equals(sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.g(this.f158045c, v7.g(this.f158044b, this.f158043a.hashCode() * 31, 31), 31);
    }
}
