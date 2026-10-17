package androidx.camera.viewfinder;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/camera/viewfinder/CameraViewfinderExt;", "", "()V", "requestSurface", "Landroid/view/Surface;", "Landroidx/camera/viewfinder/CameraViewfinder;", "viewfinderSurfaceRequest", "Landroidx/camera/viewfinder/ViewfinderSurfaceRequest;", "(Landroidx/camera/viewfinder/CameraViewfinder;Landroidx/camera/viewfinder/ViewfinderSurfaceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera-viewfinder_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CameraViewfinderExt {

    @NotNull
    public static final CameraViewfinderExt INSTANCE = new CameraViewfinderExt();

    /* JADX INFO: renamed from: androidx.camera.viewfinder.CameraViewfinderExt$requestSurface$1, reason: invalid class name */
    @gim.d(c = "androidx.camera.viewfinder.CameraViewfinderExt", f = "CameraViewfinderExt.kt", l = {31}, m = "requestSurface")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends gim.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CameraViewfinderExt.this.requestSurface(null, null, this);
        }
    }

    private CameraViewfinderExt() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestSurface(@org.jetbrains.annotations.NotNull androidx.camera.viewfinder.CameraViewfinder r5, @org.jetbrains.annotations.NotNull androidx.camera.viewfinder.ViewfinderSurfaceRequest r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super android.view.Surface> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.camera.viewfinder.CameraViewfinderExt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.viewfinder.CameraViewfinderExt$requestSurface$1 r0 = (androidx.camera.viewfinder.CameraViewfinderExt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.viewfinder.CameraViewfinderExt$requestSurface$1 r0 = new androidx.camera.viewfinder.CameraViewfinderExt$requestSurface$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            com.google.common.util.concurrent.ListenableFuture r5 = r5.requestSurfaceAsync(r6)
            java.lang.String r6 = "requestSurfaceAsync(viewfinderSurfaceRequest)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.label = r3
            java.lang.Object r7 = androidx.concurrent.futures.ListenableFutureKt.await(r5, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "requestSurfaceAsync(view…erSurfaceRequest).await()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.viewfinder.CameraViewfinderExt.requestSurface(androidx.camera.viewfinder.CameraViewfinder, androidx.camera.viewfinder.ViewfinderSurfaceRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
