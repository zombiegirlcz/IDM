package w0;

import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodedDataImpl;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f293587b;

    public /* synthetic */ a(AtomicReference atomicReference, int i) {
        this.f293586a = i;
        this.f293587b = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f293586a) {
            case 0:
                return BufferCopiedEncodedData.lambda$new$0(this.f293587b, completer);
            case 1:
                return EncodedDataImpl.lambda$new$0(this.f293587b, completer);
            case 2:
                return EncoderImpl.lambda$acquireInputBuffer$13(this.f293587b, completer);
            default:
                return EncoderImpl.lambda$new$0(this.f293587b, completer);
        }
    }
}
