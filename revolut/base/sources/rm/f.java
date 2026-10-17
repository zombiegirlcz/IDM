package rm;

import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements qm.a {
    @Override // qm.a
    public void D(Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        a().onNext(payload);
    }

    public abstract j a();

    @Override // qm.a
    public efm.b c0(Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        h hVar = new h(new phc.d(this, payload, 28), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
