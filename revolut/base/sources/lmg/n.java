package lmg;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ k7i.i D;
    public int E;
    public Map u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f197059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f197060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f197061y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.D = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return k7i.i.b(this.D, null, this);
    }
}
