package ip0;

import android.media.MediaCodec;
import androidx.camera.video.internal.muxer.Media3MuxerImpl;
import androidx.camera.video.internal.muxer.MediaMuxerImpl;
import androidx.camera.video.internal.muxer.Muxer;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class mt implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165418c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mt(Muxer muxer, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2) {
        this.f165416a = i2;
        this.f165418c = muxer;
        this.f165417b = i;
        this.d = byteBuffer;
        this.e = bufferInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f165416a) {
            case 0:
                pt ptVar = (pt) this.f165418c;
                ad adVar = (ad) this.d;
                Lazy lazy = (Lazy) this.e;
                return Float.valueOf((((Number) adVar.invoke(Integer.valueOf(this.f165417b))).floatValue() * ptVar.f165864j.getWidth()) - ((Number) lazy.getValue()).intValue());
            case 1:
                return Media3MuxerImpl.writeSampleData$lambda$1((Media3MuxerImpl) this.f165418c, this.f165417b, (ByteBuffer) this.d, (MediaCodec.BufferInfo) this.e);
            default:
                return MediaMuxerImpl.writeSampleData$lambda$1((MediaMuxerImpl) this.f165418c, this.f165417b, (ByteBuffer) this.d, (MediaCodec.BufferInfo) this.e);
        }
    }

    public /* synthetic */ mt(pt ptVar, ad adVar, int i, Lazy lazy) {
        this.f165416a = 0;
        this.f165418c = ptVar;
        this.d = adVar;
        this.f165417b = i;
        this.e = lazy;
    }
}
