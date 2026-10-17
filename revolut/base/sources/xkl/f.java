package xkl;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f306875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f306876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f306877y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f306877y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f306876x = obj2;
        this.z |= Integer.MIN_VALUE;
        return i.Z2(this.f306877y, null, null, this);
    }
}
