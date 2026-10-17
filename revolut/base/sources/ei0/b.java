package ei0;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import ecm.q;
import fim.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mp.r;
import skm.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gi0.b implements fh0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f126333a;

    public b(g installer) {
        Intrinsics.checkNotNullParameter(installer, "installer");
        this.f126333a = installer;
    }

    public static OptionalModuleApi c(fh0.b bVar) {
        int i = a.f126332a[bVar.ordinal()];
        if (i == 1) {
            return com.bumptech.glide.d.i();
        }
        if (i == 2) {
            return g4i.a.g(th.a.f271227c);
        }
        if (i == 3) {
            return g4i.a.g(pu7.a.z());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object a(fh0.b[] bVarArr, gim.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (fh0.b bVar : bVarArr) {
            arrayList.add(c(bVar));
        }
        if (arrayList.isEmpty()) {
            return Boolean.TRUE;
        }
        OptionalModuleApi[] optionalModuleApiArr = (OptionalModuleApi[]) arrayList.toArray(new OptionalModuleApi[0]);
        return this.f126333a.a((OptionalModuleApi[]) Arrays.copyOf(optionalModuleApiArr, optionalModuleApiArr.length), cVar);
    }

    public final Object b(fh0.b bVar, rli.b frame) {
        OptionalModuleApi optionalModuleApiC = c(bVar);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "ModuleInstaller", "Installing module: ".concat(optionalModuleApiC.getClass().getSimpleName()), null, null, 16);
        l lVar = new l(1, h.b(frame));
        lVar.u();
        e eVar = new e(lVar, optionalModuleApiC);
        g gVar = this.f126333a;
        gVar.f126341b = eVar;
        ModuleInstallRequest.Builder builderAddApi = new ModuleInstallRequest.Builder().addApi(optionalModuleApiC);
        e eVar2 = gVar.f126341b;
        if (eVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ModuleInstallRequest moduleInstallRequestBuild = builderAddApi.setListener(eVar2).build();
        Intrinsics.checkNotNullExpressionValue(moduleInstallRequestBuild, "build(...)");
        ((ModuleInstallClient) gVar.f126340a.getValue()).installModules(moduleInstallRequestBuild).addOnSuccessListener(new r(new f(lVar, 0))).addOnFailureListener(new a31.a(lVar, 7)).addOnCompleteListener(new q(gVar, 6));
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objT != aVar) {
            objT = Unit.f186387a;
        }
        return objT == aVar ? objT : Unit.f186387a;
    }
}
