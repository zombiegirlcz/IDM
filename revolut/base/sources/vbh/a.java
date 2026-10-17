package vbh;

import gim.c;
import sgm.e3;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f287527w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e3 e3Var, c cVar) {
        super(cVar);
        this.v = e3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f287527w |= Integer.MIN_VALUE;
        return this.v.j(null, this);
    }
}
