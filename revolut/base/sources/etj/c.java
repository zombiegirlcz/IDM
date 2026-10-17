package etj;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ o E;
    public int F;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hzi.c f129414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public IncomeSorterDestinationId f129415x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hzi.a f129416y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, gim.c cVar) {
        super(cVar);
        this.E = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        Object objD = this.E.d(null, null, null, null, null, null, false, this);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : new yhm.m(objD);
    }
}
