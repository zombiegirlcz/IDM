package jh;

import android.graphics.Matrix;
import android.media.Image;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import au0.x5;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Closeable, LifecycleObserver {
    public static final GmsLogger e = new GmsLogger("MobileVisionBase", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f174102a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.f f174103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CancellationTokenSource f174104c;
    public final Executor d;

    public c(ch.f fVar, Executor executor) {
        this.f174103b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f174104c = cancellationTokenSource;
        this.d = executor;
        fVar.f24019b.incrementAndGet();
        fVar.a(executor, f.f174108a, cancellationTokenSource.getToken()).addOnFailureListener(e.f174106a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @KeepForSdk
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.f174102a.getAndSet(true)) {
            return;
        }
        this.f174104c.cancel();
        ch.f fVar = this.f174103b;
        Executor executor = this.d;
        if (fVar.f24019b.get() <= 0) {
            z = false;
        }
        Preconditions.checkState(z);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fVar.f24018a.e(executor, new x5(fVar, taskCompletionSource, 3));
        taskCompletionSource.getTask();
    }

    public final synchronized Task d(InputImage inputImage) {
        Preconditions.checkNotNull(inputImage, "InputImage can not be null");
        if (this.f174102a.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.m() < 32 || inputImage.i() < 32) {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f174103b.a(this.d, new gqk.d(this, inputImage, 1), this.f174104c.getToken());
    }

    public Task process(InputImage inputImage) {
        return d(inputImage);
    }

    public final Task process(Image image, int i, Matrix matrix) {
        return d(InputImage.d(image, i, matrix));
    }
}
