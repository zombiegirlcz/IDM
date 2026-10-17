package sxc;

import gim.c;
import qr0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f266415w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f266415w |= Integer.MIN_VALUE;
        return this.v.f(null, this);
    }
}
