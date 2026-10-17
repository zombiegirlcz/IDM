package vrh;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public xq2.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a f291605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291606x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar, gim.c cVar) {
        super(cVar);
        this.f291605w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291606x |= Integer.MIN_VALUE;
        return this.f291605w.R2(null, this);
    }
}
