package rga;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mga.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final prl.e f254053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wn.a f254054m;

    public i(prl.e clickHandler, wn.a adsTrackingControllerModelExtension) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        this.f254053l = clickHandler;
        this.f254054m = adsTrackingControllerModelExtension;
    }

    @Override // mga.f0
    public final void Z2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        V2(new qd8.e(this, listId, obj2, (Continuation) null), new yi5.b(29));
    }

    @Override // mga.f0
    public final void b3(zn.f viewableRecordSnapshot) {
        Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
        this.f254054m.b3(viewableRecordSnapshot);
    }
}
