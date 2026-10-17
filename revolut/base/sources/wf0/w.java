package wf0;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f296933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296934x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, gim.c cVar) {
        super(cVar);
        this.f296933w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f296934x |= Integer.MIN_VALUE;
        return this.f296933w.a(null, this);
    }
}
