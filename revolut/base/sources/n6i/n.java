package n6i;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public xi0.b A;
    public /* synthetic */ Object B;
    public final /* synthetic */ o C;
    public int D;
    public k1j.a u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.l f212807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountId f212808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f212809y;
    public k1j.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.C = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(this, null, null);
    }
}
