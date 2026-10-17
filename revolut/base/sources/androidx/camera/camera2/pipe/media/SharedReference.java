package androidx.camera.camera2.pipe.media;

import hx7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import rkm.h;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/camera/camera2/pipe/media/SharedReference;", "T", "", "value", "Landroidx/camera/camera2/pipe/media/Finalizer;", "defaultFinalizer", "<init>", "(Ljava/lang/Object;Landroidx/camera/camera2/pipe/media/Finalizer;)V", "acquireOrNull", "()Ljava/lang/Object;", "", "decrement", "()V", "Ljava/lang/Object;", "Lrkm/d;", "count", "Lrkm/d;", "Lrkm/h;", "currentFinalizer", "Lrkm/h;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedReference<T> {

    @NotNull
    private final d count;

    @NotNull
    private h currentFinalizer;
    private final T value;

    public SharedReference(T t2, @NotNull Finalizer<? super T> defaultFinalizer) {
        Intrinsics.checkNotNullParameter(defaultFinalizer, "defaultFinalizer");
        this.value = t2;
        this.count = b.h(1);
        this.currentFinalizer = b.j(defaultFinalizer);
    }

    public final T acquireOrNull() {
        int i;
        int i2;
        d dVar = this.count;
        do {
            i = dVar.f254896a;
            i2 = i == 0 ? 0 : i + 1;
        } while (!d.f254895b.compareAndSet(dVar, i, i2));
        if (i2 != 0) {
            return this.value;
        }
        return null;
    }

    public final void decrement() {
        d dVar = this.count;
        dVar.getClass();
        if (d.f254895b.decrementAndGet(dVar) == 0) {
            h hVar = this.currentFinalizer;
            hVar.getClass();
            Finalizer finalizer = (Finalizer) h.f254899b.getAndSet(hVar, null);
            Intrinsics.h(finalizer);
            finalizer.finalize(this.value);
        }
    }
}
