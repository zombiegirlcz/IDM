package elf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 extends gim.c {
    public List u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f127365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n1 f127366y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.f127366y = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127365x = obj2;
        this.z |= Integer.MIN_VALUE;
        return n1.b3(this.f127366y, this);
    }
}
