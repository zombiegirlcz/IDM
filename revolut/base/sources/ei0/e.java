package ei0;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InstallStatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f126336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jh.c f126337b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l lVar, OptionalModuleApi optionalModuleApi) {
        this.f126336a = lVar;
        this.f126337b = (jh.c) optionalModuleApi;
    }

    @Override // com.google.android.gms.common.moduleinstall.InstallStatusListener
    public final void onInstallStatusUpdated(ModuleInstallStatusUpdate update) {
        Intrinsics.checkNotNullParameter(update, "update");
        l lVar = this.f126336a;
        if (lVar.y()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "ModuleInstaller", com.google.android.gms.internal.mlkit_vision_face.a.k(update.getInstallState(), this.f126337b.getClass().getSimpleName(), " module install state: "), null, null, 16);
        int installState = update.getInstallState();
        if (installState != 2) {
            if (installState == 4) {
                m.Companion companion = m.INSTANCE;
                lVar.resumeWith(Unit.f186387a);
            } else if (installState != 6) {
                m.Companion companion2 = m.INSTANCE;
                lVar.resumeWith(o.a(new IllegalStateException(a0.d.n("Failed to install module. State: ", update.getInstallState()))));
            }
        }
    }
}
