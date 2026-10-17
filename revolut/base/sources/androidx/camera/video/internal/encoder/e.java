package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl.ByteBufferInput f6913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f6914c;

    public /* synthetic */ e(EncoderImpl.ByteBufferInput byteBufferInput, CallbackToFutureAdapter.Completer completer, int i) {
        this.f6912a = i;
        this.f6913b = byteBufferInput;
        this.f6914c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6912a) {
            case 0:
                this.f6913b.lambda$acquireBuffer$4(this.f6914c);
                break;
            default:
                this.f6913b.lambda$fetchData$0(this.f6914c);
                break;
        }
    }
}
