package aw;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import androidx.camera.video.Recording;
import com.revolut.camerakit.core.camerax.delegate.MemfdCompat;
import com.revolut.camerakit.core.errors.CameraXException;
import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import java.io.FileDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ long A;
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f10163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yw.n f10164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ VideoImuDataCollectionSettings f10165y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j2, j0 j0Var, VideoImuDataCollectionSettings videoImuDataCollectionSettings, String str, Continuation continuation, yw.n nVar) {
        super(2, continuation);
        this.f10163w = j0Var;
        this.f10164x = nVar;
        this.f10165y = videoImuDataCollectionSettings;
        this.z = str;
        this.A = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kotlinx.coroutines.channels.ProducerScope r4, aw.b0 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof aw.g0
            if (r0 == 0) goto L13
            r0 = r6
            aw.g0 r0 = (aw.g0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            aw.g0 r0 = new aw.g0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L42
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L42
            r0.v = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.send(r5, r0)     // Catch: java.lang.Throwable -> L42
            if (r4 != r1) goto L3d
            return r1
        L3d:
            kotlin.Unit r4 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L42
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L42
            goto L48
        L42:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.o.a(r4)
        L48:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.h0.b(kotlinx.coroutines.channels.ProducerScope, aw.b0, gim.c):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h0 h0Var = new h0(this.A, this.f10163w, this.f10165y, this.z, continuation, this.f10164x);
        h0Var.v = obj2;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        bw.z xVar;
        ParcelFileDescriptor parcelFileDescriptorAdoptFd;
        j0 j0Var = this.f10163w;
        AtomicReference atomicReference = j0Var.f;
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            cw.a aVar2 = j0Var.f10175h;
            if (aVar2 == null) {
                throw new CameraXException("VideoCapture not initialised before recordVideo", (Throwable) null, 6);
            }
            zq.a aVar3 = j0Var.d;
            vw.p pVar = (vw.p) aVar3.f324336c;
            zw.g gVar = (zw.g) aVar3.f324335b;
            yw.n storagePolicy = this.f10164x;
            Intrinsics.checkNotNullParameter(storagePolicy, "storagePolicy");
            int i2 = bw.a0.f19140a[storagePolicy.ordinal()];
            if (i2 == 1) {
                xVar = new bw.x(gVar.a(), new a76.c(0, (zw.g) aVar3.f324335b, zw.g.class, "releaseFile", "releaseFile()V", 0, 2), pVar);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        FileDescriptor fileDescriptorMemfd_create = Os.memfd_create("video_capture", 0);
                        Intrinsics.checkNotNullExpressionValue(fileDescriptorMemfd_create, "memfd_create(...)");
                        try {
                            parcelFileDescriptorAdoptFd = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                Os.close(fileDescriptorMemfd_create);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                yhm.o.a(th10);
                            }
                        } finally {
                        }
                    } else {
                        int iNativeMemfdCreate = MemfdCompat.f50735a.nativeMemfdCreate("video_capture", 0);
                        if (iNativeMemfdCreate < 0) {
                            throw new IllegalStateException("Failed to create memfd via JNI (fd=" + iNativeMemfdCreate + ")");
                        }
                        parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(iNativeMemfdCreate);
                    }
                    Intrinsics.h(parcelFileDescriptorAdoptFd);
                    xVar = new bw.y(parcelFileDescriptorAdoptFd, gVar.a(), new a76.c(0, (zw.g) aVar3.f324335b, zw.g.class, "releaseFile", "releaseFile()V", 0, 3), pVar);
                } catch (Exception e) {
                    throw new CameraXException("Failed to create memfd descriptor", e, 4);
                }
            }
            bw.z zVar = xVar;
            try {
                VideoImuDataCollectionSettings videoImuDataCollectionSettings = this.f10165y;
                c0 c0Var = new c0(zVar, videoImuDataCollectionSettings.f50743a ? j0Var.e.a0(this.z, videoImuDataCollectionSettings) : null);
                try {
                    c0 c0Var2 = (c0) atomicReference.getAndSet(c0Var);
                    if (c0Var2 != null) {
                        c0Var2.d = true;
                        Recording recording = c0Var2.f10145c;
                        if (recording != null) {
                            recording.stop();
                        }
                        c0Var2.f10145c = null;
                        c0Var2.a();
                    }
                    long j2 = this.A;
                    c0Var.f10145c = zVar.b(aVar2, j2, new d0(j0Var, c0Var, producerScope, j2));
                    at4.b bVar = new at4.b(c0Var, j0Var, 11);
                    this.v = null;
                    this.u = 1;
                    if (com.bumptech.glide.d.d(producerScope, bVar, this) == aVar) {
                        return aVar;
                    }
                } catch (Throwable th11) {
                    while (!atomicReference.compareAndSet(c0Var, null) && atomicReference.get() == c0Var) {
                    }
                    c0Var.a();
                    throw th11;
                }
            } catch (Throwable th12) {
                zVar.a();
                throw th12;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
