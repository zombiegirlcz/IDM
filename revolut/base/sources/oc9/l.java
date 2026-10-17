package oc9;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.c {
    public gim.i u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f224152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes_terms.h f224153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f224154y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.onboarding.impl.qes_terms.h hVar, gim.c cVar) {
        super(cVar);
        this.f224153x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f224152w = obj2;
        this.f224154y |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.qes_terms.h.J2(this.f224153x, null, null, this);
    }
}
