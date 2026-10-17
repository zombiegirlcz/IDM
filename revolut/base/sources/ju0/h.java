package ju0;

import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f178560a;

    public h(UrlVideo video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f178560a = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f178560a.equals(((h) obj2).f178560a);
    }

    public final int hashCode() {
        return this.f178560a.hashCode();
    }
}
