package cdh;

import com.revolut.feature.wealth.api.widget.WealthWidgetContext;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public int A;
    public j u;
    public WealthWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f23244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f23245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f23246y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23246y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
