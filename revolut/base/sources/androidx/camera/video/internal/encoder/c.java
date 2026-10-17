package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f6908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6909c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(EncoderImpl.ByteBufferInput byteBufferInput, Observable.Observer observer, Executor executor) {
        this.f6909c = byteBufferInput;
        this.d = observer;
        this.f6908b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6907a) {
            case 0:
                ((EncoderImpl.ByteBufferInput) this.f6909c).lambda$addObserver$7((Observable.Observer) this.d, this.f6908b);
                break;
            default:
                ((EncoderImpl.MediaCodecCallback) this.f6909c).lambda$reachEndData$2(this.f6908b, (EncoderCallback) this.d);
                break;
        }
    }

    public /* synthetic */ c(EncoderImpl.MediaCodecCallback mediaCodecCallback, Executor executor, EncoderCallback encoderCallback) {
        this.f6909c = mediaCodecCallback;
        this.f6908b = executor;
        this.d = encoderCallback;
    }
}
