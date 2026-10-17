package lcm;

import com.google.common.base.MoreObjects;
import com.google.common.util.concurrent.AbstractFuture;
import ecm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AbstractFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f193906a;

    public a(i iVar) {
        this.f193906a = iVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void interruptTask() {
        this.f193906a.a("GrpcFuture was cancelled", null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        return MoreObjects.toStringHelper(this).add("clientCall", this.f193906a).toString();
    }
}
