package oii;

import android.view.View;
import cli.r;
import kotlin.jvm.internal.Intrinsics;
import os2.g;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements bki.a {
    @Override // bki.a
    public final void a(View controllerView, g uiStateBlockHandle, hli.a blockUserInteractionHandle, r transitionStateLatch) {
        Intrinsics.checkNotNullParameter(controllerView, "controllerView");
        Intrinsics.checkNotNullParameter(uiStateBlockHandle, "uiStateBlockHandle");
        Intrinsics.checkNotNullParameter(blockUserInteractionHandle, "blockUserInteractionHandle");
        Intrinsics.checkNotNullParameter(transitionStateLatch, "transitionStateLatch");
        hli.c cVar = (hli.c) blockUserInteractionHandle;
        cVar.a();
        ((pki.a) uiStateBlockHandle.f229224b).J1(uiStateBlockHandle);
        transitionStateLatch.a(new kul.b(controllerView, transitionStateLatch.b(), uiStateBlockHandle, cVar, 3));
    }
}
