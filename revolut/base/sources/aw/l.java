package aw;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.lifecycle.ProcessCameraProviderExtKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10190a;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10190a = context;
    }

    public final Object a(gim.c cVar) {
        a aVar = a.f10135a;
        Context context = this.f10190a;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (aVar) {
            if (!a.f10136b) {
                if (((yu.b) ue0.e.i(ue0.e.j(context), yu.b.class)) != null) {
                    try {
                        ProcessCameraProvider.INSTANCE.configureInstance(yu.d.a());
                        Unit unit = Unit.f186387a;
                    } catch (IllegalStateException unused) {
                        ow.a.a("CameraX was initialized before CameraKit; using its existing configuration");
                    }
                }
                a.f10136b = true;
                Unit unit2 = Unit.f186387a;
            }
        }
        return ProcessCameraProviderExtKt.awaitInstance(ProcessCameraProvider.INSTANCE, this.f10190a, cVar);
    }
}
