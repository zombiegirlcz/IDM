package pd2;

import com.revolut.feature.apm.core.models.recipients.SpinContact;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public SpinContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f235045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235046x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f235045w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235046x |= Integer.MIN_VALUE;
        return this.f235045w.h(null, this);
    }
}
