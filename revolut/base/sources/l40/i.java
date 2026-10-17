package l40;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.c {
    public UUID u;
    public r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f191997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191998y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, gim.c cVar) {
        super(cVar);
        this.f191997x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191996w = obj2;
        this.f191998y |= Integer.MIN_VALUE;
        return q.j3(this.f191997x, null, null, this);
    }
}
