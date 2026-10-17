package xkf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends gim.c {
    public TextLocalisedClause u;
    public TextLocalisedClause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f306721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q1 f306722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f306723y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(q1 q1Var, gim.c cVar) {
        super(cVar);
        this.f306722x = q1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f306721w = obj2;
        this.f306723y |= Integer.MIN_VALUE;
        return this.f306722x.b3(null, null, this);
    }
}
