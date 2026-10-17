package wdb;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public LocalTime A;
    public List B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ n E;
    public int F;
    public xdb.v u;
    public LocalDate v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalTime f296518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f296519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f296520y;
    public LocalTime z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, gim.c cVar) {
        super(cVar);
        this.E = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.g(null, null, null, 0, this);
    }
}
