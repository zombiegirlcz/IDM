package x0;

import androidx.camera.video.internal.muxer.MediaMuxerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaMuxerImpl f301447b;

    public /* synthetic */ b(MediaMuxerImpl mediaMuxerImpl, int i) {
        this.f301446a = i;
        this.f301447b = mediaMuxerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f301446a) {
            case 0:
                return MediaMuxerImpl.start$lambda$1(this.f301447b);
            default:
                return MediaMuxerImpl.stop$lambda$1(this.f301447b);
        }
    }
}
