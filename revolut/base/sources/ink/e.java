package ink;

import cli.j;
import cli.o;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements j, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UriVideo f162978a;

    public e(UriVideo video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f162978a = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f162978a.equals(((e) obj2).f162978a);
    }

    public final int hashCode() {
        return this.f162978a.hashCode();
    }
}
