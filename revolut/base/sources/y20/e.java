package y20;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public final /* synthetic */ f A;
    public int B;
    public p u;
    public u10.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u10.q f310485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t f310486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f310487y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return f.b(this.A, null, this);
    }
}
