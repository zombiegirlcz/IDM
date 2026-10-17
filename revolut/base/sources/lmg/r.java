package lmg;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.c {
    public LinkedHashMap u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.i f197069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f197070x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.f197069w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f197070x |= Integer.MIN_VALUE;
        return k7i.i.c(this.f197069w, null, this);
    }
}
