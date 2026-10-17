package tml;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f272260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.email.change_flow.a f272261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f272262y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.sso.impl.ui.email.change_flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f272261x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f272260w = obj2;
        this.f272262y |= Integer.MIN_VALUE;
        return this.f272261x.L2(this, null, false);
    }
}
