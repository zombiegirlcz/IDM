package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.Request;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\b\u0018\u00010\u0007R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Landroidx/camera/camera2/pipe/Request;", "request", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue$FrameCaptureImpl;", "remove", "(Landroidx/camera/camera2/pipe/Request;)Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue$FrameCaptureImpl;", "", "close", "", "lock", "Ljava/lang/Object;", "Lkotlin/collections/ArrayDeque;", "queue", "Lkotlin/collections/ArrayDeque;", "", "closed", "Z", "FrameCaptureImpl", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameCaptureQueue implements AutoCloseable {
    private boolean closed;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final ArrayDeque<FrameCaptureImpl> queue = new ArrayDeque<>();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue$FrameCaptureImpl;", "", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FrameCaptureImpl implements AutoCloseable {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Unit unit = Unit.f186387a;
            Iterator<FrameCaptureImpl> it8 = this.queue.iterator();
            if (!it8.hasNext()) {
                this.queue.clear();
            } else {
                if (it8.next() != null) {
                    throw new ClassCastException();
                }
                OutputStatus.INSTANCE.m258getERROR_OUTPUT_ABORTEDU7r42EA();
                throw null;
            }
        }
    }

    public final FrameCaptureImpl remove(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return null;
                }
                Iterator<FrameCaptureImpl> it8 = this.queue.iterator();
                if (!it8.hasNext()) {
                    return null;
                }
                if (it8.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
