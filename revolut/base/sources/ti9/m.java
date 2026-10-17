package ti9;

import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.c {
    public RightToCancelCancellationOutcome u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f271468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f271469x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f271468w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f271469x |= Integer.MIN_VALUE;
        return this.f271468w.a(null, this);
    }
}
