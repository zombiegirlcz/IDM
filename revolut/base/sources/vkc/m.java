package vkc;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rfi_tool.impl.navigation.b f289912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289913x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.rfi_tool.impl.navigation.b bVar, gim.c cVar) {
        super(cVar);
        this.f289912w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289913x |= Integer.MIN_VALUE;
        return com.revolut.feature.rfi_tool.impl.navigation.b.J2(this.f289912w, null, this);
    }
}
