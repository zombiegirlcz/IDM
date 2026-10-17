package l72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public MultibancoWithdrawalCode u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f192512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f192513x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f192512w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f192513x |= Integer.MIN_VALUE;
        return this.f192512w.c(null, this);
    }
}
