package ghh;

import com.revolut.core.ui_kit.models.MoneyClause;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public MoneyClause u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f143929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f143930x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f143929w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f143930x |= Integer.MIN_VALUE;
        return this.f143929w.d(null, null, this);
    }
}
