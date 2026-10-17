package kbj;

import com.revolut.retail.core.navigation.NaviCommand;
import q06.j;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public j u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f182614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182615y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f182614x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182613w = obj2;
        this.f182615y |= Integer.MIN_VALUE;
        return this.f182614x.e(null, this);
    }
}
