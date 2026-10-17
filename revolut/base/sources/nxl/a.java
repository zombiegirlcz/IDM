package nxl;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f220578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlVideo f220579c;

    public a(String designId, UrlImage cardDesignImage, UrlVideo urlVideo) {
        Intrinsics.checkNotNullParameter(designId, "designId");
        Intrinsics.checkNotNullParameter(cardDesignImage, "cardDesignImage");
        this.f220577a = designId;
        this.f220578b = cardDesignImage;
        this.f220579c = urlVideo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f220577a, aVar.f220577a) && this.f220578b.equals(aVar.f220578b) && Intrinsics.f(this.f220579c, aVar.f220579c);
    }

    public final int hashCode() {
        int iG = v7.g(this.f220578b, this.f220577a.hashCode() * 31, 31);
        UrlVideo urlVideo = this.f220579c;
        return iG + (urlVideo == null ? 0 : urlVideo.hashCode());
    }
}
