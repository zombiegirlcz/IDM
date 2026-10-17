package etj;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ o D;
    public int E;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f129435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public IncomeSorterDestinationId f129436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hzi.a f129437y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.D = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        Object objP = this.D.p(null, this, null, null, null, null, null);
        return objP == fim.a.COROUTINE_SUSPENDED ? objP : new yhm.m(objP);
    }
}
