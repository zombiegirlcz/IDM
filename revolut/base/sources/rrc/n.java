package rrc;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.c {
    public File u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f256787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256788x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.f256787w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256788x |= Integer.MIN_VALUE;
        return this.f256787w.l(null, null, this);
    }
}
