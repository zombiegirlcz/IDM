package sy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public ApmContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f266570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f266570w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266571x |= Integer.MIN_VALUE;
        return this.f266570w.d(null, null, null, this);
    }
}
