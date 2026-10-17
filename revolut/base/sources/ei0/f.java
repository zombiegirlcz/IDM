package ei0;

import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import skm.l;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f126339b;

    public /* synthetic */ f(l lVar, int i) {
        this.f126338a = i;
        this.f126339b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f126338a;
        l lVar = this.f126339b;
        switch (i) {
            case 0:
                ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) obj2;
                if (moduleInstallResponse.areModulesAlreadyInstalled() && !lVar.y()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "ModuleInstaller", com.google.android.gms.internal.mlkit_vision_face.a.r("Modules are already installed: ", moduleInstallResponse.areModulesAlreadyInstalled()), null, null, 16);
                    m.Companion companion = m.INSTANCE;
                    lVar.resumeWith(Unit.f186387a);
                }
                return Unit.f186387a;
            default:
                m.Companion companion2 = m.INSTANCE;
                Unit unit = Unit.f186387a;
                lVar.resumeWith(unit);
                return unit;
        }
    }
}
