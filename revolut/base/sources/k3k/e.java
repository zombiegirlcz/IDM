package k3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public RemittanceTransferData u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f180757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180758y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f180757x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180756w = obj2;
        this.f180758y |= Integer.MIN_VALUE;
        return this.f180757x.b(null, null, this);
    }
}
