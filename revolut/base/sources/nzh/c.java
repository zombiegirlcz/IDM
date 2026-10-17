package nzh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;
import lca.i;
import n14.k;
import nii.j0;
import nk9.l;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rzh.b f221066l;

    public c(rzh.b orderFlowStatusDialogConfigurationProvider) {
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        this.f221066l = orderFlowStatusDialogConfigurationProvider;
    }

    public final Object Z2(CryptoOrderDraft cryptoOrderDraft, gim.c cVar) {
        return k.W(this, null, new i(this, cryptoOrderDraft, 1), new a3b.i(this, cryptoOrderDraft, 17), new l(this, cryptoOrderDraft, null, 15), cVar, 1);
    }

    public abstract Object b3(CryptoOrderDraft cryptoOrderDraft, gim.c cVar);

    public abstract j0 c3(Object obj2, CryptoOrderDraft cryptoOrderDraft);
}
