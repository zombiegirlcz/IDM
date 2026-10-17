package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl.ByteBufferInput f6911b;

    public /* synthetic */ d(EncoderImpl.ByteBufferInput byteBufferInput, int i) {
        this.f6910a = i;
        this.f6911b = byteBufferInput;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f6910a) {
            case 0:
                return this.f6911b.lambda$fetchData$1(completer);
            default:
                return this.f6911b.lambda$acquireBuffer$5(completer);
        }
    }
}
