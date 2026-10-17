package vkc;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rfi_tool.impl.navigation.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.rfi_tool.impl.navigation.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f289909w |= Integer.MIN_VALUE;
        return com.revolut.feature.rfi_tool.impl.navigation.b.I2(this.v, this);
    }
}
