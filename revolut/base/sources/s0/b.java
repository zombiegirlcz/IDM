package s0;

import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f258738b;

    public /* synthetic */ b(int i, int i2) {
        this.f258737a = i2;
        this.f258738b = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f258737a) {
            case 0:
                ((VideoSpec.Builder) obj2).setBitrate(this.f258738b);
                break;
            default:
                ((VideoSpec.Builder) obj2).setAspectRatio(this.f258738b);
                break;
        }
    }
}
