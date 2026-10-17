package lxa;

import gim.c;
import jul.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f200536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f200537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f200538y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, c cVar) {
        super(cVar);
        this.f200537x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f200536w = obj2;
        this.f200538y |= Integer.MIN_VALUE;
        return this.f200537x.c(this, null, false);
    }
}
