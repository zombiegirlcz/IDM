package rg4;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public com.revolut.feature.credit.application.models.preapplication.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f254018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254019x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f254018w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254019x |= Integer.MIN_VALUE;
        return this.f254018w.a(null, null, this);
    }
}
