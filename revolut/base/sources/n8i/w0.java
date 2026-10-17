package n8i;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dpf.c f213482b;

    public /* synthetic */ w0(dpf.c cVar, int i) {
        this.f213481a = i;
        this.f213482b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213481a) {
            case 0:
                q update = (q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = update.f213461a;
                k kVar = (k) data.getContent();
                return q.a(update, Data.copy$default(data, kVar != null ? k.a(kVar, null, ((dpf.b) this.f213482b).f116876a, false, null, 13) : null, null, false, 6, null), null, null, 6);
            default:
                PeerToPeerTransferData updateTransferData = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, ((dpf.b) this.f213482b).f116876a, null, null, 253951);
        }
    }
}
