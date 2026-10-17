package mek;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pod_nominees.impl.edit.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f204724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.retail.feature.pod_nominees.impl.edit.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f204724w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pod_nominees.impl.edit.d.e3(this.v, null, null, this);
    }
}
