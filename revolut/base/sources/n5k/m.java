package n5k;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public l5k.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f212642w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212643x |= Integer.MIN_VALUE;
        return this.f212642w.i3(this);
    }
}
