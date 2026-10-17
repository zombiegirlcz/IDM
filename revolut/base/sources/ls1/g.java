package ls1;

import com.revolut.feature.apm.core.models.recipients.BizumContact;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public BizumContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f199592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f199593x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f199592w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f199593x |= Integer.MIN_VALUE;
        return this.f199592w.h(null, this);
    }
}
