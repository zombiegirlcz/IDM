package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6905c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f6903a = i;
        this.f6904b = obj2;
        this.f6905c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6903a) {
            case 0:
                ((EncoderImpl) this.f6904b).lambda$matchAcquisitionsAndFreeBufferIndexes$15((EncoderImpl.AnonymousClass2) this.f6905c);
                break;
            case 1:
                EncoderImpl.lambda$addSignalEosTimeoutIfNeeded$9((Executor) this.f6904b, (EncoderImpl.MediaCodecCallback) this.f6905c);
                break;
            case 2:
                EncoderImpl.ByteBufferInput.lambda$setActive$9((Map.Entry) this.f6904b, (BufferProvider.State) this.f6905c);
                break;
            case 3:
                ((EncoderImpl.ByteBufferInput) this.f6904b).lambda$removeObserver$8((Observable.Observer) this.f6905c);
                break;
            case 4:
                ((Observable.Observer) this.f6904b).onNewData((BufferProvider.State) this.f6905c);
                break;
            case 5:
                ((EncoderImpl.MediaCodecCallback) this.f6904b).lambda$onError$4((MediaCodec.CodecException) this.f6905c);
                break;
            case 6:
                ((EncoderImpl.MediaCodecCallback) this.f6904b).lambda$onOutputFormatChanged$7((MediaFormat) this.f6905c);
                break;
            case 7:
                EncoderImpl.MediaCodecCallback.lambda$onOutputFormatChanged$6((EncoderCallback) this.f6904b, (MediaFormat) this.f6905c);
                break;
            default:
                ((EncoderCallback) this.f6904b).onEncodedData((EncodedDataImpl) this.f6905c);
                break;
        }
    }
}
