package bw;

import android.os.Build;
import androidx.camera.core.UseCaseGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import skm.e0;
import vkm.q0;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw.u f19144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5h.g f19145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19146c;

    public i(aw.u imageAnalysis, a5h.g backupImageAnalysisDelegate, g deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(imageAnalysis, "imageAnalysis");
        Intrinsics.checkNotNullParameter(backupImageAnalysisDelegate, "backupImageAnalysisDelegate");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f19144a = imageAnalysis;
        this.f19145b = backupImageAnalysisDelegate;
        String[] elements = {"SM-A605", "SM-J415", "SM-J610", "Redmi 6", "BBD100-2", "SM-A236"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        boolean z = false;
        if (!(setY0 instanceof Collection) || !setY0.isEmpty()) {
            Iterator it8 = setY0.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                String str = (String) it8.next();
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (d0.J(MODEL, str, true)) {
                    z = true;
                    break;
                }
            }
        }
        this.f19146c = z;
    }

    public final void a(UseCaseGroup.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!this.f19146c) {
            Intrinsics.h(builder.addUseCase(this.f19144a.a()));
            return;
        }
        a5h.g gVar = this.f19145b;
        gVar.f = vkm.q.G(new q0(vkm.q.C(((dw.j) gVar.f1406b).f118187c, e0.r((Executor) gVar.f1407c)), new aee.g(2, (f) gVar.d, f.class, "analyze", "analyze(Landroidx/camera/core/ImageProxy;)V", 4, 8), 1), LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) gVar.e));
    }
}
