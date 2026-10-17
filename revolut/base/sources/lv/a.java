package lv;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends gim.c {
    public iw.a u;
    public iw.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f200264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f200265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f200266y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f200265x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f200264w = obj2;
        this.f200266y |= Integer.MIN_VALUE;
        return this.f200265x.a(this);
    }
}
