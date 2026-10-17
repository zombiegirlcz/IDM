package x0;

import androidx.camera.video.internal.muxer.Media3MuxerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Media3MuxerImpl f301445b;

    public /* synthetic */ a(Media3MuxerImpl media3MuxerImpl, int i) {
        this.f301444a = i;
        this.f301445b = media3MuxerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f301444a) {
            case 0:
                return Media3MuxerImpl.stop$lambda$1(this.f301445b);
            default:
                return Media3MuxerImpl.start$lambda$1(this.f301445b);
        }
    }
}
