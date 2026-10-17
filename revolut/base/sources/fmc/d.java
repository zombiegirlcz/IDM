package fmc;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.robo.impl.navigation.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f136333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.robo.impl.navigation.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f136333w |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
