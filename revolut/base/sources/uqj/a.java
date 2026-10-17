package uqj;

import gim.c;
import java.util.LinkedHashSet;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public int A;
    public LinkedHashSet u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f282192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f282193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f282194y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.z = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f282194y = obj2;
        this.A |= Integer.MIN_VALUE;
        Object objC = this.z.c(null, null, this);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : new m(objC);
    }
}
