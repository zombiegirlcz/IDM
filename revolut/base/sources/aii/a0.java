package aii;

import com.revolut.kompot.entry_point.fragment.KompotFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f5277a;

    public a0(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f5277a = controller;
    }

    public final void a(int i, List permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        com.revolut.kompot.navigable.b bVarY2 = this.f5277a.C2().y2();
        yji.q qVar = bVarY2 instanceof yji.q ? (yji.q) bVarY2 : null;
        if (qVar == null) {
            throw new IllegalStateException("RootControllerManager must be present for a controller");
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        mp.r rVar = qVar.f314530p;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ((KompotFragment) rVar.f207713b).requestPermissions((String[]) permissions.toArray(new String[0]), i);
    }
}
