package aii;

import android.content.Intent;
import android.os.Bundle;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f5278a;

    public b(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f5278a = controller;
    }

    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        com.revolut.kompot.navigable.b bVarY2 = this.f5278a.C2().y2();
        yji.q qVar = bVarY2 instanceof yji.q ? (yji.q) bVarY2 : null;
        if (qVar == null) {
            throw new IllegalStateException("RootControllerManager must be present for a controller");
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        ecm.q qVar2 = qVar.o;
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        ((KompotFragment) qVar2.f124861b).startActivity(intent);
    }

    public final void b(Intent intent, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        com.revolut.kompot.navigable.b bVarY2 = this.f5278a.C2().y2();
        yji.q qVar = bVarY2 instanceof yji.q ? (yji.q) bVarY2 : null;
        if (qVar == null) {
            throw new IllegalStateException("RootControllerManager must be present for a controller");
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        ecm.q qVar2 = qVar.o;
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        ((KompotFragment) qVar2.f124861b).startActivityForResult(intent, i, null);
    }
}
